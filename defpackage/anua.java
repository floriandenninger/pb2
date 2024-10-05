package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anua extends qqc {
    final /* synthetic */ rpv a;
    final /* synthetic */ anub b;

    public anua(anub anubVar, rpv rpvVar) {
        this.b = anubVar;
        this.a = rpvVar;
    }

    @Override // defpackage.qqd
    public final void a(Status status) {
        if (this.a.d(null)) {
            if (status.c()) {
                this.b.a.b.b(null);
            } else {
                this.b.a.b.a(aobq.F(status, "Indexing error, please try again."));
            }
        }
    }
}
