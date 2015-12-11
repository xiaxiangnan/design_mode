package com.journey.design.mode.proxy;

/**
 * PROJECT: design_mode
 * Created by xiaxiangnan on 15-9-2.
 */
public class DBQuery implements IDBQuery {

    /**
     * 可能包含数据库连接等耗时操作
     */
    public DBQuery() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String request() {
        return "request";
    }
}

