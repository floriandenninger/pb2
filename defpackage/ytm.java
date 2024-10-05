package defpackage;

import android.content.Context;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ytm extends CronetEngine.Builder.LibraryLoader {
    final /* synthetic */ Context a;

    public ytm(Context context) {
        this.a = context;
    }

    @Override // org.chromium.net.CronetEngine.Builder.LibraryLoader
    public final void loadLibrary(String str) {
        yny.g(this.a, str);
    }
}
