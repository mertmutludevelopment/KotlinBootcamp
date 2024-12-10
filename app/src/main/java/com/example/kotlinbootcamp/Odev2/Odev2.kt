package com.example.kotlinbootcamp.Odev2

//Q1
fun calculateInternalAngle(sides: Int): Double {
    if (sides < 3) {
        throw IllegalArgumentException("min 3 sides")
    }
    val totalInternalAngles = ((sides - 2) * 180.0)/ sides
    return totalInternalAngles
}

//Q2
fun calculateSalary(days: Int): Int {
    val dailyWorkHours = 8
    val regularHourlyRate = 40
    val overtimeHourlyRate = 80
    val regularHoursLimit = 150

    val totalWorkHours = days * dailyWorkHours

    val regularHours = if (totalWorkHours <= regularHoursLimit) totalWorkHours else regularHoursLimit
    val overtimeHours = if (totalWorkHours > regularHoursLimit) totalWorkHours - regularHoursLimit else 0

    val salary = (regularHours * regularHourlyRate) + (overtimeHours * overtimeHourlyRate)
    return salary
}
//Q3
fun calculateParkingFee(hours: Int): Int {
    val firstHourFee = 50
    val additionalHourFee = 10

    return if (hours <= 1) {
        firstHourFee
    } else {
        firstHourFee + (hours - 1) * additionalHourFee
    }
}
//Q4
fun convertKmToMiles(kilometers: Double): Double {
    val conversionRate = 0.621
    return kilometers * conversionRate
}
//Q5
fun calculateRectangleArea(length: Int, width: Int ): Int {
    return length * width
}

//Q6
fun calculateFactorial(number: Int): Long {
    if (number < 0) {
        throw IllegalArgumentException("Cannot be negative!.")
    }
    var factorial: Long = 1
    for (i in 1..number) {
        factorial *= i
    }
    return factorial
}

//Q7
fun countLetterE(word: String): Int {
    return word.count { it == 'e' || it == 'E' }
}


fun main() {
    //A1
    val angle = calculateInternalAngle(5)
    println("Her bir iç açı: $angle derece")
    println("--------------------------")

    //A2
    val salary = calculateSalary(20)
    println("Toplam maaş: $salary ₺")
    println("--------------------------")

    //A3
    val fee = calculateParkingFee(5)
    println("Toplam otopark ücreti: $fee ₺")
    println("--------------------------")

    //A4
    val km= 15.5
    val miles = convertKmToMiles(km)
    println("$km kilometre, $miles mil eder.")
    println("--------------------------")

    //A5
    val area = calculateRectangleArea(4, 10)
    println("Dikdörtgenin alanı: $area")
    println("--------------------------")

    //A6
    val result = calculateFactorial(5)
    println("Faktöriyeli: $result")
    println("--------------------------")

    //A7
    val count = countLetterE("Hello World!")
    println("Kelime içinde 'e' harfi sayısı: $count")
    println("--------------------------")


}


