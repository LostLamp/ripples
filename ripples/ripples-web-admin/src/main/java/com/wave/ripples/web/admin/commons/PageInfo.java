package com.wave.ripples.web.admin.commons;

import lombok.Data;

import java.util.List;


@Data
public class PageInfo<Member> {
    private int total;
    private List<Member> data;
}
