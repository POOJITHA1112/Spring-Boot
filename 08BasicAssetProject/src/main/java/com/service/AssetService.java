package com.service;

import java.util.List;

import com.model.Asset;

public interface AssetService {

	Asset save(Asset a);

	List<Asset> getAll();

	Asset update(Asset a);

	int delete(int id);
	
	Asset getbyid(int id);

}
