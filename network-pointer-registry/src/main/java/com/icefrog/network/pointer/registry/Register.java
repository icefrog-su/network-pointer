/*
 * Copyright 2021 icefrog All rights reserved.
 *
 * @since 1.8
 * @author: icefrog.su@qq.com
 */

package com.icefrog.network.pointer.registry;

import com.icefrog.network.pointer.registry.connect.ConnectionException;
import com.icefrog.network.pointer.registry.connect.ConnectionResult;

/**
 * @author icefrog.lsw
 * @version : Register.java, v 0.1 2021年01月10日 18:45 icefrog.lsw Exp $
 */
public interface Register {

    ConnectionResult register(RegistryTarget registryTarget) throws ConnectionException;

}
