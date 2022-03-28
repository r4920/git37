package com.rahulsapplication.app.modules.signin.`data`.model

import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class SignInModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtGladToMeety: String? =
      MyApp.getInstance().resources.getString(R.string.msg_glad_to_meet_y)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtYourName: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtYourEmail: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_your_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOr: String? = MyApp.getInstance().resources.getString(R.string.lbl_or2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAlreadyRegiste: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_registe)

)
