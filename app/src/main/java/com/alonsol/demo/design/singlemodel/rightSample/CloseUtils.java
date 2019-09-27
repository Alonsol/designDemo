package com.alonsol.demo.design.singlemodel.rightSample;

import java.io.Closeable;
import java.io.IOException;

public class CloseUtils {

    private CloseUtils() {
    }

    /**
     * 关闭closeUtils对象
     * 接口隔离原则
     */
    public static void closeQuietly(Closeable closeable) {
        if (null != closeable) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
