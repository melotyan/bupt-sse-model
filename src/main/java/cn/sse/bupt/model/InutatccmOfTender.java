package cn.sse.bupt.model;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by melot on 2016/4/4.
 */
@Data
public class InutatccmOfTender implements Serializable {
    private int id;
    private String title;
    private String content;
    private String fileUrl;
}
