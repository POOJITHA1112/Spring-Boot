package com.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.w3c.dom.ls.LSInput;

import com.model.Asset;

public class CustomResultSetExtractor implements ResultSetExtractor<List<Asset>>{

	@Override
	public List<Asset> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<Asset>a=new ArrayList<Asset>();
		while(rs.next()) {
			Asset a1=new Asset();
			a1.setId(rs.getInt(1));
			a1.setAssetName(rs.getString(2));
			a1.setRefId(rs.getString(3));
			a1.setInstallationDate(rs.getDate(4));
			a1.setLabName(rs.getString(5));
			a1.setOwnerName(rs.getString(6));
			a1.setPhotoUrl(rs.getString(7));
			
			
		}
		return a;
	}

}
