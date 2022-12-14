package com.example.layoutmusicapp.ui.component

import android.icu.text.CaseMap
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.layoutmusicapp.ui.theme.*

@Composable
fun Subtitle1(title: String, modifier: Modifier = Modifier) =
    Text(
        text = title,
        style = TextStyle(
            fontSize = 15.sp,
            fontFamily = urbanist,
            fontWeight = FontWeight.SemiBold,
            letterSpacing = .2.sp
        ),
        modifier = modifier)

@Composable
fun Subtitle2(title: String, modifier: Modifier = Modifier) =
    Text(
        text = title,
        style = TextStyle(
            fontSize = 11.sp,
            fontFamily = urbanist,
            fontWeight = FontWeight.Medium,
            color = Gray200
        ),
        modifier = modifier)

@Composable // toolbar
fun Title1(title: String, modifier: Modifier = Modifier) =
    Text(
        text = title,
        style = TextStyle(
            fontSize = 20.sp,
            fontFamily = urbanist,
            fontWeight = FontWeight.Bold,
        ),
        modifier = modifier)

@Composable
fun Title2(title: String, modifier: Modifier = Modifier) =
    Text(
        text = title,
        style = TextStyle(
            fontSize = 15.sp,
            fontFamily = urbanist,
            fontWeight = FontWeight.Bold,
        ),
        modifier = modifier)

@Composable
fun EasyPayTitle1(title: String, modifier: Modifier = Modifier) {
    Text(
        text = title,
        style = TextStyle(
            fontSize = 32.sp,
            fontFamily = IBMPlexSans,
            fontWeight = FontWeight.Medium,
        ),
        modifier = modifier)
}

@Composable
fun EasyPaySubtitle1(title: String, modifier: Modifier = Modifier) {
    Text(
        text = title,
        style = TextStyle(
            fontSize = 18.sp,
            fontFamily = roboto,
            fontWeight = FontWeight.Normal,
            color = EasyPayGray400
        ),
        textAlign = TextAlign.Center,
        modifier = modifier)
}

@Composable
fun EasyPayTitleButton(title: String, modifier: Modifier = Modifier, color: Color) {
    Text(
        text = title,
        style = TextStyle(
            fontSize = 20.sp,
            fontFamily = roboto,
            fontWeight = FontWeight.Bold,
            color = color
        ),
        modifier = modifier)
}
