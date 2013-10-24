package com.hackmaster.critfumble;

import com.flurry.android.FlurryAgent;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ShowFumble  extends Activity   implements OnClickListener{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_show_fumble);
		
		Global mApplication = (Global)getApplicationContext();
		
		Bundle extras = getIntent().getExtras();
		int d1000i = extras.getInt("Number");
		
		SQLiteDatabase db = mApplication.usdbh.getWritableDatabase();
		Cursor c = null;
		String text = "";
		 if(db != null){
			 c = db.rawQuery("SELECT text FROM Fumbles WHERE Min<="+d1000i+" AND Max>="+d1000i, null);
	     }
		 if (c.moveToFirst()) {
			 text = c.getString(0);
			 Log.d("DB",text);
		 }else{
			 Log.d("DB","Error en la query select!");
		 }
		 c.close();
		 db.close();
		 
		 if(d1000i>200){
			 TextView tv_Number = (TextView)findViewById(R.id.fumble_num);
			 tv_Number.setText(""+d1000i); 
			 if(d1000i%2!=0){
				 TextView tv_Additional = (TextView)findViewById(R.id.additional_effect);
				 tv_Additional.setText("Your enemy gets a free immediate attack.\n\n Plus:");
			 }
			 
			 
			 TextView tv_Explanation = (TextView)findViewById(R.id.fumble_explanation);
			 tv_Explanation.setText(text);
		 }else{
			 TextView tv_Number = (TextView)findViewById(R.id.yourolled);
			 tv_Number.setTypeface(Typeface.DEFAULT_BOLD);
			 if(d1000i%2==0){
				 tv_Number.setText("You rolled under 201, you got a lucky break and nothing else happens."); 
			 }else{
				 tv_Number.setText("You rolled under 201, but your enemy gets a free immediate attack.");
			 }
		 }
		 
		 Button returnH = (Button)findViewById(R.id.return_home);
		 returnH.setOnClickListener(this);
		 
		 FlurryAgent.logEvent("Show Fumble");
		 
		 
		 
	}
	
	@Override
	protected void onStart()
	{
		super.onStart();
		FlurryAgent.onStartSession(this, "NB8MFQ2685QPG8HZHG4F");
	}
	 
	@Override
	protected void onStop()
	{
		super.onStop();		
		FlurryAgent.onEndSession(this);
	}
	
	public void onClick(View v) {
		
		Intent i = new Intent(ShowFumble.this, MainActivity.class);
		startActivity(i);
	}

}
