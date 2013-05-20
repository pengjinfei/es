/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.sishuok.es.sys.permission.service;

import com.sishuok.es.common.inject.annotation.BaseComponent;
import com.sishuok.es.common.service.BaseService;
import com.sishuok.es.sys.permission.entity.Permission;
import com.sishuok.es.sys.permission.repository.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 13-2-4 下午3:01
 * <p>Version: 1.0
 */
@DependsOn("permissionRepository")
@Service
public class PermissionService extends BaseService<Permission, Long> {

    @Autowired
    @BaseComponent
    private PermissionRepository permissionRepository;



}