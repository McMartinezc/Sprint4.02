Tasca S4.02

-Conceptes:

JPA: ens permet manipular la base de dades a través d'objectes aquests objectes en Spring són anomenats Entity. 

Microserveis: conjunt de petits serveis, cadascun d'ells s'executen de manera autònoma i comunicant-se entre si, generalment a través de peticions REST sobre HTTP per mitjà de les seves APIS. És un estil d'arquitectura per desenvolupar l'aplicació.


L'estructura utilitzada a Spring Boot ha sigut la següent:

-CONTROLLER -> FruitaController: Ens permet gestionar les peticions http i redireccions

-EXCEPTION -> GestorException: Ens permet gestionar / capturar les exceptions.

           -> ItemNotFoundException: Classe d'una excepció personalitzada.
           
-MODEL -> Fruita: És la classe entitat representa un objecte. Aquesta classe està mapejada contra una taula de la base de dades, aquest mapatge es realitza amb les anotacions.

-REPOSITORY -> FruitaRepository: Interface que s'estén de JpaRepository. Forma part de la capa persistència és la forma que el nostre microservei pot guardar i recuperar les entitats.

-SEVICE -> FruitaService: és la part lògica del programa. On trobem els mètodes CRUD.


S4T02N2MartinezMCarmen
Desenvolupament de la nostra base de dades amb MySql, utilitzant la mateixa estructura del exercici 1, però implementant els canvis necessaris (application.properties)


RECURSOS UTILITZATS:

https://www.javaguides.net/p/spring-boot-tutorial.html

https://www.baeldung.com/spring-boot-h2-database

https://spring.io/guides/gs/accessing-data-mysql/

https://www.youtube.com/watch?v=ez6FNBdCUB0&list=PL-A7l3GTDnp1YkBwslsdzuJKF55cISdSD
