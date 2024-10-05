package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rni implements rmt {
    private final Status a;
    private final qrj b;

    public rni(Status status, qrj qrjVar) {
        this.a = status;
        this.b = qrjVar;
    }

    @Override // defpackage.qom
    public final Status a() {
        return this.a;
    }

    @Override // defpackage.qoj
    public final void b() {
        qrj qrjVar = this.b;
        if (qrjVar != null) {
            qrjVar.b();
        }
    }

    @Override // defpackage.rmt
    public final qrj c() {
        return this.b;
    }
}
