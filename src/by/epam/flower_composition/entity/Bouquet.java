package by.epam.flower_composition.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Bouquet implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Wrapping wrappings;
	private List<Flower> flowers;

	{
		flowers = new ArrayList<Flower>();
	}

	public Bouquet() {

	}

	public Bouquet(Wrapping wrappings) {
		this.wrappings = wrappings;
	}

	public void addFlower(Flower flower) {
		flowers.add(flower);
	}

	public void removeFlower(Flower flower) {
		flowers.remove(flower);
	}

	public Wrapping getWrappings() {
		return wrappings;
	}

	public void setWrappings(Wrapping wrappings) {
		this.wrappings = wrappings;
	}

	public List<Flower> getFlowers() {
		return flowers;
	}

	public void setFlowers(List<Flower> flowers) {
		this.flowers = flowers;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((flowers == null) ? 0 : flowers.hashCode());
		result = prime * result + ((wrappings == null) ? 0 : wrappings.hashCode());
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
		Bouquet other = (Bouquet) obj;
		if (flowers == null) {
			if (other.flowers != null)
				return false;
		} else if (!flowers.equals(other.flowers))
			return false;
		if (wrappings == null) {
			if (other.wrappings != null)
				return false;
		} else if (!wrappings.equals(other.wrappings))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bouquet [Wrapping=" + wrappings + ", flowers=" + flowers + "]";
	}
}
