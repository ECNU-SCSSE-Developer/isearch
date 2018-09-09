package com.isearch.entity;

public class CsRec {
    private Integer id;

    private String ow;

    private String name;

    private String intro;

    private String img;

    private Integer clickTimes;

    private String remark;

    private Integer score;

    private Integer sort;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOw() {
        return ow;
    }

    public void setOw(String ow) {
        this.ow = ow == null ? null : ow.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public Integer getClickTimes() {
        return clickTimes;
    }

    public void setClickTimes(Integer clickTimes) {
        this.clickTimes = clickTimes;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ow=").append(ow);
        sb.append(", name=").append(name);
        sb.append(", intro=").append(intro);
        sb.append(", img=").append(img);
        sb.append(", clickTimes=").append(clickTimes);
        sb.append(", remark=").append(remark);
        sb.append(", score=").append(score);
        sb.append(", sort=").append(sort);
        sb.append("]");
        return sb.toString();
    }
}