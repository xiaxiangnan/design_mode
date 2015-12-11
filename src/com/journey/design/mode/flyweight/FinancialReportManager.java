package com.journey.design.mode.flyweight;

/**
 * 财务报表
 * PROJECT: design_mode
 * Created by xiaxiangnan on 15-9-30.
 */
public class FinancialReportManager implements IReportManager {

    protected String tenantId = null;

    public FinancialReportManager(String tenantId) { //租户ID
        this.tenantId = tenantId;
    }

    @Override
    public String createReport() {
        return "This is a financial report";
    }


}
