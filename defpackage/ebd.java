package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ebd implements Runnable {
    final /* synthetic */ ebe a;
    private final /* synthetic */ int b;

    public ebd(ebe ebeVar, int i) {
        this.b = i;
        this.a = ebeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            ebe ebeVar = this.a;
            try {
                if (ebeVar.e == null && ebeVar.h) {
                    pvh pvhVar = new pvh(ebeVar.a, 30000L, false);
                    pvhVar.c(true);
                    ebeVar.e = pvhVar;
                    return;
                }
                return;
            } catch (IOException | qnk | qnl unused) {
                ebeVar.e = null;
                return;
            }
        }
        pyi.b(this.a.a);
    }
}
