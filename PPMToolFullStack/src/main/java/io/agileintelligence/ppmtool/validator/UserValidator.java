package io.agileintelligence.ppmtool.validator;

import io.agileintelligence.ppmtool.domain.User;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;



@Component
public class UserValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }

    @Override
    public void validate(Object object, Errors errors) {
        User user = (User) object;

        if (user.getPassword().length() < 6)
            errors.rejectValue("password", "length", "Password is too week. Use at least 6 characters");


        if (!user.getPassword().equals(user.getConfirmPassword()))
            errors.rejectValue("confirmPassword", "Match", "Passwords don't match.");

    }
}