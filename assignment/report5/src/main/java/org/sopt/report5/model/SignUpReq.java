package org.sopt.report5.model;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class SignUpReq {
    private String id;
    private String password;
    private String profileUrl;
    private String name;
    private String part;

    private MultipartFile profilePic;
}
