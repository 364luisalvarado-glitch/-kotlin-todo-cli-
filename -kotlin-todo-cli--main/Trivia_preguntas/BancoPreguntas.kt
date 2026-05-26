package trivia_preguntas

class BancoPreguntas {

    private val listaPreguntas = mutableListOf<Pregunta>()

    fun inicializarTrivia() {
        listaPreguntas.clear()

        listaPreguntas.add(
            Pregunta(
                1,
                "¿Qué palabra clave define una constante en Kotlin?",
                listOf("var", "const val", "val", "let"),
                3
            )
        )

        listaPreguntas.add(
            Pregunta(
                2,
                "¿Cómo maneja Kotlin la seguridad contra nulos por defecto?",
                listOf(
                    "Permite nulos siempre",
                    "Los tipos no son anulables por defecto",
                    "Usa punteros",
                    "Lanza NullPointerException automáticamente"
                ),
                2
            )
        )

        listaPreguntas.add(
            Pregunta(
                3,
                "¿Cuál es una ventaja de una Data Class?",
                listOf(
                    "Hereda de múltiples clases",
                    "Genera automáticamente toString(), equals() y hashCode()",
                    "Hace el código más rápido siempre",
                    "No permite funciones"
                ),
                2
            )
        )

        listaPreguntas.add(
            Pregunta(
                4,
                "¿Qué palabra clave se usa para crear una función en Kotlin?",
                listOf("function", "def", "fun", "method"),
                3
            )
        )

        listaPreguntas.add(
            Pregunta(
                5,
                "¿Qué estructura se usa para tomar decisiones en Kotlin?",
                listOf("if", "println", "readLine", "listOf"),
                1
            )
        )

        listaPreguntas.add(
            Pregunta(
                6,
                "¿Qué función sirve para crear una lista inmutable en Kotlin?",
                listOf("array()", "mutableListOf()", "listOf()", "setOf()"),
                3
            )
        )

        listaPreguntas.add(
            Pregunta(
                7,
                "¿Qué operador se conoce como Elvis operator en Kotlin?",
                listOf("?.", "?:", "!!", "::"),
                2
            )
        )

        listaPreguntas.add(
            Pregunta(
                8,
                "¿Qué función permite imprimir texto en consola?",
                listOf("show()", "printText()", "println()", "console()"),
                3
            )
        )
    }

    fun obtenerPreguntasDelJuego(): List<Pregunta> {
        return listaPreguntas.shuffled()
    }

    fun contarPreguntas(): Int {
        return listaPreguntas.count()
    }
}