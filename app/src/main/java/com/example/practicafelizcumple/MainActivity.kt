package com.example.practicafelizcumple

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practicafelizcumple.ui.theme.PracticaFelizCumpleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticaFelizCumpleTheme {
                MiPantalla()
            }
        }
    }
}


@Composable
fun MiPantalla(modifier: Modifier = Modifier) {
    val texto = stringResource(id = R.string.texto)
    val miNombre = stringResource(id = R.string.mi_nombre)
    val descripcionImagen = stringResource(id = R.string.desc_imagen)

    val imagePainter = painterResource(id = R.drawable.pez)

    val colorDeFondo = Color(0xFFE3F2FD)
    val colorDelTexto = Color(0xFF1565C0)

    Column (
        modifier = modifier
            .fillMaxSize()
            .background(colorDeFondo)
    ) {
        Image(
            painter = imagePainter,
            contentDescription = descripcionImagen,
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )

        Text(
            text = texto,
            fontSize = 24.sp,
            color = colorDelTexto,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier.padding(16.dp)
        )

        Text(
            text = miNombre,
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
            color = colorDelTexto,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp)
        )
    }
}