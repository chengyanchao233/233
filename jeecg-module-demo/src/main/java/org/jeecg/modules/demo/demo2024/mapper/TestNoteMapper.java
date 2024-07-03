package org.jeecg.modules.demo.demo2024.mapper;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.poi.ss.formula.functions.T;
import org.jeecg.modules.demo.demo2024.entity.TestNote;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * @Description: 请假单@JS增强示例
 * @Author: jeecg-boot
 * @Date:   2024-06-26
 * @Version: V1.0
 */
@Repository
@Mapper
public interface TestNoteMapper extends BaseMapper<TestNote> {
    int add(@Param("testNote")TestNote testNote);
    int myUpdateById(@Param("testNote")TestNote testNote);
    int myRemoveById(@Param("id")String id);
//    Page<TestNote> findByPaging(Map param);

    List<TestNote> getTestNoteInfoList();
}
