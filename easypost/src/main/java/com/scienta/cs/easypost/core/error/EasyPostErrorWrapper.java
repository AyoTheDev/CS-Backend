package com.scienta.cs.easypost.core.error;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EasyPostErrorWrapper {

    private EasyPostError error;

}
