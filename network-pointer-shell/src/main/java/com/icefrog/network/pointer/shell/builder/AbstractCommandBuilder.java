/*
 * Copyright 2021 icefrog All rights reserved.
 *
 * @since 1.8
 * @author: icefrog.su@qq.com
 */

package com.icefrog.network.pointer.shell.builder;

/**
 * @author icefrog.lsw
 * @version : AbstractCommandBuilder.java, v 0.1 2021年01月10日 00:37 icefrog.lsw Exp $
 */
public abstract class AbstractCommandBuilder<T> implements CommandBuilder<T> {

    protected boolean autoRelease = false;

    public AbstractCommandBuilder(boolean autoRelease) {
        this.autoRelease = autoRelease;
    }

    public AbstractCommandBuilder() {
    }

    @Override
    public T build() throws BuilderException {
        // prepare the build
        this.prepare();

        // do build
        T client = this.doBuild();

        // release the build,if auto release is true
        if (autoRelease) {
            this.release();
        }
        return client;
    }

    protected abstract void doRelease() throws BuilderException;

    protected abstract void doPrepare() throws BuilderException;

    protected abstract T doBuild() throws BuilderException;

    @Override
    public void prepare() throws BuilderException {
        this.doPrepare();
    }

    @Override
    public void release() throws BuilderException {
        this.doRelease();
    }
}
