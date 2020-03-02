package design.singleton;

/**
 * @author yanwenxiong
 * @since 2019/9/23
 */
public class RegisterSingleObject {
    private RegisterSingleObject() {

    }

    public static class StaticInnerClass {
        private static RegisterSingleObject instance = new RegisterSingleObject();

        public static RegisterSingleObject getInstance() {
            return instance;
        }
    }
}
