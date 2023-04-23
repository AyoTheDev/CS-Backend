package com.scienta.cs;

import java.lang.String;

public class DgsConstants {
  public static final String QUERY_TYPE = "Query";

  public static class TRACKERRESPONSE {
    public static final String TYPE_NAME = "TrackerResponse";

    public static final String Id = "id";

    public static final String TrackingCode = "trackingCode";

    public static final String Status = "status";

    public static final String SignedBy = "signedBy";

    public static final String Weight = "weight";

    public static final String EstDeliveryDate = "estDeliveryDate";

    public static final String ShipmentId = "shipmentId";

    public static final String Carrier = "carrier";

    public static final String TrackingDetails = "trackingDetails";

    public static final String PublicUrl = "publicUrl";

    public static final String Fees = "fees";

    public static final String CreatedAt = "createdAt";

    public static final String UpdatedAt = "updatedAt";
  }

  public static class TRACKINGDETAILRESPONSE {
    public static final String TYPE_NAME = "TrackingDetailResponse";

    public static final String Message = "message";

    public static final String Status = "status";

    public static final String Datetime = "datetime";

    public static final String Source = "source";

    public static final String TrackingLocation = "trackingLocation";
  }

  public static class TRACKINGLOCATION {
    public static final String TYPE_NAME = "TrackingLocation";

    public static final String City = "city";

    public static final String State = "state";

    public static final String Country = "country";

    public static final String Zip = "zip";
  }

  public static class PAYMENTHISTORY {
    public static final String TYPE_NAME = "PaymentHistory";

    public static final String Id = "id";

    public static final String Amount = "amount";

    public static final String Currency = "currency";

    public static final String Provider = "provider";

    public static final String Transaction_type = "transaction_type";

    public static final String Created_at = "created_at";

    public static final String Status = "status";
  }

  public static class SHIPMENTRESPONSE {
    public static final String TYPE_NAME = "ShipmentResponse";

    public static final String Id = "id";

    public static final String From = "from";

    public static final String To = "to";

    public static final String RateList = "rateList";

    public static final String Messages = "messages";
  }

  public static class POSTAGELABELRESPONSE {
    public static final String TYPE_NAME = "PostageLabelResponse";

    public static final String Id = "id";

    public static final String LabelDate = "labelDate";

    public static final String LabelEpl2Url = "labelEpl2Url";

    public static final String LabelFileType = "labelFileType";

    public static final String LabelPdfUrl = "labelPdfUrl";

    public static final String LabelResolution = "labelResolution";

    public static final String LabelSize = "labelSize";

    public static final String LabelType = "labelType";

    public static final String LabelUrl = "labelUrl";

    public static final String LabelZplUrl = "labelZplUrl";
  }

  public static class MESSAGE {
    public static final String TYPE_NAME = "Message";

    public static final String Carrier = "carrier";

    public static final String Type = "type";

    public static final String Message = "message";

    public static final String Carrier_account_id = "carrier_account_id";
  }

  public static class RATERESPONSE {
    public static final String TYPE_NAME = "RateResponse";

    public static final String Id = "id";

    public static final String Object = "object";

    public static final String Billing_type = "billing_type";

    public static final String Carrier_account_id = "carrier_account_id";

    public static final String Service = "service";

    public static final String Rate = "rate";

    public static final String Carrier = "carrier";

    public static final String Currency = "currency";

    public static final String Description = "description";

    public static final String Shipment_id = "shipment_id";

    public static final String Delivery_days = "delivery_days";

    public static final String Delivery_date = "delivery_date";

    public static final String Delivery_date_guaranteed = "delivery_date_guaranteed";

    public static final String PostageLabel = "postageLabel";

    public static final String Status = "status";

    public static final String Tracker = "tracker";
  }

  public static class CURRENCYRESPONSE {
    public static final String TYPE_NAME = "CurrencyResponse";

    public static final String Id = "id";

    public static final String Code = "code";

    public static final String Name = "name";

    public static final String Enable = "enable";

