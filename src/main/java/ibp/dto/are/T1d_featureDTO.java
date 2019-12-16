package ibp.dto.are;

public class T1d_featureDTO {
    /*特征编号*/
    private String FETR_ID;

    /*特征名称*/
    private String FETR_NAME;

    /*特征类型（参见[字典:AML0011]）*/
    private String FETR_TYPE;

    /*人行特征代码*/
    private String PBC_TCR;

    /*特征分类（参见[字典:AML0012]）*/
    private String FETR_CATG;

    /*特征计算方式（参见[字典:AML0013]）*/
    private String EXEC_MODE;

    /*是否属性（参见[字典:T00002]）*/
    private String IS_PROP;

    /*是否用于资金网络（参见[字典:T00002]）*/
    private String IS_NET;

    /*单独形成案例（参见[字典:T00002]）*/
    private String IS_CASE;

    /*涉罪类型*/
    private String CRIME_TYPE;

    /*特征描述*/
    private String FETR_DESC;

    /*创建时间*/
    private String CREATE_TM;

    /*创建人*/
    private String CREATOR;

    /*修改时间*/
    private String MODIFY_TM;

    /*修改人*/
    private String MODIFIER;

    /*是否有效（参见[字典:T00002]）*/
    private String IS_VALID;

    /*业务特征*/
    private String FETR_S_TYPE;

    /*来源依据*/
    private String SOURCE_ACCORDANCE;

    /*特征编号*/
    public String getFETR_ID() {
        return FETR_ID;
    }

    /*特征编号*/
    public void setFETR_ID(String FETR_ID) {
        this.FETR_ID = FETR_ID;
    }

    /*特征名称*/
    public String getFETR_NAME() {
        return FETR_NAME;
    }

    /*特征名称*/
    public void setFETR_NAME(String FETR_NAME) {
        this.FETR_NAME = FETR_NAME;
    }

    /*特征类型（参见[字典:AML0011]）*/
    public String getFETR_TYPE() {
        return FETR_TYPE;
    }

    /*特征类型（参见[字典:AML0011]）*/
    public void setFETR_TYPE(String FETR_TYPE) {
        this.FETR_TYPE = FETR_TYPE;
    }

    /*人行特征代码*/
    public String getPBC_TCR() {
        return PBC_TCR;
    }

    /*人行特征代码*/
    public void setPBC_TCR(String PBC_TCR) {
        this.PBC_TCR = PBC_TCR;
    }

    /*特征分类（参见[字典:AML0012]）*/
    public String getFETR_CATG() {
        return FETR_CATG;
    }

    /*特征分类（参见[字典:AML0012]）*/
    public void setFETR_CATG(String FETR_CATG) {
        this.FETR_CATG = FETR_CATG;
    }

    /*特征计算方式（参见[字典:AML0013]）*/
    public String getEXEC_MODE() {
        return EXEC_MODE;
    }

    /*特征计算方式（参见[字典:AML0013]）*/
    public void setEXEC_MODE(String EXEC_MODE) {
        this.EXEC_MODE = EXEC_MODE;
    }

    /*是否属性（参见[字典:T00002]）*/
    public String getIS_PROP() {
        return IS_PROP;
    }

    /*是否属性（参见[字典:T00002]）*/
    public void setIS_PROP(String IS_PROP) {
        this.IS_PROP = IS_PROP;
    }

    /*是否用于资金网络（参见[字典:T00002]）*/
    public String getIS_NET() {
        return IS_NET;
    }

    /*是否用于资金网络（参见[字典:T00002]）*/
    public void setIS_NET(String IS_NET) {
        this.IS_NET = IS_NET;
    }

    /*单独形成案例（参见[字典:T00002]）*/
    public String getIS_CASE() {
        return IS_CASE;
    }

    /*单独形成案例（参见[字典:T00002]）*/
    public void setIS_CASE(String IS_CASE) {
        this.IS_CASE = IS_CASE;
    }

    /*涉罪类型*/
    public String getCRIME_TYPE() {
        return CRIME_TYPE;
    }

    /*涉罪类型*/
    public void setCRIME_TYPE(String CRIME_TYPE) {
        this.CRIME_TYPE = CRIME_TYPE;
    }

    /*特征描述*/
    public String getFETR_DESC() {
        return FETR_DESC;
    }

    /*特征描述*/
    public void setFETR_DESC(String FETR_DESC) {
        this.FETR_DESC = FETR_DESC;
    }

    /*创建时间*/
    public String getCREATE_TM() {
        return CREATE_TM;
    }

    /*创建时间*/
    public void setCREATE_TM(String CREATE_TM) {
        this.CREATE_TM = CREATE_TM;
    }

    /*创建人*/
    public String getCREATOR() {
        return CREATOR;
    }

    /*创建人*/
    public void setCREATOR(String CREATOR) {
        this.CREATOR = CREATOR;
    }

    /*修改时间*/
    public String getMODIFY_TM() {
        return MODIFY_TM;
    }

    /*修改时间*/
    public void setMODIFY_TM(String MODIFY_TM) {
        this.MODIFY_TM = MODIFY_TM;
    }

    /*修改人*/
    public String getMODIFIER() {
        return MODIFIER;
    }

    /*修改人*/
    public void setMODIFIER(String MODIFIER) {
        this.MODIFIER = MODIFIER;
    }

    /*是否有效（参见[字典:T00002]）*/
    public String getIS_VALID() {
        return IS_VALID;
    }

    /*是否有效（参见[字典:T00002]）*/
    public void setIS_VALID(String IS_VALID) {
        this.IS_VALID = IS_VALID;
    }

    /*业务特征*/
    public String getFETR_S_TYPE() {
        return FETR_S_TYPE;
    }

    /*业务特征*/
    public void setFETR_S_TYPE(String FETR_S_TYPE) {
        this.FETR_S_TYPE = FETR_S_TYPE;
    }

    /*来源依据*/
    public String getSOURCE_ACCORDANCE() {
        return SOURCE_ACCORDANCE;
    }

    /*来源依据*/
    public void setSOURCE_ACCORDANCE(String SOURCE_ACCORDANCE) {
        this.SOURCE_ACCORDANCE = SOURCE_ACCORDANCE;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", FETR_ID=").append(FETR_ID);
        sb.append(", FETR_NAME=").append(FETR_NAME);
        sb.append(", FETR_TYPE=").append(FETR_TYPE);
        sb.append(", PBC_TCR=").append(PBC_TCR);
        sb.append(", FETR_CATG=").append(FETR_CATG);
        sb.append(", EXEC_MODE=").append(EXEC_MODE);
        sb.append(", IS_PROP=").append(IS_PROP);
        sb.append(", IS_NET=").append(IS_NET);
        sb.append(", IS_CASE=").append(IS_CASE);
        sb.append(", CRIME_TYPE=").append(CRIME_TYPE);
        sb.append(", FETR_DESC=").append(FETR_DESC);
        sb.append(", CREATE_TM=").append(CREATE_TM);
        sb.append(", CREATOR=").append(CREATOR);
        sb.append(", MODIFY_TM=").append(MODIFY_TM);
        sb.append(", MODIFIER=").append(MODIFIER);
        sb.append(", IS_VALID=").append(IS_VALID);
        sb.append(", FETR_S_TYPE=").append(FETR_S_TYPE);
        sb.append(", SOURCE_ACCORDANCE=").append(SOURCE_ACCORDANCE);
        sb.append("]");
        return sb.toString();
    }
}