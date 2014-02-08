package com.nihildev.critfumble;

import java.util.Random;

import com.flurry.android.FlurryAgent;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;

public class Fumble extends Activity  implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fumble);
		getActionBar().hide();
		
		Button roll = (Button)findViewById(R.id.roll);
		roll.setOnClickListener(this);
		
		Button fumble = (Button)findViewById(R.id.fumble);
		fumble.setOnClickListener(this);
		
		FlurryAgent.logEvent("Fumble");
	}

	@Override
	public void onClick(View v) {
		if (v == findViewById(R.id.roll)){
			Random rand = new Random();
			int x = rand.nextInt(999);
			EditText d1000 = (EditText)findViewById(R.id.d1000);
			d1000.setText(""+x);
			FlurryAgent.logEvent("Autoroll Fumble");
		}
		
		if (v == findViewById(R.id.fumble)){
			
			
			EditText d1000 = (EditText)findViewById(R.id.d1000);
			String d1000s = d1000.getText().toString();
			
			
			EditText diff = (EditText)findViewById(R.id.diff);
			String diffs = diff.getText().toString();
			
			
			if(d1000s.compareTo("")!=0 && diffs.compareTo("")!=0){
				
				int d1000i = Integer.parseInt(d1000s);
				Log.d("DB","d1000i: "+d1000i);
				
				int diffi = Integer.parseInt(diffs);
				Log.d("DB","diffi: "+diffi);
				d1000i = d1000i + (diffi*10);
				Log.d("DB","Total: "+d1000i);
				
				Intent i = new Intent(Fumble.this, ShowFumble.class);
				i.putExtra("Number", d1000i);
				startActivity(i);
			}else{
				Toast.makeText(getApplicationContext(),"I need all the information to make you fumble!!!", Toast.LENGTH_SHORT).show();
			}
			
		}
		
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
}
