import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Screen1(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Ardhimas Izzan Rafif")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Screen 1")
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { navController.navigate("screen2") },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue,
                contentColor = Color.White
            )
            ){
            Text(text = "Pergi Ke Screen 2")
        }
    }
}

@Composable
fun Screen2(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "235150707111050")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Screen 2")
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {navController.navigate("screen1") },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Red,
                contentColor = Color.White
            ))
        {
            Text(text = "Pergi Ke Screen 1")
        }
    }
}