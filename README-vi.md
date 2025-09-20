# Fly Mod cho Minecraft

[![Build Status](https://github.com/DangChuVMNewb/Fly-Mods-Minecraft/actions/workflows/main.yml/badge.svg)](https://github.com/DangChuVMNewb/Fly-Mods-Minecraft/actions/workflows/main.yml)
[![License](https://img.shields.io/badge/License-Apache_2.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

Một mod Fabric đơn giản cho phép người chơi bật và tắt chế độ bay bằng một lệnh đơn giản.

## Tính năng

*   **Bật/Tắt Chế độ bay:** Sử dụng lệnh `/fly` để bật hoặc tắt khả năng bay của bạn.
*   **Hỗ trợ nhiều Chế độ chơi:** Hoạt động liền mạch cho người chơi ở chế độ Survival hoặc Adventure.
*   **Thông báo trên màn hình:** Hiển thị một thông báo trạng thái rõ ràng trên thanh hành động của bạn để cho biết chế độ bay đang bật hay tắt.
*   **Hỗ trợ đa ngôn ngữ:** Mod đã được dịch sang nhiều ngôn ngữ.

## Yêu cầu

*   **Minecraft:** `~1.21.8`
*   **Mod Loader:** [Fabric Loader](https://fabricmc.net/use/)
*   **API:** [Fabric API](https://www.curseforge.com/minecraft/mc-mods/fabric-api)
*   **Java:** `Java 21` trở lên

## Cài đặt

1.  Đảm bảo bạn đã cài đặt [Fabric Loader](https://fabricmc.net/use/) và [Fabric API](https://www.curseforge.com/minecraft/mc-mods/fabric-api).
2.  Tải xuống bản phát hành mới nhất từ trang [Releases](https://github.com/DangChuVMNewb/Fly-Mods-Minecraft/releases) hoặc [Actions workflow](https://nightly.link/DangChuVMNewb/Fly-Mods-Minecraft/workflows/main/main).
3.  Đặt tệp `.jar` đã tải vào thư mục `.minecraft/mods` của bạn.
4.  Khởi chạy trò chơi bằng profile Fabric.

## Sử dụng

Chỉ cần gõ lệnh sau trong trò chuyện để bật hoặc tắt chế độ bay:

```
/fly
```

Một tin nhắn trên màn hình sẽ xác nhận chế độ bay đã được bật hay tắt.

## Mục tiêu tương lai

Chúng tôi đang tích cực làm việc để cải thiện Fly Mod. Dưới đây là một số tính năng chúng tôi dự định triển khai trong tương lai gần:

*   **Phím tắt có thể tùy chỉnh:** Chúng tôi muốn thêm một phím nóng có thể tùy chỉnh để bạn có thể bật/tắt chế độ bay mà không cần gõ lệnh.
*   **Kiểm soát tốc độ bay:** Một tính năng sắp tới sẽ là một lệnh (ví dụ: `/flyspeed <tốc độ>`) cho phép người chơi điều chỉnh tốc độ bay của họ, từ bay lơ lửng nhẹ nhàng đến bay vút nhanh chóng.
*   **Cấu hình máy chủ & Quyền hạn:** Đối với quản trị viên máy chủ, chúng tôi dự định thêm một tệp cấu hình phía máy chủ. Điều này sẽ cho phép họ tắt mod trong các chiều không gian cụ thể hoặc kiểm soát những người chơi nào có thể sử dụng lệnh bay, có thể thông qua việc tích hợp với các mod quyền hạn phổ biến.

## Quyền hạn

Hiện tại, lệnh `/fly` có sẵn cho tất cả người chơi trên máy chủ theo mặc định. Các bản cập nhật trong tương lai sẽ bao gồm các tùy chọn để chủ sở hữu máy chủ hạn chế việc sử dụng nó.

## FAQ (Câu hỏi thường gặp)

*   **H: Sử dụng mod này có khiến tôi bị cấm trên máy chủ không?**
    *   **Đ:** Trên các máy chủ công cộng không cho phép rõ ràng, có, điều này được coi là gian lận và có khả năng sẽ khiến bạn bị cấm. Mod này dành cho việc sử dụng trong thế giới chơi đơn hoặc trên các máy chủ riêng tư mà bạn được quản trị viên cho phép.

*   **H: Mod này có hoạt động với Forge không?**
    *   **Đ:** Không, đây là một mod Fabric và yêu cầu Fabric mod loader.

*   **H: Tôi có thể điều chỉnh tốc độ bay của mình không?**
    *   **Đ:** Hiện tại thì chưa, nhưng đây là một tính năng ưu tiên cao mà chúng tôi dự định sẽ sớm bổ sung.

## Ngôn ngữ được hỗ trợ

Mod bao gồm các bản dịch cho các ngôn ngữ sau:

- Tiếng Ả Rập (ar_sa)
- Tiếng Đức (de_de)
- Tiếng Anh (en_us)
- Tiếng Tây Ban Nha (es_es)
- Tiếng Pháp (fr_fr)
- Tiếng Hindi (hi_in)
- Tiếng Ý (it_it)
- Tiếng Nhật (ja_jp)
- Tiếng Hàn (ko_kr)
- Tiếng Mã Lai (ms_my)
- Tiếng Bồ Đào Nha (pt_br)
- Tiếng Nga (ru_ru)
- Tiếng Thái (th_th)
- Tiếng Thổ Nhĩ Kỳ (tr_tr)
- Tiếng Việt (vi_vn)
- Tiếng Trung (zh_cn)

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
    *(Trên Windows, sử dụng `gradlew.bat build`)*

3.  Tệp `.jar` đã build sẽ nằm trong thư mục `build/libs/`.

## Đóng góp

Đây là một dự án mã nguồn mở và miễn phí. Mọi hình thức đóng góp đều được chào đón! Đừng ngần ngại mở một issue hoặc gửi một pull request.

## Giấy phép

Dự án này được cấp phép theo **Giấy phép Apache 2.0**. Xem tệp [LICENSE.txt](LICENSE.txt) để biết chi tiết.