package cc.mrbird.febs.cos.service;

import cc.mrbird.febs.cos.entity.StudentInfo;
import cc.mrbird.febs.system.domain.User;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author FanK
 */
public interface IStudentInfoService extends IService<StudentInfo> {

    // 分页查询学生信息
    IPage<LinkedHashMap<String, Object>> getStudentInfoByPage(Page page, StudentInfo studentInfo);

    // 根据学生获取选择的课程
    List<LinkedHashMap> selectionByStudentId(Integer studentId);

    // 分页获取系统用户数据
    IPage<LinkedHashMap<String,Object>> systemUserPage(Page page, User user);

    // 学生身份进入主页
    LinkedHashMap<String, Object> home(Integer userId, Integer userType);
}
