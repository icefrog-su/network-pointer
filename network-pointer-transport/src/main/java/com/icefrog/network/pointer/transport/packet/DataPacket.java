/*
 * Copyright 2021 icefrog All rights reserved.
 *
 * @since 1.8
 * @author: icefrog.su@qq.com
 */

package com.icefrog.network.pointer.transport.packet;

import com.icefrog.network.pointer.common.IdGenerator;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 * Core data packet, including data packet id, offset, and total data packet size.
 * Use byte array as the underlying binary data.
 *
 * @author icefrog.lsw
 * @version : DataPacket.java, v 0.1 2021年01月10日 17:30 icefrog.lsw Exp $
 */
public class DataPacket implements Serializable, Cloneable {

    protected long id;

    protected long offset;

    protected byte[] data;

    protected long timestamp;

    protected int batchSize;

    public DataPacket() {
        this(IdGenerator.getLong(), 0, new byte[0], System.currentTimeMillis(), 0);
    }

    public DataPacket(byte[] data) {
        this(IdGenerator.getLong(), 0, data, System.currentTimeMillis(), data.length);
    }

    public DataPacket(byte[] data, int batchSize) {
        this(IdGenerator.getLong(), 0, data, System.currentTimeMillis(), batchSize);
    }

    public DataPacket(byte[] data, long offset, int batchSize) {
        this(IdGenerator.getLong(), offset, data, System.currentTimeMillis(), batchSize);
    }

    public DataPacket(long id, long offset, byte[] data, long timestamp, int batchSize) {
        check(data);
        this.id = id;
        this.offset = offset;
        this.data = data;
        this.timestamp = timestamp;
        this.batchSize = batchSize;
    }

    private void check(byte[] data) {
        if (data == null) {
            throw new IllegalArgumentException("Binary data cannot be empty");
        }
    }

    @Override
    public String toString() {
        return "DataPacket{" +
                "id=" + id +
                ", offset=" + offset +
                ", data=" + Arrays.toString(data) +
                ", timestamp=" + timestamp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataPacket that = (DataPacket) o;
        return id == that.id &&
                offset == that.offset &&
                timestamp == that.timestamp &&
                Arrays.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, offset, timestamp);
        result = 31 * result + Arrays.hashCode(data);
        return result;
    }

    public int getBatchSize() {
        return batchSize;
    }

    public long getId() {
        return id;
    }

    public long getOffset() {
        return offset;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public byte[] getData() {
        return data;
    }

    public long getSize() {
        if (data == null) {
            return 0;
        }
        return data.length;
    }
}
