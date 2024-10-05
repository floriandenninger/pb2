package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yqt implements ayqd {
    final /* synthetic */ Callable a;
    private ayqx b;

    public yqt(Callable callable) {
        this.a = callable;
    }

    private final void e() {
        ayqx ayqxVar = this.b;
        if (ayqxVar != null && !ayqxVar.e()) {
            this.b.qc();
        }
        this.b = null;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        e();
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 76);
        sb.append("Lifecycle-scoped subscription disposed due to unrelated error in lifecycle: ");
        sb.append(valueOf);
        zga.d(sb.toString(), th);
    }

    @Override // defpackage.ayqd
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            e();
            return;
        }
        if (this.b == null) {
            try {
                ayqx ayqxVar = (ayqx) this.a.call();
                ayqxVar.getClass();
                this.b = ayqxVar;
            } catch (Exception e) {
                throw new yqu(e);
            }
        }
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
    }

    @Override // defpackage.ayqd
    public final void sh() {
        e();
    }
}
