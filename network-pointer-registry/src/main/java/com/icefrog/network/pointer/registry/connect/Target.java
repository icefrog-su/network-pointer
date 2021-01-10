/*
 * Copyright 2021 icefrog All rights reserved.
 *
 * @since 1.8
 * @author: icefrog.su@qq.com
 */

package com.icefrog.network.pointer.registry.connect;

import lombok.Getter;

import java.util.Objects;

/**
 * Describe target client information
 *
 * @author icefrog.lsw
 * @version : Target.java, v 0.1 2021年01月10日 17:31 icefrog.lsw Exp $
 */
@Getter
public class Target {

    private String name;

    private String ip;

    private Integer port;

    public Target(String name, String ip, Integer port) {
        this.name = name;
        this.ip = ip;
        this.port = port;
    }

    @Override
    public String toString() {
        return "Target{" +
                "name='" + name + '\'' +
                ", ip='" + ip + '\'' +
                ", port=" + port +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Target target = (Target) o;
        return Objects.equals(name, target.name) &&
                Objects.equals(ip, target.ip) &&
                Objects.equals(port, target.port);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ip, port);
    }


}
