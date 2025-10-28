# 🧩 Mejores Prácticas Aplicadas

## 1️⃣ Protección de Claves y Secretos
Se implementó la ocultación de la API Key en `local.properties`, evitando exposición en repositorios públicos.  
**Ejemplo:**
```properties
MAPS_API_KEY=AIzaSy************
```
Y en `google_maps_api.xml`:
```xml
<string name="google_maps_key" translatable="false">${MAPS_API_KEY}</string>
```

## 2️⃣ Desactivar Modos Inseguros
En el `AndroidManifest.xml` se modificó:
```xml
android:debuggable="false"
android:allowBackup="false"
```

## 3️⃣ Solicitud Justificada de Permisos
Uso del método `shouldShowRequestPermissionRationale()` para explicar al usuario por qué se requiere acceso.

## 4️⃣ Principio de Mínimo Privilegio
Solo se solicitan permisos estrictamente necesarios (GPS y cámara).

## 5️⃣ Uso de HTTPS
Toda comunicación futura se planifica bajo protocolos seguros TLS 1.2+.

## 6️⃣ Control de Dependencias
Las librerías (`play-services-maps`, `play-services-location`) se mantienen actualizadas para evitar vulnerabilidades heredadas.


1. **Protección de claves y secretos**
    - API Key movida a `local.properties` y referenciada con `${MAPS_API_KEY}`.
    - Recomendación: limitar en Google Cloud por `packageName` y huella SHA-1/256.

2. **Desactivar debug y backups en producción**
    - `android:debuggable="false"`
    - `android:allowBackup="false"`

3. **Principio de mínimo privilegio**
    - Solo se declaran `ACCESS_FINE_LOCATION` y `CAMERA`.
    - Solicitud de permisos en contexto y con explicación al usuario.

4. **Uso de HTTPS (Lineamiento)**
    - Toda comunicación remota debe ir sobre TLS 1.2+.
    - Considerar `Network Security Config` si se requieren certificados propios o pinning.

5. **Gestión de dependencias**
    - Mantener librerías de Google Play Services y AndroidX actualizadas.
    - Revisar changelogs de seguridad antes de actualizar.

6. **Ciclo de vida seguro**
    - Firmar APKs de `release` con keystore propio.
    - Evitar logs de información sensible en producción.
