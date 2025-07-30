package ind.shop.calculator

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ind.shop.calculator.ui.theme.CalculatorViewModel

@Composable
fun CalculatorApp(viewModel: CalculatorViewModel) {
    val context = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize()
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.padding(0.dp, 50.dp, 0.dp, 0.dp)
                .height(400.dp)
                .background(color = Color.White)
                .fillMaxWidth()
        ) {
            Row(horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxSize()){
                Text("${viewModel.oncal.joinToString("")}",
                    fontSize = 50.sp)
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(600.dp)
                .background(color = Color.Black)
        ) {
            Row {
                Button(onClick = {viewModel.oncal.clear()},
                    border = BorderStroke(5.dp, color = Color.White),
                    shape = RoundedCornerShape(40.dp),
                    modifier = Modifier.padding(10.dp,20.dp,0.dp,0.dp)
                        .size(90.dp,65.dp)) {
                    Text("AC", fontSize = 30.sp)
                }
                Button(onClick = {viewModel.oncal.removeLast()},
                    border = BorderStroke(5.dp, color = Color.White),
                    shape = RoundedCornerShape(40.dp),
                    modifier = Modifier.padding(20.dp,20.dp,0.dp,0.dp)
                        .size(90.dp,65.dp)) {
                    Text("C", fontSize = 40.sp)
                }
                Button(onClick = {},
                    border = BorderStroke(5.dp, color = Color.White),
                    shape = RoundedCornerShape(40.dp),
                    modifier = Modifier.padding(20.dp,20.dp,0.dp,0.dp)
                        .size(90.dp,65.dp)) {
                    Text("C", fontSize = 40.sp)
                }
                Button(onClick = {viewModel.inputlist("/")},
                    border = BorderStroke(5.dp, color = Color.White),
                    shape = RoundedCornerShape(40.dp),
                    modifier = Modifier.padding(20.dp,20.dp,10.dp,0.dp)
                        .size(90.dp,65.dp)) {
                    Text("/", fontSize = 40.sp)
                }

            }
            Spacer(modifier = Modifier.padding(10.dp))
            Row {
                Button(onClick = {viewModel.inputlist("7")},
                    border = BorderStroke(5.dp, color = Color.White),
                    shape = RoundedCornerShape(40.dp),
                    modifier = Modifier.padding(10.dp,20.dp,0.dp,0.dp)
                        .size(90.dp,65.dp)) {
                    Text("7", fontSize = 40.sp)
                }
                Button(onClick = {viewModel.inputlist("8")},
                    border = BorderStroke(5.dp, color = Color.White),
                    shape = RoundedCornerShape(40.dp),
                    modifier = Modifier.padding(20.dp,20.dp,0.dp,0.dp)
                        .size(90.dp,65.dp)) {
                    Text("8", fontSize = 40.sp)
                }
                Button(onClick = {viewModel.inputlist("9")},
                    border = BorderStroke(5.dp, color = Color.White),
                    shape = RoundedCornerShape(40.dp),
                    modifier = Modifier.padding(20.dp,20.dp,0.dp,0.dp)
                        .size(90.dp,65.dp)) {
                    Text("9", fontSize = 40.sp)
                }
                Button(onClick = {viewModel.inputlist("X")},
                    border = BorderStroke(5.dp, color = Color.White),
                    shape = RoundedCornerShape(40.dp),
                    modifier = Modifier.padding(20.dp,20.dp,10.dp,0.dp)
                        .size(90.dp,65.dp)) {
                    Text("X", fontSize = 40.sp)
                }

            }
            Spacer(modifier = Modifier.padding(10.dp))
            Row {
                Button(onClick = {viewModel.inputlist("4")},
                    border = BorderStroke(5.dp, color = Color.White),
                    shape = RoundedCornerShape(40.dp),
                    modifier = Modifier.padding(10.dp,20.dp,0.dp,0.dp)
                        .size(90.dp,65.dp)) {
                    Text("4", fontSize = 40.sp)
                }
                Button(onClick = {viewModel.inputlist("5")},
                    border = BorderStroke(5.dp, color = Color.White),
                    shape = RoundedCornerShape(40.dp),
                    modifier = Modifier.padding(20.dp,20.dp,0.dp,0.dp)
                        .size(90.dp,65.dp)) {
                    Text("5", fontSize = 40.sp)
                }
                Button(onClick = {viewModel.inputlist("6")},
                    border = BorderStroke(5.dp, color = Color.White),
                    shape = RoundedCornerShape(40.dp),
                    modifier = Modifier.padding(20.dp,20.dp,0.dp,0.dp)
                        .size(90.dp,65.dp)) {
                    Text("6", fontSize = 40.sp)
                }
                Button(onClick = {viewModel.inputlist("-")},
                    border = BorderStroke(5.dp, color = Color.White),
                    shape = RoundedCornerShape(40.dp),
                    modifier = Modifier.padding(20.dp,20.dp,10.dp,0.dp)
                        .size(90.dp,65.dp)) {
                    Text("-", fontSize = 40.sp)
                }

            }
            Spacer(modifier = Modifier.padding(10.dp))
            Row {
                Button(onClick = {viewModel.inputlist("1")},
                    border = BorderStroke(5.dp, color = Color.White),
                    shape = RoundedCornerShape(40.dp),
                    modifier = Modifier.padding(10.dp,20.dp,0.dp,0.dp)
                        .size(90.dp,65.dp)) {
                    Text("1", fontSize = 40.sp)
                }
                Button(onClick = {viewModel.inputlist("2")},
                    border = BorderStroke(5.dp, color = Color.White),
                    shape = RoundedCornerShape(40.dp),
                    modifier = Modifier.padding(20.dp,20.dp,0.dp,0.dp)
                        .size(90.dp,65.dp)) {
                    Text("2", fontSize = 40.sp)
                }
                Button(onClick = {viewModel.inputlist("3")},
                    border = BorderStroke(5.dp, color = Color.White),
                    shape = RoundedCornerShape(40.dp),
                    modifier = Modifier.padding(20.dp,20.dp,0.dp,0.dp)
                        .size(90.dp,65.dp)) {
                    Text("3", fontSize = 40.sp)
                }
                Button(onClick = {viewModel.inputlist("+")},
                    border = BorderStroke(5.dp, color = Color.White),
                    shape = RoundedCornerShape(40.dp),
                    modifier = Modifier.padding(20.dp,20.dp,10.dp,0.dp)
                        .size(90.dp,65.dp)) {
                    Text("+", fontSize = 40.sp)
                }

            }
            Spacer(modifier = Modifier.padding(10.dp))
            Row {
                Button(onClick = {},
                    border = BorderStroke(5.dp, color = Color.White),
                    shape = RoundedCornerShape(40.dp),
                    modifier = Modifier.padding(10.dp,20.dp,0.dp,0.dp)
                        .size(90.dp,65.dp)) {
                    Text("%", fontSize = 40.sp)
                }
                Button(onClick = {viewModel.inputlist("0")},
                    border = BorderStroke(5.dp, color = Color.White),
                    shape = RoundedCornerShape(40.dp),
                    modifier = Modifier.padding(20.dp,20.dp,0.dp,0.dp)
                        .size(90.dp,65.dp)) {
                    Text("0", fontSize = 40.sp)
                }
                Button(onClick = {},
                    border = BorderStroke(5.dp, color = Color.White),
                    shape = RoundedCornerShape(40.dp),
                    modifier = Modifier.padding(20.dp,20.dp,0.dp,0.dp)
                        .size(90.dp,65.dp)) {
                    Text(".", fontSize = 40.sp)
                }
                Button(onClick = {viewModel.evalution()},
                    border = BorderStroke(5.dp, color = Color.White),
                    shape = RoundedCornerShape(40.dp),
                    modifier = Modifier.padding(20.dp,20.dp,10.dp,0.dp)
                        .size(90.dp,65.dp)) {
                    Text("=", fontSize = 40.sp)
                }

            }


        }
    }
    var toastmessage=viewModel.toastmessage
    LaunchedEffect(toastmessage) {
        if (toastmessage.isNotEmpty()) {

            Toast.makeText(context, viewModel.toastmessage, Toast.LENGTH_LONG).show()
            viewModel.toastmessage = ""
        }
    }
}