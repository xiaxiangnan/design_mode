package com.journey.design.mode.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 * PROJECT: design_mode
 * Created by xiaxiangnan on 15-9-30.
 */
public class ReportManagerFactory {

    Map<String, IReportManager> financialReportManager = new HashMap<String, IReportManager>();

    Map<String, IReportManager> employeeReportManager = new HashMap<String, IReportManager>();

    /**
     * 通过租户ID获得享元
     * @param tenantID 租户ID
     * @return 享元对象
     */
    IReportManager getFinancialReportManager(String tenantID) {
        IReportManager r = financialReportManager.get(tenantID);
        if (r == null) { //维护已创建好的享元对象
            r = new FinancialReportManager(tenantID);
            financialReportManager.put(tenantID, r);
        }
        return r;
    }

    IReportManager getEmployeeReportManager(String tenantID) {
        IReportManager r = employeeReportManager.get(tenantID);
        if (r == null) { //维护已创建好的享元对象
            r = new EmployeeReportManager(tenantID);
            employeeReportManager.put(tenantID, r);
        }
        return r;
    }


}
