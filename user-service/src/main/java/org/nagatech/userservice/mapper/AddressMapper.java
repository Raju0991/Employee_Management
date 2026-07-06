package org.nagatech.userservice.mapper;

import org.mapstruct.Mapper;
import org.nagatech.userservice.dto.AddressRequest;
import org.nagatech.userservice.dto.AddressResponse;
import org.nagatech.userservice.model.Address;
@Mapper(componentModel = "spring")
public interface AddressMapper {
    Address toEntity(AddressRequest request);
    AddressResponse toResponse(Address address);
}
