package com.journey.design.mode.flyweight;

/**
 * 享元模式
 * PROJECT: design_mode
 * Created by xiaxiangnan on 15-9-30.
 */
public class Main {

    public static void main(String[] args) {
        ReportManagerFactory rmf = new ReportManagerFactory();
        IReportManager rm = rmf.getFinancialReportManager("A");
        System.out.println(rm.createReport());
    }
}
