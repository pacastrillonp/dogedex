package co.pacastrillonp.dogedex.ui.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Error
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.ImagePainter
import coil.compose.rememberImagePainter

@OptIn(ExperimentalCoilApi::class)
@Composable
fun LoadImageFromUrl(modifier: Modifier, imageUrl: String) {
    val painter = rememberImagePainter(
        data = imageUrl,
        builder = {
            crossfade(true)
        }
    )
    Box(modifier = modifier) {
        Image(
            painter = painter,
            contentDescription = null,
            modifier = Modifier
                .size(150.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )
        when (painter.state) {
            is ImagePainter.State.Loading -> {
                CircularProgressIndicator(
                    modifier = modifier
                        .padding(8.dp)
                        .size(150.dp),
                    color = MaterialTheme.colorScheme.secondary,
                    trackColor = MaterialTheme.colorScheme.surfaceVariant,
                )
            }
            is ImagePainter.State.Error -> {
                Icon(
                    modifier = Modifier
                        .padding(2.dp)
                        .align(Alignment.Center)
                        .size(50.dp),
                    imageVector = Icons.Filled.Error,
                    contentDescription = "error",
                    tint = Color.Red
                )
            }
            else -> {}
        }
    }
}