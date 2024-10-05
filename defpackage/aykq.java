package defpackage;

import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aykq implements Runnable {
    final /* synthetic */ ayks a;
    final /* synthetic */ aykt b;

    public aykq(aykt ayktVar, ayks ayksVar) {
        this.b = ayktVar;
        this.a = ayksVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.a.get() == aykx.g) {
            aykx aykxVar = this.b.c;
            if (aykxVar.w == null) {
                aykxVar.w = new LinkedHashSet();
                aykx aykxVar2 = this.b.c;
                aykxVar2.Q.c(aykxVar2.x, true);
            }
            this.b.c.w.add(this.a);
            return;
        }
        this.a.j();
    }
}
