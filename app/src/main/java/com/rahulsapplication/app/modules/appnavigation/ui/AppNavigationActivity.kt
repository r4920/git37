package com.rahulsapplication.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.base.BaseActivity
import com.rahulsapplication.app.databinding.ActivityAppNavigationBinding
import com.rahulsapplication.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.rahulsapplication.app.modules.dashboard.ui.DashboardActivity
import com.rahulsapplication.app.modules.offerscreen.ui.OfferScreenActivity
import com.rahulsapplication.app.modules.signin.ui.SignInActivity
import com.rahulsapplication.app.modules.signup.ui.SignUpActivity
import com.rahulsapplication.app.modules.splashscreen.ui.SplashScreenActivity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.appNavigationVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.linearSplashScreen.setOnClickListener {
      val destIntent = SplashScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearOfferScreen.setOnClickListener {
      val destIntent = OfferScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSignIn.setOnClickListener {
      val destIntent = SignInActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSignUp.setOnClickListener {
      val destIntent = SignUpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDashboard.setOnClickListener {
      val destIntent = DashboardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
