package cn.sse.bupt.model;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by melot on 2016/4/4.
 */
@Data
public class TenderModel implements Serializable {
    private int id;
    private int tid;
    private int uid;
    private String title;
    private String fileUrl;
}
