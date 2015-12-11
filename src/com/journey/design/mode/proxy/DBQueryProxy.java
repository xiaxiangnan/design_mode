package com.journey.design.mode.proxy;

/**
 * PROJECT: design_mode
 * Created by xiaxiangnan on 15-9-2.
 */
public class DBQueryProxy implements IDBQuery {

    private DBQuery real = null;

    @Override
    public String request() {
        //真正需要的时候才创建，创建时间可能很慢
        if (real == null) {
            real = new DBQuery();
        }

        return real.request();
    }


    public static void main(String[] args) {
        IDBQuery query = new DBQueryProxy();
        query.request(); //在使用时才创建真实的对象
    }


}
