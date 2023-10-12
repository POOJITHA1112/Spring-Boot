package com.model;

import java.sql.Date;

public class Asset {
	
	private int id;
	private String assetName;
	private String refId;
	private Date installationDate;
	private String labName;
	private String ownerName;
	private String photoUrl;
	
	public Asset() {
		
	}

	public Asset(int id, String assetName, String refId, Date installationDate, String labName, String ownerName,String photoUrl) {
		this.id=id;
		this.assetName = assetName;
		this.refId = refId;
		this.installationDate = installationDate;
		this.labName = labName;
		this.ownerName = ownerName;
		this.photoUrl=photoUrl;
	}
	
	

	public Asset(int id,String assetName, String refId, String labName, String ownerName,String photoUrl) {
		super();
		this.id=id;
		this.assetName = assetName;
		this.refId = refId;
		this.labName = labName;
		this.ownerName = ownerName;
		this.photoUrl=photoUrl;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public String getRefId() {
		return refId;
	}

	public void setRefId(String refId) {
		this.refId = refId;
	}

	public Date getInstallationDate() {
		return installationDate;
	}

	public void setInstallationDate(Date installationDate) {
		this.installationDate = installationDate;
	}

	public String getLabName() {
		return labName;
	}

	public void setLabName(String labName) {
		this.labName = labName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	@Override
	public String toString() {
		return "Asset [id=" + id + ", assetName=" + assetName + ", refId=" + refId + ", installationDate="
				+ installationDate + ", labName=" + labName + ", ownerName=" + ownerName + ", photoUrl=" + photoUrl
				+ "]";
	}

	
	

}
