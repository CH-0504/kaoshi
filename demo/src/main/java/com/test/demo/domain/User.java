package com.test.demo.domain;




import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.Version;
import com.baomidou.mybatisplus.enums.IdType;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

@TableName(value = "huihe56_user")
public class User implements Serializable {

    @ApiModelProperty(value = "账号", name = "username")
    private String username;

    @ApiModelProperty(value = "密码", name = "password", hidden = true)
    @TableField(value = "password")
    private String password;

    @ApiModelProperty(value = "客户名称", name = "cunitName")
    @TableField(value = "cUnitName")
    private String cunitName;

    @ApiModelProperty(value = "用户id", name = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private int id;

    @ApiModelProperty(value = "钮门id", name = "icid")
    @TableField(value = "icid")
    private int icid;

    @ApiModelProperty(value = "钮门秘钥", name = "secret", hidden = true)
    @TableField(value = "secret")
    private String secret;

    @ApiModelProperty(value = "站点", name = "site")
    @TableField(value = "site")
    private String site;

    @ApiModelProperty(value = "上一次登录时间", name = "logintime")
    @TableField(value = "logintime")
    private Long logintime;

    @ApiModelProperty(value = "qq绑定id", name = "qq_bind")
    @TableField(value = "qq_bind")
    private String qqBind;

    @ApiModelProperty(value = "qq绑定json", name = "qq_json")
    @TableField(value = "qq_json")
    private String qqJson;

    @ApiModelProperty(value = "微信绑定id", name = "weixin_bind")
    @TableField(value = "weixin_bind")
    private String weixinBind;

    @ApiModelProperty(value = "微信json", name = "weixin_json", hidden = true)
    @TableField(value = "weixin_json")
    private String weixinJson;

    @ApiModelProperty(value = "微信头像", name = "weixin_headimgurl")
    @TableField(value = "weixin_headimgurl")
    private String weixinHeadImgUrl;

    @ApiModelProperty(value = "新浪绑定id", name = "sina_bind")
    @TableField(value = "sina_bind")
    private String sinaBind;

    @ApiModelProperty(value = "新浪json", name = "sina_json", hidden = true)
    @TableField(value = "sina_json")
    private String sinaJson;

    @ApiModelProperty(value = "注册时间", name = "starttime")
    @TableField(value = "starttime")
    private Long starttime;

    @ApiModelProperty(value = "钮门客户授信额", name = "fCredit")
    @TableField(value = "fCredit")
    private float fcredit;

    @ApiModelProperty(value = "客户总额度", name = "totalAmount")
    @TableField(value = "total_amount")
    private float totalAmount;

    @ApiModelProperty(value = "客户可用额度", name = "amount")
    @TableField(value = "Amount")
    private float amount;


    @ApiModelProperty(value = "账户余额", name = "accountBalance")
    @TableField(value = "account_balance")
    private float accountBalance;

    @ApiModelProperty(value = "提现额度", name = "withdrawalBalance")
    @TableField(value = "withdrawal_balance")
    private float withdrawalBalance;

    @ApiModelProperty(value = "积分", name = "integral")
    @TableField(value = "integral")
    private int integral;


    @ApiModelProperty(value = "周期", name = "cycle")
    @TableField(value = "cycle")
    private Integer cycle;

    @ApiModelProperty(value = "电话", name = "cPhone")
    @TableField(value = "cPhone")
    private String cphone;

    @ApiModelProperty(value = "头像", name = "headimgurl")
    @TableField(value = "headimgurl")
    private String headImgUrl;

    @ApiModelProperty(value = "登录次数", name = "logonnum")
    @TableField(value = "logonnum")
    private int logonnum;

    @ApiModelProperty(value = "协议客户申请状态 100未申请 101待审核 102 待签约 103 已完成 104 签约失败 400 未通过 ", name = "agreementstatic")
    @TableField(value = "agreementstatic")
    private int agreementstatic;

    @ApiModelProperty(value = "注册来源 ", name = "way")
    @TableField(value = "way")
    private String way;

    @ApiModelProperty(value = "获客成本 ", name = "waycost")
    @TableField(value = "waycost")
    private float waycost;

    @ApiModelProperty(value = "交货仓库 ", name = "Warehouse")
    @TableField(value = "Warehouse")
    private String warehouse;

    @ApiModelProperty(value = "用户状态 1:正常 2:拉黑 ", name = "userstate")
    @TableField(value = "userstate")
    private Integer userstate;

    @ApiModelProperty(value = "联系人", name = "cSign")
    @TableField(value = "cSign")
    private String cSign;

    @ApiModelProperty(value = "用户类型 (1 现付 2协议)", notes = "1 现付 2协议 ")
    private int userType;


    @ApiModelProperty(value = "地址", example = "11")
    @TableField(value = "caddr")
    private String caddr;

    @ApiModelProperty(value = "城市", example = "11")
    @TableField(value = "city")
    private String city;


    @ApiModelProperty(value = "区", example = "11")
    @TableField(value = "area")
    private String area;

    @ApiModelProperty(value = "省份", example = "11")
    @TableField(value = "province")
    private String province;


    @ApiModelProperty(value = "公司规模", notes = "公司规模", example = "公司规模")
    private String scale;


    @ApiModelProperty(value = "昵称", example = "昵称")
    private String nickname;

    @ApiModelProperty(value = "性别", notes = "0 男 1女 默认 0", example = "公司规模")
    private int gender;

    @ApiModelProperty(value = "岗位", example = "岗位")
    private String station;
 /*   @ApiModelProperty(value = "岗位名称", example = "岗位名称")
    @TableField(exist = false)
    private String stationName;*/

    @ApiModelProperty(value = "生日", example = "生日")
    private String birthday;

    @Version
    private Integer version;

    @ApiModelProperty(value = "认证标记(101:未认证 102:个人认证中 103:公司认证中 202:已认证个人 203:已认证公司 )")
    private Integer certificationMark;

    @ApiModelProperty(value = "支付密码", hidden = true)
    private String payPassword;

    @ApiModelProperty(value = "是否存在支付密码")
    @TableField(exist = false)
    private boolean hasPayPassword;

    @ApiModelProperty(value = "下一个账单开始日期")
    private Date nextBillStartDate;

    @ApiModelProperty("账单生成后支付期限(天)")
    private Integer paymentDay;

    @ApiModelProperty("钉钉群Token")
    private String dingdingToken;


    /**
     * 经办人
     */
    @ApiModelProperty("经办人编号")
    private String agent;
    @ApiModelProperty("经办人名称")
    @TableField(exist = false)
    private String agentName;
    /**
     * 维护客服
     */
    @ApiModelProperty("维护客服编号")
    private String maintainer;

    @ApiModelProperty("维护客服名称")
    @TableField(exist = false)
    private String maintainerName;

    /**
     * 审核人
     */
    @ApiModelProperty("审核人编号")
    private String auditor;
    @ApiModelProperty("审核人名称")
    @TableField(exist = false)
    private String auditorName;

    /**
     * 入库员
     */
    @ApiModelProperty("入库员编码")
    private String warehouser;
    @ApiModelProperty("入库员名称")
    @TableField(exist = false)
    private String warehouserName;
    /**
     * 取件人
     */
    @ApiModelProperty("取件人编码")
    private String taker;
    @ApiModelProperty("取件人名称")
    @TableField(exist = false)
    private String takerName;
    /**
     * 运费核算员
     */
    @ApiModelProperty("运费核算员编码")
    private String freightCashier;
    @ApiModelProperty("运费核算员名称")
    @TableField(exist = false)
    private String freightCashierName;


    @ApiModelProperty("推广人")
    private String promoter;

    /**
     * 发货人
     */
    @ApiModelProperty("发货人编码")
    private String consignor;
    @ApiModelProperty("发货人名称")
    @TableField(exist = false)
    private String consignorName;



    @ApiModelProperty("组别")
    @TableField("user_group")
    private String userGroup;

    @ApiModelProperty("是否是小包客户")
    private boolean parcel;
    @ApiModelProperty("是否是快递客户")
    private boolean express;
    @ApiModelProperty("是否是fba客户")
    private boolean fba;

    public boolean isParcel() {
        return parcel;
    }

    public void setParcel(boolean parcel) {
        this.parcel = parcel;
    }

    public boolean isExpress() {
        return express;
    }

    public void setExpress(boolean express) {
        this.express = express;
    }

    public boolean isFba() {
        return fba;
    }

    public void setFba(boolean fba) {
        this.fba = fba;
    }

    public String getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(String userGroup) {
        this.userGroup = userGroup;
    }


    public String getAgent() {
        return agent;
    }

    public String getMaintainer() {
        return maintainer;
    }

    public String getAuditor() {
        return auditor;
    }

    public String getWarehouser() {
        return warehouser;
    }

    public String getTaker() {
        return taker;
    }

    public String getFreightCashier() {
        return freightCashier;
    }

    public String getConsignor() {
        return consignor;
    }

    public String getAftersale() {
        return aftersale;
    }

    public String getTreasurer() {
        return treasurer;
    }

    public String getItTechnician() {
        return itTechnician;
    }

    /**
     * 售后客服
     */
    @ApiModelProperty("售后客服")
    private String aftersale;
    @ApiModelProperty("售后客服名称")
    @TableField(exist = false)
    private String aftersaleName;

    /**
     * 专属财务
     */
    @ApiModelProperty("专属财务编号")
    private String treasurer;
    @ApiModelProperty("专属财务名称")
    @TableField(exist = false)
    private String treasurerName;
    /**
     * 专属it
     */
    @ApiModelProperty("专属it编号")
    private String itTechnician;
    @ApiModelProperty("专属it名称")
    @TableField(exist = false)
    private String itTechnicianName;
    /**
     *
     */
 /*   @ApiModelProperty("推广员")
    private String promoter;*/
    @ApiModelProperty("客户销售id")
    private Integer clientSellId;
    @ApiModelProperty("错误登录次数")
    private int errorLogonnum;

    @ApiModelProperty(value = "标签id数组")
    @TableField(exist = false)
    private Integer[] tagArray;

    public Integer[] getTagArray() {
        return tagArray;
    }

    public void setTagArray(Integer[] tagArray) {
        this.tagArray = tagArray;
    }

    public int getErrorLogonnum() {
        return errorLogonnum;
    }

    public void setErrorLogonnum(int errorLogonnum) {
        this.errorLogonnum = errorLogonnum;
    }

    public String getPromoter() {
        return promoter;
    }

    public void setPromoter(String promoter) {
        this.promoter = promoter;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getMaintainerName() {
        return maintainerName;
    }

    public void setMaintainerName(String maintainerName) {
        this.maintainerName = maintainerName;
    }

    public String getAuditorName() {
        return auditorName;
    }

    public void setAuditorName(String auditorName) {
        this.auditorName = auditorName;
    }

    public String getWarehouserName() {
        return warehouserName;
    }

/*
    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }
*/

    public void setWarehouserName(String warehouserName) {
        this.warehouserName = warehouserName;
    }

    public String getTakerName() {
        return takerName;
    }

    public void setTakerName(String takerName) {
        this.takerName = takerName;
    }

    public String getFreightCashierName() {
        return freightCashierName;
    }

    public void setFreightCashierName(String freightCashierName) {
        this.freightCashierName = freightCashierName;
    }

    public String getConsignorName() {
        return consignorName;
    }

    public void setConsignorName(String consignorName) {
        this.consignorName = consignorName;
    }

    public String getAftersaleName() {
        return aftersaleName;
    }

    public void setAftersaleName(String aftersaleName) {
        this.aftersaleName = aftersaleName;
    }

    public String getTreasurerName() {
        return treasurerName;
    }

    public void setTreasurerName(String treasurerName) {
        this.treasurerName = treasurerName;
    }

    public String getItTechnicianName() {
        return itTechnicianName;
    }

    public void setItTechnicianName(String itTechnicianName) {
        this.itTechnicianName = itTechnicianName;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public void setMaintainer(String maintainer) {
        this.maintainer = maintainer;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public void setWarehouser(String warehouser) {
        this.warehouser = warehouser;
    }

    public void setTaker(String taker) {
        this.taker = taker;
    }

    public void setFreightCashier(String freightCashier) {
        this.freightCashier = freightCashier;
    }

    public void setConsignor(String consignor) {
        this.consignor = consignor;
    }

    public void setAftersale(String aftersale) {
        this.aftersale = aftersale;
    }

    public void setTreasurer(String treasurer) {
        this.treasurer = treasurer;
    }

    public void setItTechnician(String itTechnician) {
        this.itTechnician = itTechnician;
    }

    public Integer getClientSellId() {
        return clientSellId;
    }

    public void setClientSellId(Integer clientSellId) {
        this.clientSellId = clientSellId;
    }

    @ApiModelProperty("接受消息的手机号")
    private String recvPhone;

    @ApiModelProperty("注册时填入的推广码")
    private String promoCode;

    @ApiModelProperty(" 客户类型 1:普通 2:同行 3:统一")
    private Integer customerType;

    public Integer getCustomerType() {
        return customerType;
    }

    public void setCustomerType(Integer customerType) {
        this.customerType = customerType;
    }

    public int getIcid() {
        return icid;
    }

    public void setIcid(int icid) {
        this.icid = icid;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    public String getRecvPhone() {
        return recvPhone;
    }

    public void setRecvPhone(String recvPhone) {
        this.recvPhone = recvPhone;
    }

    public boolean isHasPayPassword() {
        return hasPayPassword;
    }

    public void setHasPayPassword(boolean hasPayPassword) {
        this.hasPayPassword = hasPayPassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCunitName() {
        return cunitName;
    }

    public void setCunitName(String cunitName) {
        this.cunitName = cunitName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Long getLogintime() {
        return logintime;
    }

    public void setLogintime(Long logintime) {
        this.logintime = logintime;
    }

    public String getQqBind() {
        return qqBind;
    }

    public void setQqBind(String qqBind) {
        this.qqBind = qqBind;
    }

    public String getQqJson() {
        return qqJson;
    }

    public void setQqJson(String qqJson) {
        this.qqJson = qqJson;
    }

    public String getWeixinBind() {
        return weixinBind;
    }

    public void setWeixinBind(String weixinBind) {
        this.weixinBind = weixinBind;
    }

    public String getWeixinJson() {
        return weixinJson;
    }

    public void setWeixinJson(String weixinJson) {
        this.weixinJson = weixinJson;
    }

    public String getWeixinHeadImgUrl() {
        return weixinHeadImgUrl;
    }

    public void setWeixinHeadImgUrl(String weixinHeadImgUrl) {
        this.weixinHeadImgUrl = weixinHeadImgUrl;
    }

    public String getSinaBind() {
        return sinaBind;
    }

    public void setSinaBind(String sinaBind) {
        this.sinaBind = sinaBind;
    }

    public String getSinaJson() {
        return sinaJson;
    }

    public void setSinaJson(String sinaJson) {
        this.sinaJson = sinaJson;
    }

    public Long getStarttime() {
        return starttime;
    }

    public void setStarttime(Long starttime) {
        this.starttime = starttime;
    }

    public float getFcredit() {
        return fcredit;
    }

    public void setFcredit(float fcredit) {
        this.fcredit = fcredit;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public float getWithdrawalBalance() {
        return withdrawalBalance;
    }

    public void setWithdrawalBalance(float withdrawalBalance) {
        this.withdrawalBalance = withdrawalBalance;
    }

    public int getIntegral() {
        return integral;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }

    public Integer getCycle() {
        return cycle;
    }

    public void setCycle(Integer cycle) {
        this.cycle = cycle;
    }

    public String getCphone() {
        return cphone;
    }

    public void setCphone(String cphone) {
        this.cphone = cphone;
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl;
    }

    public int getLogonnum() {
        return logonnum;
    }

    public void setLogonnum(int logonnum) {
        this.logonnum = logonnum;
    }

    public int getAgreementstatic() {
        return agreementstatic;
    }

    public void setAgreementstatic(int agreementstatic) {
        this.agreementstatic = agreementstatic;
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }

    public float getWaycost() {
        return waycost;
    }

    public void setWaycost(float waycost) {
        this.waycost = waycost;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public Integer getUserstate() {
        return userstate;
    }

    public void setUserstate(Integer userstate) {
        this.userstate = userstate;
    }

    public String getcSign() {
        return cSign;
    }

    public void setcSign(String cSign) {
        this.cSign = cSign;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String getCaddr() {
        return caddr;
    }

    public void setCaddr(String caddr) {
        this.caddr = caddr;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getCertificationMark() {
        return certificationMark;
    }

    public void setCertificationMark(Integer certificationMark) {
        this.certificationMark = certificationMark;
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }

    public Date getNextBillStartDate() {
        return nextBillStartDate;
    }

    public void setNextBillStartDate(Date nextBillStartDate) {
        this.nextBillStartDate = nextBillStartDate;
    }

    public Integer getPaymentDay() {
        return paymentDay;
    }

    public void setPaymentDay(Integer paymentDay) {
        this.paymentDay = paymentDay;
    }

    public String getDingdingToken() {
        return dingdingToken;
    }

    public void setDingdingToken(String dingdingToken) {
        this.dingdingToken = dingdingToken;
    }
}
