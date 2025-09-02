package com.example.whishlistcrud.Components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType

@Composable
fun WishTextField(
    label: String,
    value: String,
    onValueChanged: (String) -> Unit,
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChanged,
        label = { Text(text = label, color = Color.Black) },
        modifier = Modifier.fillMaxWidth(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
//        colors = TextFieldDefaults.textFieldColors(
//            // using predefined Color
//            textColor = Color.Black,
//            // using our own colors in Res.Values.Color
//            focusedBorderColor = colorResource(id = R.color.black),
//            unfocusedBorderColor = colorResource(id = R.color.black),
//            cursorColor = colorResource(id = R.color.black),
//            focusedLabelColor = colorResource(id = R.color.black),
//            unfocusedLabelColor = colorResource(id = R.color.black),
//        )
    )
}
