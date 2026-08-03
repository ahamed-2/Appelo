package com.appelo.security


class AuthManager {


    private var authenticated =
        false



    fun login(
        password: String
    ): Boolean {


        // Real biometric/password system পরে add হবে


        authenticated =
            password.isNotEmpty()


        return authenticated
    }



    fun logout(){

        authenticated = false

    }



    fun isLoggedIn(): Boolean {

        return authenticated

    }
}
