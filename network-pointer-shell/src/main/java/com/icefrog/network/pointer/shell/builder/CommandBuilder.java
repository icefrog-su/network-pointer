/*
 * Copyright 2021 icefrog All rights reserved.
 *
 * @since 1.8
 * @author: icefrog.su@qq.com
 */

package com.icefrog.network.pointer.shell.builder;

/**
 * Command builder and extends the Builder
 *
 * @author icefrog.lsw
 * @version : CommandBuilder.java, v 0.1 2021年01月10日 00:37 icefrog.lsw Exp $
 */
public interface CommandBuilder<T> extends Builder<T> {

    void prepare() throws BuilderException;

    void release() throws BuilderException;

}
