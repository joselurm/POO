# POO
El polimorfismo se aplica:

1. Array de tipo base: Se crea un array de tipo `Empleado` que puede contener objetos de cualquier subclase.
2. Llamadas polimórficas: En el bucle `for` de `Main`, se llama a `mostrarInformacion()` y `calcularSalario()`.
3. Método `calcularTotalSalarios`: Este método recibe un array de `Empleado` y llama a `calcularSalario()` para cada elemento, demostrando cómo el polimorfismo permite tratar objetos de diferentes tipos de manera uniforme.

Preguntas
### 1. ¿Por qué es útil definir métodos con el mismo nombre en distintas clases?
Es útil porque permite un interface consistente. Esto mejora la legibilidad y mantenibilidad del código.

### 2. ¿Qué ventaja aporta el uso de super frente a duplicar código?
El uso de `super` permite:Reutilizar código, Mantener consistencia, Reducir errores, Mejorar mantenibilidad.

### 3. ¿Cómo mejora el polimorfismo la escalabilidad del programa?
El polimorfismo mejora la escalabilidad porque:
- Permite añadir nuevas clases sin modificar el código existente
- Reduce el acoplamiento entre componentes
- Permite que el código cliente sea genérico y funcione con futuras subclases

### 4. Si añadieras un nuevo tipo de empleado, ¿qué cambios deberías realizar en la jerarquía?
Para añadir un nuevo tipo de empleado (ej: `EmpleadoComision`):
1. Crear una nueva clase que extienda `Empleado`
2. Redefinir los métodos `calcularSalario()` y `mostrarInformacion()`

