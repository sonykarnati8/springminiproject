package com.gqt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gqt.Items;
import com.gqt.service.ItemService;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    /*
    @RequestMapping("/addItem")
    public ModelAndView addItem(HttpServletRequest request) {
        int itemId = Integer.parseInt(request.getParameter("iid"));
        String itemName = request.getParameter("iname");
        float itemPrice = Float.parseFloat(request.getParameter("iprice"));

        Items item = new Items();
        item.setItemId(itemId);
        item.setItemName(itemName);
        item.setItemPrice(itemPrice);

        // Invoking ItemService class Method
        itemService.addItem(item);

        // Loading view file
        return new ModelAndView("SuccessItems.jsp");
    }
    */

    @RequestMapping("/addItem")
    public ModelAndView addItem(@RequestParam("iid") int itemId,
                                @RequestParam("iname") String itemName,
                                @RequestParam("iprice") float itemPrice) {
        Items item = new Items();
        item.setItemId(itemId);
        item.setItemName(itemName);
        item.setItemPrice(itemPrice);

        // Invoking ItemService class Method
        itemService.addItem(item);

        // Loading view file
        return new ModelAndView("SuccessItems.jsp");
    }
}
