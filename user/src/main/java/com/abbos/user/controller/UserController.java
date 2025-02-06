package com.abbos.user.controller;

import com.abbos.user.dto.UserCreateDTO;
import com.abbos.user.dto.UserResponseDTO;
import com.abbos.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Aliabbos Ashurov
 * @since 21/January/2025  11:33
 **/
@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/save")
    public ResponseEntity<UserResponseDTO> save(@RequestBody UserCreateDTO dto) {
        return ResponseEntity.ok(userService.save(dto));
    }

}
