package com.core.jsonparser.service;

import java.util.List;

public interface IJsonProcessor<OBJECTT> {
	
	List<OBJECTT> getJSONtoListObject();
	
}
