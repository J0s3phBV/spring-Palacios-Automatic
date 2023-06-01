package com.idat.pe.model;

public class Producto {
	private Integer id;
	private String prodNom;
	private String prodDes;
	private String image;
	private double precio;
	private int cantidad;
	
	
	
	public Producto() {
	}

	public Producto(Integer id, String prodNom, String prodDes, String image, double precio, int cantidad) {
		this.id = id;
		this.prodNom = prodNom;
		this.prodDes = prodDes;
		this.image = image;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProdNom() {
		return prodNom;
	}

	public void setProdNom(String prodNom) {
		this.prodNom = prodNom;
	}

	public String getProdDes() {
		return prodDes;
	}

	public void setProdDes(String prodDes) {
		this.prodDes = prodDes;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", prodNom=" + prodNom + ", prodDes=" + prodDes + ", image=" + image + ", precio="
				+ precio + ", cantidad=" + cantidad + "]";
	}
	
		
}
