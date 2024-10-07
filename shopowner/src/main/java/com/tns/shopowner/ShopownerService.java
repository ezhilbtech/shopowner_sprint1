package com.tns.shopowner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopownerService {

    @Autowired
    private ShopownerRepository shopownerRepository;

    public List<Shopowner> getAllShopowners() {
        return shopownerRepository.findAll();
    }

    public Shopowner createShopowner(Shopowner shopowner) {
        return shopownerRepository.save(shopowner);
    }

    public Shopowner getShopownerById(Long id) {
        return shopownerRepository.findById(id).orElse(null);
    }

    public void deleteShopowner(Long id) {
        shopownerRepository.deleteById(id);
    }
    
}
