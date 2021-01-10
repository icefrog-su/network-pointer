/*
 * Copyright 2021 icefrog All rights reserved.
 *
 * @since 1.8
 * @author: icefrog.su@qq.com
 */

package com.icefrog.network.pointer.shell.command;

import com.icefrog.network.pointer.shell.builder.AbstractCommandBuilder;
import com.icefrog.network.pointer.shell.builder.NetworkPointerException;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

/**
 * @author icefrog.lsw
 * @version : NetworkPointerShell.java, v 0.1 2021年01月10日 14:07 icefrog.lsw Exp $
 */
@ShellComponent
public class NetworkPointerShell extends AbstractCommandBuilder<NetworkPointerShell> {

    @ShellMethod(value = "reg")
    public void reg(String targetIp) throws NetworkPointerException {
        super.prepare();

        super.release();
    }

}
