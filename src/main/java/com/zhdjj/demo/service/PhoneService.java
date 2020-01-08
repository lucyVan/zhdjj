package com.zhdjj.demo.service;

import org.springframework.stereotype.Repository;

import java.io.IOException;

@Repository
public interface PhoneService {
    int InsertInfo() throws IOException;
}
