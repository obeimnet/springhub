package net.springhub.samples.cxf;

import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.samples.petclinic.model.Owner;
import org.springframework.samples.petclinic.model.Pet;
import org.springframework.samples.petclinic.model.PetType;
import org.springframework.samples.petclinic.model.Vet;
import org.springframework.samples.petclinic.service.ClinicService;

@Path(value = "clinicRestService")
@Produces("application/xml")
public class ClinicRestService {

	private ClinicService clinicService;
	
	public ClinicService getClinicService() {
		return clinicService;
	}

	public void setClinicService(ClinicService clinicService) {
		this.clinicService = clinicService;
	}

	@GET
	@Path(value = "petTypes")
	public Collection<PetType> findPetTypes() {
		return clinicService.findPetTypes();
	}

	@GET
	@Path(value = "owner/{id}")
	public Owner findOwnerById(int id) {
    	return clinicService.findOwnerById(id);
    }
	
	
	@GET
	@Path(value = "pet/{id}")
	public Pet findPetById(int id) {
    	return clinicService.findPetById(id);
    }

	@GET
	@Path(value = "vets")
	public Collection<Vet> findVets() {
    	return clinicService.findVets();
    }
    

	public Collection<Owner> findOwnerByLastName(String lastName) {
    	return clinicService.findOwnerByLastName(lastName);
    }
	
	@POST
	@Path(value = "owner")
	public void createOwner(Owner owner) {
		clinicService.saveOwner(owner);
	}
    
}
