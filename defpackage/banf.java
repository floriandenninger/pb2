package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class banf implements banj, bani {
    public volatile banj a;
    public volatile bani b;
    private final String c = "T";
    private final banj d;

    public banf(banj banjVar) {
        this.d = banjVar;
    }

    @Override // defpackage.banj
    public final int a(bakb bakbVar) {
        banj banjVar = this.d;
        banj banjVar2 = this.a;
        int a = banjVar.a(bakbVar) + banjVar2.a(bakbVar);
        return banjVar2.b(bakbVar, 1) > 0 ? a + this.c.length() : a;
    }

    @Override // defpackage.banj
    public final int b(bakb bakbVar, int i) {
        int b = this.d.b(bakbVar, i);
        return b < i ? b + this.a.b(bakbVar, i) : b;
    }

    @Override // defpackage.banj
    public final void c(StringBuffer stringBuffer, bakb bakbVar) {
        banj banjVar = this.d;
        banj banjVar2 = this.a;
        banjVar.c(stringBuffer, bakbVar);
        if (banjVar2.b(bakbVar, 1) > 0) {
            stringBuffer.append(this.c);
        }
        banjVar2.c(stringBuffer, bakbVar);
    }
}
