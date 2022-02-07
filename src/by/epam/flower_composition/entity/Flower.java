package by.epam.flower_composition.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class Flower implements Serializable {

	private static final long serialVersionUID = 4L;
	private String nameOfFlower;
	private String color;
	private BigDecimal price;

	public Flower(String nameOfFlower, String color, BigDecimal price) {
		super();
		this.nameOfFlower = nameOfFlower;
		this.color = color;
		this.price = price;
	}

	public Flower() {

	}

	public String getNameOfFlower() {
		return nameOfFlower;
	}

	public void setNameOfFlower(String nameOfFlower) {
		this.nameOfFlower = nameOfFlower;
	}

	public String getColor() {
		return color;
	}

	public void setColour(String color) {
		this.color = color;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((nameOfFlower == null) ? 0 : nameOfFlower.hashCode());
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
		Flower other = (Flower) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (nameOfFlower == null) {
			if (other.nameOfFlower != null)
				return false;
		} else if (!nameOfFlower.equals(other.nameOfFlower))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return " NameOfFlower=" + nameOfFlower + ", colour=" + color + ", price=" + price + ",";
	}

}