    public static final String WalletRegex = "walletRegex";

    public static final String Priority = "priority";

    public static final String ExtraIdExists = "extraIdExists";

    public static final String ExtraIdRegex = "extraIdRegex";

    public static final String LogoUrl = "logoUrl";

    public static final String Track = "track";

    public static final String CgId = "cgId";

    public static final String IsMaxlimit = "isMaxlimit";

    public static final String Network = "network";

    public static final String SmartContract = "smartContract";

    public static final String NetworkPrecision = "networkPrecision";
  }

  public static class MUTATION {
    public static final String TYPE_NAME = "Mutation";

    public static final String InitOrder = "initOrder";

    public static final String CompleteOrder = "completeOrder";

    public static final String SendLabelsToEmail = "sendLabelsToEmail";

    public static final String InitShipment = "initShipment";

    public static final String ImportFromCsv = "importFromCsv";
  }

  public static class QUERY {
    public static final String TYPE_NAME = "Query";

    public static final String GetOrder = "getOrder";

    public static final String GetTracker = "getTracker";

    public static final String History = "history";

    public static final String Currency = "currency";
  }

  public static class ORDERGETRESPONSE {
    public static final String TYPE_NAME = "OrderGetResponse";

    public static final String RateList = "rateList";

    public static final String Status = "status";

    public static final String TransactionId = "transactionId";

    public static final String OrderId = "orderId";
  }

  public static class ORDERCOMPLETERESPONSE {
    public static final String TYPE_NAME = "OrderCompleteResponse";

    public static final String Invoice_url = "invoice_url";
  }

  public static class ORDERRESPONSE {
    public static final String TYPE_NAME = "OrderResponse";

    public static final String Id = "id";
  }

  public static class TRACKERGETREQUEST {
    public static final String TYPE_NAME = "TrackerGetRequest";

    public static final String Code = "code";
  }

  public static class TRANSACTIONREQUEST {
    public static final String TYPE_NAME = "TransactionRequest";

    public static final String UserUuid = "userUuid";

    public static final String FromDate = "fromDate";

    public static final String ToDate = "toDate";

    public static final String Size = "size";

    public static final String Page = "page";
  }

  public static class SHIPMENTREQUEST {
    public static final String TYPE_NAME = "ShipmentRequest";

    public static final String Parcel = "parcel";

    public static final String FromAddress = "fromAddress";

    public static final String ToAddress = "toAddress";

    public static final String SignatureType = "signatureType";
  }

  public static class ADDRESSREQUEST {
    public static final String TYPE_NAME = "AddressRequest";

    public static final String Name = "name";

    public static final String AddressLine1 = "addressLine1";

    public static final String AddressLine2 = "addressLine2";

    public static final String City = "city";

    public static final String Postcode = "postcode";

    public static final String Country = "country";

    public static final String Phone = "phone";

    public static final String State = "state";
  }

  public static class PARCELREQUEST {
    public static final String TYPE_NAME = "ParcelRequest";

    public static final String MeasurementType = "measurementType";

    public static final String Length = "length";

    public static final String Width = "width";

    public static final String Height = "height";

    public static final String Weight = "weight";
  }

  public static class ORDERGETREQUEST {
    public static final String TYPE_NAME = "OrderGetRequest";

    public static final String OrderId = "orderId";
  }

  public static class ORDERCOMPLETEREQUEST {
    public static final String TYPE_NAME = "OrderCompleteRequest";

    public static final String OrderId = "orderId";
  }

  public static class ORDEREMAILREQUEST {
    public static final String TYPE_NAME = "OrderEmailRequest";

    public static final String OrderId = "orderId";

    public static final String Email = "email";
  }

  public static class ORDERREQUEST {
    public static final String TYPE_NAME = "OrderRequest";

    public static final String OrderList = "orderList";
  }

  public static class ORDERREQUESTINFO {
    public static final String TYPE_NAME = "OrderRequestInfo";

    public static final String RateId = "rateId";

    public static final String ShipmentId = "shipmentId";
  }
}
