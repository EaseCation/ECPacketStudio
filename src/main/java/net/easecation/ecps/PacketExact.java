package net.easecation.ecps;

import java.nio.ByteBuffer;

/**
 * By lmlstarqaq http://snake1999.com/
 * Creation time: 2017/6/1 17:04.
 */
public interface PacketExact {

    ByteBuffer getPayload();

    static PacketExact from(ByteBuffer buffer) {
        return () -> buffer;
    }
}
