package net.easecation.ecps;

import java.nio.ByteBuffer;
import java.time.Instant;
import java.util.List;

/**
 * By lmlstarqaq http://snake1999.com/
 * Creation time: 2017/6/1 17:04.
 */
public interface PacketLogNode {

    List<PacketLogNode> subNode();

    long getPacketSize();

    ByteBuffer getPacketPayload();

    PacketSession getPacketSession();

    Instant getTimeSent();
}
