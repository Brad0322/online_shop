package uz.pdp.shop.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.shop.model.receive.user.UserReceiveModel;
import uz.pdp.shop.model.response.base.BaseResponse;
import uz.pdp.shop.service.user.UserService;

@RestController
@RequestMapping("api/shop/user")
public class UserRestController {

    private final UserService userService;

    @Autowired
    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    public BaseResponse addUser(
            @RequestBody UserReceiveModel userReceiveModel
    ) {
        return userService.addUser(userReceiveModel);
    }
}
