package com.scienta.cs.cms.models;

import lombok.Data;

@Data
public class CmsResponse<T> {

    CmsData<T> data;

}
