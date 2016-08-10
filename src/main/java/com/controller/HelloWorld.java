package com.controller;

import com.entity.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by Evilina on 2016/7/29.
 */
@RequestMapping("/test")
@Controller
public class HelloWorld {

    private final String SUCCESS = "success";

    /**
     * springmvc 确定目标方法pojo类型入参的过程
     * 1. 确定一个key
     *      1.1 若目标方法的pojo类型的参数没有使用@modelAttribute作为修饰，则key为pojo类名第一个字母小写
     *      1.2 若使用了@modelAttribute来修饰，则key为@modelAttributes注解的value属性值
     * 2. 在implicitModel中查找key对应的对象，如存在，则作为入参传入
     *      2.1 若在modelAttribute标记的方法中在map中保存过，且key和1确定的key一致，则挥霍渠道
     *      2.2
     * 3. 在implicitModel中不存在key对应的对象，则检查当前handler是否使用@sessionAttribute注解修饰
     * 4. 若使用了该注解，且@sessionAttributes注解的value属性值中包含了key，会从httpsession中来获取key所对应的value值，若存在，则直接传入到目标方法的入参中，若不存在，则抛出异常
     * 5. 若handler没有表示@sessionAttr或该注解value值中不包含key，则会通过反射来创建pojo类型的参数，传入为目标方法的参数
     * 6. springmvc会把key和pojo类型的对象保存到implicitmodel中，进而保存到request中
     *
     *
     * 1. 调用@modelAttribute注解修饰的方法，
     * 实际上，把@modelAttribute方法中的map的数据放在了ImplicitMap中
     * 2. 解析请求处理器的目标参数，实际上该目标参数来自于WebDataBinder对象的target属性
     *      2.1 创建webDataBinder对象
     *          2.1.1 确定ObjectName属性，若传入attrName的属性值为""，则objectName为类名第一个字母小写
     *                  注意： attrName，若目标方法POJO属性使用了@modelAttribute来修饰，则attrName值即为@modelAttribute的value值
     *          2.1.2 确定target属性，在ImplicitModel中查找，attrName对应的属性值，若存在，ok
     *                  如不存在，则验证当前Handler是否使用了@SessionAttribute进行了修饰，如使用了，则尝试从session中获取attrName所对应的属性值，
     *                  若session中没有对应的属性值，则抛出异常
     *                  若handler没有使用@sessionAttrbutes进行修饰，或@sessionAttributes中没有这个使用value指定的key和attrName相匹配，则通过反射创建这个pojo对象
     *      2.2 springmvc把表单的请求参数赋值给了WebDataBinder的target对应的属性
     *      2.3 springmvc会把webdatabinder的attrName和target给到implicitmodel
     *      2.4 把webdatabinder中的target作为参数传递给目标方法的入参
     * @para id
     * @param map
     */
    @ModelAttribute
    public void getUserDAO(@RequestParam(value = "id", required = false) Integer id
            , Map<String, Object> map) {
        if (id != null) {
            System.out.println("nihao");
            UserEntity u = new UserEntity(1,"u","a");
            map.put("userEntity", u);
        }
    }

    @RequestMapping(value = "/testModelAttributes")
    public String testModelAttributes(@ModelAttribute(value = "userEntity") UserEntity userEntity) {
        System.out.println("xiugai :" + userEntity);
        return SUCCESS;
    }



    /*
    * 1.使用RequsetMapping映射请求的url
    * 2.返回值解析成物理视图
    *  */
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("hello world");
        return "success";
    }

    @RequestMapping(value = "/hello_post", method = RequestMethod.POST)
    public String helloPost() {
        System.out.println("post");
        return SUCCESS;
    }

    /**
     * 占位符方式的url解析
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/rst/{id}", method = RequestMethod.GET)
    public String helloRest(@PathVariable Integer id) {
        System.out.println("testRest get" + id);
        return SUCCESS;
    }

    /**
     * 传参数请求，其中age并不是必须，所以要改成Integer类型
     * 如果一定要求int类型，可以设置defaultValue = 0
     * @param username
     * @param age
     * @return
     */
    @RequestMapping(value = "/testRequestParams")
    public String testRequestParam(@RequestParam(value = "username") String username
    ,@RequestParam(value = "age" , required = false) Integer age) {
        System.out.println(username + age);
        return SUCCESS;
    }

    /**
     * springmvc 可以把请求参数和pojo属性对应起来，并支持级联操作
     * @param userDAO
     * @return
     */
    @RequestMapping(value = "/testPOJO")
    public String testPOJO(UserEntity userDAO) {
        System.out.println(userDAO);
        return SUCCESS;
    }
}

