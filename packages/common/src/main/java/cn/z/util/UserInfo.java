package cn.z.util;

/**
 * <h1>用户信息</h1>
 *
 * <p>
 * createDate 2023/12/19 10:04:24
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.4.1
 **/
public class UserInfo {

    private UserInfo() {
    }

    /**
     * id
     */
    private static final ThreadLocal<Long> ID = new NamedThreadLocal<>("UserInfo Id");

    public static Long getId() {
        return ID.get();
    }

    public static void setId(Long id) {
        ID.set(id);
    }

    public static void removeId() {
        ID.remove();
    }

    /**
     * 命名本地线程
     */
    private static class NamedThreadLocal<T> extends ThreadLocal<T> {

        /**
         * 线程名
         */
        private final String name;

        /**
         * 构造函数
         *
         * @param name 线程名
         */
        public NamedThreadLocal(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }

    }

}
