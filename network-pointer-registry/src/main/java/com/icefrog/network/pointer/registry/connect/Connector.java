/*
 * Copyright 2021 icefrog All rights reserved.
 *
 * @since 1.8
 * @author: icefrog.su@qq.com
 */

package com.icefrog.network.pointer.registry.connect;

import java.io.Closeable;

/**
 * @author icefrog.lsw
 * @version : Connector.java, v 0.1 2021年01月10日 18:24 icefrog.lsw Exp $
 */
public interface Connector extends Closeable {

    ConnectionResult connect(Target target) throws ConnectionException;

}
