package com.tuapp.gastos.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tuapp.gastos.components.ScreenContainer
import com.tuapp.gastos.ui.theme.AppTextSecondary

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutScreen(
    onBack: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Información del Proyecto", style = MaterialTheme.typography.titleLarge) },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Volver",
                            tint = MaterialTheme.colorScheme.onPrimary
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary
                )
            )
        }
    ) { paddingValues ->

        ScreenContainer {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
                    .verticalScroll(rememberScrollState())
            ) {
                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Derechos de Autor",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(20.dp))

                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                    elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                ) {
                    Column(modifier = Modifier.padding(20.dp)) {
                        InfoRow(label = "Universidad:", value = "Universidad Don Bosco")
                        Spacer(modifier = Modifier.height(12.dp))

                        InfoRow(label = "Materia:", value = "Desarrollo de Software para Móviles (DSM941)")
                        Spacer(modifier = Modifier.height(12.dp))

                        InfoRow(label = "Proyecto:", value = "Foro 2")
                        Spacer(modifier = Modifier.height(12.dp))

                        InfoRow(label = "Grupo:", value = "#3")
                        Spacer(modifier = Modifier.height(12.dp))

                        InfoRow(label = "Estudiante:", value = "Isidro Alexander Marroquín Echeverría")
                        Spacer(modifier = Modifier.height(12.dp))

                        InfoRow(label = "Correo:", value = "isidro.marroquin@udb.edu.sv")
                        Spacer(modifier = Modifier.height(12.dp))

                        InfoRow(label = "Carnet:", value = "ME221443")
                        Spacer(modifier = Modifier.height(12.dp))

                        InfoRow(label = "Fecha:", value = "Mayo 2026")
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                Text(
                    text = "Descripción del Proyecto",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.SemiBold
                )

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text = "ControlGastosApp es una aplicación Android de gestión de gastos personales desarrollada con Jetpack Compose y Firebase. Permite a los usuarios registrar, categorizar y visualizar sus gastos de forma intuitiva y segura.",
                    style = MaterialTheme.typography.bodyMedium,
                    color = AppTextSecondary,
                    lineHeight = 24.sp
                )

                Spacer(modifier = Modifier.height(20.dp))

                Text(
                    text = "Características Principales",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.SemiBold
                )

                Spacer(modifier = Modifier.height(12.dp))

                FeatureItem("Autenticación segura con Firebase")
                FeatureItem("Registro de gastos con categorización")
                FeatureItem("Dashboard con estadísticas en tiempo real")
                FeatureItem("Historial detallado de transacciones")
                FeatureItem("Sincronización en la nube con Firestore")
                FeatureItem("Interfaz moderna con Material Design 3")

                Spacer(modifier = Modifier.height(24.dp))

                Text(
                    text = "Tecnologías Utilizadas",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.SemiBold
                )

                Spacer(modifier = Modifier.height(12.dp))

                TechItem("Kotlin 2.2.10")
                TechItem("Jetpack Compose")
                TechItem("Firebase Authentication")
                TechItem("Firestore Database")
                TechItem("Material Design 3")
                TechItem("Jetpack Navigation")

                Spacer(modifier = Modifier.height(32.dp))
            }
        }
    }
}

@Composable
fun InfoRow(label: String, value: String) {
    Column {
        Text(
            text = label,
            style = MaterialTheme.typography.labelMedium,
            fontWeight = FontWeight.SemiBold,
            color = MaterialTheme.colorScheme.primary
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = value,
            style = MaterialTheme.typography.bodyMedium,
            color = AppTextSecondary
        )
    }
}

@Composable
fun FeatureItem(text: String) {
    Text(
        text = "• $text",
        style = MaterialTheme.typography.bodyMedium,
        color = AppTextSecondary,
        modifier = Modifier.padding(vertical = 6.dp)
    )
}

@Composable
fun TechItem(text: String) {
    Text(
        text = "• $text",
        style = MaterialTheme.typography.bodyMedium,
        color = AppTextSecondary,
        modifier = Modifier.padding(vertical = 6.dp)
    )
}
