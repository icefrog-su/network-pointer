/*
 * Copyright 2021 icefrog All rights reserved.
 *
 * @since 1.8
 * @author: icefrog.su@qq.com
 */

package com.icefrog.network.pointer.transport;

import com.icefrog.network.pointer.transport.packet.DataPacket;

/**
 * Base transport
 *
 * @author icefrog.lsw
 * @version : Transport.java, v 0.1 2021年01月10日 18:19 icefrog.lsw Exp $
 */
public interface Transport {

    void transport(DataPacket dataPacket);

}
