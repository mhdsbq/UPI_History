import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Path

import com.upihistory.upismsprocessor.model.UpiTransaction
import java.util.Calendar
import java.util.Date



@Composable
fun SpendLineGraph(dailySpends: List<Float>, modifier: Modifier = Modifier) {
    if (dailySpends.isEmpty()) return

    val cumulativeSpends = toCumulative(dailySpends)

    Canvas(modifier = modifier.height(150.dp).fillMaxWidth()) {
        val width = size.width
        val height = size.height
        val pointCount = cumulativeSpends.size
        val spacing = width / (pointCount - 1).coerceAtLeast(1)
        val maxY = cumulativeSpends.maxOrNull() ?: 1f

        fun getY(value: Float): Float {
            return height - (value / maxY * height)
        }

        val path = Path().apply {
            moveTo(0f, getY(cumulativeSpends[0]))

            for (i in 1 until pointCount) {
                val x1 = (i - 1) * spacing
                val y1 = getY(cumulativeSpends[i - 1])
                val x2 = i * spacing
                val y2 = getY(cumulativeSpends[i])

                val midX = (x1 + x2) / 2
                val midY = (y1 + y2) / 2

                quadraticBezierTo(x1, y1, midX, midY)
                quadraticBezierTo(midX, midY, x2, y2)
            }
        }

        drawPath(
            path = path,
            color = Color(0xFF6200EE),
            style = Stroke(width = 4.dp.toPx(), cap = StrokeCap.Round)
        )
    }
}

fun toCumulative(data: List<Float>): List<Float> {
    val result = mutableListOf<Float>()
    var sum = 0f
    for (value in data) {
        sum += value
        result.add(sum)
    }
    return result
}


fun calculateDailySpendThisMonth(transactions: List<UpiTransaction>): List<Float> {
    val calendar = Calendar.getInstance()
    val currentMonth = calendar.get(Calendar.MONTH)
    val currentYear = calendar.get(Calendar.YEAR)

    // Filter transactions of the current month and year
    val filtered = transactions.filter {
        calendar.time = Date(it.timestamp.toLong() * 1000)
        val month = calendar.get(Calendar.MONTH)
        val year = calendar.get(Calendar.YEAR)
        month == currentMonth && year == currentYear
    }

    // Map day of month to total spend
    val dailySpendMap = mutableMapOf<Int, Float>()

    filtered.forEach {
        calendar.time = Date(it.timestamp.toLong() * 1000)
        val day = calendar.get(Calendar.DAY_OF_MONTH)
        // assuming amount is in paise, convert to rupees
        dailySpendMap[day] = (dailySpendMap[day] ?: 0f) + (it.amount / 100f)
    }

    // Prepare a list for all days up to today, filling missing with 0
    val today = calendar.get(Calendar.DAY_OF_MONTH)
    return (1..today).map { day -> dailySpendMap[day] ?: 0f }
}

@Preview(showBackground = true)
@Composable
fun PreviewSpendLineGraph() {
    // Simulated sample spend for each day of the month up to day 10
    val sampleData = listOf(120f, 250f, 100f, 300f, 80f, 0f, 180f, 400f, 220f, 100f)

    SpendLineGraph(dailySpends = sampleData)
}
