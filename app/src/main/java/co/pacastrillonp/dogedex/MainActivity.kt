package co.pacastrillonp.dogedex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import co.pacastrillonp.dogedex.presentables.Dog
import co.pacastrillonp.dogedex.ui.dogs.DogScreenViewModel
import co.pacastrillonp.dogedex.ui.dogs.DogsScreen
import co.pacastrillonp.dogedex.ui.theme.DogeDexTheme

class MainActivity : ComponentActivity() {

    private lateinit var dogScreenViewModel: DogScreenViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        dogScreenViewModel = ViewModelProvider(this)[DogScreenViewModel::class.java]

        setContent {

            val dogs: List<Dog> by dogScreenViewModel.dogList.observeAsState(initial = emptyList())

            DogeDexTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DogsScreen(dogs)
                }
            }
        }
    }
}