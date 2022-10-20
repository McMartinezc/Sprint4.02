# Sprint 4.02

Spring Framework Bàsics

## Iniciant 🚀

Ha arribat el moment de què comencis a familiaritzar-te amb Spring.

Spring és un framework de codi obert per a la creació d'aplicacions empresarials amb Java. Disposa d'una estructura modular que li proporciona molta flexibilitat per a implementar diferents solucions segons les necessitats de cada aplicació.

Per tal de simplificar la configuració i el desplegament de les aplicacions desenvolupades amb Spring Framework, va sorgir Spring Boot, que facilita molt aquests aspectes.

### Descripció📋

En aquesta tasca faràs un CRUD (Create, Read, Update, Delete) amb 3 bases de dades diferents.

Aprendràs a usar correctament els verbs HTTP i a gestionar els codis de resposta.

```
PostMapping("/Add")
PutMapping("/Update/{id}")
DeleteMapping("/Delete/{id}")
GetMapping("/getOne/{id}")
GetMapping("/getAll")
```
## Nivells Realitzats

1- EXERCICI CRUD AMB H2

H2-> Base de dades en memòria. Es pot visualitzar a la consola per http://localhost:8080/h2-console. 

2- EXERICI CRUD AMB MySQL


## Conceptes ⚙️

JPA: ens permet manipular la base de dades a través d'objectes, aquests objectes en Spring són anomenats Entity. 

Microserveis: conjunt de petits serveis, cadascun d'ells s'executen de manera autònoma i comunicant-se entre si, generalment a través de peticions REST sobre HTTP per mitjà de les seves APIS. És un estil d'arquitectura per desenvolupar l'aplicació.


L'estructura utilitzada a Spring Boot ha sigut la següent:

-CONTROLLER -> FruitaController: Ens permet gestionar les peticions http i redireccions

-EXCEPTION -> GestorException: Ens permet gestionar / capturar les exceptions.

           -> ItemNotFoundException: Classe d'una excepció personalitzada.
           
-MODEL -> Fruita: És la classe entitat representa un objecte. Aquesta classe està mapejada contra una taula de la base de dades, aquest mapatge es realitza amb les anotacions.

-REPOSITORY -> FruitaRepository: Interface que s'estén de JpaRepository. Forma part de la capa persistència és la forma que el nostre microservei pot guardar i recuperar les entitats. (Conté els metodes CRUD).

-SEVICE -> FruitaService: és la part lògica del programa. On trobem els mètodes CRUD.

## Recursos 🛠️

* [JavaGuides](https://www.javaguides.net/p/spring-boot-tutorial.html) 
* [Baeldung](https://www.baeldung.com/spring-boot-h2-database) 
* [Spring](https://www.youtube.com/watch?v=ez6FNBdCUB0&list=PL-A7l3GTDnp1YkBwslsdzuJKF55cISdSD)
* [Curso SpringBoot](https://spring.io/guides/gs/accessing-data-mysql/)

---

