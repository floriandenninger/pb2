package defpackage;

import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aduv extends CronetEngine.Builder.LibraryLoader {
    final /* synthetic */ aduw a;

    public aduv(aduw aduwVar) {
        this.a = aduwVar;
    }

    @Override // org.chromium.net.CronetEngine.Builder.LibraryLoader
    public final void loadLibrary(String str) {
        yny.g(this.a.a, str);
    }
}
