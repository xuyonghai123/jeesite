package com.thinkgem.jeesite.modules.statisticalAnalysis;

import com.thinkgem.jeesite.modules.sys.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Thinkpad on 17/11/30.
 **/

@Controller
@RequestMapping(value = "${adminPath}/statisticalAnalysis/history")
public class statisticalAnalysisController {

    @RequestMapping(value = {"database"})
    public String index(User user, Model model) {
        return "modules/statisticalAnalysis/history/history";
    }
}
