📄 Description – Exercise statements

Tasca S1.02. Exceptions

🔹 Nivell 1
- Exercici 1
Crea una classe anomenada "Producte" amb els atributs nom i preu, i una altra classe anomenada "Venda". Aquesta classe té com a atributs una col·lecció de productes i el preu total de la venda.

La classe "Venda", té un mètode anomenat calcularTotal() que llança l’excepció personalitzada "VendaBuidaException" i mostra per pantalla “Per fer una venda primer has d’afegir productes” si la col·lecció de productes està buida. Si la col·lecció té productes, llavors ha de recórrer la col·lecció i guardar la suma de tots els preus dels productes a l’atribut preu total de la venda.

L’excepció personalitzada "VendaBuidaException" ha de ser filla de la classe Exception. Al seu constructor li hem de passar el missatge  “Per fer una venda primer has d’afegir productes” i quan capturem l’excepció, l’hem de mostrar per pantalla amb el mètode getMessage() de l’excepció.

Escriu el codi necessari per a generar i capturar una excepció de tipus "IndexOutOfBoundsException".

**********************
Nivell 2
- Exercici 1
Crea una classe anomenada "Entrada". Aquesta classe ha de servir per controlar les diferents excepcions que poden aparèixer en Java a l’hora d’introduir dades per teclat utilitzant la classe Scanner.

El primer que s’ha de fer és instanciar un objecte de la classe Scanner i a partir d’aquí, crear mètodes estàtics per llegir els diferents tipus de dades des del teclat. 

 Important

És important que si en algun mètode salta una excepció, la tractem i tornem a demanar la dada a l’usuari/ària fins que aquesta estigui ben introduïda. Per exemple: Si introdueix un float amb un punt en lloc d'una coma, ha de mostrar “Error de format”. Fins que l’usuari/ària no introdueix un float ben format ha de seguir demanant la dada.
Tots els mètodes reben un String amb el missatge que es vol mostrar a l’usuari/ària, per exemple: “Introdueix la teva edat”, i retornen la dada oportuna introduïda per l’usuari/ària en cada mètode, per exemple: un byte amb l’edat de l’usuari/ària.

Mètodes a implantar capturant l’excepció de la classe "InputMismatchException":

public static byte llegirByte(String missatge);
public static int llegirInt(String missatge);
public static float llegirFloat(String missatge);
public static double llegirDouble(String missatge);
Mètodes a implantar capturant una excepció personalitzada de la classe Exception:

public static char llegirChar(String missatge);
public static String llegirString(String missatge);
public static boolean llegirSiNo(String missatge), si l’usuari/ària introdueix “s”, retorna “true”, si l’usuari/ària introdueix “n”, retorna “false”.

**********************
Nivell 3
- Exercici 1
Una famosa empresa de cinemes ens ha demanat que desenvolupem una aplicació per a la reserva de seients en els seus cinemes. L’aplicació serà utilitzada pels venedors/es a l’hora de vendre les entrades.

Funcionament
L’aplicació un cop s’hagi iniciat, preguntarà a l’usuari/ària quantes files i quants seients per fila té la sala de cinema. Un cop introduïdes aquestes dades, es mostrarà el següent menú:

1.- Mostrar totes les butaques reservades.
2.- Mostrar les butaques reservades per una persona.
3.- Reservar una butaca.
4.- Anul·lar la reserva d’una butaca.
5.- Anul·lar totes les reserves d’una persona.
0.- Sortir.

L’aplicació tindrà les següents classes:

Classe Principal
Tindrà el main de l’aplicació on s’instanciarà un objecte de la classe "Cine" i cridarà al seu mètode "iniciar".

Classe Butaca
Tindrà les dades d’una butaca:

Atributs:
Nombre de fila.
Nombre de seient.
Persona que reserva la butaca.
Mètodes:

Constructor amb tots els paràmetres.
Getters per tots els atributs.
Equals: retornarà que dues butaques són iguales si la fila i el seient són iguals.
toString: retornarà un String amb el següent format: “Fila: 5, Seient: 20, Persona: Maria Febrer”

Classe Cine
Contindrà els atributs i el mètode d’inicialització.
Atributs:
Nombre de files del cinema.
Nombre de seients per cada fila.
Un objecte de la classe "GestioButaques"
Un objecte de la classe "GestioCine"
Mètodes:

