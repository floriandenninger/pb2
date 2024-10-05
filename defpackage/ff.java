package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ff implements Runnable {
    final /* synthetic */ Typeface a;
    final /* synthetic */ fh b;

    public ff(fh fhVar, Typeface typeface) {
        this.b = fhVar;
        this.a = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a(this.a);
    }
}
