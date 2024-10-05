package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class kou implements fmy {
    final /* synthetic */ kow a;

    public kou(kow kowVar) {
        this.a = kowVar;
    }

    @Override // defpackage.fmy
    public final void a(long j) {
        Iterator it = this.a.b.iterator();
        while (it.hasNext()) {
            ((fmy) it.next()).a(j);
        }
    }

    @Override // defpackage.fmy
    public final void b(long j, boolean z) {
        Iterator it = this.a.b.iterator();
        while (it.hasNext()) {
            ((fmy) it.next()).b(j, z);
        }
    }
}
