package com.scienta.cs.address.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {
    @Id()
    @Column(name = "id", nullable = false, length = 512)
    private String id;                      //	Unique identifier, begins with "adr_"
    private String mode;                        //	Set based on which api-key you used, either "test" or "production"
    private String street1;                     //	First line of the address
    private String street2;                     //	Second line of the address
    private String city;                        //	City the address is located in
    private String state;                       //	State or province the address is located in
    private String zip;                     //	ZIP or postal code the address is located in
    private String country;                     //	ISO 3166 country code for the country the address is located in
    private Boolean residential;                        //	Whether or not this address would be considered residential
    private String carrierFacility;                        //	The specific designation for the address (only relevant if the address is a carrier facility)
    private String name;                        //	Name of the person. Both name and company can be included
    private String company;                     //	Name of the organization. Both name and company can be included
    private String phone;                       //	Phone number to reach the person or organization
    private String email;                       //	Email to reach the person or organization
    private String federalTaxId;                      //	Federal tax identifier of the person or organization
    private String stateTaxId;
}
