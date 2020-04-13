package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {
    @Autowired
    BrandService brandService;


    @Test
    public void contextLoads() {
        BrandEntity brand = new BrandEntity();
       /* brand.setName("huawei");
        brandService.save(brand);
        System.out.println("保存成功！");*/

        brand.setBrandId(1l);
        brand.setDescript("测试");
        brandService.updateById(brand);

    }

}
