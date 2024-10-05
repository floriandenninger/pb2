package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class qzk extends qpb {
    public qzk(qof qofVar) {
        super(qza.a, qofVar);
    }

    protected abstract void b(qzq qzqVar);

    @Override // defpackage.qpb
    protected final /* bridge */ /* synthetic */ void c(qnq qnqVar) {
        qzo qzoVar = (qzo) qnqVar;
        Context context = qzoVar.q;
        b((qzq) qzoVar.D());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qpb, defpackage.qpc
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        super.n(obj);
    }
}
