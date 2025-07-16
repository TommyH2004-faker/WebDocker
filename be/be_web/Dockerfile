# Sử dụng image JDK 17
FROM openjdk:17-jdk-slim

# Thiết lập múi giờ Việt Nam để tránh lệch thời gian VNPAY
ENV TZ=Asia/Ho_Chi_Minh

# Tạo thư mục chứa ứng dụng
WORKDIR /app

# Copy file jar đã build
COPY target/*.jar app.jar

# Expose port 8080
EXPOSE 8080

# Lệnh chạy ứng dụng
ENTRYPOINT ["java", "-jar", "app.jar"]
