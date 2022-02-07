package by.epam.flower_composition.entity;

import java.math.BigDecimal;

public class Carnation extends Flower  {

	private static final long serialVersionUID = 2L;
	private String sort;
	private int height;
	private int numberOfFlower;

	public static class Builder {
		private Carnation newCarnation;

		public Builder() {
			newCarnation = new Carnation();
		}

		public Builder withNameOfFlower(String nameOfFlower) {
			newCarnation.setNameOfFlower(nameOfFlower);
			return this;
		}

		public Builder withColor(String color) {
			newCarnation.setColour(color);
			return this;
		}

		public Builder withPrice(BigDecimal price) {
			newCarnation.setPrice(price);
			;
			return this;
		}

		public Builder withSort(String sort) {
			newCarnation.sort = sort;
			return this;
		}

		public Builder withHeight(int height) {
			newCarnation.height = height;
			;
			return this;
		}

		public Builder withNumberOfFlower(int numberOfFlower) {
			newCarnation.numberOfFlower = numberOfFlower;
			return this;
		}

		public Carnation build() {
			return newCarnation;
		}
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getNumberOfFlower() {
		return numberOfFlower;
	}

	public void setNumberOfFlower(int numberOfFlower) {
		this.numberOfFlower = numberOfFlower;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + height;
		result = prime * result + numberOfFlower;
		result = prime * result + ((sort == null) ? 0 : sort.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carnation other = (Carnation) obj;
		if (height != other.height)
			return false;
		if (numberOfFlower != other.numberOfFlower)
			return false;
		if (sort == null) {
			if (other.sort != null)
				return false;
		} else if (!sort.equals(other.sort))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + ", sort= " + sort + " height=" + height + ", numberOfFlower=" + numberOfFlower;
	}
}
