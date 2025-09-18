# Fly Mod

Một mod Minecraft đơn giản cho Fabric, cho phép người chơi bật và tắt chế độ bay bằng một lệnh đơn giản.

## Mục tiêu Dự án

### Đã hoàn thành
- [x] Tạo lệnh `/fly` để bật/tắt chế độ bay.
- [x] Hỗ trợ chế độ Survival và Adventure.
- [x] Thông báo trạng thái trên màn hình.

### Mục tiêu Tương lai
- [ ] Thêm phím tắt có thể cấu hình để bật/tắt bay.
- [ ] Thêm lệnh để điều chỉnh tốc độ bay.
- [ ] Thêm tệp cấu hình cho các cài đặt phía máy chủ (ví dụ: tắt mod ở một số thế giới nhất định).

## Tính năng

*   Thêm lệnh `/fly` để bật hoặc tắt khả năng bay.
*   Hoạt động cho người chơi ở chế độ Survival hoặc Adventure.
*   Hiển thị thông báo trạng thái bay ngay trên màn hình.

## Yêu cầu

*   **Minecraft:** `~1.21.8`
*   **Mod Loader:** Fabric Loader
*   **API:** Fabric API
*   **Java:** `Java 21` trở lên

## Cài đặt

1.  Đảm bảo bạn đã cài đặt Fabric Loader và Fabric API.
2.  Tải xuống bản build mới nhất từ [Actions workflow](https://nightly.link/DangChuVMNewb/Fly-Mods-Minecraft/workflows/main/main).
3.  Đặt tệp `.jar` đã tải vào thư mục `mods` của bạn (`.minecraft/mods`).
4.  Khởi chạy trò chơi bằng profile Fabric.

## Sử dụng

Chỉ cần gõ lệnh sau trong trò chuyện để bật hoặc tắt chế độ bay:

```
/fly
```

## Build từ mã nguồn

1.  Clone repository này:
    ```sh
    git clone https://github.com/DangChuVMNewb/Fly-Mods-Minecraft.git
    cd Fly-Mods-Minecraft
    ```
2.  Chạy lệnh build của Gradle:
    ```sh
    ./gradlew build
    ```
    (Trên Windows, sử dụng `gradlew.bat build`)

3.  Tệp `.jar` đã build sẽ nằm trong thư mục `build/libs/`.

## Đóng góp

Đây là một dự án miễn phí và mã nguồn mở. Mọi hình thức đóng góp đều được chào đón! Đừng ngần ngại mở một issue hoặc gửi một pull request.

## Giấy phép

Dự án này được cấp phép theo [CC0-1.0 Universal](https://creativecommons.org/publicdomain/zero/1.0/).
