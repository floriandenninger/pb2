package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jrf implements ftf {
    private aput a;

    public jrf(aput aputVar) {
        this.a = aputVar;
    }

    @Override // defpackage.ftf
    public final CharSequence a() {
        return this.a.c;
    }

    @Override // defpackage.ftf
    public final /* synthetic */ Object b() {
        return this.a;
    }

    @Override // defpackage.ftf
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        aput aputVar = (aput) obj;
        aputVar.getClass();
        this.a = aputVar;
    }

    @Override // defpackage.ftf
    public final boolean d() {
        return this.a.d;
    }
}
