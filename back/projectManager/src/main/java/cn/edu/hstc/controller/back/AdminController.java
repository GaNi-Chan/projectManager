package cn.edu.hstc.controller.back;

import cn.edu.hstc.common.JSONResponse;
import cn.edu.hstc.pojo.User;
import cn.edu.hstc.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Veng Su 1344114844@qq.com
 * @date 2018/3/31 19:18
 */
@Controller
@RequestMapping("admin")
public class AdminController {
    @Autowired
    UserService userService;

    /**
     *@author Veng Su
     *@date 2018/3/31 19:32
     *@param
     *@return java.lang.String
     *方法作用：跳转到member-list页面
     **/
    @RequestMapping("/show/user-list")
    @ResponseBody
    public String showMember(){
        return "member-list";
    }











}
