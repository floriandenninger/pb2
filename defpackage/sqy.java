package defpackage;

import java.util.BitSet;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sqy extends dgy {
    sra a;
    private final String[] d = {"commandResolver", "conversionContext", "drawableRequester", "logger", "styleRunExtensionConverters", "textType", "typefaceProvider"};
    private final BitSet e = new BitSet(7);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void d(sqy sqyVar, dhe dheVar, sra sraVar) {
        super.w(dheVar, sraVar);
        sqyVar.a = sraVar;
        sqyVar.e.clear();
    }

    @Override // defpackage.dgy
    protected final void b(dha dhaVar) {
        this.a = (sra) dhaVar;
    }

    @Override // defpackage.dgy
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final sra a() {
        o(7, this.e, this.d);
        return this.a;
    }

    public final void e(sww swwVar) {
        this.a.b = swwVar;
        this.e.set(0);
    }

    public final void f(sxc sxcVar) {
        this.a.c = sxcVar;
        this.e.set(1);
    }

    public final void g(sxi sxiVar) {
        this.a.d = sxiVar;
        this.e.set(2);
    }

    public final void h(syd sydVar) {
        this.a.v = sydVar;
        this.e.set(3);
    }

    public final void i(Map map) {
        this.a.w = map;
        this.e.set(4);
    }

    public final void j(axpe axpeVar) {
        this.a.x = axpeVar;
        this.e.set(5);
    }

    public final void k(szl szlVar) {
        this.a.y = szlVar;
        this.e.set(6);
    }
}
