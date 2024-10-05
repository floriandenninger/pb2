package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qov extends qor {
    public final qqj b;

    public qov(qqj qqjVar, rpv rpvVar) {
        super(4, rpvVar);
        this.b = qqjVar;
    }

    @Override // defpackage.qoq
    public final boolean a(qpu qpuVar) {
        return ((qqt) qpuVar.f.get(this.b)) != null;
    }

    @Override // defpackage.qoq
    public final Feature[] b(qpu qpuVar) {
        qqt qqtVar = (qqt) qpuVar.f.get(this.b);
        if (qqtVar == null) {
            return null;
        }
        return qqtVar.a.b;
    }

    @Override // defpackage.qor
    public final void c(qpu qpuVar) {
        qqt qqtVar = (qqt) qpuVar.f.remove(this.b);
        if (qqtVar != null) {
            qrh qrhVar = qqtVar.b;
            qrhVar.a.b.a(qpuVar.b, this.a);
            qqtVar.a.a.a();
            return;
        }
        this.a.d(false);
    }

    @Override // defpackage.qor, defpackage.qow
    public final /* bridge */ /* synthetic */ void g(qpm qpmVar, boolean z) {
    }
}
