package com.springfamework.spring5mvcrest.bootstrap;

import com.springfamework.spring5mvcrest.domain.Vendor;
import com.springfamework.spring5mvcrest.repositories.VendorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class VendorBootstrap implements CommandLineRunner {

    private VendorRepository vendorRepository;

    public VendorBootstrap(VendorRepository vendorRepository) {
        this.vendorRepository = vendorRepository;
    }

    @Override
    public void run(String... args) {
        Vendor vendor1 = new Vendor();
            vendor1.setName("Vendor 1");
            vendorRepository.save(vendor1);

        Vendor vendor2 = new Vendor();
            vendor2.setName("Vendor 2");
            vendorRepository.save(vendor2);
    }
}
