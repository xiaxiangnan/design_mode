package com.journey.design.mode.decorator;

/**
 * PROJECT: design_mode
 * Created by xiaxiangnan on 15-9-30.
 */
public class PacketHTTPHeaderCreator extends PacketDecorator {


    public PacketHTTPHeaderCreator(IPacketCreator c) {
        super(c);
    }

    @Override
    public String handleContent() { //将给定的数据封装成HTTP
        StringBuilder sb = new StringBuilder();
        sb.append("Cache-Control:no-cache\n");
        sb.append("Date:Mon,31Dec201204;25;57GMT\n");
        sb.append(component.handleContent());
        return sb.toString();
    }
}
