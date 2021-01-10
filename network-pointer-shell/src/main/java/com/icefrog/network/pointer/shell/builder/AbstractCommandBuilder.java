/*
 * Copyright 2021 icefrog All rights reserved.
 *
 * @since 1.8
 * @author: icefrog.su@qq.com
 */

package com.icefrog.network.pointer.shell.builder;

import lombok.Getter;

/**
 * @author icefrog.lsw
 * @version : AbstractCommandBuilder.java, v 0.1 2021年01月10日 00:37 icefrog.lsw Exp $
 */
@Getter
public abstract class AbstractCommandBuilder<T> implements CommandBuilder<T> {

    private boolean autoRelease = false;

    private String version;

    public AbstractCommandBuilder(boolean autoRelease) {
        this.autoRelease = autoRelease;
    }

    public AbstractCommandBuilder() {
    }

    @Override
    public T build() throws NetworkPointerException {
        return null;
    }

    @Override
    public void prepare() throws NetworkPointerException {

    }

    @Override
    public void release() throws NetworkPointerException {

    }
}
