package cn.z.base;

import cn.z.constant.FormatConstant;
import com.alibaba.fastjson2.JSON;

import java.io.Serializable;

/**
 * <h1>ToString基类</h1>
 *
 * <p>
 * createDate 2020/11/11 11:11:11
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
public class ToStringBase implements Serializable {

    /**
     * JSON字符串
     */
    @Override
    public String toString() {
        return JSON.toJSONString(this, FormatConstant.DATE);
    }

}
