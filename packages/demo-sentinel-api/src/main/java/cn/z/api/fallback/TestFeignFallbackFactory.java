package cn.z.api.fallback;

import cn.z.api.TestFeign;
import cn.z.constant.ResultEnum;
import cn.z.entity.pojo.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FallbackFactory;

/**
 * <h1>测试</h1>
 *
 * <p>
 * createDate 2023/12/24 15:44:08
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
public class TestFeignFallbackFactory implements FallbackFactory<TestFeign> {

    private static final Logger log = LoggerFactory.getLogger(TestFeignFallbackFactory.class);

    /**
     * 重写错误方法
     */
    @Override
    public TestFeign create(Throwable cause) {
        return () -> {
            log.error("get", cause);
            return Result.e(ResultEnum.SYSTEM_INNER_ERROR);
        };
    }

}
