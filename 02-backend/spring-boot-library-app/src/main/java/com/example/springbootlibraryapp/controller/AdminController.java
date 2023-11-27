package com.example.springbootlibraryapp.controller;

import com.example.springbootlibraryapp.requestmodels.AddBookRequest;
import com.example.springbootlibraryapp.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/admin")
public class AdminController {

    private AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("/add/book")
    public void postBook(@RequestBody AddBookRequest addBookRequest) throws Exception {
        adminService.postBook(addBookRequest);
    }

    @PutMapping("/secure/increase/book/quantity")
    public void increaseBookQuantity(@RequestParam Long bookId) throws Exception {
        adminService.increaseBookQuantity(bookId);
    }
}
