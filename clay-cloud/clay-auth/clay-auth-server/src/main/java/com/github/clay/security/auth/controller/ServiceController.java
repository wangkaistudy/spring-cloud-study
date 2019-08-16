package com.github.clay.security.auth.controller;

import com.github.clay.security.auth.biz.ClientBiz;
import com.github.clay.security.auth.entity.Client;
import com.github.clay.security.auth.entity.ClientService;
import com.github.clay.security.common.msg.ObjectRestResponse;
import com.github.clay.security.common.rest.BaseController;
import org.springframework.web.bind.annotation.*;

/**
 * @author clay
 * @create 2017/12/26.
 */
@RestController
@RequestMapping("service")
public class ServiceController extends BaseController<ClientBiz,Client>{

    @RequestMapping(value = "/{id}/client", method = RequestMethod.PUT)
    @ResponseBody
    public ObjectRestResponse modifyUsers(@PathVariable int id, String clients){
        baseBiz.modifyClientServices(id, clients);
        return new ObjectRestResponse().rel(true);
    }

    @RequestMapping(value = "/{id}/client", method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse<ClientService> getUsers(@PathVariable int id){
        return new ObjectRestResponse<ClientService>().rel(true).data(baseBiz.getClientServices(id));
    }
}
