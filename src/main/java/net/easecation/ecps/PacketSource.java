package net.easecation.ecps;

import java.util.stream.Stream;

/**
 * By lmlstarqaq http://snake1999.com/
 * Creation time: 2017/6/1 17:04.
 */
public interface PacketSource {

    Stream<PacketLogNode> allPackets();
}
