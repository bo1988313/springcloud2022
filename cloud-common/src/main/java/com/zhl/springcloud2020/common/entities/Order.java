package com.zhl.springcloud2020.common.entities;

import lombok.*;


/**
 * @author Administrator
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Order {
    private Integer id;

    private int userid;

    private int productid;

    private int money;

    private int count;

    private int status;

    public Order(int userid, int productid, int money, int count, int status) {
        this(null, userid,  productid,  money,  count,  status);
    }
}
