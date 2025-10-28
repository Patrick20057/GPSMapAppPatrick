# 📱 Proyecto: GPSCamera Security App

## 🧾 Descripción General
La aplicación **GPSCamera Security App** fue desarrollada en **Java** utilizando **Android Studio**, con el objetivo de integrar los servicios de **Google Maps** y la **cámara del dispositivo**.  
Permite al usuario visualizar su ubicación actual mediante GPS, agregar marcadores personalizados con un toque prolongado en el mapa y capturar fotografías directamente desde la interfaz.  

Este proyecto forma parte de la **Actividad 2.5 — Manejo de Elementos de Seguridad** del módulo *Programación Android*, donde se realizó un análisis de vulnerabilidades y se aplicaron prácticas seguras siguiendo la pauta académica.

---

## 🎯 Objetivos
- Desarrollar una aplicación Android funcional con integración de mapa y cámara.  
- Detectar vulnerabilidades mediante análisis estático con **MobSF**.  
- Aplicar medidas de seguridad, buenas prácticas y documentación técnica.  
- Subir el proyecto a **GitHub** con los archivos de análisis y mejoras implementadas.

---

## 🧩 Explicación del Código

### 🔹 `MainActivity.java`
Pantalla inicial de bienvenida. Incluye un botón que redirige a la vista principal (mapa).

```java
btnStart.setOnClickListener(v -> {
    Toast.makeText(this, "¡Bienvenido, Patrick!", Toast.LENGTH_SHORT).show();
    Intent intent = new Intent(this, MapCamaraActivity.class);
    startActivity(intent);
});
```

👉 Usa `Intent` para la navegación y un `Toast` para retroalimentar al usuario.  
No presenta vulnerabilidades, pero se evita incluir información sensible en los mensajes.

---

### 🔹 `MapCamaraActivity.java`
Gestiona Google Maps, ubicación y cámara. Implementa `OnMapReadyCallback`.

```java
locationClient.getLastLocation().addOnSuccessListener(location -> {
    if (location != null) {
        LatLng current = new LatLng(location.getLatitude(), location.getLongitude());
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(current, 15));
        mMap.addMarker(new MarkerOptions().position(current).title("Tu ubicación"));
    }
});
```

📍 Obtiene la ubicación del usuario y la muestra con un marcador.  
Se solicita el permiso de ubicación en tiempo de ejecución para evitar accesos no autorizados.

---

### 🔹 Permisos en `AndroidManifest.xml`
```xml
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
<uses-permission android:name="android.permission.CAMERA" />
<uses-permission android:name="android.permission.INTERNET" />
```
Estos permisos son esenciales para las funciones de cámara y mapa.  
Su solicitud en tiempo real garantiza mayor control de seguridad.

---

## 🛡️ Análisis de Vulnerabilidades (MobSF)
Se realizó un análisis estático con **Mobile Security Framework (MobSF)** obteniendo una puntuación de **45/100 (riesgo medio)**.  

**Principales hallazgos:**
1. API Key expuesta en `google_maps_api.xml`.  
2. Modo Debug activado (`android:debuggable="true"`).  
3. Copia de datos habilitada (`android:allowBackup="true"`).  
4. Firma con certificado de depuración.  
5. Permisos peligrosos sin racionalidad.  

Todos los detalles están documentados en [`Documentos/vulnerabilities.md`](Documentos/vulnerabilities.md).

---

## 🧠 Mejores Prácticas Aplicadas
- API Key protegida en `local.properties`.  
- Debug y Backup desactivados.  
- Permisos solicitados con explicación al usuario.  
- Aplicación del principio de “mínimo privilegio”.  
- Uso de HTTPS en futuras conexiones.

📄 Ver documento completo: [`Documentos/best_practices.md`](Documentos/best_practices.md)

---

## 🔒 Security Tips Implementados
- Solicitar permisos solo cuando sea necesario.  
- Evitar almacenamiento sin cifrado.  
- Eliminar logs antes de publicar.  
- Revisar dependencias y librerías cada trimestre.  

📄 Ver: [`Documentos/security-tips.md`](Documentos/security-tips.md)

---

## 📈 Programa de Mejora Continua
Se diseñó un plan de revisión periódica de seguridad con actividades mensuales, trimestrales y semestrales para mantener la aplicación libre de vulnerabilidades.

📄 Ver: [`Documentos/security_improvement_program.md`](Documentos/security_improvement_program.md)

---

## 🚀 Ejecución Segura
1. Configurar la API Key en `local.properties`.  
2. Revisar los permisos al ejecutar por primera vez.  
3. Generar el APK **release** firmado.  
4. Analizar la app con MobSF antes de publicar.

---

## 📘 Reflexión Final
El desarrollo de esta aplicación permitió comprender la importancia de **la seguridad en el ciclo de vida del software móvil**.  
Se adquirieron conocimientos sobre detección de vulnerabilidades, uso responsable de permisos, cifrado de datos y documentación profesional de seguridad.  

---

**Autor:** Patrick Jean Paul Vera Ossandón  
**Carrera:** Analista Programador  
**Año:** 2025  
**Institución:** Instituto Profesional / CFT


👨‍💻 Desarrollado por

Patrick Jean Paul Vera Ossandón
📘 Analista Programador
📍 Chile, Ovalle
