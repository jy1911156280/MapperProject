//package com.aaa.one.service;
//
//import com.aaa.one.base.BaseService;
//import com.aaa.one.mapper.MappingProjectMapper;
//import com.aaa.one.model.MappingProject;
//import com.aaa.one.utils.IDUtils;
//import com.github.pagehelper.PageInfo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import tk.mybatis.mapper.util.Sqls;
//
//import java.util.List;
//
///**
// * @ProjectName: mapping-qy108
// * @Package: com.aaa.six.service
// * @ClassName: MappingProjectService
// * @Author: lifuju
// * @Description:
// * @Date: 2020/5/20 21:57
// * @Version: 1.0
// */
//@Service
//public class MappingProjectService extends BaseService<MappingProject> {
//
//    @Autowired
//    private MappingProjectMapper mappingProjectMapper;
//
//
//
//    /**
//     *@Description: TODO
//     * 项目管理 新增方法 单个新增
//     *@Param :  [mappingProject]
//     *@MethodName: add
//     *@Author: lifuju
//     *@Date: 2020/5/21 14:12
//     *@Return: java.lang.Integer
//     */
//    @Override
//    public Integer add(MappingProject mappingProject){
//        mappingProject.setId(IDUtils.genUniqueKey());
//        mappingProject.setCreateTime(getCurrentTime());
//        try {
//            return super.add(mappingProject);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    /**
//     *@Description: TODO
//     * 项目管理 删除方法  单个删除
//     *@Param :  [mappingProject]
//     *@MethodName: delete
//     *@Author: lifuju
//     *@Date: 2020/5/21 14:08
//     *@Return: java.lang.Integer
//     */
//    @Override
//    public Integer delete(Long id){
//        try {
//            return super.delete(id);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    /**
//     *@Description: TODO
//     * 项目管理 删除方法 批量删除
//     *@Param :  [ids]
//     *@MethodName: delete
//     *@Author: lifuju
//     *@Date: 2020/5/21 14:16
//     *@Return: java.lang.Integer
//     */
//
//    public Integer delete(List<Object> ids){
//        if (ids == null) {
//            return null;
//        }
//        try {
//            return super.delete(ids);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    /**
//     *@Description: TODO
//     * 项目管理 更新方法 单个更新
//     *@Param :  [mappingProject]
//     *@MethodName: update
//     *@Author: lifuju
//     *@Date: 2020/5/21 14:18
//     *@Return: java.lang.Integer
//     */
//
//    @Override
//    public Integer update(MappingProject mappingProject){
//        mappingProject.setCreateTime(getCurrentTime());
//        try {
//            return super.update(mappingProject);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//
//    /**
//     *@Description: TODO
//     * 查询一条数据
//     *@Param :  [mappingProject]
//     *@MethodName: queryOne
//     *@Author: lifuju
//     *@Date: 2020/5/21 14:20
//     *@Return: com.aaa.six.model.MappingProject
//     */
//    public MappingProject getOne(Long id){
//        MappingProject mappingProject = mappingProjectMapper.selectByPrimaryKey(id);
//        if(mappingProject!=null){
//            return mappingProject;
//        }
//        return null;
//    }
//    /**
//     *@Description: TODO
//     * 项目管理 更新方法 批量更新
//     *@Param :  [mappingProject, ids]
//     *@MethodName: batchUpdate
//     *@Author: lifuju
//     *@Date: 2020/5/21 14:18
//     *@Return: java.lang.Integer
//     */
//    @Override
//    public Integer batchUpdate(MappingProject mappingProject, Object[] ids){
//        mappingProject.setModifyTime(getCurrentTime());
//        try {
//            return super.batchUpdate(mappingProject, ids);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    /**
//     *@Description: TODO
//     * 分页查询
//     *@Param :  [mappingProject, pageNo, pageSize]
//     *@MethodName: queryListByPage
//     *@Author: lifuju
//     *@Date: 2020/5/21 13:52
//     *@Return: com.github.pagehelper.PageInfo<com.aaa.six.model.MappingProject>
//     */
//    @Override
//    public PageInfo<MappingProject> queryListByPage(Integer pageNo, Integer pageSize){
//        try {
//            return super.queryListByPage(pageNo, pageSize);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    /**
//     *@Description: TODO
//     * 条件查询分页
//     *@Param :  [pageNo, pageSize, where, orderByFileds, fields]
//     *@MethodName: queryListByPageAndFields
//     *@Author: lifuju
//     *@Date: 2020/5/21 14:24
//     *@Return: com.github.pagehelper.PageInfo<com.aaa.six.model.MappingProject>
//     */
//    @Override
//    public PageInfo<MappingProject> queryListByPageAndFields(Integer pageNo, Integer pageSize, Sqls where, String orderByFileds, String... fields){
//        try {
//            return super.queryListByPageAndFields(pageNo, pageSize, where, orderByFileds, fields);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//}
package com.aaa.one.service;

