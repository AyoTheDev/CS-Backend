package com.scienta.cs.batch;


import com.scienta.cs.types.ShipmentResponse;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface BatchCreatorService {

    List<ShipmentResponse> importFromCsv(MultipartFile multipartFile);

}
