package defpackage;

import android.util.Log;
import android.view.Display;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bgx {
    public final /* synthetic */ bhd a;

    public final void a(Display display) {
        bhd bhdVar = this.a;
        if (display == null) {
            Log.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            bhdVar.i = -9223372036854775807L;
            bhdVar.j = -9223372036854775807L;
        } else {
            double refreshRate = display.getRefreshRate();
            Double.isNaN(refreshRate);
            long j = (long) (1.0E9d / refreshRate);
            bhdVar.i = j;
            bhdVar.j = (j * 80) / 100;
        }
    }
}
