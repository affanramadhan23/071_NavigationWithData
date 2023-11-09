package com.example.praktikum6.ui.komponen

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.praktikum6.R

@Composable
fun Formatlabelharga(
    subtotal : String,
    modifier: Modifier=Modifier
) {
    Text(
        text = stringResource(R.string.subtotal_price, subtotal),
        modifier = modifier,
        style = MaterialTheme.typography.headlineSmall
        )
}