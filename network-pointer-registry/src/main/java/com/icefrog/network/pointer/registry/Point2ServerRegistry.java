/*
 * Copyright 2021 icefrog All rights reserved.
 *
 * @since 1.8
 * @author: icefrog.su@qq.com
 */

package com.icefrog.network.pointer.registry;

import com.icefrog.network.pointer.registry.connect.*;

/**
 * Point to server registry
 *
 * @author icefrog.lsw
 * @version : Point2ServerRegistry.java, v 0.1 2021年01月10日 18:45 icefrog.lsw Exp $
 */
public class Point2ServerRegistry implements Register {

    private AbstractConnection connection = new KeepaliveConnection();

    public ConnectionResult register(RegistryTarget registryTarget) throws ConnectionException {
        return connection.connect(registryTarget);
    }
}
