package com.mammutgroup.taxi.commons.service.remote.rest.api.user.model;

import com.google.gson.annotations.SerializedName;
import com.mammutgroup.taxi.commons.service.remote.model.BaseDto;

/**
 * @author mushtu
 * @since 6/14/16.
 */
public class User extends BaseDto {
    private String username;
    private String password;
    @SerializedName("firstname")
    private String firstName;
    @SerializedName("lastname")
    private String lastName;
    private String type;
    private String email;
    private ProfilePicture profilePicture;
    private boolean mobileVerified;
    private String profileImg;
    private String mobile;

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public String getFullName()
    {
        String fullName = "";
        if(firstName != null && lastName!= null)
            fullName = firstName + " " + lastName;
        else if(firstName!= null && lastName == null)
            fullName = firstName;
        else if(lastName != null)
            fullName = lastName;
        else
            fullName = mobile;

        return fullName;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ProfilePicture getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(ProfilePicture profilePicture) {
        this.profilePicture = profilePicture;
    }

    public boolean isMobileVerified() {
        return mobileVerified;
    }

    public void setMobileVerified(boolean mobileVerified) {
        this.mobileVerified = mobileVerified;
    }


}
