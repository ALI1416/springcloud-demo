package cn.z.api;

import cn.z.api.fallback.TestFeignFallbackFactory;
import cn.z.entity.pojo.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <h1>测试</h1>
 *
 * <p>
 * createDate 2023/12/16 16:07:30
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
// fallbackFactory 错误回调工厂
@FeignClient(value = "demo-sentinel-provider", path = "test", contextId = "test", fallbackFactory = TestFeignFallbackFactory.class)
public interface TestFeign {

    /**
     * <h1>获取</h1>
     */
    @GetMapping("get")
    Result<Long> get();

}
