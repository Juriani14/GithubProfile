package id.ac.polbeng.juriani.githubprofile.activities

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Parcel
import android.os.Parcelable
import id.ac.polbeng.juriani.githubprofile.helpers.Config
import id.ac.polbeng.juriani.githubprofile.databinding.ActivitySplashScreenBinding

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity() : AppCompatActivity(), Parcelable {

    private lateinit var binding: ActivitySplashScreenBinding

    constructor(parcel: Parcel) : this() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler(mainLooper).postDelayed({
            startActivity(Intent(this@SplashScreenActivity, MainActivity::class.java))
            finish()
        }, Config.SPLASH_SCREEN_DELAY)
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<SplashScreenActivity> {
        override fun createFromParcel(parcel: Parcel): SplashScreenActivity {
            return SplashScreenActivity(parcel)
        }

        override fun newArray(size: Int): Array<SplashScreenActivity?> {
            return arrayOfNulls(size)
        }
    }
}
