package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class qik implements qon {
    public final /* synthetic */ qio a;
    private final /* synthetic */ int b;

    public /* synthetic */ qik(qio qioVar, int i) {
        this.b = i;
        this.a = qioVar;
    }

    @Override // defpackage.qon
    public final void a(qom qomVar) {
        if (this.b == 0) {
            qio qioVar = this.a;
            Status a = ((qjh) qomVar).a();
            int i = a.g;
            if (i != 0) {
                qioVar.a.d(String.format("Error fetching queue items, statusCode=%s, statusMessage=%s", Integer.valueOf(i), a.h), new Object[0]);
            }
            qioVar.i = null;
            if (qioVar.h.isEmpty()) {
                return;
            }
            qioVar.h();
            return;
        }
        qio qioVar2 = this.a;
        Status a2 = ((qjh) qomVar).a();
        int i2 = a2.g;
        if (i2 != 0) {
            qioVar2.a.d(String.format("Error fetching queue item ids, statusCode=%s, statusMessage=%s", Integer.valueOf(i2), a2.h), new Object[0]);
        }
        qioVar2.j = null;
        if (qioVar2.h.isEmpty()) {
            return;
        }
        qioVar2.h();
    }
}
