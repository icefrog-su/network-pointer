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
 * @version : BuilderException.java, v 0.1 2021年01月10日 00:40 icefrog.lsw Exp $
 */
public class BuilderException extends Exception {

    public BuilderException() {}

    public BuilderException(String message) {
        super(message);
    }

    public BuilderException(String message, Throwable thr) {
        super(message, thr);
    }

}
