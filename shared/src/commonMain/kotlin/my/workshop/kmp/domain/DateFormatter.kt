package my.workshop.kmp.domain

internal expect object DateFormatter {
    fun getStringTime(timeInSeconds: Long): String
}