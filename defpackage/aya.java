package defpackage;

import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aya implements ayq {
    public ayh a;
    public boolean b;
    final /* synthetic */ aye c;
    public final bbx d;

    public aya(aye ayeVar, bbx bbxVar, byte[] bArr) {
        this.c = ayeVar;
        this.d = bbxVar;
    }

    @Override // defpackage.ayq
    public final void a() {
        Handler handler = this.c.j;
        pse.c(handler);
        pts.ar(handler, new Runnable() { // from class: axy
            @Override // java.lang.Runnable
            public final void run() {
                aya ayaVar = aya.this;
                if (ayaVar.b) {
                    return;
                }
                ayh ayhVar = ayaVar.a;
                if (ayhVar != null) {
                    ayhVar.p(ayaVar.d);
                }
                ayaVar.c.d.remove(ayaVar);
                ayaVar.b = true;
            }
        });
    }
}
