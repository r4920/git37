package com.rahulsapplication.app.modules.signup.`data`.model

import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class SignUpModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSignUpAndsta: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_up_and_sta)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtYourName: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtYourName1: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtYourName2: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtYourName3: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBySigningUpY: String? =
      MyApp.getInstance().resources.getString(R.string.msg_by_signing_up_y)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAlreadyRegiste: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_registe)

)
