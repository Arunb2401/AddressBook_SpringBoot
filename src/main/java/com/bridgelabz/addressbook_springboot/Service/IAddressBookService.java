package com.bridgelabz.addressbook_springboot.Service;

import com.bridgelabz.addressbook_springboot.DTO.AddressBookDTO;
import com.bridgelabz.addressbook_springboot.Model.AddressbookData;
import java.util.List;


public interface IAddressBookService {
    List<AddressbookData> getAddressBookData();
    AddressbookData getAddressBookDataById(int personId);
    AddressbookData updateAddressBookData(int personId ,AddressBookDTO addressBookDTO);
    AddressbookData createAddressBookData(AddressBookDTO addressBookDTO);
    void deleteAddressBookData(int personId);

}
