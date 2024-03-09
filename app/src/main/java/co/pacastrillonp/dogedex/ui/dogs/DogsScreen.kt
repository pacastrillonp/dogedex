package co.pacastrillonp.dogedex.ui.dogs

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import co.pacastrillonp.dogedex.presentables.Dog

@Composable
fun DogsScreen(dogs: List<Dog>) {

    val rememberLazyGridState = rememberLazyGridState()

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(8.dp),
        state = rememberLazyGridState
    ) {
        items(dogs) { dog ->
            DogCard(dog)
        }
    }
}

@Composable
fun DogCard(dog: Dog) {
    Card {
        Text(text = dog.name)
    }
}