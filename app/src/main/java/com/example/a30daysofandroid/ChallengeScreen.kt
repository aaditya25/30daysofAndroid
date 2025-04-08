package com.example.a30daysofandroid

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.a30daysofandroid.model.UnitDetails

@Composable
fun UnitList(
    units: List<UnitDetails>,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp)
) {
    LazyColumn(contentPadding = contentPadding, modifier = modifier) {
        itemsIndexed(units) { index, unitDetails ->
            UnitCard(
                unitDetails = unitDetails,
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            )
        }
    }
}

@Composable
fun UnitCard(unitDetails: UnitDetails, modifier: Modifier = Modifier) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        modifier = modifier)
    {
        Column {
            Image(
                painter = painterResource(unitDetails.image),
                contentDescription = null,
            )
            Text(
                text = stringResource(unitDetails.title),
                style = MaterialTheme.typography.titleLarge,
            )
            Text(
                text = stringResource(unitDetails.description),
                style = MaterialTheme.typography.bodyLarge,
            )

        }
    }
}
