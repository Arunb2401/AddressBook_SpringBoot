package com.bridgelabz.addressbook_springboot.Model;

import com.bridgelabz.addressbook_springboot.DTO.AddressBookDTO;
import lombok.Data;
import javax.persistence.*;

@SuppressWarnings("ALL")
@Entity
@Table(name = "addressbook")
public @Data class AddressbookData {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int personId;
        private String fullName;
        private  String address;
        private String city;
        private long zipCode;
        private long phoneNumber;
        private String state;

        public AddressbookData() {}

        public AddressbookData(AddressBookDTO addressBookDTO) {
            this.updateAddressbookData(addressBookDTO);
        }

        public void updateAddressbookData(AddressBookDTO addressBookDTO) {
            this.fullName = addressBookDTO.fullName;
            this.address = addressBookDTO.address;
            this.city = addressBookDTO.city;
            this.state = addressBookDTO.state;
            this.zipCode = addressBookDTO.zipCode;
            this.phoneNumber = addressBookDTO.phoneNumber;
        }
}
