fun main() {
    var nameStudents = arrayOf("Wein Juma", "Rein Roy","Pein Pop")
    var ageOfStudents = arrayOf(30, 40, 50)
    var phoneNumbers = arrayOf(712345678, 787654321,735627584)
    var weightInKgs = arrayOf("35", "45", "55")
    val kenyaCitizen = true

    var student1 = arrayOf("Wein Juma", ageOfStudents[0], phoneNumbers[0], weightInKgs[0],kenyaCitizen )
    println(student1.contentToString())
    var student2 =arrayOf("Rein Juma", ageOfStudents[1], phoneNumbers[1],weightInKgs[1],!kenyaCitizen)
    println(student2.contentToString())
    var student3 = arrayOf("Pein Pop", ageOfStudents[2], phoneNumbers[2], weightInKgs[2], kenyaCitizen)
    println(student3.contentToString())

}