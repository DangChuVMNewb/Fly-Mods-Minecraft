package com.chuong.flymod;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import com.mojang.brigadier.Command;

public class FlyCommand {

    /**
     * Đăng ký lệnh /fly.
     * @param dispatcher The command dispatcher
     */
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {
        dispatcher.register(CommandManager.literal("fly")
                // Yêu cầu người thực thi lệnh phải là một người chơi
                .requires(source -> source.getEntity() instanceof ServerPlayerEntity)
                // Logic sẽ được thực thi khi gõ lệnh
                .executes(FlyCommand::toggleFly));
    }

    /**
     * Logic chính để bật/tắt chế độ bay.
     * @param context The command context.
     * @return Command result.
     * @throws CommandSyntaxException
     */
    private static int toggleFly(CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        // Lấy đối tượng người chơi đã thực thi lệnh
        ServerPlayerEntity player = context.getSource().getPlayerOrThrow();
        Text message;

        // Kiểm tra nếu người chơi đang được phép bay
        if (player.getAbilities().allowFlying) {
            // Tắt chế độ bay
            player.getAbilities().allowFlying = false;
            player.getAbilities().flying = false; // Đảm bảo người chơi ngừng bay ngay lập tức
            
            // Tạo tin nhắn thông báo (màu đỏ)
            message = Text.translatable("command.fly-mod.fly.disabled").formatted(Formatting.RED);
        } else {
            // Bật chế độ bay
            player.getAbilities().allowFlying = true;
            
            // Tạo tin nhắn thông báo (màu xanh lá)
            message = Text.translatable("command.fly-mod.fly.enabled").formatted(Formatting.GREEN);
        }

        // Gửi cập nhật trạng thái khả năng của người chơi
        player.sendAbilitiesUpdate();
        
        // Gửi tin nhắn tới action bar của người chơi
        player.sendMessage(message, true);

        // Trả về kết quả thành công
        return Command.SINGLE_SUCCESS;
    }
}
