package com.ignat.sfgpetclinic.services;

import com.ignat.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
