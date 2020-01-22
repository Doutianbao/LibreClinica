/*
 * LibreClinica is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://libreclinica.org/license
 * LibreClinica, copyright (C) 2020
 */
// default package
// Generated Jul 31, 2013 2:03:33 PM by Hibernate Tools 3.4.0.CR1
package org.akaza.openclinica.domain.datamap;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.akaza.openclinica.domain.AbstractMutableDomainObject;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * OpenclinicaVersion generated by hbm2java
 */
@Entity
@Table(name = "openclinica_version")
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class OpenclinicaVersion  extends AbstractMutableDomainObject {

	private int id;
	private Integer version;
	private String name;
	private String buildNumber;
	private Date updateTimestamp;

	public OpenclinicaVersion() {
	}

	public OpenclinicaVersion(int id) {
		this.id = id;
	}

	public OpenclinicaVersion(int id, String name, String buildNumber,
			Date updateTimestamp) {
		this.id = id;
		this.name = name;
		this.buildNumber = buildNumber;
		this.updateTimestamp = updateTimestamp;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Version
	@Column(name = "version")
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "build_number", length = 1000)
	public String getBuildNumber() {
		return this.buildNumber;
	}

	public void setBuildNumber(String buildNumber) {
		this.buildNumber = buildNumber;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_timestamp", length = 8)
	public Date getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Date updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

}
