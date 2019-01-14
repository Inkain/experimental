package inkant1990.com.experimental

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var ex: Boolean = false;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun appyMotion(view: View) {
        Log.d("testDima", "click")
        if (!ex) {

            ex = true
            Log.d("testDima", "click if")
            motion2.transitionToStart()
            motion2.transitionToState(R.id.start)

        } else {
            ex = false


            motion2.transitionToState(R.id.end)
            motion2.transitionToEnd()


        }
    }
}
