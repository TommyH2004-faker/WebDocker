package com.example.WebsiteMHiepBe.Controller;


import com.example.WebsiteMHiepBe.service.cart.CartService;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart-item")
public class CartItemController {

    @Autowired
    private CartService cartService;

    @GetMapping("/get-all")
    public ResponseEntity<?> getAll() {
        return cartService.getAll();
    }
    @PostMapping("/add-item")
    public ResponseEntity<?> add(@RequestBody JsonNode jsonData) {
        try{
            return cartService.save(jsonData);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping("/update-item")
    private ResponseEntity<?> update(@RequestBody JsonNode jsonData) {
        try{
            cartService.update(jsonData);
            return ResponseEntity.ok("success");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().build();
        }
    }
}
