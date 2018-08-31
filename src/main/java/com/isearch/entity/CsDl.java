package com.isearch.entity;

import java.util.Date;

public class CsDl {
    private Integer id;

    private String link;

    private String img;

    private String version;

    private String name;

    private Date dlLastUpdateTime;

    private Integer downloadTime;

    private Integer score;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getDlLastUpdateTime() {
        return dlLastUpdateTime;
    }

    public void setDlLastUpdateTime(Date dlLastUpdateTime) {
        this.dlLastUpdateTime = dlLastUpdateTime;
    }

    public Integer getDownloadTime() {
        return downloadTime;
    }

    public void setDownloadTime(Integer downloadTime) {
        this.downloadTime = downloadTime;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", link=").append(link);
        sb.append(", img=").append(img);
        sb.append(", version=").append(version);
        sb.append(", name=").append(name);
        sb.append(", dlLastUpdateTime=").append(dlLastUpdateTime);
        sb.append(", downloadTime=").append(downloadTime);
        sb.append(", score=").append(score);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}