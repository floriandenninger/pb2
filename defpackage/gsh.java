package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class gsh implements azrw {
    public final /* synthetic */ aaxr a;
    private final /* synthetic */ int b;

    public /* synthetic */ gsh(aaxr aaxrVar, int i) {
        this.b = i;
        this.a = aaxrVar;
    }

    @Override // defpackage.azrw
    public final Object get() {
        int i = this.b;
        if (i == 0) {
            aaxr aaxrVar = this.a;
            return new aaxs(aaxrVar.f, aaxrVar.a.c(), null, null, null);
        }
        if (i != 1) {
            aaxr aaxrVar2 = this.a;
            return new aaxt(aaxrVar2.f, aaxrVar2.a.c(), null, null, null);
        }
        aaxr aaxrVar3 = this.a;
        return new aaxo(aaxrVar3.f, aaxrVar3.a.c(), null, null, null);
    }
}
