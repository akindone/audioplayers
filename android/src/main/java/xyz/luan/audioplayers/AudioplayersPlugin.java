package xyz.luan.audioplayers;

import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;

public class AudioplayersPlugin implements FlutterPlugin {

    private static final String CHANNEL_NAME = "xyz.luan/audioplayers";
    private MethodChannel channel;

    public static void registerWith(final PluginRegistry.Registrar registrar) {
        final MethodChannel channel = new MethodChannel(registrar.messenger(), CHANNEL_NAME);
        channel.setMethodCallHandler(new AudioplayersHandler(channel, registrar.activeContext()));
    }

    @Override
    public void onAttachedToEngine(FlutterPluginBinding binding) {
        channel = new MethodChannel(binding.getBinaryMessenger(), CHANNEL_NAME);
        channel.setMethodCallHandler(new AudioplayersHandler(channel, binding.getApplicationContext()));
    }

    @Override
    public void onDetachedFromEngine(FlutterPluginBinding binding) {
        if (channel != null) {
            channel.setMethodCallHandler(null);
            channel = null;
        }
    }

}
