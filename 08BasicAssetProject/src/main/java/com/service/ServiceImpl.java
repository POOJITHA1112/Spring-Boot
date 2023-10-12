package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.DaoImpl;
import com.model.Asset;

@Service
public class ServiceImpl implements AssetService{

	@Autowired
	DaoImpl impl;
	
	@Override
	public Asset save(Asset a) {
		return impl.save(a);
	}

	@Override
	public List<Asset> getAll() {
		return impl.getAll();
	}

	@Override
	public Asset update(Asset a) {
		return impl.update(a);
	}

	@Override
	public int delete(int id) {
		return impl.delete(id);
	}

	@Override
	public Asset getbyid(int id) {
		return impl.getbyid(id);
	}

}
