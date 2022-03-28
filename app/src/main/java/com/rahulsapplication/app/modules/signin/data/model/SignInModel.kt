package com.rahulsapplication.app.modules.signin.`data`.model

import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class SignInModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtTitle: String? =
      MyApp.getInstance().resources.getString(R.string.msg_glad_to_meet_y)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtGroup26: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtGroup25: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_email)
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
  public var txtOr: String? = MyApp.getInstance().resources.getString(R.string.lbl_or)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAlreadyregiste: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_registe)

)