Constructor: no rebrà paràmetres. Inicialitzarà l’objecte de la classe "GestioButaques" i "GestioCine". Cridarà al mètode "demanarDadesInicials" que inicialitzarà el nombre de files i de seients.
iniciar: començarà l’aplicació. Cridarà al mètode "menu" i en funció del número retornat, cridarà al mètode corresponent de la classe "GestioCine".
"demanarDadesInicials": Demanarà a l’usuari/ària el nombre de files i seients i els guardarà en els atributs corresponents
Classe GestioCine:

Contindrà la lògica per a la gestió de les operacions del cinema.

Atributs:

Un objecte de la classe "Cine"
Mètodes:

"Constructor": Rebrà com a paràmetre un objecte de la classe "Cine" i l’assignarà a l’atribut corresponent.
"menu": Mostrarà les opcions del menú principal a l’usuari/ària, li demanarà el número de l’opció escollida i el retornarà.
"mostrarButaques": Mostra totes les butaques reservades.
"mostrarButaquesPersona": Demana el nom de la persona que ha fet la reserva i mostra totes les butaques reservades per aquesta persona
"reservarButaca": Demana a l’usuari/ària un número de fila (crida al mètode "introduirFila"), un número de seient (crida al mètode "introduirSeient"), el nom de la persona que fa la reserva (crida al mètode "introduirPersona") i reserva la butaca.
"anularReserva": Demana a l’usuari/ària un número de fila (crida al mètode "introduirFila"), un número de seient (crida al mètode "introduirSeient") i elimina la reserva de la butaca.
"anularReservaPersona": Demana a l’usuari/ària el nom de la persona (crida al mètode "introduirPersona") i elimina les butaques reservades per la persona introduïda.
"introduirPersona": Demana a l’usuari/ària el nom de la persona i el retorna si és correcte. Si conté números, llença una excepció personalitzada "ExcepcioNomPersonaIncorrecte"
"introduirFila": Demana el nombre de fila, si aquest està entre 1 i el nombre de files totals, el retorna. Si no, llença una excepció personalitzada "ExcepcioFilaIncorrecta"
"introduirSeient": Demana el seient, si el número està entre 1 i el nombre total de seients, el retorna. Si no, llença una excepció personalitzada "ExcepcioSeientIncorrecte"

Classe GestioButaques
Contindrà un ArrayList de butaques i els mètodes necessaris per afegir, eliminar i cercar les butaques a l’ArrayList.

Atri
butaques: ArrayList de butaques.
Mètodes:

Constructor: No rebrà paràmetres i inicialitzarà l’ArrayList de butaques.
getButaques: Retornarà l’atribut butaques.
"afegirButaca": serà l’encarregat d’afegir una butaca a l’ArrayList de butaques. Rebrà com a paràmetre un objecte de la classe "Butaca" i l’afegirà a l’ArrayList. Si la fila i el seient de la butaca rebuda com a paràmetre coincideixen amb el d’una butaca que ja es trobi a l’ArrayList (s’utilitzarà el mètode "cercarButaca"), es llençarà l’excepció personalitzada "ExcepcioButacaOcupada".
"eliminarButaca": serà l’encarregat d’eliminar una butaca de l’ArrayList de butaques. Rebrà com a paràmetres el número de fila i el seient i l’eliminarà de l’ArrayList. Si la fila i el seient no coincideixen amb el d’una butaca reservada (s’utilitzarà el mètode "cercarButaca"), llençarà una excepció personalitzada "ExcepcioButacaLliure".
"cercarButaca": Cerca a l’ArrayList de butaques, la butaca que coincideixi amb les dades rebudes com a paràmetre (fila i seient). Si la troba, retornarà la posició de la butaca a l’ArrayList i, si no la troba, retornarà -1.


💻 Technologies used

IntelliJ IDEA 
Java 21
Git & GitHub

📚 Repository description

This repository contains the exercises from the Java specialization at IT Academy, specifically the tasks for Sprint 1, Exercise 2. The focus of these exercises is to practice exception handling in Java through the use of try and catch blocks, as well as the creation and management of custom exceptions.


🛠️ Installation

Clone the repository

▶️ Execution

Open the project in IntelliJ IDEA or Eclipse, compile, and run the main() of each exercise.

🌐 Deployment

Not applicable (local Java projects).

🤝 Contributions

Project developed as part of Java OOP practice exercises.