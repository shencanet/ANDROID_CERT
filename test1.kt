fun main() {
    val estudiante1 = Student("Juanma")
    println(estudiante1.isLoggedIn)
    estudiante1.login()
    estudiante1.isLoggedIn = true
    println(estudiante1.isLoggedIn)
    estudiante1.logout()
    estudiante1.isLoggedIn = false

}
