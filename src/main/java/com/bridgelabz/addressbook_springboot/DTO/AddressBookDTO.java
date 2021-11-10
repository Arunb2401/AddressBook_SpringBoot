package com.bridgelabz.addressbook_springboot.DTO;

import lombok.ToString;
import javax.validation.constraints.*;


public @ToString class AddressBookDTO {

        @NotNull(message = "Enter Fullname")
        public String fullName;

        @NotNull(message = "Enter address.")
        public  String address;

        @NotNull(message = "Enter City")
        public String city;

        public String state;

        @NotNull(message = "Enter ZipCode.")
        public long zipCode;

        @NotBlank(message = "Enter PhoneNumber.")
        public long phoneNumber;
}
