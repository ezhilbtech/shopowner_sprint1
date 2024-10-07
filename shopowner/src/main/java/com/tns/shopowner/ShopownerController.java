package com.tns.shopowner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shopowner")  // Base path is now "/shopowner"
public class ShopownerController {

    @Autowired
    private ShopownerService shopownerService;

    @GetMapping
    public List<Shopowner> getAllShopowners() {
        return shopownerService.getAllShopowners();
    }

    @PostMapping
    public Shopowner createShopowner(@RequestBody Shopowner shopowner) {
        return shopownerService.createShopowner(shopowner);
    }

    @GetMapping("/{id}")
    public Shopowner getShopownerById(@PathVariable Long id) {
        return shopownerService.getShopownerById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteShopowner(@PathVariable Long id) {
        shopownerService.deleteShopowner(id);
    }
}
