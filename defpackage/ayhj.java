package defpackage;

import io.grpc.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayhj extends ayhx {
    public final aybn a;
    public final ayai b = ayai.b();
    final /* synthetic */ ayhk c;
    public final ayep[] d;

    public ayhj(ayhk ayhkVar, aybn aybnVar, ayep[] ayepVarArr, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = ayhkVar;
        this.a = aybnVar;
        this.d = ayepVarArr;
    }

    @Override // defpackage.ayhx, defpackage.aygd
    public final void b(ayiz ayizVar) {
        if (this.a.a.f()) {
            ayizVar.a("wait_for_ready");
        }
        super.b(ayizVar);
    }

    @Override // defpackage.ayhx, defpackage.aygd
    public final void c(Status status) {
        super.c(status);
        synchronized (this.c.a) {
            ayhk ayhkVar = this.c;
            if (ayhkVar.e != null) {
                boolean remove = ayhkVar.g.remove(this);
                if (!this.c.b() && remove) {
                    ayhk ayhkVar2 = this.c;
                    ayhkVar2.b.c(ayhkVar2.d);
                    ayhk ayhkVar3 = this.c;
                    if (ayhkVar3.h != null) {
                        ayhkVar3.b.c(ayhkVar3.e);
                        this.c.e = null;
                    }
                }
            }
        }
        this.c.b.b();
    }

    @Override // defpackage.ayhx
    protected final void p(Status status) {
        for (ayep ayepVar : this.d) {
            ayepVar.o(status);
        }
    }
}
