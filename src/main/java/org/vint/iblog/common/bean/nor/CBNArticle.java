package org.vint.iblog.common.bean.nor;

import java.util.Date;

/**
 * 通用文章Java对象
 *
 * Created by Vin on 14-3-10.
 */
public class CBNArticle extends CBNObject {
    // hex code
    public String hCode;

    // title
    public String title;
    // content
    public String content;

    public Date createDate;

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String gethCode() {
        return hCode;
    }

    public void sethCode(String hCode) {
        this.hCode = hCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
