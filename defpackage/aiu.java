package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aiu implements Runnable {
    final /* synthetic */ ajh a;
    final /* synthetic */ Typeface b;

    public aiu(ajh ajhVar, Typeface typeface) {
        this.a = ajhVar;
        this.b = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ajh ajhVar = this.a;
        Typeface typeface = this.b;
        fh fhVar = ajhVar.a;
        if (fhVar != null) {
            fhVar.a(typeface);
        }
    }
}
