package com.saubao.szuclass;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ViewSwitcher;

public class HomeFragment extends Fragment{
	
	private View layoutView;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		layoutView = inflater.inflate(R.layout.home_fragment, null); 
		ViewSwitcher vs = (ViewSwitcher)layoutView.findViewById(R.id.home_view_switcher);
		vs.setDisplayedChild(0);
		Button Login = (Button)layoutView.findViewById(R.id.login_submit);
		Login.setText("haha");
		return layoutView;
	}
	
}
