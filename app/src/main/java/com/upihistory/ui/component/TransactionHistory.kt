import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.upihistory.data.model.Bank
import com.upihistory.data.model.TransactionType
import com.upihistory.data.model.UpiTransaction
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TransactionHistory(transactions: List<UpiTransaction>) {
    val grouped = groupTransactionsByMonth(transactions)

    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background)
            .padding(horizontal = 16.dp)
    ) {
        grouped.forEach { (monthYear, txns) ->
            // Calculate total monthly spend
            val totalMonthlySpend = txns.sumOf { it.amount } / 100.0

            // Show month and total monthly spend as normal header (non sticky)
            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(MaterialTheme.colorScheme.background)
                        .padding(vertical = 18.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = monthYear, style = MaterialTheme.typography.titleLarge, color = MaterialTheme.colorScheme.primary
                        )
                        Text(
                            text = "₹${"%.0f".format(totalMonthlySpend)}", style = MaterialTheme.typography.titleMedium, color = MaterialTheme.colorScheme.primary
                        )
                    }
                }
            }

            var lastDateLabel: String? = null

            txns.forEach { txn ->
                val currentDateLabel = formatDateLabel(txn.timestamp)

                if (lastDateLabel != currentDateLabel) {
                    item {
                        Text(
                            text = currentDateLabel,
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.primary.copy(alpha = 0.75f),
                            modifier = Modifier.padding(top = 8.dp, bottom = 4.dp)
                        )
                    }
                    lastDateLabel = currentDateLabel
                }

                item {
                    TransactionItem(txn)
                }
            }
        }
    }
}

@Composable
fun TransactionItem(transaction: UpiTransaction) {
    val date = formatDateTime(transaction.timestamp)
    val nameOrVpa = transaction.receiverName?.takeIf { it.isNotBlank() } ?: transaction.receiverVpa.orEmpty()

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp)
            .shadow(elevation = 2.dp, shape = RoundedCornerShape(12.dp))
            .background(MaterialTheme.colorScheme.surface, shape = RoundedCornerShape(12.dp))
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = nameOrVpa, style = MaterialTheme.typography.bodyLarge, color = MaterialTheme.colorScheme.onSurface
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = date, style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }

            Text(
                text = "₹${"%.0f".format(transaction.amount / 100.0)}", color = MaterialTheme.colorScheme.onSurfaceVariant, style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}

private fun formatDateTime(timestampMillis: Long): String {
    val sdf = SimpleDateFormat("dd MMM yyyy, hh:mm a", Locale.getDefault())
    return sdf.format(Date(timestampMillis))
}

fun groupTransactionsByMonth(transactions: List<UpiTransaction>): Map<String, List<UpiTransaction>> {
    val sdf = SimpleDateFormat("MMMM yyyy", Locale.getDefault())
    return transactions.sortedByDescending { it.timestamp }
        .groupBy { sdf.format(Date(it.timestamp)) }
}

private fun formatDateLabel(timestampMillis: Long): String {
    val sdf = SimpleDateFormat("dd MMMM yyyy", Locale.getDefault())
    return sdf.format(Date(timestampMillis))
}

@Preview(showBackground = true)
@Composable
fun PreviewTransactionItem() {
    val sampleTransaction = UpiTransaction().apply {
        amount = 25900
        timestamp = System.currentTimeMillis()
        bank = Bank.SBI
        transactionType = TransactionType.DEBIT
        receiverName = "Adhil Rahman"
        receiverVpa = "adhil@upi"
    }

    TransactionItem(sampleTransaction)
}
