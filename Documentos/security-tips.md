# 🔒 Security Tips — Consejos Implementados y Recomendaciones

1️⃣ **Permisos en Contexto:** solicitar solo cuando el usuario realiza la acción (abrir cámara, centrar mapa).  
2️⃣ **Evitar Almacenamiento Plano:** cifrar datos con AES o usar `EncryptedSharedPreferences` si se guarda información.  
3️⃣ **Eliminar Logs Sensibles:** no registrar datos personales o rutas internas.  
4️⃣ **HTTPS Obligatorio:** todo tráfico de red debe ir cifrado.  
5️⃣ **Hardening de Manifest:** evitar componentes `exported` innecesarios.  
6️⃣ **Validación de Entradas:** sanitizar texto o datos de usuario antes de procesarlos.  
7️⃣ **Actualización Continua:** aplicar revisiones periódicas y parches de seguridad.  
