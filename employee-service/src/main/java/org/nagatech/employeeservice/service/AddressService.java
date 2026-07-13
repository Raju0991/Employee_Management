package org.nagatech.employeeservice.service;

import org.nagatech.employeeservice.dtos.request.AddressRequest;
import org.nagatech.employeeservice.dtos.response.AddressResponse;

import java.util.List;

public interface AddressService {
    AddressResponse createAddress(AddressRequest request);
    AddressResponse updateAddress(Long address_id, AddressRequest request);
    AddressResponse getAddressById(Long address_id);
    List<AddressResponse> getAddresses();
    void deleteAddress(Long address_id);
}
