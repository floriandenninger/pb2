package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wzw extends dha {

    @dnt(a = 13)
    aovz a;

    @dnt(a = 13)
    tdv b;

    @dnt(a = 10)
    dha c;

    @dnt(a = 13)
    sww d;

    public wzw() {
        super("ActiveViewDisplayContainerType");
    }

    @Override // defpackage.dhk, defpackage.dix
    public final Object K(diy diyVar, Object obj) {
        int i = diyVar.b;
        if (i == -1782007764) {
            dji djiVar = diyVar.a;
            View view = ((djs) obj).a;
            wzw wzwVar = (wzw) djiVar;
            wzwVar.b.d(wzwVar.a.f);
            return null;
        }
        if (i == -1048037474) {
            N((dhe) diyVar.c[0], (diw) obj);
            return null;
        }
        if (i != 1749548209) {
            return null;
        }
        dji djiVar2 = diyVar.a;
        View view2 = ((dmy) obj).a;
        wzw wzwVar2 = (wzw) djiVar2;
        sww swwVar = wzwVar2.d;
        tdv tdvVar = wzwVar2.b;
        aovz aovzVar = wzwVar2.a;
        tdvVar.b(aovzVar.f, view2, new wzy(swwVar, aovzVar));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final dha b(dhe dheVar) {
        dha dhaVar = this.c;
        dnc a = dnd.a(dheVar);
        a.e(dhaVar);
        a.R(H(wzw.class, dheVar, 1749548209, new Object[]{dheVar}));
        a.K(H(wzw.class, dheVar, -1782007764, new Object[]{dheVar}));
        return a.a();
    }

    @Override // defpackage.dha
    public final /* bridge */ /* synthetic */ dha j() {
        wzw wzwVar = (wzw) super.j();
        dha dhaVar = wzwVar.c;
        wzwVar.c = dhaVar != null ? dhaVar.j() : null;
        return wzwVar;
    }
}
