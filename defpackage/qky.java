package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qky implements qlb {
    final /* synthetic */ qlb a;
    final /* synthetic */ qla b;
    private final /* synthetic */ int c;

    public qky(qla qlaVar, qlb qlbVar, int i) {
        this.c = i;
        this.b = qlaVar;
        this.a = qlbVar;
    }

    @Override // defpackage.qlb
    public final void b(long j) {
        if (this.c != 0) {
            qlb qlbVar = this.a;
            if (qlbVar != null) {
                qlbVar.b(j);
                return;
            }
            return;
        }
        qlb qlbVar2 = this.a;
        if (qlbVar2 != null) {
            qlbVar2.b(j);
        }
    }

    @Override // defpackage.qlb
    public final void a(long j, int i, Object obj) {
        if (this.c != 0) {
            this.b.h = null;
            qlb qlbVar = this.a;
            if (qlbVar != null) {
                qlbVar.a(j, i, obj);
                return;
            }
            return;
        }
        if (this.a != null) {
            if (i == 2001) {
                qla qlaVar = this.b;
                qlaVar.a.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", Integer.valueOf(qlaVar.i));
                Iterator it = this.b.E.a.d.iterator();
                while (it.hasNext()) {
                    ((qip) it.next()).g();
                }
                i = 2001;
            }
            this.a.a(j, i, obj);
        }
    }
}
