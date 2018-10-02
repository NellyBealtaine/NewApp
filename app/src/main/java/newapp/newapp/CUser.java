package newapp.newapp;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.gson.*;

public class CUser implements MainActivity.Authentification {

    static String _email;
    static String _password;
    private static CUser me;
    private CUser(String _email, String _password){
        this._email = _email;
        this._password = _password;
    }
    public static CUser instance(){
        if (me==null) me = new CUser(_email, _password);
        return me;
    }
    GsonBuilder gbuilder = new GsonBuilder();
    Gson gson = gbuilder.create();

    public void setUserData(String email, String password){
        try{_email = email.getBytes().toString();
            _password = password.getBytes().toString();}
        catch(Exception e){}
    }
    public String getUserData(String email, String password){

        String result = gson.toJson(CUser.instance());
        return (result);
    }

/*
    protected CUser(Parcel in) {
        _email = in.readString();
        _password = in.readString();
    }

//    @Override
    public int describeContents() {
        return 0;
    }

//    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(_email);
        dest.writeString(_password);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<CUser> CREATOR = new Parcelable.Creator<CUser>() {
        @Override
        public CUser createFromParcel(Parcel in) {
            return new CUser(in);
        }

        @Override
        public CUser[] newArray(int size) {
            return new CUser[size];
        }
    };   */

}
