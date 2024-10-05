package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qot extends qor {
    public final qqt b;

    public qot(qqt qqtVar, rpv rpvVar, byte[] bArr) {
        super(3, rpvVar);
        this.b = qqtVar;
    }

    @Override // defpackage.qoq
    public final boolean a(qpu qpuVar) {
        return true;
    }

    @Override // defpackage.qoq
    public final Feature[] b(qpu qpuVar) {
        return this.b.a.b;
    }

    @Override // defpackage.qor
    public final void c(qpu qpuVar) {
        this.b.a.b(qpuVar.b, this.a);
        qqj a = this.b.a.a();
        if (a != null) {
            qpuVar.f.put(a, this.b);
        }
    }

    @Override // defpackage.qor, defpackage.qow
    public final /* bridge */ /* synthetic */ void g(qpm qpmVar, boolean z) {
    }
}
