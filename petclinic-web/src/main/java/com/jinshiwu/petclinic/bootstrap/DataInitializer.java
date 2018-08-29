package com.jinshiwu.petclinic.bootstrap;

import com.jinshiwu.petclinic.model.Owner;
import com.jinshiwu.petclinic.model.Vet;
import com.jinshiwu.petclinic.service.OwnerService;
import com.jinshiwu.petclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by EL on 8/28/18.
 */
@Component
public  class DataInitializer implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataInitializer(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    @Override
    public void run(String... strings) throws Exception {
        Owner owner1 = new Owner();

        owner1.setFirstName("jack");
        owner1.setLastName("ryan");
        ownerService.save(owner1);

        Owner owner2 = new Owner();

        owner2.setFirstName("josh");
        owner2.setLastName("ryan");
        ownerService.save(owner2);

        System.out.println("ownerservice working");

        Vet vet1 = new Vet();

        vet1.setFirstName("Baily");
        vet1.setLastName("T");
        vetService.save(vet1);

        Vet vet2 = new Vet();

        vet2.setFirstName("Baegle");
        vet2.setLastName("Will");
        vetService.save(vet2);

        System.out.println("vetservice working");
    }
}
