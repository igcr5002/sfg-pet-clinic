package com.ignat.sfgpetclinic.services;

import com.ignat.sfgpetclinic.model.Pet;
import com.ignat.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Pet pet);

    Set<Vet> findAll();
}
