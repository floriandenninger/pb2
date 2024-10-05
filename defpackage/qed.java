package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qed extends qeb {
    final /* synthetic */ rpv a;

    public qed(rpv rpvVar) {
        this.a = rpvVar;
    }

    @Override // defpackage.qeb
    public final void a(String str) {
        Status status;
        if (str == null) {
            status = new Status(3006);
        } else {
            status = Status.a;
        }
        qar.o(status, str, this.a);
    }
}
