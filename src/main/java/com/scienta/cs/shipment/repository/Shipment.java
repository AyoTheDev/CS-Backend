package com.scienta.cs.shipment.repository;

import com.scienta.cs.address.model.entity.Address;
import com.scienta.cs.fee.model.entity.Fee;
import com.scienta.cs.forms.models.entity.Form;
import com.scienta.cs.parcel.model.entity.Parcel;
import com.scienta.cs.postagelabel.model.entity.PostageLabel;
import com.scienta.cs.rate.model.entity.Rate;
import com.scienta.cs.scanform.model.entity.ScanForm;
import com.scienta.cs.tracker.model.entity.Tracker;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "shipments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Shipment {

    @Id
    @Column(name = "id", nullable = false, length = 512)
    private String id;

    private String mode;//	"test" or "production"

    @OneToOne(optional = false, cascade = { CascadeType.ALL })
    @JoinColumn(name = "to_address_id")
    private Address toAddress;//	The destination address

    @OneToOne(optional = false, cascade = { CascadeType.ALL })
    @JoinColumn(name = "from_address_id")
    private Address fromAddress;//	The origin address

    @OneToOne(optional = false, cascade = { CascadeType.ALL })
    @JoinColumn(name = "parcel_id")
    private Parcel parcel;//	The dimensions and weight of the package

//    @Embedded
//    private CustomsInfoDto customsInfo;//	Information for the processing of customs

    @OneToOne(cascade = { CascadeType.ALL })
    @JoinColumn(name = "scan_form_id")
    private ScanForm scanForm;//	Document created to manifest and scan multiple shipments

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "shipment")
    private List<Form> forms = new ArrayList<>();         // array	All associated Form objects

    private String insurance;//	The associated Insurance amount

    @OneToMany(mappedBy = "shipmentId", cascade = { CascadeType.ALL })
    private List<Rate> rates = new ArrayList<>();// array	All associated RateDto objects

    @OneToOne(cascade = { CascadeType.ALL })
    @JoinColumn(name = "postage_label_ID")
    private PostageLabel postageLabel;//	The associated PostageLabel object
    private String trackingCode;//	If purchased, the tracking code will appear here as well as within the Tracker object
    private Integer uspsZone;//	The USPS zone of the shipment, if purchased with USPS
    private String status;//	The current tracking status of the shipment

    @OneToOne(cascade = { CascadeType.ALL })
    @JoinColumn(name = "tracker_ID")
    private Tracker tracker;//	The associated Tracker object

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "shipment")
    private List<Fee> fees = new ArrayList<>();// array	The associated Fee objects charged to the billing user account
    private String refundStatus;//	The current status of the shipment refund process. Possible values are "submitted", "refunded", "rejected".
    private String batchId;//	The ID of the batch that contains this shipment, if any
    private String batchStatus;//	The current status of the associated BatchShipment
    private String batchMessage;//	The current message of the associated BatchShipment
    private LocalDateTime createdAt;//
    private LocalDateTime updatedAt;//

}
