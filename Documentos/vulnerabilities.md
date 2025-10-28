# 🔍 Análisis Detallado de Vulnerabilidades

## 1️⃣ API Key Expuesta
**Ubicación:** `res/values/google_maps_api.xml`  
**Riesgo:** Alto  
**Impacto:** Permite el uso no autorizado del servicio y posibles costos.  
**Corrección:** Mover la clave al archivo `local.properties` y restringir su uso por nombre de paquete y SHA-1 en Google Cloud Console.

---

## 2️⃣ Aplicación Firmada con Certificado de Depuración
**Descripción:** MobSF detectó que la app fue firmada con `Android Debug Certificate`.  
**Impacto:** Facilita ataques de ingeniería inversa.  
**Solución:** Generar un **keystore de release** y firmar el APK final antes de distribuirlo.

---

## 3️⃣ Modo Debug Activado
**Archivo:** `AndroidManifest.xml`
```xml
android:debuggable="true"
```
**Impacto:** Permite que atacantes conecten un depurador al proceso y accedan a datos internos.  
**Solución:** Cambiar a `android:debuggable="false"` en el entorno de producción.

---

## 4️⃣ Respaldo de Datos Activado
**Archivo:** `AndroidManifest.xml`
```xml
android:allowBackup="true"
```
**Impacto:** Permite extraer información mediante ADB.  
**Solución:** Establecer `android:allowBackup="false"`.

---

## 5️⃣ Permisos Peligrosos
**Permisos:** `ACCESS_FINE_LOCATION` y `CAMERA`  
**Riesgo:** Medio  
**Impacto:** Mal uso o abuso puede revelar ubicación o imágenes sin consentimiento.  
**Corrección:** Solicitar en contexto con racionalidad al usuario mediante `shouldShowRequestPermissionRationale()`.

---

## 6️⃣ Compatibilidad con Versiones Antiguas
**minSdkVersion:** 26  
**Riesgo:** Medio  
**Recomendación:** Actualizar a `minSdk=29` para evitar vulnerabilidades presentes en Android 8 y 9.

---
