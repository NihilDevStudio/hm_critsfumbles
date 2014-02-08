package com.nihildev.critfumble;


import com.flurry.android.FlurryAgent;


import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class MainActivity extends Activity implements OnClickListener{

	private ProgressDialog dialog;
	Global mApplication;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button fumble = (Button)findViewById(R.id.fumble);
		fumble.setOnClickListener(this);
		findViewById(R.id.fumble);
		
		Button crit = (Button)findViewById(R.id.crit);
		crit.setOnClickListener(this);
		findViewById(R.id.crit);
		
		mApplication = (Global)getApplicationContext();
		
		dialog = new ProgressDialog(this);
        dialog.setMessage("Initializing the app. This will only take a few minutes the first time you start it.");
        dialog.setTitle("Hackmaster");
        dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        dialog.setCancelable(false);
		
		new DatabaseFill().execute("");

	}
	


	@Override
	public void onClick(View arg0) {
		
		if (arg0 == findViewById(R.id.fumble)){
			Intent intent = new Intent(MainActivity.this, Fumble.class);
			startActivity(intent);
		}
		
		if (arg0 == findViewById(R.id.crit)){
			Intent intent = new Intent(MainActivity.this, Crit.class);
			startActivity(intent);
		}
	}
	

	private class DatabaseFill extends AsyncTask<String, Float, Integer>{
		SQLiteDatabase db;
        protected void onPreExecute() {
        	Log.d("DB","onPreExecute");
        	 dialog.show();
    		db = mApplication.usdbh.getWritableDatabase();
         }

         protected Integer doInBackground(String... urls) {
        	 Log.d("DB","doInBackground");
        	 if(db != null){
    			 try{
    				 Cursor c = db.rawQuery("SELECT * FROM Fumbles", null);
    				 if(c.getCount()==0){
    					 Log.d("DB","Filling Database 1");
    					 FlurryAgent.logEvent("Filling Database");
    					 dataLoader dl = new dataLoader();
    					 dl.loadFumbles(db);
		        		 dl.loadCritCrushing(db);
		        		 dl.loadCritHacking(db);
		        	     dl.loadCritPiercing(db);
    				 }else{
    					 dataLoader dl = new dataLoader();
    					 Log.d("DB","Database is filled with data :)"); 
    				 }
    				 c.close();
    			 }catch(Exception e){
    				 Log.d("DB","DB Fill Exception: "+e.getMessage());
 
    			 }
        	 
        	 } 
			return null;
            
         }



         protected void onPostExecute(Integer bytes) {
        	 db.close();
        	 dialog.dismiss();
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
