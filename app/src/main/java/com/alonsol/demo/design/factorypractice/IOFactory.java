package com.alonsol.demo.design.factorypractice;

public class IOFactory {


    /**
     * 获取IO处理者
     *
     * @param clz IOHandler类型的类类型
     * @param <T>
     * @return IOHandler 对象
     */
    public static <T extends IOHandler> T getIOHandler(Class<T> clz) {
        IOHandler handler = null;
        try {
            handler = (IOHandler) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) handler;
    }
}
