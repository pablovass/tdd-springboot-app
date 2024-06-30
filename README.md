
# Microservicios Spring Boot con TDD

Este repositorio contiene una colección de microservicios Spring Boot desarrollados siguiendo la metodología de Desarrollo Dirigido por Pruebas (TDD). Cada microservicio demuestra diferentes aspectos de desarrollo y pruebas, utilizando diversas tecnologías y frameworks.

## Características

- Múltiples microservicios Spring Boot
- Enfoque en Desarrollo Dirigido por Pruebas (TDD)
- Ejemplos de integración con MongoDB
- Pruebas de integración con Karate
- Pruebas de comportamiento con Cucumber
- Uso de Maven y Gradle como sistemas de construcción
- Pruebas unitarias con JUnit y Spock

## Requisitos previos

- Java JDK 11 o superior
- Maven
- Gradle
- MongoDB

## Estructura del proyecto

Cada carpeta en la raíz del repositorio representa un microservicio independiente. Dentro de cada microservicio, encontrarás:

- Código fuente en `src/main/java`
- Pruebas en `src/test/java`
- Archivos de configuración para Maven o Gradle

## Ejecución de los proyectos

Para ejecutar un microservicio específico:

1. Navega a la carpeta del microservicio
2. Ejecuta el comando correspondiente según el sistema de construcción:

   Con Maven:
   ```
   mvn spring-boot:run
   ```

   Con Gradle:
   ```
   ./gradlew bootRun
   ```

## Ejecución de pruebas

Para ejecutar las pruebas de un microservicio:

Con Maven:
```
mvn test
```

Con Gradle:
```
./gradlew test
```

## Contribuciones

Las contribuciones son bienvenidas. Por favor, asegúrate de seguir los principios de TDD al añadir nuevas características o microservicios.

## Licencia

[Añade aquí la licencia de tu proyecto]
