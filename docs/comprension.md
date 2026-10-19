# Comprensión del diseño — Enunciado C
**Nombre:** KAREN MANUELA RICO MALDONADO
**Fecha:** 19/10//26

Responde con tus palabras, basándote en `docs/UML-final.md`. Respuestas
concisas (2–4 líneas por pregunta). Evidencia que entendiste el contrato
**antes** de programar.

---

### 1. Herencia y polimorfismo
¿Por qué `Curso` es una clase abstracta y no concreta? Menciona qué método
obliga a cada subclase a implementar y qué gana el sistema con eso.

> _Tu respuesta:Pues `Curso` es abstracta porque no tiene sentido crear un curso a
> todo genérico sin saber si es obligatorio o qué. Obliga a hacer el método
> `dificultadEsperada()` en las hijas, y con eso el sistema calcula la dificultad
> de una sin ponerse a hacer un montón de `if-else`.

---

### 2. Composición vs. agregación
Explica la diferencia entre `PlanEstudios ◆— Curso` (composición) y
`Facultad ◇— PlanEstudios` (agregación). ¿Qué pasaría con los cursos si se
elimina el plan? ¿Y con los planes si se elimina la facultad?

> _Tu respuesta:En la composición el plan es el dueño y los cursos se crean ahí adentro,
> entonces si borran el plan, los cursos mueren con él. En la agregación la facultad solo 
> guarda los planes pero no los crea, así que si borran la facultad, los planes se salvan y siguen existiendo normal.

---

### 3. Asociación
En `Estudiante — Curso`, ¿quién es dueño de quién? ¿Por qué se modela como
N:M y no como composición?

> _Tu respuesta:_Ahí ninguno es dueño de nadie, solo se conocen y ya. Es N:M porque
> un estudiante puede meter varios cursos y un curso puede tener a muchos estudiantes, 
> entonces no dependen el uno del otro para nacer o morir.

---

### 4. Dependencia
¿Por qué `Recomendador` **depende** de `HistorialAcademico` en lugar de
**tenerlo** como atributo? ¿Qué ventaja tiene pasar el servicio como
parámetro?

> _Tu respuesta:_ Depende de él porque el recomendador no necesita guardarse 
> eso para siempre, solo lo recibe un momentico por parámetro cuando le van j a
> pedir la recomendación. Así el código queda menos pesado y se deja probar más fácil.

---

### 5. Listas
En este proyecto se usan dos estructuras distintas:
- `int[] notas` en `Estudiante`
- `ArrayList<Curso>` en `PlanEstudios` y `Estudiante`

Explica por qué en cada caso se eligió esa estructura y no la otra. ¿Qué
pasa si el estudiante intenta registrar más notas que la capacidad del
arreglo?

> _Tu respuesta:_ El arreglo `int[]` se usa para las notas porque uno
> le pone un tamaño fijo al crear al estudiante y se controla fácil. 
> El `ArrayList` se usa para las listas de cursos porque eso sí puede crecer o 
> encogerse a cada rato. Si intentan meterle más notas de la cuenta, el método
> simplemente lo ignora y ya no hace nada.