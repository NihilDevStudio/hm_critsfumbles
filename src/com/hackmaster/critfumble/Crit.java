package com.hackmaster.critfumble;

import java.util.Random;

import com.flurry.android.FlurryAgent;



import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;

public class Crit extends Activity  implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_crit);
		
		Button next = (Button)findViewById(R.id.next);
		next.setOnClickListener(this);
		
		FlurryAgent.logEvent("Crit Step 1");
	}

	@Override
	public void onClick(View v) {
		
		if (v == findViewById(R.id.next)){	
			
			EditText diff = (EditText)findViewById(R.id.diff);
			String diffs = diff.getText().toString();
			
			
			if(diffs.compareTo("")!=0){
				Spinner atk = (Spinner) findViewById(R.id.atk);
				Spinner def = (Spinner) findViewById(R.id.def);
				Spinner dam = (Spinner) findViewById(R.id.dam);
				int diffi = Integer.parseInt(diffs);
				Log.d("Intent","Intent");
				Intent i = new Intent(Crit.this, Crit2.class);
				i.putExtra("Number", diffi);
				i.putExtra("atk", atk.getItemAtPosition(atk.getSelectedItemPosition()).toString());
				i.putExtra("def", def.getItemAtPosition(def.getSelectedItemPosition()).toString());
				i.putExtra("dam", dam.getItemAtPosition(dam.getSelectedItemPosition()).toString());
				i.putExtra("dif", diffi);
				startActivity(i);
			}else{
				Toast.makeText(getApplicationContext(),"I need all the information!!!", Toast.LENGTH_SHORT).show();
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
