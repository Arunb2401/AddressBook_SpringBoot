package com.bridgelabz.addressbook_springboot.Controller;


import com.bridgelabz.addressbook_springboot.DTO.AddressBookDTO;
import com.bridgelabz.addressbook_springboot.DTO.ResponseDTO;
import com.bridgelabz.addressbook_springboot.Model.AddressbookData;
import com.bridgelabz.addressbook_springboot.Service.IAddressBookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

//@CrossOrigin(maxAge = 3600)
//@CrossOrigin(allowedHeaders = "*", origins = "*")

@CrossOrigin (origins = "http://localhost:4200/", maxAge = 3600)
@Slf4j
@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {

    private final IAddressBookService addressBookService;

    public AddressBookController(IAddressBookService addressBookService) {
        this.addressBookService = addressBookService;
    }

    @RequestMapping(value = { "", "/", "/get" })
//    @CrossOrigin (origins = "http://localhost:4200/")
    public ResponseEntity<ResponseDTO> getAddressBookData() {
        List<AddressbookData> PersonDataList = addressBookService.getAddressBookData();
        ResponseDTO responseDTO = new ResponseDTO("GET call is Successful", PersonDataList);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }


//    @CrossOrigin (origins = "http://localhost:4200/")
    @GetMapping("/get/{personId}")
    public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("personId") int personId) {
        AddressbookData personData = addressBookService.getAddressBookDataById(personId);
        ResponseDTO responseDTO = new ResponseDTO("GET call for ID is successfull for ID: ", personData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }


//    @CrossOrigin (origins = "http://localhost:4200/")
    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddressBookData(
            @Valid @RequestBody AddressBookDTO addressBookDTO) {
        AddressbookData personData;
        personData = addressBookService.createAddressBookData(addressBookDTO);
        log.debug("Person DTO:" + personData);
        ResponseDTO responseDTO = new ResponseDTO("Created Address Book Data Successfully !!", personData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

//    @CrossOrigin(origins = "http://localhost:4200/")
    @PutMapping("/update/{personId}")
    public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable("personId") int personId,
                                                                 @Valid @RequestBody AddressBookDTO addressBookDTO) {
        log.debug("Person DTO:" + addressBookDTO.toString());
        AddressbookData personData = addressBookService.updateAddressBookData(personId, addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Updated Address Book Data Successfully!!", personData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

//    @CrossOrigin (origins = "http://localhost:4200/")
    @DeleteMapping("/delete/{personId}")
    public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("personId") int personId) {
        addressBookService.deleteAddressBookData(personId);
        ResponseDTO responseDTO = new ResponseDTO("DELETED Successfully !!", "Deleted ID: " + personId);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
}
