package com.rahulsapplication.app.modules.dashboard.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.rahulsapplication.app.databinding.SlideritemDashboard1Binding
import com.rahulsapplication.app.modules.dashboard.`data`.model.ImageSliderGroup8Model
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit

public class ImageSliderGroup8Adapter(
  public val dataList: ArrayList<ImageSliderGroup8Model>,
  public val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderGroup8Model>(dataList, mIsInfinite) {
  public override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ): Unit {
    if (binding is SlideritemDashboard1Binding) {
      binding.imageSliderGroup8Model = dataList[listPosition]
    }
  }

  public override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemDashboard1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
