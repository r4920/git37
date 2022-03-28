package com.rahulsapplication.app.modules.dashboard.`data`.model

import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class Dashboard3RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtMSNikeAirM: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ms_nike_air_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt29943: String? = MyApp.getInstance().resources.getString(R.string.lbl_299_43)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt53433: String? = MyApp.getInstance().resources.getString(R.string.lbl_534_33)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt24Off: String? = MyApp.getInstance().resources.getString(R.string.lbl_24_off)

)
