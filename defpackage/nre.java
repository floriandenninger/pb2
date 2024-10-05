package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class nre extends nrb {
    final /* synthetic */ nrf f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nre(nrf nrfVar, String str, nqg nqgVar) {
        super(str, nqgVar);
        this.f = nrfVar;
    }

    @Override // defpackage.nrb
    public final void a(int i) {
        if (i == 5) {
            nrf nrfVar = this.f;
            String str = this.a;
            nqg nqgVar = this.b;
            nrb a = nrfVar.a(str);
            if (nrfVar.b(str) && a != null && nqgVar.equals(a.b)) {
                if (this.c == 2) {
                    super.a(4);
                    return;
                }
                return;
            }
        }
        super.a(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        super.a(5);
    }
}
