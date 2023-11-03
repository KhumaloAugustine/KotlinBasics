fun main(args: Array<String>) {
    // Read the coefficients from the user
    val coefficients = readCoefficients()

    // Calculate the discriminant
    val discriminant = calculateDiscriminant(coefficients)

    // Solve for the roots
    val roots = solveQuadraticEquation(coefficients, discriminant)

    // Display the solution
    displaySolution(roots)
}

fun readCoefficients(): List<Double> {
    println("Enter the coefficient of x^2:")
    val a = readlnOrNull()?.toDouble() ?: 0.0
    println("Enter the coefficient of x:")
    val b = readlnOrNull()?.toDouble() ?: 0.0
    println("Enter the coefficient of c:")
    val c = readlnOrNull()?.toDouble() ?: 0.0
    return listOf(a, b, c)
}

fun calculateDiscriminant(coefficients: List<Double>): Double {
    val a = coefficients[0]
    val b = coefficients[1]
    val c = coefficients[2]
    return b * b - 4 * a * c
}

fun solveQuadraticEquation(coefficients: List<Double>, discriminant: Double): List<Double> {
    val a = coefficients[0]
    val b = coefficients[1]
    val c = coefficients[2]

    if (discriminant > 0.0) {
        // Real roots
        val root1 = (-b + Math.sqrt(discriminant)) / (2 * a)
        val root2 = (-b - Math.sqrt(discriminant)) / (2 * a)
        return listOf(root1, root2)
    } else if (discriminant == 0.0) {
        // Equal roots
        val root = -b / (2 * a)
        return listOf(root, root)
    } else {
        // Complex roots
        return emptyList()
    }
}

fun displaySolution(roots: List<Double>) {
    println("The roots of the quadratic equation are:")
    for (root in roots) {
        println(root)
    }
}
