package com.journey.design.mode.flyweight;

/**
 * 员工报表
 * PROJECT: design_mode
 * Created by xiaxiangnan on 15-9-30.
 */
public class EmployeeReportManager implements IReportManager {


    protected String tenantId = null;

    public EmployeeReportManager(String tenantId) { //租户ID
        this.tenantId = tenantId;
    }

    @Override
    public String createReport() {
        return "This is a employee report";
    }

}
