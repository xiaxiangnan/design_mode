package com.journey.design.mode.decorator;

/**
 * 核心业务逻辑全部委托component完成，自己仅仅是做增强处理
 * PROJECT: design_mode
 * Created by xiaxiangnan on 15-9-30.
 */
public abstract class PacketDecorator implements IPacketCreator {

    IPacketCreator component;

    public PacketDecorator(IPacketCreator c) {
        this.component = c;
    }

}
