/*
 * *****************************************************************************
 *  达飞金融，机密
 *  __________________
 * Copyright@2015-2016 DAFY CREDIT ALL Rights Reserved 达飞金融旗下品牌即有分期 版权所有
 * 备案号：粤ICP备17014188号
 *
 * 注意：
 * 	此处包含的所有信息均为深圳前海达飞金融服务有限公司的财产。知识和技术理念包含在内为深圳前
 * 	海达飞金融服务有限公司所有，可能受中国和国际专利，以及商业秘密或版权法保护。严格禁止传播
 * 	此信息或复制此材料，除非事先获得来自深圳前海达飞金融服务有限公司的书面许可。
 */

package com.dafycredit.fn.service.impl;

import java.io.IOException;

/**
 * <br>TODO(描述该类的作用)</br>
 *
 * @author  515119
 * @email   hudongzhu@dafycredit.com
 * @date    2017年6月5日 下午4:42:57
 * @version 1.0
 * @since   1.0
 */
public class DemoSerivceImpl {

    /**
     * TODO(用一句话描述这个变量表示什么).
     */
    private Integer id;
    /**
     * TODO(用一句话描述这个变量表示什么).
     */
    private String name;

    /**
     * id.
     *
     * @return  the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * id.
     *
     * @param   id    the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * name.
     *
     * @return  the name
     */
    public String getName() {
        return name;
    }

    /**
     * name.
     *
     * @param   name    the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>Description : TODO 简单描述该方法的实现功能（可选）.</p>
     * @return
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "DemoSerivceImpl [id=" + id + ", name=" + name + ", toString()=" + super.toString() + "]";
    }

    /**
     * Creates a new instance of DemoSerivceImpl.
     *
     */
    public DemoSerivceImpl() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * Creates a new instance of DemoSerivceImpl.
     *
     * @param id
     * @param name
     */
    public DemoSerivceImpl(Integer id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    /**
     * <br>TODO(描述该方法的作用)</br>
     *
     * @author    515119
     * @email     hudongzhu@dafycredit.com
     * @date      2017年6月5日 下午4:44:43
     * @version   1.0
     * @since     1.0
     * @param id
     * @param type
     * @return
     * @throws IllegalArgumentException
     * @throws IOException
     */
    public String fetchToken(Integer id, String type) throws IllegalArgumentException, IOException {
        return "";
    }

}
