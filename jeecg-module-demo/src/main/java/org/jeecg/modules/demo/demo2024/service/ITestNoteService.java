package org.jeecg.modules.demo.demo2024.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.jeecg.common.api.vo.Result;
import org.jeecg.modules.demo.demo2024.entity.TestNote;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @Description: 请假单@JS增强示例
 * @Author: jeecg-boot
 * @Date:   2024-06-26
 * @Version: V1.0
 */
public interface ITestNoteService extends IService<TestNote> {

    public String mysave(TestNote testNote);

    public String myUpdateById(TestNote testNote);

    public String myRemoveById(String id);

    List<TestNote> getTestNoteInfoList(int pageNow, int pageSize);

//    IPage<TestNote> queryTestNoteList(Integer pageNo, Integer pageSize);

}
