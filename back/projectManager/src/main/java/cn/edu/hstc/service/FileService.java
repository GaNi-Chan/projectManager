package cn.edu.hstc.service;

import cn.edu.hstc.common.JSONResponse;
import org.springframework.web.multipart.MultipartFile;

/**
* @Description:
* @author: yifang
* @Date: 2018/4/2 19:13
*/
public interface FileService {

    JSONResponse<String> upload(MultipartFile file, String path);

    JSONResponse<Integer> updateFilepathInfo(String url,Integer userId);

}
