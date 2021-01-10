/*
 * Copyright 2021 icefrog All rights reserved.
 *
 * @since 1.8
 * @author: icefrog.su@qq.com
 */

package com.icefrog.network.pointer.transport;

import java.io.IOException;

/**
 * TransportException. (with IOException)
 * @author icefrog.lsw
 * @version : TransportException.java, v 0.1 2021年01月10日 18:20 icefrog.lsw Exp $
 */
public class TransportException extends IOException {

    /**
     * @see IOException#IOException()
     */
    public TransportException(String message) {
        super(message);
    }

    /**
     * @see IOException#IOException(String)
     */
    public TransportException(String message, Throwable throwable) {
        super(message, throwable);
    }

    /**
     * @see IOException#IOException()
     */
    public TransportException() {
        super();
    }

}
