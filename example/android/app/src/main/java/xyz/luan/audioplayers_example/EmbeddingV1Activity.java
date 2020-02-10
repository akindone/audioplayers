package xyz.luan.audioplayers_example;

import android.os.Bundle;

import io.flutter.app.FlutterActivity;
import io.flutter.plugins.GeneratedPluginRegistrant;
import io.flutter.plugins.pathprovider.PathProviderPlugin;
import xyz.luan.audioplayers.AudioplayersPlugin;

public class EmbeddingV1Activity extends FlutterActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    AudioplayersPlugin.registerWith(registrarFor("xyz.luan.audioplayers.AudioplayersPlugin"));
    PathProviderPlugin.registerWith(registrarFor("io.flutter.plugins.pathprovider.PathProviderPlugin"));  }
}
