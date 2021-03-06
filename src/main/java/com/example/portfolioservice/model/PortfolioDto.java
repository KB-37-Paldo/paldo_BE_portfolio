package com.example.portfolioservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PortfolioDto {
    private long portfolioId;
    private String investType;
    private long targetPrice;
    private Date targetPeriod;
    private Date createAt;
    private long userId;
    private String description;
    private List<PortfolioDetailDto> details;
}
