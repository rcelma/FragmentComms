package net.rcelma.feb10_17_fragmentcomms;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {
	private EditText et1;
	private Button b1F1;


	public Fragment1() {
		// Required empty public constructor
	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_fragment1, container, false);
		et1 = (EditText) view.findViewById(R.id.eT1F1);
		b1F1 = (Button) view.findViewById(R.id.b1F1);
		b1F1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				sendText();
			}
		});
		setRetainInstance(true);
		return view;
	}

	private void sendText() {

		sendWInterface();
	}

	private void sendWInterface() {

		IF1 main = (IF1) getActivity();
		main.iSend22(et1.getText().toString());
	}

	public void setText(String text){
		et1.setText(text);
	}

	public interface IF1{
		void iSend22(String text);
	}
}
