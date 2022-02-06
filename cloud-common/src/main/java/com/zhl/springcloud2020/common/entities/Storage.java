package com.zhl.springcloud2020.common.entities;

import lombok.*;

import java.math.BigInteger;

/**
 * @author Administrator
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Storage {
    private Integer id;

    private int productid;

    private int total;

    private int used;

    private int residue;

    public Storage(int productid, int total, int used, int residue) {
        this(null, productid, total, used, residue);
    }
}
