package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.*;
import com.example.demo.repository.*;
import java.util.Collection;
import java.util.stream.Collectors;

@RestController @CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {
  @Autowired
  private CountryCodeRepository countryCodeRepository;
  @Autowired
  private CustomerRepository customerRepository;
  @Autowired
  private SexRepository sexRepository;
  @Autowired
  private TitleNameRepository titleNameRepository;

  @Autowired
  public CustomerController(CountryCodeRepository countryCodeRepository, CustomerRepository customerRepository,
                             SexRepository sexRepository, TitleNameRepository titleNameRepository){
    this.countryCodeRepository = countryCodeRepository;
    this.customerRepository = customerRepository;
    this.sexRepository = sexRepository;
    this.titleNameRepository = titleNameRepository;
  }

  @GetMapping(path = "/countryCode", produces = MediaType.APPLICATION_JSON_VALUE)
  public Collection<CountryCodeEntity> CountryCode(){
    return countryCodeRepository.findAll().stream().collect(Collectors.toList());
  }

  @GetMapping(path = "/customer", produces = MediaType.APPLICATION_JSON_VALUE)
  public Collection<CustomerEntity> Customer(){
    return customerRepository.findAll().stream().collect(Collectors.toList());
  }

  @GetMapping(path = "/sex", produces = MediaType.APPLICATION_JSON_VALUE)
  public Collection<SexEntity> Sex(){
    return sexRepository.findAll().stream().collect(Collectors.toList());
  }

  @GetMapping(path = "/TitleNameEntity", produces = MediaType.APPLICATION_JSON_VALUE)
  public Collection<TitleNameEntity> TitleName(){
    return titleNameRepository.findAll().stream().collect(Collectors.toList());
  }

  @PostMapping("/customer/{titleName}/{customerName}/{sex}/{email}/{pass}/{countryCode}/{phone}/{address}")
  public CustomerEntity customer(@RequestBody CustomerEntity cus, @PathVariable String titleName, @PathVariable String customerName,
                                 @PathVariable String sex, @PathVariable String email, @PathVariable String pass, @PathVariable Long countryCode,
                                 @PathVariable String phone, @PathVariable String address) {
    CustomerEntity customerEntity = new CustomerEntity();
    TitleNameEntity title = titleNameRepository.findBytitlename(titleName);
    CountryCodeEntity countrycode = countryCodeRepository.findBycountrycodeid(countryCode);
    SexEntity csex = sexRepository.findBycustomersex(sex);

    customerEntity.setTitleName(title);
    customerEntity.setCustomername(customerName);
    customerEntity.setCustomeremail(email);
    customerEntity.setCountry(countrycode);
    customerEntity.setCustomerphone(phone);
    customerEntity.setCustomeraddress(address);
    customerEntity.setCustomersex(csex);
    customerEntity.setCustomerpass(pass);

    return customerRepository.save(customerEntity);
  }



}
