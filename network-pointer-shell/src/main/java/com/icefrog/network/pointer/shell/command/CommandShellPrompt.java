/*
 * Copyright 2021 icefrog All rights reserved.
 *
 * @since 1.8
 * @author: icefrog.su@qq.com
 */

package com.icefrog.network.pointer.shell.command;

import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.springframework.shell.jline.PromptProvider;
import org.springframework.stereotype.Component;

/**
 * Network pointer's shell prompt
 * @author icefrog.lsw
 * @version : CommandShellPrompt.java, v 0.1 2021年01月10日 00:34 icefrog.lsw Exp $
 */
@Component
public class CommandShellPrompt implements PromptProvider {

    @Override
    public AttributedString getPrompt() {
        return new AttributedString("network-pointer:>",
                AttributedStyle.DEFAULT.foreground(AttributedStyle.RED));
    }
}
