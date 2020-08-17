package com.example.servicedetails;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "ServiceDetails")
public class ServiceDetails implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name = "ID")
	private int id;
	
	//@Column(name = "Application_Name")
	private String applicationName;
	
	//@Column(name = "Path")
	private String path;
	
	//@Column(name = "Query")
	private String query;
	
	//@Column(name = "URL")
	private String url;
	
	//@Column(name = "IsCacheable")
	private String isCacheable;
	
	//@Column(name = "CacheExpiryTime")
	private String cacheExpiryTime;
	
	//@Column(name = "CacheExpiryDate")
	private String cacheExpiryDate;
	
	//@Column(name = "Status")
	private int status;

	public ServiceDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ServiceDetails(int id, String applicationName, String path, String query, String url, String isCacheable,
			String cacheExpiryTime, String cacheExpiryDate, int status) {
		super();
		this.id = id;
		this.applicationName = applicationName;
		this.path = path;
		this.query = query;
		this.url = url;
		this.isCacheable = isCacheable;
		this.cacheExpiryTime = cacheExpiryTime;
		this.cacheExpiryDate = cacheExpiryDate;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIsCacheable() {
		return isCacheable;
	}

	public void setIsCacheable(String isCacheable) {
		this.isCacheable = isCacheable;
	}

	public String getCacheExpiryTime() {
		return cacheExpiryTime;
	}

	public void setCacheExpiryTime(String cacheExpiryTime) {
		this.cacheExpiryTime = cacheExpiryTime;
	}

	public String getCacheExpiryDate() {
		return cacheExpiryDate;
	}

	public void setCacheExpiryDate(String cacheExpiryDate) {
		this.cacheExpiryDate = cacheExpiryDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((applicationName == null) ? 0 : applicationName.hashCode());
		result = prime * result + ((cacheExpiryDate == null) ? 0 : cacheExpiryDate.hashCode());
		result = prime * result + ((cacheExpiryTime == null) ? 0 : cacheExpiryTime.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((isCacheable == null) ? 0 : isCacheable.hashCode());
		result = prime * result + ((path == null) ? 0 : path.hashCode());
		result = prime * result + ((query == null) ? 0 : query.hashCode());
		result = prime * result + status;
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ServiceDetails other = (ServiceDetails) obj;
		if (applicationName == null) {
			if (other.applicationName != null)
				return false;
		} else if (!applicationName.equals(other.applicationName))
			return false;
		if (cacheExpiryDate == null) {
			if (other.cacheExpiryDate != null)
				return false;
		} else if (!cacheExpiryDate.equals(other.cacheExpiryDate))
			return false;
		if (cacheExpiryTime == null) {
			if (other.cacheExpiryTime != null)
				return false;
		} else if (!cacheExpiryTime.equals(other.cacheExpiryTime))
			return false;
		if (id != other.id)
			return false;
		if (isCacheable == null) {
			if (other.isCacheable != null)
				return false;
		} else if (!isCacheable.equals(other.isCacheable))
			return false;
		if (path == null) {
			if (other.path != null)
				return false;
		} else if (!path.equals(other.path))
			return false;
		if (query == null) {
			if (other.query != null)
				return false;
		} else if (!query.equals(other.query))
			return false;
		if (status != other.status)
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ServiceDetails [id=" + id + ", applicationName=" + applicationName + ", path=" + path + ", query="
				+ query + ", url=" + url + ", isCacheable=" + isCacheable + ", cacheExpiryTime=" + cacheExpiryTime
				+ ", cacheExpiryDate=" + cacheExpiryDate + ", status=" + status + "]";
	}
	
}
