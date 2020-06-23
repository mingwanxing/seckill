package cn.mingwangxin.mapper;

import cn.mingwangxin.seckill.SeckillApplication;
import cn.mingwangxin.seckill.mapper.SeckillMapper;
import cn.mingwangxin.seckill.entity.Seckill;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:application.properties")
@SpringBootTest
@ContextConfiguration(classes = SeckillApplication.class)
public class SeckillMapperTest {

    @Autowired
    private SeckillMapper seckillMapper;

    @Test
    public void findAll() {
        List<Seckill> all = seckillMapper.findAll();
        for (Seckill seckill : all) {
            System.out.println(seckill.getTitle());
        }
    }

    @Test
    public void findById() {
        Seckill seckill = seckillMapper.findById(1l);
        System.out.println(seckill.getTitle());
    }

    @Test
    public void reduceStock() {
        int row = seckillMapper.reduceStock(1l, new Date());
        System.out.println(row);
    }
}