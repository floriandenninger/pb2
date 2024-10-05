package defpackage;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ykh implements ComponentCallbacks {
    final /* synthetic */ aypz a;

    public ykh(aypz aypzVar) {
        this.a = aypzVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        if (this.a.e()) {
            return;
        }
        this.a.d(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
