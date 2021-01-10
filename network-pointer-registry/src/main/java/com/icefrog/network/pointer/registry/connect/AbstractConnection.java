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
 * @version : AbstractConnection.java, v 0.1 2021年01月10日 18:56 icefrog.lsw Exp $
 */
public abstract class AbstractConnection implements Connector {

    @Override
    public ConnectionResult connect(Target target) throws ConnectionException {
        return this.doConnect(target);
    }

    @Override
    public void close() throws IOException {
        this.doClose();
    }

    protected abstract ConnectionResult doConnect(Target target) throws ConnectionException;

    protected abstract void doClose() throws IOException;
}
