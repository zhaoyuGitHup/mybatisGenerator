package ibp.dto.core.BaseDTO;

import java.io.Serializable;

public class BaseDTO implements Serializable{

    /** 排序字段 */
    private String sidx;
    /** 排序方式 */
    private String sord;
    /** 登录用户名  */
    private String loginusername="";
    /** 是否启用组  */
    private String isgroup = "";

    public String getIsgroup() {
        return isgroup;
    }

    public void setIsgroup(String isgroup) {
        this.isgroup = isgroup;
    }

    public String getSidx() {
        return sidx;
    }

    public void setSidx(String sidx) {
        this.sidx = sidx;
    }

    public String getSord() {
        return sord;
    }

    public void setSord(String sord) {
        this.sord = sord;
    }




    public String getLoginusername() {
        return loginusername;
    }


    public void setLoginusername(String loginusername) {
        this.loginusername = loginusername;
    }

}
