package com.scienta.cs.easypost.shipment.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.scienta.cs.easypost.address.models.AddressDto;
import com.scienta.cs.easypost.parcel.models.ParcelDto;
import com.scienta.cs.easypost.custominfo.models.CustomsInfoDto;
import com.scienta.cs.easypost.fee.models.FeeDto;
import com.scienta.cs.easypost.form.models.FormDto;
import com.scienta.cs.easypost.message.models.MessageDto;
import com.scienta.cs.easypost.postagelabel.models.PostageLabelDto;
import com.scienta.cs.easypost.rate.models.RateDto;
import com.scienta.cs.easypost.scanform.models.ScanFormDto;
import com.scienta.cs.easypost.tracker.models.TrackerDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShipmentDto {

    private String id;//	Unique, begins with "shp_"
    @JsonProperty("carrier_accounts")
    private List<String> carrierAccounts = new ArrayList<>();
    private String object;//	"Shipment"
    private String reference;//	An optional field that may be used in place of id in other API endpoints
    private String mode;//	"test" or "production"
    @JsonProperty("to_address")
    private AddressDto toAddress;//	The destination address
    @JsonProperty("from_address")
    private AddressDto fromAddress;//	The origin address
    @JsonProperty("return_address")
    private AddressDto returnAddress;//	The shipper's address, defaults to from_address
    @JsonProperty("buyer_address")
    private AddressDto buyerAddress;//	The buyer's address, defaults to to_address
    private ParcelDto parcel;//	The dimensions and weight of the package
    @JsonProperty("customs_info")
    private CustomsInfoDto customsInfo;//	Information for the processing of customs
    @JsonProperty("scan_form")
    private ScanFormDto scanForm;//	Document created to manifest and scan multiple shipments
    private List<FormDto> forms;         // array	All associated Form objects
    private String insurance;//	The associated Insurance amount
    private List<RateDto> rates;// array	All associated RateDto objects
    @JsonProperty("selected_rate")
    private RateDto selectedRate;//	The specific rate purchased for the shipment, or null if unpurchased or purchased through another mechanism
    @JsonProperty("postage_label")
    private PostageLabelDto postageLabel;//	The associated PostageLabel object
    private List<MessageDto> messages;// array	Any carrier errors encountered during rating, discussed in more depth below
    private OptionsDto options;//	All of the options passed to the shipment, discussed in more depth below
    @JsonProperty("is_return")
    private Boolean isReturn;//	Set true to create as a return, discussed in more depth below
    @JsonProperty("tracking_code")
    private String trackingCode;//	If purchased, the tracking code will appear here as well as within the Tracker object
    @JsonProperty("usps_zone")
    private Integer uspsZone;//	The USPS zone of the shipment, if purchased with USPS
    private String status;//	The current tracking status of the shipment
    private TrackerDto tracker;//	The associated Tracker object
    private List<FeeDto> fees;// array	The associated Fee objects charged to the billing user account
    @JsonProperty("refund_status")
    private String refundStatus;//	The current status of the shipment refund process. Possible values are "submitted", "refunded", "rejected".
    @JsonProperty("batch_id")
    private String batchId;//	The ID of the batch that contains this shipment, if any
    @JsonProperty("batch_status")
    private String batchStatus;//	The current status of the associated BatchShipment
    @JsonProperty("batch_message")
    private String batchMessage;//	The current message of the associated BatchShipment
    @JsonProperty("created_at")
    private LocalDateTime createdAt;//
    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;//

}
