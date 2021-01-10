/*
 * Copyright 2021 icefrog All rights reserved.
 *
 * @since 1.8
 * @author: icefrog.su@qq.com
 */

package com.icefrog.network.pointer.registry.connect;

import java.io.IOException;

/**
 * ConnectionException. (with IOException)
 * @author icefrog.lsw
 * @version : ConnectionException.java, v 0.1 2021年01月10日 18:25 icefrog.lsw Exp $
 */
public class ConnectionException extends IOException {

    /**
     * @see IOException#IOException()
     */
    public ConnectionException(String message) {
        super(message);
    }

    /**
     * @see IOException#IOException(String)
     */
    public ConnectionException(String message, Throwable throwable) {
        super(message, throwable);
    }

    /**
     * @see IOException#IOException()
     */
    public ConnectionException() {
        super();
    }

}
