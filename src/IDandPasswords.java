import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){
        logininfo.put("375014","123456");
    }

    public HashMap getLoginInfo(){
        return logininfo;
    }
}