package com.rahulsapplication.app.modules.splashscreen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.base.BaseActivity
import com.rahulsapplication.app.databinding.ActivitySplashScreenBinding
import com.rahulsapplication.app.modules.splashscreen.`data`.viewmodel.SplashScreenVM
import kotlin.String
import kotlin.Unit

public class SplashScreenActivity :
    BaseActivity<ActivitySplashScreenBinding>(R.layout.activity_splash_screen) {
  private val viewModel: SplashScreenVM by viewModels<SplashScreenVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.splashScreenVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageLogo.setOnClickListener {
      // TODO please, add your navigation code here
    }
  }

  public companion object {
    public const val TAG: String = "SPLASH_SCREEN_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SplashScreenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
