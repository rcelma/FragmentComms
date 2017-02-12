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
public class Fragment2 extends Fragment {
	private EditText et2;
	private Button b2F2;


	public Fragment2() {
		// Required empty public constructor
	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_fragment2, container, false);
		et2 = (EditText) view.findViewById(R.id.eT1F2);
		b2F2 = (Button) view.findViewById(R.id.b1F2);
		b2F2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				sendText();
			}
		});
		setRetainInstance(false);
		return view;
	}

	private void sendText(){

		sendWInterface();
	}

	private void sendWInterface() {

		IF2 main = (IF2) getActivity();
		main.iSend21(et2.getText().toString());
	}

	public void setText(String text){
		et2.setText(text);
	}

	public interface IF2{
		void iSend21(String text);
	}
}