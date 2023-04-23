package com.scienta.cs.nowpayments.core.models;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@AllArgsConstructor
public class Pair<A, B> {
    public A left;
    public B right;
}

