package org.nagatech.employeeservice.service;

import org.nagatech.employeeservice.dtos.request.AddressRequest;
import org.nagatech.employeeservice.dtos.response.AddressResponse;

import java.util.List;

public class AddressServiceImpl implements AddressService{
    @Override
    public AddressResponse createAddress(AddressRequest request) {
        return null;
    }

    @Override
    public AddressResponse updateAddress(Long address_id, AddressRequest request) {
        return null;
    }

    @Override
    public AddressResponse getAddressById(Long address_id) {
        return null;
    }

    @Override
    public List<AddressResponse> getAddresses() {
        return List.of();
    }

    @Override
    public void deleteAddress(Long address_id) {

    }
}
