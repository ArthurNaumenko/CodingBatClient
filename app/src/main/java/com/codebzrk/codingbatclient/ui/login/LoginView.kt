/*
 *
 *  * Copyright (C) 2018 Arthur McCay.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.codebzrk.codingbatclient.ui.login

interface LoginView {

    fun setEmailError()

    fun setEmailEmpty()

    fun setPasswordError()

    fun setPasswordEmpty()

    fun showProgress()

    fun hideProgress()

    fun openCategories()

    fun openSignUpScreen()

    fun openResetPasswordScreen()

    fun setInputDisabled()

    fun setInputEnabled()

    fun setLoginDataPresentFlag(isLoginDataPresent : Boolean)

}