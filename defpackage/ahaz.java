package defpackage;

import android.media.AudioDeviceCallback;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahaz {
    public final adxl a;
    public final aifs b;
    public final AudioDeviceCallback c;

    public ahaz(adxl adxlVar, aifs aifsVar) {
        this.a = adxlVar;
        this.b = aifsVar;
        this.c = Build.VERSION.SDK_INT >= 23 ? new ahay(this) : null;
    }
}
