package by.epam.flower_composition.entity;

import java.math.BigDecimal;



public class Fern extends Flower  {
	
	private static final long serialVersionUID = 3L;
	private String sort;
	private int height;
	private int numberOfFlower;

	public static class Builder {
		private Fern newFern;

		public Builder() {
			newFern = new Fern();
		}

		public Builder withNameOfFlower(String nameOfFower) {
			newFern.setNameOfFlower(nameOfFower);
			return this;
		}

		public Builder withColor(String color) {
			newFern.setColour(color);
			return this;
		}

		public Builder withPrice(BigDecimal price) {
			newFern.setPrice(price);
			return this;
		}
		 public Builder withSort(String sort) {
		    	newFern.sort=sort;
		    	return this;
		    }
		public Builder withHeight(int height) {
			newFern.height = height;
			return this;
		}

		public Builder withNumberOfFlower(int numberOfFlower) {
			newFern.numberOfFlower = numberOfFlower;
			return this;
		}

		public Fern build() {
			return newFern;
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
		result = prime * result + ((sort == null) ? 0 : sort.hashCode());
		result = prime * result + numberOfFlower;
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
		Fern other = (Fern) obj;
		if (height != other.height)
			return false;
		if (sort == null) {
			if (other.sort != null)
				return false;
		} else if (!sort.equals(other.sort))
			return false;
		if (numberOfFlower != other.numberOfFlower)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return  super.toString()+", sort="+sort+", height=" + height + ", numberOfFlower=" + numberOfFlower + "]";
	}

}
