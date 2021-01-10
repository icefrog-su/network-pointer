/*
 * Copyright 2021 icefrog All rights reserved.
 *
 * @since 1.8
 * @author: icefrog.su@qq.com
 */

package com.icefrog.network.pointer.shell.builder;

/**
 * Builder exception.
 *
 * @author icefrog.lsw
 * @version : NetworkPointerException.java, v 0.1 2021年01月10日 00:40 icefrog.lsw Exp $
 */
public class NetworkPointerException extends Exception {

    public NetworkPointerException() {}

    public NetworkPointerException(String message) {
        super(message);
    }

    public NetworkPointerException(String message, Throwable thr) {
        super(message, thr);
    }

}
