package com.isearch.entity;

import java.util.Date;

public class CsDl {
    private Integer id;

    private String link1;

    private String img;

    private String version;

    private String name;

    private Date dlLastUpdateTime;

    private Integer downloadTime;

    private Integer score;

    private String remark;

    private String link2;

    private String link3;

    private String intro;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLink1() {
        return link1;
    }

    public void setLink1(String link1) {
        this.link1 = link1 == null ? null : link1.trim();
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

    public String getLink2() {
        return link2;
    }

    public void setLink2(String link2) {
        this.link2 = link2 == null ? null : link2.trim();
    }

    public String getLink3() {
        return link3;
    }

    public void setLink3(String link3) {
        this.link3 = link3 == null ? null : link3.trim();
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", link1=").append(link1);
        sb.append(", img=").append(img);
        sb.append(", version=").append(version);
        sb.append(", name=").append(name);
        sb.append(", dlLastUpdateTime=").append(dlLastUpdateTime);
        sb.append(", downloadTime=").append(downloadTime);
        sb.append(", score=").append(score);
        sb.append(", remark=").append(remark);
        sb.append(", link2=").append(link2);
        sb.append(", link3=").append(link3);
        sb.append(", intro=").append(intro);
        sb.append("]");
        return sb.toString();
    }
}