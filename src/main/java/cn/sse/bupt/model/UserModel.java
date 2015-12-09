package cn.sse.bupt.model;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by hao.yan on 2015/12/1.
 */
@Data
public class UserModel implements Serializable {

    private long id;
    private String username;
    private String nickname;
    private String password;
    private String email;
    private String phone;
    private String address;
    private int userType;
    private int accountStatus;
    private Date createTime;
}
