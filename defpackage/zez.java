package defpackage;

import android.content.Context;
import android.media.AudioManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zez {
    private final AudioManager a;
    private final int b;

    public zez(Context context) {
        context.getClass();
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        this.a = audioManager;
        this.b = audioManager.getStreamMaxVolume(3);
    }

    public final int a() {
        if (this.b == 0) {
            return 0;
        }
        return (this.a.getStreamVolume(3) * 100) / this.b;
    }
}
