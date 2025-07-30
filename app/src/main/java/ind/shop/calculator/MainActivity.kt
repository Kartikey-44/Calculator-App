package ind.shop.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Surface
import ind.shop.calculator.ui.theme.CalculatorTheme
import ind.shop.calculator.ui.theme.CalculatorViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CalculatorTheme {
               Surface {
                   CalculatorTheme {
                       CalculatorApp(viewModel = CalculatorViewModel())

                   }
               }
            }
        }
    }
}

