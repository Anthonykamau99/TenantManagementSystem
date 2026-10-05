//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Part 0
    println("Welcome to the Tenant Management System")
    //Part 1
    //tenant id is fixed thus val is used since it can not be reassigned
//    val TenantID = 1001
//    A person's name is fixed thus val is used
//    val Name = "Jane Wanjiku"
//    // Phonenumber is fixed thus val is used
//    val Phone= "0712345678"
//    // Housenumber is fixed thus val is used
//    val HouseNumber= "A-204"
//    // Monthly rarely changes thus val is used
//    val MonthlyRent = 25000
//    // Amount paid may change they may pay full or partially thus var is used
//    var AmountPaid = 15000
//
//    println("Amount paid before: $AmountPaid")
//    var  UpdatedAmountPaid = (AmountPaid + 5000)
//    println("Amount paid after: $UpdatedAmountPaid")
// when uncommented it shows Kotlin: Unresolved reference 'tenantId'.
    //tenantId = 1002

    //Part 2
    //Task 2.1
    val TenantID: Int = 1001
    val Name: String = "Jane Wanjiku"
    val Phone: String = "0712345678"
    val HouseNumber: String = "A-204"
    val MonthlyRent: Int = 25000
    var AmountPaid: Int = 15000

    //String is used for phone numbers because:
    // Phone numbers can start with 0, so storing them as a String keeps the zero.
    //Phone numbers are not used for calculations.
    //Task 2.2
    val block: Char = 'A'
    val isActive: Boolean = true

    //Task 2.3
    val monthlyRent: Int = 25000
    val rentAsDouble: Double = monthlyRent.toDouble()

    println(rentAsDouble)

    // Task 2.4
    val registrationNumber: Long = 999_999_999L

    println(registrationNumber)


    //Part 3
    // Tak 3.1
    println(Name + " lives in house " + HouseNumber)

    //Task 3.2
    println("$Name lives in house $HouseNumber")

    //string template is easier to read as it is shorter
    //Task 3.3
    println("Total rent for 6 months: KES ${MonthlyRent * 6}")

    //task 3.4
    val receipt = """
    ===== RENT RECEIPT =====
    Tenant: Jane Wanjiku
    House: A-204
    Paid: KES 20000
"""

    println(receipt.trimIndent())
    //trimIndent() removes the common indentation from each line of the triple-quoted string making the code indent neatly
    // task 3.5
    val greeting = "Dear Tenant"
    greeting.uppercase()
    println(greeting)

    //Part 4
    //Task 4.1
    val balance = monthlyRent - AmountPaid
    println( "Balance: KES $balance")

    //Task 4.2
    val percentPaid = (AmountPaid.toDouble() / MonthlyRent) * 100
    println("Paid: ${percentPaid.toInt()}%")
    //Paid: 0%, it is incorrect since the expected answer is Paid: 80%
    //Both rent variables are of Int data types and when 2 integers are divided, Kotlin discards the fractional part and truncates the result towards 0
    //convert amountPaid to double first or mulitply 100 before dividing

    //Task 4.3
    val instalment= 6000
    println("Full instalments: ${MonthlyRent / instalment}")
    println("Remaining amount: KES ${MonthlyRent % instalment}")

    // Task 4.4
    val totalRent = MonthlyRent.times(6)

    //Task 4.5
    val isRentPaid: Boolean = AmountPaid >= MonthlyRent
    println("Is rent paid: $isRentPaid")

    // Task 4.6
    var monthsInArrears = 2
    val needsReminder: Boolean = (AmountPaid < MonthlyRent) && (monthsInArrears > 1)
    println("Needs reminder: $needsReminder")
    //value: false, the logical condition requires both sub-conditions to be true and since 1>1 evaluates to false, the entire logical AND expression evaluated to false

    //Task 5
    //Task5.1
    if (balance <= 0) {
        println("Rent is fully paid")
    } else {
        println("Rent is outstanding")
    }

    //Task 5.2
    if (balance <= 0) {
        println("Rent is fully paid")
    }else if (balance < 10000) {
        println("Small outstanding balance")
    }else {
        println("Large outstanding balance")
    }

    //Task 5.3
    when {
        balance <= 0 ->println("Rent is fully paid")
        balance < 10000 -> println("Small outstanding balance")
        else ->println("Large outsatnding balance")
    }
    //The when statement is more readable because it eliminates the repetitive if/else keywords, reducing clutter

    //Task 5.4
    val monthsBehind = 2 // test values: 0,2,4,8,15
    when (monthsBehind) {
        0 ->println("Rent is up to date")
        in 1..2->println("Early arrears")
        in 3..5-> println("Serious arrears")
        in 6..12-> println("Critical arrears")
        else -> println("Review tenant account")
    }

    //Task 5.5
    val status = "ACTIVE"//test values: active, vacated, pending
    when (status) {
        "ACTIVE" -> println("Tenant is currently active")
        "VACATED" -> println("Tenant has vacated the house")
        "PENDING" -> println("Tenancy status is pending approval")
        else -> println("Unknown tenant status")
    }

    //Part 6
    //Task 6.1
    for (month in 1..12) {
        println(month)
    }

    //Task 6.2
    for (month in 1..12 step 2) {
        println("Checking payment history for month $month")
    }

    //Task 6.3
    for (month in 5 downTo 1) {
        println(month)
    }

    //Task 6.4
    val tenantNames = listOf("Jane", "Brian", "Mary", "David")
    for ((index, tenant) in tenantNames.withIndex()) {
        println("${index + 1}. $tenant")
    }
    //Adding the 1 coverts the zero-based computer index into human-readable form

    //Task 6.5
    var vacantHouse = 0

    //Version A
    while (vacantHouse > 0) {
        println("Checking vacant houses...")
    }//prints 0 lines because the condition is checked before entering the loop, so the body never executes

    //Version B
    do {
        println("Checking vacant houses...")
    } while (vacantHouse > 0)
    //prints 1 line because the loop body runs first and only evaluates the condition after the first pass.
    //the difference is the while loop checks the condtion before executing, and the do-while loop executes the block first before checking the condition.

    //Task 6.6
    repeat(3) {
        println("Please pay your rent.")
    }
    // PART 7 — LISTS AND ARRAYS

    val tenants = listOf(
        "Jane Wanjiku",
        "Brian Otieno",
        "Mary Achieng",
        "John Kamau"
    )

    println("First tenant: ${tenants[0]}")
    println("Last tenant: ${tenants[tenants.size - 1]}")

    // tenants.add("David Mwangi")
    // Error: "Unresolved reference: add" — tenants is a read-only List, which has no add().

    val mutableTenants = mutableListOf(
        "Jane Wanjiku",
        "Brian Otieno",
        "Mary Achieng",
        "John Kamau"
    )

    mutableTenants.add("David Mwangi")
    mutableTenants.remove("Brian Otieno")

    println("Final tenant list: $mutableTenants")
    println("Final list size: ${mutableTenants.size}")

    val houseNumbers = arrayOf(
        "A-101",
        "A-102",
        "A-103",
        "A-104"
    )

    println("Second house: ${houseNumbers[1]}")
    houseNumbers[0] = "A-201"
    println("Updated houses: ${houseNumbers.joinToString()}")

    // println(testHouses) prints [Ljava.lang.String;@... because arrays don't
    // override toString() with their contents. joinToString() and
    // contentToString() print the actual values instead.

    val testHouses = arrayOf("A-101", "A-102")
    println(testHouses.joinToString())
    println(testHouses.contentToString())

    val blockA = intArrayOf(1, 2, 3)
    val blockB = intArrayOf(4, 5, 6)

    val combined = blockA + blockB
    println("Combined blocks: ${combined.joinToString()}")
    // blockB + blockA gives 4, 5, 6, 1, 2, 3 — + always places the left
    // array's elements first, then the right array's.

    // MutableList can add/remove elements and change size; Array cannot.
    // Array allows changing existing elements; a read-only List does not.


    // PART 8 — NULL SAFETY

    // val tenantEmail: String = null
    // Error: "Null can not be a value of a non-null type String".
    // Adding "?" (String?) makes it nullable.

    var tenantEmail: String? = null
    println("Tenant email: $tenantEmail")
    // Wouldn't show "null" to a property manager — it's a programming term,
    // not user-friendly output.

    println("Email: ${tenantEmail ?: "Not provided"}")
    tenantEmail = "jane@example.com"
    println("Email: ${tenantEmail ?: "Not provided"}")

    tenantEmail = null
    println(tenantEmail?.length)
    println(tenantEmail?.length ?: 0)

    // println(tenantEmail!!.length)
    // Tested: crashes with KotlinNullPointerException since tenantEmail is null.
    // !! is the not-null assertion operator — it skips the null check and
    // trusts the value isn't null. Only safe to use when you're certain,
    // from prior logic, that it can't be null.

    var nextOfKin: String? = "Mary"
    println(nextOfKin?.uppercase() ?: "No next of kin on record")
    // Setting nextOfKin = null gives "No next of kin on record" — ?. only
    // calls uppercase() if not null, and ?: supplies the fallback otherwise.
}