/*
 * Copyright 2021 icefrog All rights reserved.
 *
 * @since 1.8
 * @author: icefrog.su@qq.com
 */

package com.icefrog.network.pointer.transport.packet;

import com.icefrog.network.pointer.registry.connect.Target;

import java.util.Objects;

/**
 * Based on the data packet structure of the core data packet that can be resumed and retryed
 *
 * @see DataPacket
 * @author icefrog.lsw
 * @version : BreakpointResumeDataPacket.java, v 0.1 2021年01月10日 17:32 icefrog.lsw Exp $
 */
public class BreakpointResumeDataPacket extends DataPacket {

    private int retryTimes;

    private int delay;

    public BreakpointResumeDataPacket(){
        super();
    }

    public BreakpointResumeDataPacket(Target target, int retryTimes, int delay) {
        super();
        this.retryTimes = retryTimes;
        this.delay = delay;
    }

    public BreakpointResumeDataPacket(byte[] data, Target target, int retryTimes, int delay) {
        super(data);
        this.retryTimes = retryTimes;
        this.delay = delay;
    }

    public BreakpointResumeDataPacket(byte[] data, int batchSize, Target target, int retryTimes, int delay) {
        super(data, batchSize);
        this.retryTimes = retryTimes;
        this.delay = delay;
    }

    public BreakpointResumeDataPacket(byte[] data, long offset, int batchSize, Target target, int retryTimes, int delay) {
        super(data, offset, batchSize);
        this.retryTimes = retryTimes;
        this.delay = delay;
    }

    public BreakpointResumeDataPacket(long id, long offset, byte[] data, long timestamp, int batchSize, Target target, int retryTimes, int delay) {
        super(id, offset, data, timestamp, batchSize);
        this.retryTimes = retryTimes;
        this.delay = delay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BreakpointResumeDataPacket that = (BreakpointResumeDataPacket) o;
        return retryTimes == that.retryTimes &&
                delay == that.delay;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), retryTimes, delay);
    }

    public int getRetryTimes() {
        return retryTimes;
    }

    public int getDelay() {
        return delay;
    }
}
