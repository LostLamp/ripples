package com.wave.ripples.web.admin.dto;

import com.wave.ripples.domain.Member;
import lombok.Data;
import java.io.Serializable;
import java.util.List;


/**
 * 用于封装 DataTable 数据源
 * @Author wodef
 * @version 1.0.0
 * @Date 2018/12/20
 */
@Data
public class DataTable<Member> implements Serializable {
    private int draw;
    private int recordsTotal;
    private int recordsFiltered;
    private List<Member> data;
}
