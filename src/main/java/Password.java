import com.jeeplus.modules.sys.service.SystemService;

public class Password {
    public static void main(String[] args) {
        String s = SystemService.entryptPassword("123456");
        boolean b = SystemService.validatePassword("123456", s);
        System.out.println(s);
        System.out.println(b);
    }
}
