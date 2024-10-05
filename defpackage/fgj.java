package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fgj extends fgi {
    private final ypa f;
    private final azrw g;

    public fgj(azrw azrwVar, shf shfVar, ypa ypaVar) {
        super(azrwVar, shfVar);
        this.g = azrwVar;
        ypaVar.getClass();
        this.f = ypaVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fgi
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        this.f.d(new fec());
    }

    @Override // defpackage.fgi
    protected final /* bridge */ /* synthetic */ void i(aasw aaswVar, aaqh aaqhVar, afwx afwxVar) {
        abbu abbuVar = (abbu) aaswVar;
        abbp abbpVar = (abbp) aaqhVar;
        this.f.d(new fed());
        abbuVar.b.i(abbpVar, afwxVar);
        abbpVar.p = new abbq(abbuVar);
    }

    public final abbp n(Uri uri, String str) {
        abbu abbuVar = (abbu) this.g.get();
        return new abbp(abbuVar.f, abbuVar.a.c(), uri, str, null, null, null);
    }

    public final void o(Uri uri, String str, afwx afwxVar) {
        h(n(uri, str), afwxVar);
    }
}
