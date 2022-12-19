package com.bridgelabz.hellomessagingapprestapicall.controller;



import com.bridgelabz.hellomessagingapprestapicall.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRestController {
    //UC1-create a rest controller to demonstrate various http methods
    @RequestMapping(value = "/hello")
    public String hello() {
        return " Hello From BridgeLabz ";
    }

    @RequestMapping(value = "/sayhello", method = RequestMethod.GET)
    public String sayHello() {
        return "My name is NitishPriyadarshi";
    }

    //UC2-use get request method and passed name as query parameter

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public String sayHelloAgain(@RequestParam(value = "name") String name) {
        return "Hello " + name + " From BridgeLabz!!!!";
    }

    @RequestMapping(value = "/query1", method = RequestMethod.PUT)
    public String sayHelloAgain(@RequestParam(value = "MobileNumber") long MobileNumber) {
        return "Hello My Mobile Number is ==> " + MobileNumber;
    }

    //UC3-Use GET Request Method and pass name as path variable
    @RequestMapping(value = "/path/{name}",method = RequestMethod.GET)
    public String passName(@PathVariable String name){
        return "Hello "+name+ "!!";
    }

    @RequestMapping(value = "/path1/{userId}",method = RequestMethod.PUT)
    public String passDetail(@PathVariable("userId")int userId){
        return "This is My UserID " + userId;
    }


    //UC-4 Pass FirstName and LastName In Body
    @RequestMapping(value = "/post",method = RequestMethod.POST)
    public String details(@RequestBody User user){
        return "Hello "+user.getFirstName()+" "+user.getLastName();

    }

    //UC5- Passing firstName in PathVariable and lastName in Query Parameter
    @RequestMapping(value = "/path2/{firstName}",method = RequestMethod.PUT)
    public String detail(@PathVariable("firstName")String firstName,@RequestParam(value = "lastName")String lastName){
        return "hello "+firstName +" "+lastName +" From BridgeLabz";
    }


}

