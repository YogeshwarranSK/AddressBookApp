package com.example.AddressBook.service;

import com.example.AddressBook.dto.AddressDTO;
import com.example.AddressBook.model.AddressBookData;

import java.util.List;

public interface IAddressBookService {
    List<AddressBookData> getAll();
    AddressBookData getById(int id);
    AddressBookData create(AddressDTO dto);
    AddressBookData update(int id, AddressDTO dto);
    void delete(int id);
}
