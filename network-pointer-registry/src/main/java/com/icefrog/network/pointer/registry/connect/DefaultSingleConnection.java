/*
 * Copyright 2021 icefrog All rights reserved.
 *
 * @since 1.8
 * @author: icefrog.su@qq.com
 */

package com.icefrog.network.pointer.registry.connect;

import java.io.IOException;

/**
 * @author icefrog.lsw
 * @version : DefaultSingleConnection.java, v 0.1 2021年01月10日 18:33 icefrog.lsw Exp $
 */
public class DefaultSingleConnection extends AbstractConnection {

    @Override
    protected ConnectionResult doConnect(Target target) throws ConnectionException {
        return null;
    }

    @Override
    protected void doClose() throws IOException {

    }
}
