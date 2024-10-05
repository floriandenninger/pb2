package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajcr extends fh {
    final /* synthetic */ String a;

    public ajcr(String str) {
        this.a = str;
    }

    @Override // defpackage.fh
    public final void a(Typeface typeface) {
        synchronized (ajct.s) {
            ajct.s.put(this.a, typeface);
        }
    }

    @Override // defpackage.fh
    public final void e() {
    }
}
