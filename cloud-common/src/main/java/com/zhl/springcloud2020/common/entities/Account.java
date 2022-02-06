package com.zhl.springcloud2020.common.entities;

import lombok.*;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author Administrator
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Account {
    private Integer id;

    private int userid;

    private int total;

    private int used;

    private int residue;

    public Account(int userid, int total, int used, int residue) {
        this(null,userid, total, used, residue);
    }
}
