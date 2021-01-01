import java.io.IOException;
import java.util.logging.*;

public class Main {

    /**
     * 登陆请求地址
     */
    public static final String LOGIN_URL = "https://www.secure.pixiv.net/login.php";

    /**
     * 登录成功的返回码
     */
    public static final int LOGIN_SUCCESS_CODE = 302;

    private static final Logger LOGGER = Logger.getGlobal();

    public static void main(String[] args) throws IOException {
        FileHandler fileHandler = new FileHandler("crawler.log");
        fileHandler.setFormatter(new SimpleFormatter());
        LOGGER.addHandler(fileHandler);
        // LOGGER.info("logging...");
    }

    public boolean login (String username, String password) {
        if (username == null || password == null) {
            LOGGER.warning("用户名或密码为空！");
            return false;
        }
        LOGGER.info ("当前登录的用户为：" + username);
        
        return true;
    }
}
