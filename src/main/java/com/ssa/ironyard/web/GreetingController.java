package com.ssa.ironyard.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ssa.ironyard.SpringStarter;
import com.ssa.ironyard.web.Vegetable.Color;
import java.time.LocalDate;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {
    static final Logger LOGGER = LogManager.getLogger(SpringStarter.class);

    @Autowired
    WeatherService weather;
    @Autowired
    FoodService food;
    // @Autowired
    // TrieLoadingService trie;

    @RequestMapping("/")
    @ResponseBody
    public String greet(HttpServletRequest request) {
        if (null != request.getParameter("food"))
            return currentDelivery().toString();

        return "Our first web app";
    }

    @RequestMapping("/foo")
    @ResponseBody
    public Map<String, LocalDate> now(HttpServletRequest request) {

        Map<String, LocalDate> model = new HashMap<String, LocalDate>();

        model.put("now", LocalDate.now());
        if (Strings.isEmpty(request.getParameter("now")))
            return model;
        return Collections.emptyMap();
    }

    @RequestMapping("/zucchini")
    @ResponseBody
    public Vegetable zucchini() {
        Vegetable zucchini = new Vegetable(Color.YELLOW, "zucchini");
        LOGGER.warn("Zucchini is fatal", zucchini);

        return zucchini;
    }

    @RequestMapping("/temp")
    @ResponseBody
    public float currentTemp() {
        return this.weather.temperature();
    }

    @RequestMapping("/temp/mooo")
    @ResponseBody
    public Vegetable currentDelivery() {
        return this.food.delivery();
    }

    // @RequestMapping("/trie")
    // @ResponseBody
    // public List<String> trie(HttpServletRequest request) {
    // String temp="2";
    //
    // if (Strings.isEmpty(request.getParameter("suggest"))) {
    // temp = request.getParameter("suggest").substring(0);
    // }
    //
    // return trie.suggest(temp);
    //
    // }

}
