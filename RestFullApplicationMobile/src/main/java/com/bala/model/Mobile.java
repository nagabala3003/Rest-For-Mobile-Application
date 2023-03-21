package com.bala.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Mobile_Tab")
public class Mobile {
@Id
private Integer modelId;
private String modelName;
private String ram_Size;
private String rom_Size;
private String os_Name;
private String processor_Name;
private Double price;
private String company_Name;
public Mobile() {
	super();
}
public Mobile(Integer modelId, String modelName, String ram_Size, String rom_Size, String os_Name,
		String processor_Name, Double price, String company_Name) {
	super();
	this.modelId = modelId;
	this.modelName = modelName;
	this.ram_Size = ram_Size;
	this.rom_Size = rom_Size;
	this.os_Name = os_Name;
	this.processor_Name = processor_Name;
	this.price = price;
	this.company_Name = company_Name;
}
public Integer getModelId() {
	return modelId;
}
public void setModelId(Integer modelId) {
	this.modelId = modelId;
}
public String getModelName() {
	return modelName;
}
public void setModelName(String modelName) {
	this.modelName = modelName;
}
public String getRam_Size() {
	return ram_Size;
}
public void setRam_Size(String ram_Size) {
	this.ram_Size = ram_Size;
}
public String getRom_Size() {
	return rom_Size;
}
public void setRom_Size(String rom_Size) {
	this.rom_Size = rom_Size;
}
public String getOs_Name() {
	return os_Name;
}
public void setOs_Name(String os_Name) {
	this.os_Name = os_Name;
}
public String getProcessor_Name() {
	return processor_Name;
}
public void setProcessor_Name(String processor_Name) {
	this.processor_Name = processor_Name;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public String getCompany_Name() {
	return company_Name;
}
public void setCompany_Name(String company_Name) {
	this.company_Name = company_Name;
}
@Override
public String toString() {
	return "Mobile [modelId=" + modelId + ", modelName=" + modelName + ", ram_Size=" + ram_Size + ", rom_Size="
			+ rom_Size + ", os_Name=" + os_Name + ", processor_Name=" + processor_Name + ", price=" + price
			+ ", company_Name=" + company_Name + "]";
}


}
