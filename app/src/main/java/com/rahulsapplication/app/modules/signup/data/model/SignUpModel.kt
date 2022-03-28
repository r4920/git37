package com.rahulsapplication.app.modules.signup.`data`.model

import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class SignUpModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtTitle: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_up_and_sta)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtGroup21: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtGroup20: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtGroup19: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtGroup18: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBysigningupy: String? =
      MyApp.getInstance().resources.getString(R.string.msg_by_signing_up_y)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAlreadyregiste: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_registe)

)
