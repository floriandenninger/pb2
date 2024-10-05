package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bop extends bpc {
    final String a;
    final boo b;

    public bop(String str, boo booVar) {
        this.a = str;
        this.b = booVar;
    }

    @Override // defpackage.bpc
    public final void b(int i) {
        boo booVar;
        String str = this.a;
        if (str == null || (booVar = this.b) == null) {
            return;
        }
        booVar.d(str, i);
    }

    @Override // defpackage.bpc
    public final void c(int i) {
        boo booVar;
        String str = this.a;
        if (str == null || (booVar = this.b) == null) {
            return;
        }
        booVar.e(str, i);
    }
}
