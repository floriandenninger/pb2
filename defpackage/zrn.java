package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zrn implements Runnable {
    final /* synthetic */ zrs a;
    private final /* synthetic */ int b;

    public zrn(zrs zrsVar, int i) {
        this.b = i;
        this.a = zrsVar;
    }

    public /* synthetic */ zrn(zrs zrsVar, int i, byte[] bArr) {
        this.b = i;
        this.a = zrsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            zrs zrsVar = this.a;
            zpi zpiVar = zrsVar.t;
            if (zpiVar != null) {
                zpiVar.b();
            }
            zrsVar.i.k.a(null);
            zrsVar.i.m(true);
            return;
        }
        if (this.a.n || !this.a.o) {
            return;
        }
        zrs zrsVar2 = this.a;
        if (!zrsVar2.i.D || !zrsVar2.C() || !this.a.j.h()) {
            this.a.A();
            return;
        }
        zrs zrsVar3 = this.a;
        zqg zqgVar = zrsVar3.j;
        zqgVar.g = zrsVar3.p;
        zqgVar.e.clear();
        List list = zqgVar.j;
        if (list != null) {
            zqgVar.e.addAll(list);
            zqgVar.b.k();
        }
    }
}
