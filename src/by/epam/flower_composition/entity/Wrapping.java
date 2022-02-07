package by.epam.flower_composition.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class Wrapping implements Serializable {

	private static final long serialVersionUID = 7L;
	private String composition;
	private String color;
	private BigDecimal price;

	public static class Builder {
		private Wrapping newWrapping;

		public Builder() {
			newWrapping = new Wrapping();
		}

		public Builder withComposition(String composition) {
			newWrapping.composition = composition;
			return this;
		}

		public Builder withColor(String color) {
			newWrapping.color = color;
			return this;
		}

		public Builder withPrice(BigDecimal price) {
			newWrapping.price = price;
			return this;
		}

		public Wrapping build() {
			return newWrapping;
		}
	}

	public String getComposition() {
		return composition;
	}

	public void setComposition(String composition) {
		this.composition = composition;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
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
		result = prime * result + ((composition == null) ? 0 : composition.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
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
		Wrapping other = (Wrapping) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (composition == null) {
			if (other.composition != null)
				return false;
		} else if (!composition.equals(other.composition))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Wrapping [composition=" + composition + ", color=" + color + ", price=" + price + "]";
	}

}
