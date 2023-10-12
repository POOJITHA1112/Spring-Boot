package com.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.model.Asset;

@Repository
public class DaoImpl implements AssetDao {

	@Autowired
	JdbcTemplate jdbc;
	
	@Override
	public Asset save(Asset a) {
		String q="insert into asset values(?,?,?,?,?,?,?)";
		int i = jdbc.update(q, a.getId(),a.getAssetName(),a.getRefId(),a.getInstallationDate(),a.getLabName(),a.getOwnerName(),a.getPhotoUrl());
		return a;
	}

	

	@Override
	public Asset update(Asset a) {
		String q="update asset set assetName=?,refId=?,installationDate=?,labName=?,ownerName=?,photoUrl=? where id=?" ;
		int i= jdbc.update(q, a.getAssetName(),a.getRefId(),a.getInstallationDate(),a.getLabName(),a.getOwnerName(),a.getPhotoUrl(),a.getId());
		return a;
	}

	@Override
	public int delete(int id) {
		String q="delete from asset where id=?";
		return jdbc.update(q, id);
	}

	@Override
	public Asset getbyid(int id) {
		String s="select *  from asset where id=?";
		return jdbc.queryForObject(s,new BeanPropertyRowMapper<>(Asset.class), new Object[] {id});
	}



	@Override
	public List<Asset> getAll() {
		String q="select * from asset";
		return jdbc.query(q, new CustomResultSetExtractor());
		 
	}

}
