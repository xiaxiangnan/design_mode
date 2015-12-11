package com.journey.design.mode.decorator;

/**
 * 装饰者模式
 * PROJECT: design_mode
 * Created by xiaxiangnan on 15-9-30.
 */
public class Main {

    public static void main(String[] args) {
        IPacketCreator pc = new PacketHTTPHeaderCreator(new PacketHTMLHeaderCreator(new PacketBodyCreator()));
        System.out.println(pc.handleContent());
    }
}
