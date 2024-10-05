package defpackage;

import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qho extends ji {
    private final qhn a;

    static {
        new qkw("MediaRouterCallback");
    }

    public qho(qhn qhnVar) {
        qip.an(qhnVar);
        this.a = qhnVar;
    }

    @Override // defpackage.ji
    public final void j(bpv bpvVar) {
        try {
            this.a.a(bpvVar.c, bpvVar.q);
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.ji
    public final void k(bpv bpvVar) {
        try {
            this.a.f(bpvVar.c, bpvVar.q);
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.ji
    public final void l(bpv bpvVar) {
        try {
            this.a.g(bpvVar.c, bpvVar.q);
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.ji
    public final void p(bpv bpvVar, int i) {
        if (bpvVar.k != 1) {
            return;
        }
        try {
            this.a.h(bpvVar.c, bpvVar.q);
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.ji
    public final void r(bpv bpvVar, int i) {
        if (bpvVar.k != 1) {
            return;
        }
        try {
            this.a.i(bpvVar.c, bpvVar.q, i);
        } catch (RemoteException unused) {
        }
    }
}
