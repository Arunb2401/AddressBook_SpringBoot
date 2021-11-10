package com.bridgelabz.addressbook_springboot.Repository;

import com.bridgelabz.addressbook_springboot.Model.AddressbookData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressBookRepository extends JpaRepository<AddressbookData, Integer> {
}
