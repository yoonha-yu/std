package com.example.test.User;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateForm {
    @Size(min = 3, max = 25)
    @NotEmpty(message = "사용자ID는 필수항목입니다.")
    private String username;

    @NotEmpty(message = "닉네임은 필수항목입니다.")
    @Size(min = 3, max = 7, message = "닉네임은 2자이상 7자 이하여야 합니다.")
    private String nickname;

    @NotEmpty(message = "비밀번호는 필수항목입니다.")
    private String password1;

    @NotEmpty(message = "비밀번호 확인은 필수항목입니다.")
    private String password2;
}
