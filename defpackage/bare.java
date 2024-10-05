package defpackage;

import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.NoiseSuppressor;
import java.util.UUID;
import org.webrtc.Logging;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bare {
    private static final UUID e = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    private static final UUID f = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");
    private static AudioEffect.Descriptor[] g;
    public AcousticEchoCanceler a;
    public NoiseSuppressor b;
    public boolean c;
    public boolean d;

    public bare() {
        String valueOf = String.valueOf(aype.q());
        Logging.a("WebRtcAudioEffectsExternal", valueOf.length() != 0 ? "ctor".concat(valueOf) : new String("ctor"));
    }

    public static void a(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public static boolean b() {
        return d(AudioEffect.EFFECT_TYPE_AEC, e);
    }

    public static boolean c() {
        return d(AudioEffect.EFFECT_TYPE_NS, f);
    }

    private static boolean d(UUID uuid, UUID uuid2) {
        AudioEffect.Descriptor[] descriptorArr = g;
        if (descriptorArr == null) {
            descriptorArr = AudioEffect.queryEffects();
            g = descriptorArr;
        }
        if (descriptorArr == null) {
            return false;
        }
        for (AudioEffect.Descriptor descriptor : descriptorArr) {
            if (descriptor.type.equals(uuid)) {
                return !descriptor.uuid.equals(uuid2);
            }
        }
        return false;
    }
}
