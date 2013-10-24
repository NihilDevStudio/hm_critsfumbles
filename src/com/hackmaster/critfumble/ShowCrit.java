package com.hackmaster.critfumble;

import com.flurry.android.FlurryAgent;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ShowCrit  extends Activity   implements OnClickListener{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_show_crit);
		
		Bundle extras = getIntent().getExtras();
		int d1000i = extras.getInt("Number");
		int dif = extras.getInt("dif");
		String dam = extras.getString("dam");
		
		Global mApplication = (Global)getApplicationContext();
		
		SQLiteDatabase db = mApplication.usdbh.getWritableDatabase();
		Cursor c = null;
		String text = "";
		 if(db != null){
			 c = db.rawQuery("SELECT text FROM "+dam+" WHERE Min<="+d1000i+" AND Max>="+d1000i+" AND Min2<="+dif+" AND Max2>="+dif, null);
	     }
		 if (c.moveToFirst()) {
			 text = c.getString(0);
			 Log.d("DB",text);
		 }else{
			 Log.d("DB","Error en la query select!");
		 }
		 c.close();
		 db.close();
		 
		 TextView tv_Number = (TextView)findViewById(R.id.crit_number);
		 TextView tv_Wound = (TextView)findViewById(R.id.wound_number);
		 TextView tv_Type = (TextView)findViewById(R.id.type_number);
		 tv_Number.setText(d1000i+""); 
		 tv_Wound.setText(dif+""); 
		 tv_Type.setText(""+dam); 
		 
		 TextView tv_text = (TextView)findViewById(R.id.crit_explanation);
		 tv_text.setText(text); 
		 
		 Button returnH = (Button)findViewById(R.id.return_home);
		 returnH.setOnClickListener(this);
		 

		 FlurryAgent.logEvent("Show Crit");
		 
		 
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
		
		Intent i = new Intent(ShowCrit.this, MainActivity.class);
		startActivity(i);
	}

}
