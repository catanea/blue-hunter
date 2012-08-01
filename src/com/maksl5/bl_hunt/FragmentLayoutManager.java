package com.maksl5.bl_hunt;



import com.maksl5.bl_hunt.MainActivity.CustomSectionFragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class FragmentLayoutManager {

	private LayoutInflater parentInflater;
	private ViewGroup rootContainer;
	private Bundle params;
	private Context parentContext;

	public FragmentLayoutManager(LayoutInflater inflater,
			ViewGroup container,
			Bundle args,
			Context context) {

		parentInflater = inflater;
		rootContainer = container;
		params = args;
		parentContext = context;

	}

	public View getSpecificView() {

		int sectionNumber = params.getInt(CustomSectionFragment.ARG_SECTION_NUMBER);

		switch (sectionNumber) {
		case 1:
			return parentInflater.inflate(R.layout.act_page_discovery, rootContainer, false);
		case 2:

		case 3:

		case 4:
			
		}
		
		return new View(parentContext);
	}

}
