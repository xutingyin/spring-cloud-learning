package cn.xutingyin.springcloudclient.controller;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student implements Serializable {
    private String name;
    private BigDecimal math;
    private BigDecimal chinese;
    private BigDecimal english;
    private BigDecimal total;

}
