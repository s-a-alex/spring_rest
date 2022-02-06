package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Setter
@Getter
public class Singer implements Serializable {

	@Id
	@GeneratedValue(strategy = AUTO)
	private Long id;

	@Version
	private int version;

	private String firstName;

	private String lastName;

	@Temporal(TemporalType.DATE)
	private Date birthDate;

	private String description;

	@Override
	public String toString() {
		return "Singer - Id: " + id + ", First name: " + firstName
				+ ", Last name: " + lastName + ", Birthday: " + birthDate
				+ ", Description: " + description;
	}
}
