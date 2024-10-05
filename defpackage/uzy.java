package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class uzy implements ComponentCallbacks2 {
    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        uzx.b();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        uzx.c(i);
    }
}
