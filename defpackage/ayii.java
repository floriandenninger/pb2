package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayii extends ayls {
    private boolean b;
    private final Status c;
    private final ayge d;
    private final ayep[] e;

    public ayii(Status status, ayge aygeVar, ayep[] ayepVarArr, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        amkq.F(!status.f(), "error must not be OK");
        this.c = status;
        this.d = aygeVar;
        this.e = ayepVarArr;
    }

    @Override // defpackage.ayls, defpackage.aygd
    public final void b(ayiz ayizVar) {
        ayizVar.b("error", this.c);
        ayizVar.b("progress", this.d);
    }

    @Override // defpackage.ayls, defpackage.aygd
    public final void m(aygf aygfVar) {
        amkq.O(!this.b, "already started");
        this.b = true;
        for (ayep ayepVar : this.e) {
            ayepVar.o(this.c);
        }
        aygfVar.a(this.c, this.d, new aycd());
    }

    public ayii(Status status, ayep[] ayepVarArr, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this(status, ayge.PROCESSED, ayepVarArr, null, null, null);
    }
}
