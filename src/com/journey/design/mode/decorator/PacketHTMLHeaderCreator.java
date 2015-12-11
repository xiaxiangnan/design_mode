package com.journey.design.mode.decorator;

/**
 * PROJECT: design_mode
 * Created by xiaxiangnan on 15-9-30.
 */
public class PacketHTMLHeaderCreator extends PacketDecorator {


    public PacketHTMLHeaderCreator(IPacketCreator c) {
        super(c);
    }

    @Override
    public String handleContent() { //将给定的数据封装成HTML
        StringBuilder sb = new StringBuilder();
        sb.append("<html>");
        sb.append("<body>");
        sb.append(component.handleContent());
        sb.append("</html>");
        sb.append("</body>\n");
        return sb.toString();
    }
}
