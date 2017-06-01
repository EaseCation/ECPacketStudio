package net.easecation.ecps;

import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.time.Instant;

/**
 * By lmlstarqaq http://snake1999.com/
 * Creation time: 2017/6/1 17:04.
 */
public interface PacketLogNode {

    ByteBuffer getPayload();

    Instant getTimeSent();

    InetAddress addressFrom();

    InetAddress addressTo();
}
