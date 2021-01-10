/*
 * Copyright 2021 icefrog All rights reserved.
 *
 * @since 1.8
 * @author: icefrog.su@qq.com
 */

package com.icefrog.network.pointer.transport.packet;

import com.icefrog.network.pointer.registry.connect.Target;

/**
 * Data packet factory. Support retryable packets, core packets, heartbeat detection packets
 *
 * @see DataPacket
 * @see BreakpointResumeDataPacket
 * @author icefrog.lsw
 * @version : DataPacketFactory.java, v 0.1 2021年01月10日 17:34 icefrog.lsw Exp $
 */
public class DataPacketFactory {

    public static class DataPacketFactoryHolder {
        public static DataPacketFactory dataPacketFactory = new DataPacketFactory();
    }

    public static DataPacketFactory getInstance() {
        return DataPacketFactoryHolder.dataPacketFactory;
    }

    /**
     * Build a heartbeat detection packet
     * @return DataPacket
     */
    public static DataPacket getHeartbeatDataPacket() {

        return null;
    }

    /**
     * Build the default data package for the specified binary data
     * @param data binary data
     * @return default data package
     */
    public static DataPacket getDataPacket(byte[] data) {

        return null;
    }

    /**
     * Build default data package, specify binary data and data package id
     * @param data binary data
     * @param id package id
     * @return default data package
     */
    public static DataPacket getDataPacket(byte[] data, long id) {

        return null;
    }

    /**
     * Build a data package that supports resumable transmission
     * @param dataPacket default data package
     * @param target Target client information
     * @param retryTimes number of retries
     * @param delay Retry delay
     * @return Resume data packets
     */
    public static BreakpointResumeDataPacket getBreakpointResumeDataPacket(DataPacket dataPacket, Target target,
                                                                           long retryTimes, int delay) {

        return null;
    }

    /**
     * Build a data package that supports resumable transmission
     * @param dataPacket default data package
     * @param target Target client information
     * @return Resume data packets
     */
    public static BreakpointResumeDataPacket getBreakpointResumeDataPacket(DataPacket dataPacket, Target target) {

        return null;
    }

    /**
     * Build a data package that supports resumable transmission
     * @param data binary data
     * @param id package id
     * @param target Target client information
     * @return Resume data packets
     */
    public static BreakpointResumeDataPacket getBreakpointResumeDataPacket(byte[] data, long id, Target target) {

        return null;
    }
}
