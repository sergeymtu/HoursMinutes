package ru.netology


val seconds = 54_000
val minutes = seconds / 60
val hours = minutes / 60
var printMinutes: String = ""
var printHours: String = ""
//println(minutes)

fun hoursCount(hours: Int) {
    //var printHours: String
    //println(hours)

    if (hours == 1) {
        printHours = "Час"
    } else if (hours > 1 && hours < 5) {
        printHours = "Часа"
    } else if (hours >= 5 && hours <= 20) {
        printHours = "Часов"
    } else if (hours % 10 == 1) {
        printHours = "Час"
    } else if (hours % 10 == 2 || hours % 10 == 3 || hours % 10 == 4) {
        printHours = "Часа"
    } else {
        printHours = "Часов"
    }

    //println(printHours)

}


fun minutesCount(minutes: Int) {

    if (minutes == 1) {
        printMinutes = "Минуту"
    } else if (minutes > 1 && minutes < 5) {
        printMinutes = "Минуты"
    } else if (minutes >= 5 && minutes <= 20) {
        printMinutes = "Минут"
    } else if (minutes % 10 == 1) {
        printMinutes = "Минуту"
    } else if (minutes % 10 == 2 || minutes % 10 == 3 || minutes % 10 == 4) {
        printMinutes = "Минуты"
    } else {
        printMinutes = "Минут"
    }

    // println(printMinutes)
}


fun agoToText(seconds: Int): String {
    return when {
        seconds * 2 > 0 && seconds <= 60 -> "Только что"
        seconds >= 61 && seconds <= 3600 -> "$minutes $printMinutes назад"
        seconds >= 3601 && seconds <= 84600 -> "$hours $printHours назад"
        seconds > 84600 && seconds <= 172800 -> "сегодня"
        seconds > 172800 && seconds <= 259200 -> "вчера"
        seconds > 259200 -> "Давно"

        else -> "go"
    }

}

fun main() {

    if (minutes >= 1 && minutes <= 60) {
        minutesCount(minutes)
    } else if (minutes > 60 && minutes <= 1140) {
        hoursCount(hours)
    }

    val result = agoToText(seconds)
    println(result)


}