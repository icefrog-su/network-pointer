/*
 * Copyright 2021 icefrog All rights reserved.
 *
 * @since 1.8
 * @author: icefrog.su@qq.com
 */

package com.icefrog.network.pointer.shell.builder;

/**
 * @author icefrog.lsw
 * @version : Builder.java, v 0.1 2021年01月10日 00:37 icefrog.lsw Exp $
 */
public interface Builder<T> {

    T build() throws NetworkPointerException;

}
