package com.rahulsapplication.app.modules.signin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rahulsapplication.app.modules.signin.`data`.model.SignInModel

public class SignInVM : ViewModel() {
  public val signInModel: MutableLiveData<SignInModel> = MutableLiveData(SignInModel())

  public var navArguments: Bundle? = null
}
