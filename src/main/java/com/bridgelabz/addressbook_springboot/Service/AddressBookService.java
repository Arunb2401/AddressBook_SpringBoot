package com.bridgelabz.addressbook_springboot.Service;

import com.bridgelabz.addressbook_springboot.DTO.AddressBookDTO;
import com.bridgelabz.addressbook_springboot.Exception.CustomAddressBookException;
import com.bridgelabz.addressbook_springboot.Model.AddressbookData;
import com.bridgelabz.addressbook_springboot.Repository.AddressBookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Slf4j
public  class AddressBookService implements IAddressBookService {

    @Autowired
    private AddressBookRepository addressbookRepository;

    public List<AddressbookData> getAddressBookData() {
        return addressbookRepository.findAll();
    }

    public AddressbookData getAddressBookDataById(int personId) {
        return addressbookRepository
                .findById(personId)
                .orElseThrow(() -> new CustomAddressBookException
                        ("User with personId" + personId + "does not Exists.....!!"));
    }



    public AddressbookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressbookData personData = new AddressbookData(addressBookDTO);
        log.debug("Person Data: " + personData.toString());
        return addressbookRepository.save(personData);
    }

    public AddressbookData updateAddressBookData(int personId, AddressBookDTO addressBookDTO) {
        AddressbookData personData = this.getAddressBookDataById(personId);
        personData.updateAddressbookData(addressBookDTO);
        return addressbookRepository.save(personData);
    }

    public void deleteAddressBookData(int personId) {
        AddressbookData personData = this.getAddressBookDataById(personId);
        addressbookRepository.delete(personData);
    }
}
