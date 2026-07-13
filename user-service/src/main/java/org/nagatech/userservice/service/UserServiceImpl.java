package org.nagatech.userservice.service;

import org.nagatech.userservice.dto.UserRequest;
import org.nagatech.userservice.dto.UserResponse;
import org.nagatech.userservice.exception.UserNotFundException;
import org.nagatech.userservice.mapper.AddressMapper;
import org.nagatech.userservice.mapper.UserMapper;
import org.nagatech.userservice.mapper.UsersMapper;
import org.nagatech.userservice.model.Address;
import org.nagatech.userservice.model.User;
import org.nagatech.userservice.repository.AddressRepository;
import org.nagatech.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UsersMapper usersMapper;
    @Autowired
    private AddressMapper addressMapper;
    @Autowired
    private AddressRepository addressRepository;
    private UserRepository repository;

    @Autowired
    public void setRepository(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserResponse createUser(UserRequest request) {
        Address savedAddress = null;
        if (request.getAddress() != null) {
            Address address = addressMapper.toEntity(request.getAddress());
            savedAddress = addressRepository.save(address);
        }
        User user = usersMapper.toEntity(request);
        user.setAddress(savedAddress);
        User savedUser = repository.save(user);
        return usersMapper.toResponse(savedUser);
    }

    @Override
    public List<UserResponse> getAllUsers() {
        List<User> users = repository.findAll();
        return users.stream().map(usersMapper::toResponse).toList();
    }

    @Override
    public UserResponse updateUser(UserRequest request, Long id) throws Exception {
        User user = repository.findById(id).orElseThrow(() ->
                new UserNotFundException("User NotFound with this id: " + id));
        User savedUser = usersMapper.toUpdateEntity(request, user);
        User updatedUser = repository.save(savedUser);
        return usersMapper.toResponse(updatedUser);
    }

    @Override
    public void  deleteUser(Long id) throws Exception {
        User user = repository.findById(id).orElseThrow(() ->
                new UserNotFundException("User is not found with this id: " + id));
      repository.delete(user);
    }
}
