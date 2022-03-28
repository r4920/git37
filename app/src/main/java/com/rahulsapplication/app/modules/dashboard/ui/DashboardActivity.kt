package com.rahulsapplication.app.modules.dashboard.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.base.BaseActivity
import com.rahulsapplication.app.databinding.ActivityDashboardBinding
import com.rahulsapplication.app.modules.dashboard.`data`.model.Dashboard2RowModel
import com.rahulsapplication.app.modules.dashboard.`data`.model.Dashboard3RowModel
import com.rahulsapplication.app.modules.dashboard.`data`.model.Dashboard4RowModel
import com.rahulsapplication.app.modules.dashboard.`data`.model.ImageSliderGroup8Model
import com.rahulsapplication.app.modules.dashboard.`data`.viewmodel.DashboardVM
import com.rahulsapplication.app.modules.offerscreen.ui.OfferScreenActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

public class DashboardActivity : BaseActivity<ActivityDashboardBinding>(R.layout.activity_dashboard)
    {
  private val imageSliderGroup8Items: ArrayList<ImageSliderGroup8Model> = arrayListOf()

  private val viewModel: DashboardVM by viewModels<DashboardVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val imageSliderGroup8Adapter = ImageSliderGroup8Adapter(imageSliderGroup8Items,true)
    binding.imageSliderGroup8.adapter = imageSliderGroup8Adapter
    binding.imageSliderGroup8.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorGroup6.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorGroup6.updateIndicatorCounts(binding.imageSliderGroup8.indicatorCount)
    val recyclerFlashSaleAdapter =
    RecyclerFlashSaleAdapter(viewModel.recyclerFlashSaleList.value?:mutableListOf())
    binding.recyclerFlashSale.adapter = recyclerFlashSaleAdapter
    recyclerFlashSaleAdapter.setOnItemClickListener(
    object : RecyclerFlashSaleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Dashboard2RowModel) {
        onClickRecyclerFlashSale(view, position, item)
      }
    }
    )
    viewModel.recyclerFlashSaleList.observe(this) {
      recyclerFlashSaleAdapter.updateData(it)
    }
    val recyclerMegaSaleAdapter =
    RecyclerMegaSaleAdapter(viewModel.recyclerMegaSaleList.value?:mutableListOf())
    binding.recyclerMegaSale.adapter = recyclerMegaSaleAdapter
    recyclerMegaSaleAdapter.setOnItemClickListener(
    object : RecyclerMegaSaleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Dashboard3RowModel) {
        onClickRecyclerMegaSale(view, position, item)
      }
    }
    )
    viewModel.recyclerMegaSaleList.observe(this) {
      recyclerMegaSaleAdapter.updateData(it)
    }
    val recyclerDashboardAdapter =
    RecyclerDashboardAdapter(viewModel.recyclerDashboardList.value?:mutableListOf())
    binding.recyclerDashboard.adapter = recyclerDashboardAdapter
    recyclerDashboardAdapter.setOnItemClickListener(
    object : RecyclerDashboardAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Dashboard4RowModel) {
        onClickRecyclerDashboard(view, position, item)
      }
    }
    )
    viewModel.recyclerDashboardList.observe(this) {
      recyclerDashboardAdapter.updateData(it)
    }
    binding.dashboardVM = viewModel
  }

  public override fun onPause(): Unit {
    binding.imageSliderGroup8.pauseAutoScroll()
    super.onPause()
  }

  public override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderGroup8.resumeAutoScroll()
  }

  public override fun setUpClicks(): Unit {
    binding.linearFlashsalehead.setOnClickListener {
      val destIntent = OfferScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public fun onClickRecyclerFlashSale(
    view: View,
    position: Int,
    item: Dashboard2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerMegaSale(
    view: View,
    position: Int,
    item: Dashboard3RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerDashboard(
    view: View,
    position: Int,
    item: Dashboard4RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "DASHBOARD_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DashboardActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
