fun main(args: Array<String>) {
    /*
    val people = ArrayList<KotlinPerson>()
    people.add(KotlinPerson(1, "Mr", "Carlos", "Vargas", null))
    people.add(KotlinPerson(2, "Miss", "Shopie", "Orange", null))
    people.add(KotlinPerson(3, "Mrs", "Anita", "Fap", null))
    people.add(KotlinPerson(4, "Mr", "Blacketo", "CTM", null))

    //user for to destructure
    for ((id, title, firstName) in people) {
        println("$title $firstName has id $id")
    }
    */
    val people = HashMap<Int, KotlinPerson>()

    people.put(1, KotlinPerson(1, "Mr", "Carlos", "Vargas", null))
    people.put(2, KotlinPerson(2, "Miss", "Shopie", "Orange", null))
    people.put(3, KotlinPerson(3, "Mrs", "Anita", "Fap", null))
    people.put(4, KotlinPerson(4, "Mr", "Blacketo", "CTM", null))

    for ((key, value) in people) {
        println("$value has key $key")
    }

    val myRange = 0..9

    for (i in myRange) {
        println(i)
    }

    (0..9).forEach { i -> println(i) }
    (9 downTo 0).forEach { println(it) }
    (0 until 9).forEach { println(it) }
    (0..9 step 2).forEach { println(it) }
    ('A' .. 'F').forEach { println(it) }

}


fun whileLoop() {
    var x: Int = 0

    while (x < 10) {
        println(x)
        x++
    }
}