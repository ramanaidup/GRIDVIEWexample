package gridviewexample.pkg.com.gridviewexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends Activity {
//rama
//rama
//rama
//rama
//rama
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 GridView gridview = (GridView) findViewById(R.id.gridview);

//Add New Line
		    gridview.setAdapter(new ImageAdapter(this));

		    gridview.setOnItemClickListener(new OnItemClickListener() {
		        public void onItemClick(AdapterView<?> parent, View v,
		                int position, long id) {
		            Toast.makeText(MainActivity.this, "" + position,
		                    Toast.LENGTH_SHORT).show();
		        }
		    });
		
	}

}
