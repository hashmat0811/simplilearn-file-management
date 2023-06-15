package com.simplilearn.client;

import com.simplilearn.services.FileManagementService;

public class FileManagement {
    public static void main(String[] args) {
        FileManagementService fileManagementService = new FileManagementService();
        fileManagementService.startApp();
    }
}
