package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.internal.FusedLocationProviderResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class raq extends rbk {
    final /* synthetic */ rpv a;

    public raq(rpv rpvVar) {
        this.a = rpvVar;
    }

    @Override // defpackage.rbl
    public final void a(FusedLocationProviderResult fusedLocationProviderResult) {
        Status status = fusedLocationProviderResult.a;
        if (status == null) {
            this.a.c(new qnx(new Status(8, "Got null status from location service")));
        } else if (status.g == 0) {
            this.a.b(true);
        } else {
            this.a.c(qar.m(status));
        }
    }

    @Override // defpackage.rbl
    public final void b() {
    }
}
