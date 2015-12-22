package cn.sse.bupt.model;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by hao.yan on 2015/12/22.
 */
@Data
public class FileModel implements Serializable {
    private static final long serialVersionUID = -1561334485065596677L;

    private int id;
    private int nid;
    private String title;
    private String url;
}
