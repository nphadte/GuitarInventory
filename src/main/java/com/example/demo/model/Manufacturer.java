package com.example.demo.model;

import org.springframework.context.annotation.ComponentScan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@NamedNativeQuery(name = "Manufacturer.getAllThatSellAcoustics",
		query = "SELECT m.id, m.name, m.foundedDate, m.averageYearlySales, m.location_id as headquarters_id "
				+ "FROM Manufacturer m "
				+ "LEFT JOIN Model mod ON (m.id = mod.manufacturer_id) "
				+ "LEFT JOIN ModelType mt ON (mt.id = mod.modeltype_id) "
				+ "WHERE (mt.name = ?)", resultClass = Manufacturer.class)

public class Manufacturer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MFG_ID")
	private Long id;

	private String name;

	@Column(name="FOUNDED_DATE")
	private Date   foundedDate;

	@Column(name="AVERAGE_YEARLY_SALES")
	private BigDecimal averageYearlySales;

	private Boolean  active;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="LOCATION_ID")
	private List<Manufacturer> manufacturers = new ArrayList<Manufacturer>();

	@ManyToOne
	@JoinColumn(name="HEADQUARTER_ID")
	private Location headquarters;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getFoundedDate() {
		return foundedDate;
	}

	public void setFoundedDate(Date foundedDate) {
		this.foundedDate = foundedDate;
	}

	public BigDecimal getAverageYearlySales() {
		return averageYearlySales;
	}

	public void setAverageYearlySales(BigDecimal averageYearlySales) {
		this.averageYearlySales = averageYearlySales;
	}

	public List<Model> getModels() {
		return models;
	}

	public void setModels(List<Model> models) {
		this.models = models;
	}

	public Location getHeadquarters() {
		return headquarters;
	}

	public void setHeadquarters(Location headquarters) {
		this.headquarters = headquarters;
	}

	public Long getId() {
		return id;
	}

}

