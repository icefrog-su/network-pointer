/*
 * Copyright 2021 icefrog All rights reserved.
 *
 * @since 1.8
 * @author: icefrog.su@qq.com
 */

package com.icefrog.network.pointer.registry;

import com.icefrog.network.pointer.registry.connect.Target;

/**
 * @author icefrog.lsw
 * @version : RegistryTarget.java, v 0.1 2021年01月10日 18:59 icefrog.lsw Exp $
 */
public class RegistryTarget extends Target {

    public RegistryTarget(String name, String ip, Integer port) {
        super(name, ip, port);
    }
}