import com.aaa.one.base.BaseService;
import com.aaa.one.mapper.MappingProjectMapper;
import com.aaa.one.model.MappingProject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.util.Sqls;

import java.util.List;
import java.util.Map;

/**
 * @Company
 * @Author Jiayi
 * @Date Create 2020/6/2 9:43
 * @Description
 **/
@Service
public class MappingProjectService extends BaseService<MappingProject> {

    @Autowired
    MappingProjectMapper mappingProjectMapper;

    /**
     *@Author Jiayi
     *@Description   新增项目
     *@Param [mappingProject]
     *@Date 2020/6/2 10:46
     *@return boolean
     **/
    public boolean addMappingProject(MappingProject mappingProject){
        boolean t = false;
        int i = mappingProjectMapper.insertSelective(mappingProject);
        if (i>0){
            t = true;
        }
        return t;
    }

    /**
     *@Author Jiayi
     *@Description 查询所有项目
     *                  不带分页
     *@Param []
     *@Date 2020/6/2 10:45
     *@return java.util.List<com.aaa.one.model.MappingProject>
     **/
    public List<MappingProject> queryListAll(){

        List<MappingProject> mappingProjects = mappingProjectMapper.selectAll();
        if (null != mappingProjects && mappingProjects.size()>0){
            return mappingProjects;
        }
        return null;
    }


    /**
     *@Author Jiayi
     *@Description   查询所有项目  开启分页
     *@Param [currentPage, pageSize]
     *@Date 2020/6/2 18:33
     *@return com.github.pagehelper.PageInfo<com.aaa.one.model.MappingProject>
     **/
    public PageInfo<MappingProject> queryListAllByPage(Integer currentPage,Integer pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<MappingProject> mappingProjects = mappingProjectMapper.selectAll();
        if (null!=mappingProjects && mappingProjects.size()>0){
            PageInfo<MappingProject> info = new PageInfo<>(mappingProjects);
            return info;
        }
        return null;
    }

    /**
     *@Author Jiayi
     *@Description   根据项目类型查询项目
     *@Param [where]
     *@Date 2020/6/2 11:22
     *@return java.util.List<com.aaa.one.model.MappingProject>
     **/
    public List<MappingProject> queryListByType(String where){
        Sqls custom = Sqls.custom();
        custom.andEqualTo("projectType",where);
        try{
            List<MappingProject> mappingProjects = super.queryListByFields(custom, null, null);
            if (mappingProjects != null && mappingProjects.size() > 0){
                return mappingProjects;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }


    /**
     *@Author Jiayi
     *@Description     根据项目类型查询项目  开启分页
     *@Param [where, currentPage, pageSize]
     *@Date 2020/6/2 18:41
     *@return com.github.pagehelper.PageInfo<com.aaa.one.model.MappingProject>
     **/
    public PageInfo<MappingProject> queryListByTypeAndPage(String where, Integer currentPage, Integer pageSize){
        Sqls custom = Sqls.custom();
        custom.andEqualTo("projectType",where);
        try{
            PageHelper.startPage(currentPage,pageSize);
            List<MappingProject> mappingProjects = super.queryListByFields(custom, null, null);
            if (null != mappingProjects && mappingProjects.size() > 0){
                PageInfo<MappingProject> info = new PageInfo<>(mappingProjects);
                return info;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }



    /**
     *@Author Jiayi
     *@Description   修改项目信息
     *@Param [mappingProject]
     *@Date 2020/6/2 16:49
     *@return java.lang.Integer
     **/
    public Boolean updateProject(MappingProject mappingProject){
        int i = mappingProjectMapper.updateByPrimaryKey(mappingProject);
        return i>0;
    }

    /**
     *@Author Jiayi
     *@Description   根据主键删除项目
     *@Param [mappingProject]
     *@Date 2020/6/2 16:50
     *@return java.lang.Integer
     **/
    public Boolean deleteProject(MappingProject mappingProject){
        int i = mappingProjectMapper.deleteByPrimaryKey(mappingProject);
        return i>0;
    }

    /**
     *@Author Jiayi
     *@Description   项目类型统计
     *@Param []
     *@Date 2020/6/3 10:58
     *@return java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
     **/
    public List<Map<String,Object>> projectTypeStatistics(){
        List<Map<String, Object>> list = mappingProjectMapper.projectTypeStatistics();
        if (null != list && list.size()>0){
            return list;
        }
        return null;
    }



}

