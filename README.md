📱 GPS + Cámara — Android App

Una aplicación Android que combina geolocalización con captura de imágenes.
El usuario puede visualizar su ubicación en un mapa, agregar marcadores personalizados y tomar fotos directamente desde la interfaz.

🚀 Características principales

  📍 Muestra la ubicación actual del usuario en Google Maps.
  
  📸 Permite tomar fotos con la cámara del dispositivo.
  
  📌 Agrega marcadores personalizados con un toque largo en el mapa.
  
  🧭 Botón flotante para volver a la ubicación actual.
  
  🎨 Diseño limpio y moderno con animaciones suaves.
  
  ✅ Compatible con permisos de ubicación y cámara.

🧩 Estructura del proyecto
res/
├── layout/
│   ├── activity_main.xml
│   └── activity_map_camara.xml
├── anim/
│   └── fade_out.xml
├── drawable/
│   ├── ic_launcher_background.xml
│   └── ic_launcher_foreground.xml
├── mipmap/
│   ├── ic_launcher.webp
│   └── ic_launcher_round.webp
├── values/
│   ├── colors.xml
│   ├── themes.xml
│   └── google_maps_api.xml

🛠️ Cambios realizados
✅ Funcionales

Se agregó implements OnMapReadyCallback a MapCamaraActivity.

Se activó el botón flotante de ubicación con:
mMap.getUiSettings().setMyLocationButtonEnabled(true);
Se agregó manejo de permisos para cámara y ubicación.

Se implementó onActivityResult para mostrar la foto tomada en un ImageView.

🎨 Visuales

Se rediseñó activity_main.xml con un estilo limpio y centrado.

Se simplificó activity_map_camara.xml para que el mapa ocupe toda la pantalla sin interferencias.

Se agregó una animación de desvanecimiento (fade_out.xml) al iniciar la app.

🎬 Animaciones

Se creó res/anim/fade_out.xml para animar el título al presionar “Iniciar”.

Se añadió una transición suave entre actividades con:
overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

📦 Requisitos

Android Studio Arctic Fox o superior

API Level 21+ (Android 5.0 o superior)

Conexión a internet para cargar el mapa

Permisos de ubicación y cámara habilitados

🧪 Cómo usar

Abre la aplicación y presiona Iniciar.

Visualiza el mapa con tu ubicación actual.

Presiona Tomar Foto para capturar una imagen.

Mantén presionado en el mapa para agregar un marcador personalizado.

👨‍💻 Desarrollado por

Patrick Jean Paul Vera Ossandón
📘 Analista Programador
📍 Chile, Ovalle
