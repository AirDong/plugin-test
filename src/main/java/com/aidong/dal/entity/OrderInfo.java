package com.aidong.dal.entity;

import java.util.Date;

/**
 * className: OrderInfo
 * tableName: t_order_info
 * remarks:订单表
 * @author aidong.pan
 */
public class OrderInfo {
    /**
     * columnName: ORDER_NO
     * remarks: 订单号
     */
    private String orderNo;

    /**
     * columnName: ORDER_DESC
     * remarks: 订单描述
     */
    private String orderDesc;

    /**
     * columnName: ORDER_DATE
     * remarks: 订单日期
     */
    private String orderDate;

    /**
     * columnName: CREATE_USER
     * remarks: 创建人
     */
    private String createUser;

    /**
     * columnName: CREATE_TIME
     * remarks: 创建时间
     */
    private Date createTime;

    /**
     * columnName: CUSTOMER
     * remarks: 客户名
     */
    private String customer;

    /**
     * columnName: CUSTOMER_EMAIL
     * remarks: 客户邮箱
     */
    private String customerEmail;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc == null ? null : orderDesc.trim();
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate == null ? null : orderDate.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail == null ? null : customerEmail.trim();
    }
}