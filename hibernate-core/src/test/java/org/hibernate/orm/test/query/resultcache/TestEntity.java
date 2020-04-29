/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.hibernate.orm.test.query.resultcache;

import java.time.Instant;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Steve Ebersole
 */
@Entity
public class TestEntity {
	@Id
	private Integer id;
	private String name;
	@Temporal( TemporalType.TIMESTAMP )
	private Instant instant;

	public TestEntity() {
	}

	public TestEntity(Integer id, String name) {
		this( id, name, Instant.now() );
	}

	public TestEntity(Integer id, String name, Instant instant) {
		this.id = id;
		this.name = name;
		this.instant = instant;
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

	public Instant getInstant() {
		return instant;
	}

	public void setInstant(Instant instant) {
		this.instant = instant;
	}
}
