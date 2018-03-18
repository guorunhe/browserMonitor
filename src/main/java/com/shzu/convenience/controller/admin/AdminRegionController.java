package com.shzu.convenience.controller.admin;

import com.shzu.convenience.entity.Region;
import com.shzu.convenience.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 区域控制器
 * @author atom
 */
@Controller
@RequestMapping(value = {"/admin/region"})
public class AdminRegionController {
    @Autowired
    private RegionService regionService;

    @RequestMapping(value = {"/all"})
    @ResponseBody
    public String all(@RequestParam Integer pageNum) {
        for (Region region : regionService.findAllRegion(pageNum)) {
            System.out.println(region.getName());
        }
        return "123";
    }
}
