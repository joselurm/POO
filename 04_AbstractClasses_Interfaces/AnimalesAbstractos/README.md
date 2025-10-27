Qué representa la jerarquía:
Clase abstracta Animal: Representa el concepto de "animal" con atributos y comportamientos comunes a todos los animales.
Subclases concretas: Representan tipos de animales con sus características particulares.
Interfaces: Representan capacidades que los animales pueden tener, independientemente de su tipo.



Respuestas a las preguntas de reflexión:
¿Por qué no tiene sentido crear directamente un objeto de tipo Animal?
Porque Animal es abstracta y representa un concepto general.

¿Qué ventajas aporta definir comportamientos comunes como interfaces?
Permite que clases no relacionadas compartan comportamientos y la extensibilidad sin afectar la herencia.

¿Qué diferencia hay entre heredar de una clase abstracta e implementar una interfaz?
Una clase solo puede heredar de una clase, pero puede implementar múltiples interfaces.

¿Cómo facilita el polimorfismo la extensión del programa con nuevos tipos de animales?
Permite añadir nuevos tipos de animales sin modificar el código que trabaja con la clase Animal.

Respuestas a las preguntas de reflexión:
1 ¿Por qué no tiene sentido crear directamente un objeto de tipo Animal?
Porque Animal es abstracta y representa un concepto general. No existe un "animal genérico" en el mundo real, 
cada animal tiene características específicas.

2 ¿Qué ventajas aporta definir comportamientos comunes como interfaces?
Permite que clases no relacionadas compartan comportamientos y facilita la extensibilidad sin afectar la jerarquía de herencia.

3 ¿Qué diferencia hay entre heredar de una clase abstracta e implementar una interfaz?
Una clase solo puede heredar de una clase, pero puede implementar múltiples interfaces.

4 ¿Cómo facilita el polimorfismo la extensión del programa con nuevos tipos de animales?
Permite agregar nuevos tipos de animales sin modificar el código existente que trabaja con la clase Animal.
