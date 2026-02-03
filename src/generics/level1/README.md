  
**Nivell 1**

En aquest nivell t’introduiràs als conceptes fonamentals dels genèrics. Aprendràs a crear **classes i mètodes que treballin amb qualsevol tipus de dades**, i observaràs com Java gestiona la **tipificació flexible però segura**.

**Exercici 1 — Classe sense genèrics**

Crea una classe anomenada `NoGenericMethods` que emmagatzemi **tres arguments del mateix tipus**, juntament amb:

- un **constructor** que els inicialitzi,
- i mètodes `getElement1()`, `getElement2()`, `getElement3()` per accedir-hi.

Comprova que pots passar els arguments en qualsevol ordre al constructor.

Aquest exercici serveix per comparar després el comportament amb una versió genèrica.

**Exercici 2 — Mètode genèric amb paràmetres diversos**

Crea una classe `Person` amb els atributs `name`, `surname` i `age`. Després, crea una classe anomenada `GenericMethods` amb un **mètode genèric** anomenat `printElements()` que accepti **tres arguments de tipus genèric** i els imprimeixi per pantalla.

Al `main()` de la classe principal, crida aquest mètode amb diferents tipus de paràmetres (per exemple: un objecte `Person`, un `String` i un valor numèric primitiu).

Amb aquest exercici verificaràs que els mètodes genèrics poden **acceptar qualsevol combinació de tipus** i en qualsevol ordre.
