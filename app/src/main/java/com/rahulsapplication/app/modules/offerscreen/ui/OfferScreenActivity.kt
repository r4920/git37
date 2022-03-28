package com.rahulsapplication.app.modules.offerscreen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.base.BaseActivity
import com.rahulsapplication.app.databinding.ActivityOfferScreenBinding
import com.rahulsapplication.app.modules.offerscreen.`data`.model.OfferScreen1RowModel
import com.rahulsapplication.app.modules.offerscreen.`data`.viewmodel.OfferScreenVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class OfferScreenActivity :
    BaseActivity<ActivityOfferScreenBinding>(R.layout.activity_offer_screen) {
  private val viewModel: OfferScreenVM by viewModels<OfferScreenVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerOfferScreenAdapter =
    RecyclerOfferScreenAdapter(viewModel.recyclerOfferScreenList.value?:mutableListOf())
    binding.recyclerOfferScreen.adapter = recyclerOfferScreenAdapter
    recyclerOfferScreenAdapter.setOnItemClickListener(
    object : RecyclerOfferScreenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : OfferScreen1RowModel) {
        onClickRecyclerOfferScreen(view, position, item)
      }
    }
    )
    viewModel.recyclerOfferScreenList.observe(this) {
      recyclerOfferScreenAdapter.updateData(it)
    }
    binding.offerScreenVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerOfferScreen(
    view: View,
    position: Int,
    item: OfferScreen1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "OFFER_SCREEN_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OfferScreenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
