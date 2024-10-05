package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class banb implements bane {
    private final bane a;
    private final bane b;

    public banb(bane baneVar, bane baneVar2) {
        this.a = baneVar;
        this.b = baneVar2;
    }

    @Override // defpackage.bane
    public final int a(int i) {
        return this.a.a(i) + this.b.a(i);
    }

    @Override // defpackage.bane
    public final void b(StringBuffer stringBuffer, int i) {
        this.a.b(stringBuffer, i);
        this.b.b(stringBuffer, i);
    }
}
