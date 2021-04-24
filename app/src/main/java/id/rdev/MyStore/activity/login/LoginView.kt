package id.rdev.MyStore.activity.login

import id.rdev.MyStore.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}