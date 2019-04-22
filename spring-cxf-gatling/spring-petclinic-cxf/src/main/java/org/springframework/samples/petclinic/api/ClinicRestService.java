package org.springframework.samples.petclinic.api;

import java.util.Collection;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.samples.petclinic.owner.Owner;
import org.springframework.samples.petclinic.owner.OwnerRepository;
import org.springframework.samples.petclinic.owner.Pet;
import org.springframework.samples.petclinic.owner.PetRepository;
import org.springframework.samples.petclinic.owner.PetType;
import org.springframework.samples.petclinic.vet.Vet;
import org.springframework.samples.petclinic.vet.VetRepository;
import org.springframework.stereotype.Service;

import io.swagger.annotations.Api;

@Api(value = "/clinic", produces = "application/json")
@Path("/clinic")
@Service("clinicRestService")
@Produces("application/json")
@Consumes("application/json")
public class ClinicRestService {

	@Resource
	private OwnerRepository ownerRepository;
	@Resource
	private PetRepository petRepository;
	@Resource
	private VetRepository vetRepository;
	
	 
	@GET
	@Path(value = "petTypes")
	public Collection<PetType> findPetTypes() {
		return petRepository.findPetTypes();
	}

	@GET
	@Path(value = "owner/{id}")
	public Owner findOwnerById(int id) {
    	return ownerRepository.findById(id);
    }
	
	
	@GET
	@Path(value = "pet/{id}")
	public Pet findPetById(int id) {
    	return petRepository.findById(id);
    }

	@GET
	@Path(value = "vets")
	public Collection<Vet> findVets() {
    	return vetRepository.findAll();
    }
    

	public Collection<Owner> findOwnerByLastName(String lastName) {
    	return ownerRepository.findByLastName(lastName);
    }
	
	@POST
	@Path(value = "owner")
	public void createOwner(Owner owner) {
		ownerRepository.save(owner);
	}
    
}
