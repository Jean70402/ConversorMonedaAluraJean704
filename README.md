# 🌎💱 Conversor de Monedas - Reto de Alura

Este proyecto es una aplicación en Java que permite realizar conversiones de monedas utilizando la API de ExchangeRate. Fue desarrollado como parte del desafío de Alura para practicar habilidades de programación, manejo de APIs y estructuración de proyectos.

---

## 🚀 Características

✅ **Conversión de monedas latinoamericanas**  
✅ **Menú interactivo** para seleccionar monedas y realizar conversiones  
✅ **Uso de la API de ExchangeRate** para obtener tasas de cambio actualizadas  
✅ **Implementación con Gson** para procesar datos JSON  
✅ Basado en **Java 17** y estructurado con clases modulares  

---

## 🛠️ Tecnologías utilizadas

- **Java 17**: Lenguaje principal del proyecto.  
- **Gson**: Para procesar y mapear datos JSON desde la API.  
- **HttpClient**: Para realizar solicitudes HTTP.  
- **API de ExchangeRate**: Fuente de tasas de cambio actualizadas.  
- **IntelliJ IDEA**: IDE utilizado para el desarrollo.  

---

## 📦 Requisitos

Antes de ejecutar el proyecto, asegúrate de tener instalado lo siguiente:

1. [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
2. [Gson]([https://maven.apache.org/](https://mvnrepository.com/artifact/com.google.code.gson/gson)) (Utilizado como implementacion .jar)
3. Una conexión a internet (para acceder a la API de ExchangeRate)

---

## 🔑 Configuración de la API

Este proyecto utiliza la API de ExchangeRate. Necesitarás tu propia **API Key** para realizar solicitudes. Si no tienes una, [puedes obtenerla aquí](https://app.exchangerate-api.com/dashboard/confirmed).

1. **Tu clave API**: `ab30c3a4d8ccc8b2569a8739` (puedes reemplazarla por la tuya en la clase `ExchangeRateService`).

```java
private static final String API_KEY = "ab30c3a4d8ccc8b2569a8739";
```

## 👨‍💻 Cómo ejecutar la aplicación

    Clona este repositorio:

git clone https://github.com/tu_usuario/conversor-monedas.git
cd conversor-monedas

Compila el proyecto con Maven:

mvn clean install

Ejecuta la aplicación desde la clase principal Main:

    java -cp target/conversor-monedas-1.0-SNAPSHOT.jar Main

## 🧭 Cómo usar la aplicación

    Al iniciar la aplicación, se mostrará un menú interactivo:

    ***************
    Seleccione una opción:
    1.- Convertir ARS a otras monedas
    2.- Convertir BRL a otras monedas
    3.- Convertir CLP a otras monedas
    ...
    X.- Salir.

    Introduce el número correspondiente a la moneda base que deseas convertir.

    Escribe el monto que deseas convertir.

    Selecciona la moneda de destino para completar la conversión.

    Repite o presiona X para salir del programa.

## 💰 Monedas disponibles

El conversor actualmente soporta las siguientes monedas de Latinoamérica:

    🇦🇷 ARS: Peso argentino
    🇧🇷 BRL: Real brasileño
    🇨🇱 CLP: Peso chileno
    🇨🇴 COP: Peso colombiano
    🇨🇷 CRC: Colón costarricense
    🇨🇺 CUP: Peso cubano
    🇩🇴 DOP: Peso dominicano
    🇲🇽 MXN: Peso mexicano
    🇵🇪 PEN: Sol peruano
    🇵🇾 PYG: Guaraní paraguayo
    🇺🇾 UYU: Peso uruguayo
    🇻🇪 VES: Bolívar venezolano

## 🔄 API utilizada

Este proyecto utiliza la API de ExchangeRate para obtener las tasas de cambio.

## 🌟 Sobre el desafío de Alura

Este proyecto fue desarrollado como parte del Challenge Back-End de Alura, enfocado en mejorar las habilidades técnicas y enfrentar retos reales de desarrollo.

Objetivos principales:

    Manejar APIs externas.
    Estructurar proyectos Java con buenas prácticas.
    Interactuar con el usuario mediante una interfaz de consola.
    Implementar bibliotecas externas como Gson para trabajar con JSON.

## 🤝 Contribuciones

¡Las contribuciones son bienvenidas! Si deseas mejorar esta aplicación o agregar nuevas funcionalidades, no dudes en hacer un fork y enviar un pull request.
📝 Licencia

Este proyecto está bajo la licencia MIT. Puedes usarlo libremente para aprender y crear tus propias aplicaciones.
