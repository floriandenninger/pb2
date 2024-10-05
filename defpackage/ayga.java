package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayga implements aygf {
    public Status a;
    final /* synthetic */ aygc b;
    public final ayaw c;

    public ayga(aygc aygcVar, ayaw ayawVar, byte[] bArr, byte[] bArr2) {
        this.b = aygcVar;
        this.c = ayawVar;
    }

    @Override // defpackage.aygf
    public final void a(Status status, ayge aygeVar, aycd aycdVar) {
        int i = aypd.a;
        ayaj f = this.b.f();
        if (status.getCode() == Status.Code.CANCELLED && f != null && f.d()) {
            ayiz ayizVar = new ayiz();
            this.b.e.b(ayizVar);
            Status status2 = Status.f;
            String valueOf = String.valueOf(ayizVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
            sb.append("ClientCall was cancelled at or after deadline. ");
            sb.append(valueOf);
            status = status2.a(sb.toString());
            aycdVar = new aycd();
        }
        this.b.b.execute(new ayfy(this, status, aycdVar));
    }

    public final void b(Status status) {
        this.a = status;
        this.b.e.c(status);
    }

    @Override // defpackage.aygf
    public final void c(aycd aycdVar) {
        int i = aypd.a;
        this.b.b.execute(new ayfw(this, aycdVar));
    }

    @Override // defpackage.ayod
    public final void d(ayoc ayocVar) {
        int i = aypd.a;
        this.b.b.execute(new ayfx(this, ayocVar));
    }

    @Override // defpackage.ayod
    public final void e() {
        if (this.b.a.a.a()) {
            return;
        }
        int i = aypd.a;
        this.b.b.execute(new ayfz(this));
    }
}
