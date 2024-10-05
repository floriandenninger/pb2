package defpackage;

import android.text.Spanned;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class absj implements Runnable {
    final /* synthetic */ absm a;
    final /* synthetic */ abwl b;

    public absj(absm absmVar, abwl abwlVar, byte[] bArr) {
        this.a = absmVar;
        this.b = abwlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.a.c);
        String.valueOf(valueOf).length();
        String.valueOf(valueOf2).length();
        abwl abwlVar = this.b;
        absl abslVar = this.a.c;
        abwy abwyVar = abwlVar.a;
        if (abslVar == null || !abwyVar.S) {
            return;
        }
        Spanned spanned = abslVar.b;
        String obj = spanned == null ? null : spanned.toString();
        String valueOf3 = String.valueOf(obj);
        if (valueOf3.length() != 0) {
            "onHealthStatusChanged: ".concat(valueOf3);
        }
        if (abslVar.a == 2) {
            abwyVar.m(abww.BAD, obj);
        } else {
            abwyVar.m(abww.GOOD, obj);
        }
    }
}
