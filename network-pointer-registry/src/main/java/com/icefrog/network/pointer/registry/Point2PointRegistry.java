/*
 * Copyright 2021 icefrog All rights reserved.
 *
 * @since 1.8
 * @author: icefrog.su@qq.com
 */

package com.icefrog.network.pointer.registry;

import com.icefrog.network.pointer.registry.connect.AbstractConnection;
import com.icefrog.network.pointer.registry.connect.ConnectionException;
import com.icefrog.network.pointer.registry.connect.ConnectionResult;
import com.icefrog.network.pointer.registry.connect.DefaultSingleConnection;

/**
 * Point to point registry
 *
 * @author icefrog.lsw
 * @version : Point2PointRegistry.java, v 0.1 2021年01月10日 18:44 icefrog.lsw Exp $
 */
public class Point2PointRegistry implements Register {

    private AbstractConnection connection = new DefaultSingleConnection();

    public ConnectionResult register(RegistryTarget registryTarget) throws ConnectionException {
        return connection.connect(registryTarget);
    }
}
