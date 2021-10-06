package aula29.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

private val PAGES = 3

class MainActivity : FragmentActivity() {

    lateinit var viewPager: ViewPager2
    lateinit var mediator: TabLayoutMediator
    lateinit var tabs: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.pager)

        val pagerAdapter = Adapter(this)
        viewPager.adapter = pagerAdapter

        tabs = findViewById(R.id.tab)

        TabLayoutMediator(tabs, viewPager, TabLayoutMediator.TabConfigurationStrategy{ tab, position ->
            when (position) {
                0 -> {tab.text = "Salgados"}
                1 -> {tab.text = "Doces"}
                2 -> {tab.text = "Bebidas"}
            }
        }).attach()

    }

    private inner class Adapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
        override fun getItemCount(): Int = PAGES

        override fun createFragment(position: Int): Fragment {
            return when (position) {
                0 -> Frag1()
                1 -> Frag2()
                2 -> Frag3()
                else -> Frag1()
            }
        }
    }


}