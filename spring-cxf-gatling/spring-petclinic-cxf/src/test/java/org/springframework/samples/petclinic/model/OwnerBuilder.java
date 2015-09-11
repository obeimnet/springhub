package org.springframework.samples.petclinic.model;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class OwnerBuilder {

	private Owner owner = new Owner();
	
	public OwnerBuilder firstName(String firstName) {
		owner.setFirstName(firstName);
		return this;
	}
	
	public OwnerBuilder lastName(String lastName) {
		owner.setLastName(lastName);
		return this;
	}
	
	
	public OwnerBuilder address(String address) {
		owner.setAddress(address);
		return this;
	}
	
	public OwnerBuilder city(String city) {
		owner.setCity(city);
		return this;
	}
	
	public OwnerBuilder telephone(String telephone) {
		owner.setTelephone(telephone);
		return this;
	}
	
	public Owner build() {
		return owner;
	}
	
	public static void main(String[] args) throws JAXBException {
		Owner  owner = new OwnerBuilder()
						.firstName("John")
						.lastName("Citizen")
						.address("1 George St")
						.city("SYDNEY")
						.telephone("11111111").build();

		JAXBContext context = JAXBContext.newInstance(Owner.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(owner, System.out);
	}
}

