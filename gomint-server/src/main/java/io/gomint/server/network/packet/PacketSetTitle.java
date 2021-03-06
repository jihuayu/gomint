package io.gomint.server.network.packet;

import io.gomint.jraknet.PacketBuffer;
import io.gomint.server.network.Protocol;

public class PacketSetTitle extends Packet {

    private int type;
    private String text = "";
    private int fadeInTime = 0;
    private int stayTime = 0;
    private int fadeOutTime = 0;

    public PacketSetTitle() {
        super( Protocol.PACKET_SET_TITLE );
    }

    @Override
    public void serialize( PacketBuffer buffer, int protocolID ) {
        buffer.writeSignedVarInt( type );
        buffer.writeString( text );
        buffer.writeSignedVarInt( fadeInTime );
        buffer.writeSignedVarInt( stayTime );
        buffer.writeSignedVarInt( fadeOutTime );
    }

    @Override
    public void deserialize( PacketBuffer buffer, int protocolID ) {
        this.type = buffer.readSignedVarInt();
        this.text = buffer.readString();
        this.fadeInTime = buffer.readSignedVarInt();
        this.stayTime = buffer.readSignedVarInt();
        this.fadeOutTime = buffer.readSignedVarInt();
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getFadeInTime() {
        return fadeInTime;
    }

    public void setFadeInTime(int fadeInTime) {
        this.fadeInTime = fadeInTime;
    }

    public int getStayTime() {
        return stayTime;
    }

    public void setStayTime(int stayTime) {
        this.stayTime = stayTime;
    }

    public int getFadeOutTime() {
        return fadeOutTime;
    }

    public void setFadeOutTime(int fadeOutTime) {
        this.fadeOutTime = fadeOutTime;
    }

    public enum TitleType {

        TYPE_CLEAR( 0 ),
        TYPE_RESET( 1 ),
        TYPE_TITLE( 2 ),
        TYPE_SUBTITLE( 3 ),
        TYPE_ACTION_BAR( 4 ),
        TYPE_ANIMATION_TIMES( 5 );

        private final int id;

        TitleType(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

    }
}
