package com.iprody.aptgateway.model;

import com.iprody.aptgateway.enums.PaymentStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Payment {
    private Long id;

    private Long inquiryRefId;

    private BigDecimal amount;

    private String currency;

    private Long transactionRefId;

    private PaymentStatus status;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    public Payment() {
    }

    public Payment(Long id, Long inquiryRefId, BigDecimal amount, String currency, Long transactionRefId, PaymentStatus status, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.inquiryRefId = inquiryRefId;
        this.amount = amount;
        this.currency = currency;
        this.transactionRefId = transactionRefId;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getInquiryRefId() {
        return inquiryRefId;
    }

    public void setInquiryRefId(Long inquiryRefId) {
        this.inquiryRefId = inquiryRefId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Long getTransactionRefId() {
        return transactionRefId;
    }

    public void setTransactionRefId(Long transactionRefId) {
        this.transactionRefId = transactionRefId;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
