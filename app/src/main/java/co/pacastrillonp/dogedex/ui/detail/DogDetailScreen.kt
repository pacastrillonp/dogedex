package co.pacastrillonp.dogedex.ui.detail

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.SportsFootball
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.pacastrillonp.dogedex.presentables.Dog
import co.pacastrillonp.dogedex.ui.theme.Purple40
import co.pacastrillonp.dogedex.ui.theme.Purple80
import co.pacastrillonp.dogedex.ui.theme.PurpleGrey80

@Composable
fun DogDetailScreen(dog: Dog) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
            .background(color = Purple40, shape = RoundedCornerShape(16.dp))
    ) {
        Header(modifier = Modifier.align(Alignment.TopEnd), dog = dog)
        Body(modifier = Modifier.align(Alignment.Center), dog = dog)
        Footer(modifier = Modifier.align(Alignment.BottomCenter)) {}
    }
}

@Composable
fun Header(modifier: Modifier, dog: Dog) {
    Text(
        text = dog.index.toString(),
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        modifier = modifier
            .padding(8.dp)
            .size(24.dp)
    )
}

@Composable
fun Body(modifier: Modifier, dog: Dog) {
    Card(
        shape = RoundedCornerShape(16.dp),
        modifier = modifier.padding(8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = dog.name,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(8.dp),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            LoadImageFromUrl(Modifier.align(Alignment.CenterHorizontally), dog.imageUrl)
            Text(
                text = dog.lifeExpectancy,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(2.dp),
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = dog.temperament,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(2.dp),
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(2.dp),
                color = MaterialTheme.colorScheme.secondary
            )
            Row {
                Column(
                    modifier = Modifier
                        .weight(0.4F)
                        .padding(2.dp)
                ) {
                    Text(
                        text = "Female",
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(4.dp),
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                    )
                    Text(
                        text = dog.weightFemale,
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    )
                    Text(
                        text = "Weight",
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(2.dp),
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 14.sp,
                    )
                    Text(
                        text = dog.heightFemale,
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    )
                    Text(
                        text = "Height",
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(2.dp),
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 14.sp,
                    )
                }
                VerticalDivider(
                    modifier = Modifier
                        .size(1.dp, 50.dp)
                        .align(Alignment.CenterVertically)
                        .padding(1.dp), color = MaterialTheme.colorScheme.secondary
                )
                Column(
                    modifier = Modifier
                        .weight(0.2F)
                        .align(Alignment.CenterVertically)
                        .padding(2.dp)
                ) {
                    Text(
                        text = "Group",
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(2.dp),
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                    )
                    Text(
                        text = dog.type,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)

                    )
                    Icon(
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(2.dp),
                        imageVector = Icons.Filled.SportsFootball,
                        contentDescription = "toy",
                    )
                }
                VerticalDivider(
                    modifier = Modifier
                        .size(1.dp, 50.dp)
                        .align(Alignment.CenterVertically)
                        .padding(1.dp), color = MaterialTheme.colorScheme.secondary
                )
                Column(
                    modifier = Modifier
                        .weight(0.4F)
                        .padding(2.dp)
                ) {
                    Text(
                        text = "Male",
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(4.dp),
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                    )
                    Text(
                        text = dog.weightMale,
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    )
                    Text(
                        text = "Weight",
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(2.dp),
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 14.sp,
                    )
                    Text(
                        text = dog.heightMale,
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    )
                    Text(
                        text = "Height",
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(2.dp),
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 14.sp,
                    )
                }
            }
        }
    }
}

@Composable
fun Footer(modifier: Modifier, onClick: () -> Unit) {
    Surface(
        shape = CircleShape,
        color = PurpleGrey80,
        border = BorderStroke(1.dp, Purple80),
        modifier = modifier.padding(8.dp)
    ) {
        IconButton(
            onClick = { onClick() },
            modifier = Modifier
                .size(56.dp)
                .clip(CircleShape)
        ) {
            Icon(
                imageVector = Icons.Filled.Check,
                contentDescription = "Check",
                tint = Purple40
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewDogDetailScreen() {
    val dog = Dog(
        id = 1,
        index = 1,
        name = "Affenpinscher",
        type = "Toy",
        heightFemale = "23-30 cm",
        heightMale = "23-30 cm",
        imageUrl = "https://cdn2.thedogapi.com/images/SkIjUe9V7_1280.jpg",
        lifeExpectancy = "12-15 years",
        temperament = "Stubborn, Curious, Playful, Adventurous, Active, Fun-loving",
        weightFemale = "3-6 kg",
        weightMale = "3-6 kg"
    )
    DogDetailScreen(dog)
}