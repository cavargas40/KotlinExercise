import java.util.*

data class KotlinPerson(
    val id: Long,
    val title: String,
    val firstName: String,
    val surname: String,
    val dateOfBirth: Calendar?
) {
    override fun toString() =
        "$title $firstName $surname"


    var favoriteColor: String? = null

    fun getUpperCaseColor() : String =
            favoriteColor?.toUpperCase() ?: ""

    fun getLastLetter(a: String) = a.takeLast(1)

    fun getLastLetterOfColor() : String =
            favoriteColor?.let { getLastLetter(it) } ?: ""
        // return if(favoriteColor == null) "" else getLastLetter(favoriteColor)

    fun getColorType(): String {
        val color = getUpperCaseColor()
        /*
        return if(color == "")
                "empty"
            else if (color == "RED" || color == "BLUE"|| color == "GREEN")
                "rgb"
            else
                "other"
                */

        //when operator
        return when(color){
            "" -> "empty"
            "RED", "GREEN", "BLUE" -> "rgb"
            else -> "other"
        }
    }

    val safeAge: Int
        get() =
        //elvis operator
            age ?: -1

    val age: Int?
        get() = getAge(dateOfBirth)

    companion object {
        fun getAge(dateOfBirth: Calendar?): Int {
            if (dateOfBirth == null) return -1

            val today = GregorianCalendar()
            val years = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR)

            return if (dateOfBirth.get(Calendar.DAY_OF_YEAR) >= today.get(Calendar.YEAR)) years - 1 else years
        }
    }
}

fun main(args: Array<String>) {
    val carlos = KotlinPerson(1L, "Mr", "Carlos", "Vargas", GregorianCalendar(1991, 10, 14))
    val azusa = KotlinPerson(2L, "Mrs", "Azusa", "Moro", null)

    println("$carlos's age is ${carlos.age}")
    println("$azusa's age is ${azusa.age}")
    println("The age of someone born on 3rd of May 1988 is ${KotlinPerson.getAge(GregorianCalendar(1988, 5, 3))}")

    val olderPerson = if (carlos.safeAge > azusa.safeAge) carlos else azusa
    println("The older person was $olderPerson")
}