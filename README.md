# Sprint 4.02

Spring Framework B脿sics

## Iniciant 馃殌

Ha arribat el moment de qu猫 comencis a familiaritzar-te amb Spring.

Spring 茅s un framework de codi obert per a la creaci贸 d'aplicacions empresarials amb Java. Disposa d'una estructura modular que li proporciona molta flexibilitat per a implementar diferents solucions segons les necessitats de cada aplicaci贸.

Per tal de simplificar la configuraci贸 i el desplegament de les aplicacions desenvolupades amb Spring Framework, va sorgir Spring Boot, que facilita molt aquests aspectes.

### Descripci贸馃搵

En aquesta tasca far脿s un CRUD (Create, Read, Update, Delete) amb 3 bases de dades diferents.

Aprendr脿s a usar correctament els verbs HTTP i a gestionar els codis de resposta.

```
PostMapping("/Add")
PutMapping("/Update/{id}")
DeleteMapping("/Delete/{id}")
GetMapping("/getOne/{id}")
GetMapping("/getAll")
```
## Nivells Realitzats

1- EXERCICI CRUD AMB H2

H2-> Base de dades en mem貌ria. Es pot visualitzar a la consola per http://localhost:8080/h2-console. 

2- EXERICI CRUD AMB MySQL


## Conceptes 鈿欙笍

JPA: ens permet manipular la base de dades a trav茅s d'objectes, aquests objectes en Spring s贸n anomenats Entity. 

Microserveis: conjunt de petits serveis, cadascun d'ells s'executen de manera aut貌noma i comunicant-se entre si, generalment a trav茅s de peticions REST sobre HTTP per mitj脿 de les seves APIS. 脡s un estil d'arquitectura per desenvolupar l'aplicaci贸.


L'estructura utilitzada a Spring Boot ha sigut la seg眉ent:

-CONTROLLER -> FruitaController: Ens permet gestionar les peticions http i redireccions

-EXCEPTION -> GestorException: Ens permet gestionar / capturar les exceptions.

           -> ItemNotFoundException: Classe d'una excepci贸 personalitzada.
           
-MODEL -> Fruita: 脡s la classe entitat representa un objecte. Aquesta classe est脿 mapejada contra una taula de la base de dades, aquest mapatge es realitza amb les anotacions.

-REPOSITORY -> FruitaRepository: Interface que s'est茅n de JpaRepository. Forma part de la capa persist猫ncia 茅s la forma que el nostre microservei pot guardar i recuperar les entitats. (Cont茅 els metodes CRUD).

-SEVICE -> FruitaService: 茅s la part l貌gica del programa. On trobem els m猫todes CRUD.

## Recursos 馃洜锔?

* [JavaGuides](https://www.javaguides.net/p/spring-boot-tutorial.html) 
* [Baeldung](https://www.baeldung.com/spring-boot-h2-database) 
* [Spring](https://www.youtube.com/watch?v=ez6FNBdCUB0&list=PL-A7l3GTDnp1YkBwslsdzuJKF55cISdSD)
* [Curso SpringBoot](https://spring.io/guides/gs/accessing-data-mysql/)
* [Mongodb](https://www.javadevjournal.com/spring-boot/spring-boot-with-mongodb/)

---

