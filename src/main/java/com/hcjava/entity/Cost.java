package com.hcjava.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * �����ʷѵ�
 * 
 * @author huachuang
 *
 */
public class Cost implements Serializable {

	private Integer id;
	private String name;
	private String status;
	private Timestamp createtime;
	private Timestamp starttime;
	private String type;

	public Cost() {
		super();
	}

	public Cost(Integer id, String name, String status, Timestamp createtime, Timestamp starttime, String type) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.createtime = createtime;
		this.starttime = starttime;
		this.type = type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

	public Timestamp getStarttime() {
		return starttime;
	}

	public void setStarttime(Timestamp starttime) {
		this.starttime = starttime;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
