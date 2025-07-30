package ind.shop.calculator.ui.theme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel


class CalculatorViewModel:ViewModel() {
    val oncal= mutableStateListOf<String>()
    private val _opearatorlist= listOf("+","/","X","-",".")
    var toastmessage by mutableStateOf("")

    init {
    }
    fun inputlist(value:String) {
        if (value in _opearatorlist) {
            if (oncal.isEmpty()) {
                toastmessage = "without value opearator is not allowed "
                return
            }
            if (oncal.isNotEmpty() && oncal.last() in _opearatorlist) {
                toastmessage = "operator is not allowed after opearator"
                return
            }
            oncal.add(value)

        }
        else {
            // Digit input
            if (oncal.isEmpty() || oncal.last() in _opearatorlist) {
                oncal.add(value)
            } else {
                // Append digit to the last number
                val last = oncal.removeLast()
                oncal.add(last + value)
            }
        }
    }
    var currentresult=0
    var next=0
    var result=""

    fun evalution(){

        if (oncal.isEmpty())
        {
            println("0")
        }
        var currentresult= oncal[0].toInt()
        var i=1
        while (i<oncal.lastIndex){
            var opearator=oncal[i]
            var next =oncal[i+1].toInt()
            if (next==null) break
            currentresult= when (opearator){
                "+"->add(currentresult,next)
                "-"->sub(currentresult,next)
                "X"->mul(currentresult,next)
                "/"->div(currentresult,next)
                else->currentresult

            }
            i=i+2
        }
        var result=currentresult.toString()
        oncal.clear()
        oncal.add(result)




    }

    private fun add(a: Int, b: Int): Int = a + b
     private fun sub(a: Int, b: Int): Int = a - b
    private fun mul(a: Int, b: Int): Int = a * b
    private  fun div(a: Int, b: Int): Int = if (b != 0) a / b else 0
    fun forfloat(){
         if((oncal.last() in _opearatorlist)||oncal.last().isEmpty()){
             toastmessage="cannot convert in float"
             return

         }
        if(oncal.last().isNotEmpty()){



         }
    }


}