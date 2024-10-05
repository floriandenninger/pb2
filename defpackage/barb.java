package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import org.webrtc.Logging;
import org.webrtc.audio.JavaAudioDeviceModule;
import org.webrtc.audio.WebRtcAudioManager;
import org.webrtc.audio.WebRtcAudioRecord;
import org.webrtc.audio.WebRtcAudioTrack;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class barb {
    public int a = 7;
    public boolean b = bare.b();
    public boolean c = bare.c();
    public boolean d;
    public AudioAttributes e;
    public acnc f;
    public acoh g;
    public acnc h;
    private final Context i;
    private final AudioManager j;
    private final int k;
    private final int l;

    public barb(Context context) {
        this.i = context;
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        this.j = audioManager;
        this.k = WebRtcAudioManager.getSampleRate(audioManager);
        this.l = WebRtcAudioManager.getSampleRate(audioManager);
    }

    public final JavaAudioDeviceModule a() {
        Logging.a("JavaAudioDeviceModule", "createAudioDeviceModule");
        if (!this.c) {
            if (bare.c()) {
                Logging.a("JavaAudioDeviceModule", "Overriding default behavior; now using WebRTC NS!");
            }
            Logging.a("JavaAudioDeviceModule", "HW NS will not be used.");
        } else {
            Logging.a("JavaAudioDeviceModule", "HW NS will be used.");
        }
        if (!this.b) {
            if (bare.b()) {
                Logging.a("JavaAudioDeviceModule", "Overriding default behavior; now using WebRTC AEC!");
            }
            Logging.a("JavaAudioDeviceModule", "HW AEC will not be used.");
        } else {
            Logging.a("JavaAudioDeviceModule", "HW AEC will be used.");
        }
        return new JavaAudioDeviceModule(this.i, this.j, new WebRtcAudioRecord(this.i, WebRtcAudioRecord.b(), this.j, this.a, this.h, this.g, this.b, this.c, null), new WebRtcAudioTrack(this.i, this.j, this.e, this.f), this.k, this.l, this.d);
    }
}
