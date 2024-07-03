package org.jeecg.modules.demo.demo2024.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.jeecg.common.api.vo.Result;
import org.jeecg.modules.demo.demo2024.entity.TestNote;
import org.jeecg.modules.demo.demo2024.mapper.TestNoteMapper;
import org.jeecg.modules.demo.demo2024.service.ITestNoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;
import java.util.UUID;

/**
 * @Description: 请假单@JS增强示例
 * @Author: jeecg-boot
 * @Date:   2024-06-26
 * @Version: V1.0
 */
@Service
public class TestNoteServiceImpl extends ServiceImpl<TestNoteMapper, TestNote> implements ITestNoteService {
    @Autowired
    TestNoteMapper testNoteMapper;

    @Override
    public String mysave(TestNote testNote) {
        UUID randomUUID = UUID.randomUUID();
        testNote.setId(randomUUID.toString());
        int a=testNoteMapper.add(testNote);
        if (a == 1) {
            return "添加成功";
        } else {
            return "添加失败";
        }
    }

    @Override
    public String myUpdateById(TestNote testNote) {
        int a = testNoteMapper.myUpdateById(testNote);
        if (a == 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }

    @Override
    public String myRemoveById(String id) {
        int a = testNoteMapper.myRemoveById(id);
        if (a == 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }

    @Override
    public List<TestNote> getTestNoteInfoList(int pageNow, int pageSize) {
        return null;
    }

//    @Override
//    public IPage<TestNote> queryTestNoteList(Integer pageNo, Integer pageSize) {
//        QueryWrapper<TestNote> queryWrapper=new QueryWrapper<>();
//        queryWrapper.orderByDesc("create_time");
//        IPage<TestNote> iPage=testNoteMapper.selectPage(new Page<>(pageNo,pageSize),queryWrapper);
//        return iPage;
//    }

}
