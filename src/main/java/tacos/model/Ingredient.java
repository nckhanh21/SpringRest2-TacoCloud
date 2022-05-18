
package tacos.model;

import javax.persistence.*;

@Entity
@Table(name="ingredient")
public class Ingredient {
	@Id
	private String id;

	@Column
	private String name;

	@Column
	@Enumerated(EnumType.STRING)
	private Type type;

	public Ingredient(String id, String name, Type type) {
		this.id = id;
		this.name = name;
		this.type = type;
	}

	public Ingredient() {

	}

	public static enum Type {
		WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
}