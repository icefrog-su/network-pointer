/*
 * Copyright 2021 icefrog All rights reserved.
 *
 * @since 1.8
 * @author: icefrog.su@qq.com
 */

package com.icefrog.network.pointer.common;

/**
 * Id generator
 *
 * @author icefrog.lsw
 * @version : IdGenerator.java, v 0.1 2021年01月10日 17:46 icefrog.lsw Exp $
 */
public class IdGenerator {

    /**
     * Get a simple long timestamp based on timestamp
     * @return long type id
     */
    public static long getLong() {
        return System.currentTimeMillis();
    }

}
