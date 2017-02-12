package net.rcelma.feb10_17_fragmentcomms;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements Fragment1.IF1, Fragment2.IF2 {
	private Fragment1 f1;
	private Fragment2 f2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		FragmentManager manager = getSupportFragmentManager();
		FragmentTransaction transaction = manager.beginTransaction();

		//This can also be done by tags, putting the TAG in the add in the transaction, (for headless fragments)
		f1 = (Fragment1) manager.findFragmentById(R.id.fL4F1);
		if(null == f1){
			f1 = new Fragment1();
			transaction.add(R.id.fL4F1, f1, "F1");//Adding the TAG!
		}
		f2 = (Fragment2) manager.findFragmentById(R.id.fL4F2);
		if(null == f2){
			f2 = new Fragment2();
			transaction.add(R.id.fL4F2, f2);
		}


		transaction.commit();
	}

	public void iSend22(String text) {

		f2.setText(text);
	}

	public void iSend21(String text) {

		f1.setText(text);
	}
}