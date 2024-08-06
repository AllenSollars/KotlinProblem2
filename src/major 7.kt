fun main() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"


    println(displayAlertMessage(operatingSystem, emailId))
}

fun displayAlertMessage(operatingSystem: String, emailId: String) {
    val firstUserEmailId = "user_one@gmail.com"
    val firstOperatingSystem = "unknown OS"
    println("There's a new sign-in request on $firstOperatingSystem for your Google Account $firstUserEmailId")



    // The following line of code assumes that you named your parameter as emailId.
    // If you named it differently, feel free to update the name.

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"
    println("There's a new sign-in request on $secondUserOperatingSystem for your Google Account $secondUserEmailId")

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"
    println("There's a new sign-in request on $thirdUserOperatingSystem for your Google Account $thirdUserEmailId")


}

// Define your displayAlertMessage() below this line.
