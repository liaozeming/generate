package com.lzm.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 部门表
 * </p>
 *
 * @author lzm
 * @since 2021-07-07
 */
public class Dept extends Model<Dept> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "deptno", type = IdType.AUTO)
    private Long deptno;

    private String dname;

    private String dbSource;


    public Long getDeptno() {
        return deptno;
    }

    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDbSource() {
        return dbSource;
    }

    public void setDbSource(String dbSource) {
        this.dbSource = dbSource;
    }

    @Override
    protected Serializable pkVal() {
        return this.deptno;
    }

    @Override
    public String toString() {
        return "Dept{" +
        "deptno=" + deptno +
        ", dname=" + dname +
        ", dbSource=" + dbSource +
        "}";
    }
}
