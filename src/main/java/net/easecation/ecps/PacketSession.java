package net.easecation.ecps;

import java.net.InetAddress;
import java.time.Instant;
import java.util.Optional;

/**
 * By lmlstarqaq http://snake1999.com/
 * Creation time: 2017/6/3 17:16.
 */
public interface PacketSession {

    InetAddress addressFrom();

    InetAddress addressTo();

    Optional<Instant> creationTime();

    Optional<Instant> destroyTime();
}
