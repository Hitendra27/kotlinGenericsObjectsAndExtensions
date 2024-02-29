fun main(args: Array<String>) {

    val question1 = Question<String>("Quoth the raven ___", "nevermore", "medium")
    val question2 = Question<Boolean>("The Sky is green. True or false", false, "easy")
    val question3 = Question<Int>("How many days are there between full moons?", 28, "hard")
    println(question1.questionText)
}

class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: String
) {
}