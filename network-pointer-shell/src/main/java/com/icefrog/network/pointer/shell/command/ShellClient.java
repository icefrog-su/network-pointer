/*
 * Copyright 2021 icefrog All rights reserved.
 *
 * @since 1.8
 * @author: icefrog.su@qq.com
 */

package com.icefrog.network.pointer.shell.command;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

/**
 * Core shell client
 *
 * @author icefrog.lsw
 * @version : ShellClient.java, v 0.1 2021年01月10日 00:28 icefrog.lsw Exp $
 */
@ShellComponent
public class ShellClient {

    @ShellMethod("shell client method : test")
    public String test(String message) {
        System.out.println("input message:" + message);
        return "message: " + message;
    }

    public static void main(String[] args) {

    }

}
