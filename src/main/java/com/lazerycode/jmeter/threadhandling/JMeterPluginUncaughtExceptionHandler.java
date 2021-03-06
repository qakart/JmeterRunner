package com.lazerycode.jmeter.threadhandling;
/**
 * 
 * @author caiqiuliang
 *
 */

public class JMeterPluginUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler
{
    public void uncaughtException(Thread t, Throwable e) {
        if (e instanceof ExitException && ((ExitException) e).getCode() == 0) {
            return; // Ignore
        }
    }
}
