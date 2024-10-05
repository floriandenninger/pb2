package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dyz implements dza {
    private final dxk a;
    private final String b;
    private final /* synthetic */ int c;

    public dyz(dxk dxkVar, String str, int i) {
        this.c = i;
        this.a = dxkVar;
        this.b = str;
    }

    @Override // defpackage.dza
    public final dxk a(dyn dynVar) {
        int i = this.c;
        if (i == 0) {
            dxk a = this.a.a();
            a.e(this.b, dynVar);
            return a;
        }
        if (i != 1) {
            this.a.e(this.b, dynVar);
            return this.a;
        }
        dxk a2 = this.a.a();
        a2.f(this.b, dynVar);
        return a2;
    }
}
