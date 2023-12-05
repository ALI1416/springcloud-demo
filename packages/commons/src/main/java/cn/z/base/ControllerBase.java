package cn.z.base;

import cn.z.constant.ResultEnum;
import cn.z.entity.pojo.Result;

/**
 * <h1>控制层基类</h1>
 *
 * <p>
 * createDate 2020/11/11 11:11:11
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
public class ControllerBase {

    /**
     * 请求参数错误
     */
    public static Result paramIsError() {
        return Result.e(ResultEnum.PARAM_ERROR);
    }

}
