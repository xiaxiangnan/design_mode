package com.journey.design.mode.decorator;

/**
 * PROJECT: design_mode
 * Created by xiaxiangnan on 15-9-30.
 */
public class PacketBodyCreator implements IPacketCreator {
    @Override
    public String handleContent() {
        return "Content of Packet"; //构造核心数据，但不包含格式
    }
}
