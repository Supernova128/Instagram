package com.example.instagram;


import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

@ParseClassName("Post")
public class Post extends ParseObject {

    public static final String Description_Key = "description";
    public static final String Image_Key = "image";
    public static final String User_Key = "user";

    public String getDescription(){
        return getString(Description_Key);
    }
    public void setDescription(String description){
        put(Description_Key, description);
    }
    public ParseFile getImage(){
        return  getParseFile(Image_Key);
    }
    public void setImage(ParseFile parsefile){
        put(Image_Key,parsefile);
    }
    public ParseUser getUser() {
        return getParseUser(User_Key);
    }
    public void setUser(ParseUser user){
        put(User_Key,user);
    }

}
