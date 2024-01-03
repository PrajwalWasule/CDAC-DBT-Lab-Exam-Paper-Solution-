package core;

import java.time.LocalDate;

public class PetsToy {
	private static int cnt;
	static {
		cnt=0;
	}
	private Integer id;
	private String name;
	private Brand brand;
	private Species species;
	private String material;
	private Integer stock;
	private LocalDate stockListingDate;
	private LocalDate stockUpdateDate;
	private Double price;
	public PetsToy(String name, Brand brand, Species species, String material, Integer stock, Double price,LocalDate stockListingDate) {
		super();
		this.id = ++cnt;
		this.name = name;
		this.brand = brand;
		this.species = species;
		this.material = material;
		this.stock = stock;
		this.price = price;
		this.stockListingDate = stockListingDate;
		this.stockUpdateDate = stockListingDate;
		
	}
	
	public PetsToy(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		setStockUpdateDate(stockUpdateDate);
		this.stock = stock;
	}

	public LocalDate getStockListingDate() {
		return stockListingDate;
	}

	public void setStockListingDate(LocalDate stockListingDate) {
		this.stockListingDate = stockListingDate;
	}

	public LocalDate getStockUpdateDate() {
		return stockUpdateDate;
	}

	public void setStockUpdateDate(LocalDate stockUpdateDate) {
		this.stockUpdateDate = stockUpdateDate;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override 
	public boolean equals(Object o){
		if(o instanceof PetsToy) {
			PetsToy p = (PetsToy) o;
			return name.equals(p.name);
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "PetsToy [id=" + id + ", name=" + name + ", brand=" + brand + ", species=" + species + ", material="
				+ material + ", stock=" + stock + ", stockListingDate=" + stockListingDate + ", stockUpdateDate="
				+ stockUpdateDate + ", price=" + price + "]";
	}

	
}
