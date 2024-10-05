package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sra extends dha {

    @dnt(a = 13)
    Boolean a;

    @dnt(a = 13)
    sww b;

    @dnt(a = 13)
    sxc c;

    @dnt(a = 13)
    sxi d;

    @dnt(a = 3)
    boolean e;

    @dnt(a = 3)
    boolean f;

    @dnt(a = 3)
    boolean g;

    @dnt(a = 13)
    syd v;

    @dnt(a = 13)
    Map w;

    @dnt(a = 13)
    axpe x;

    @dnt(a = 13)
    szl y;

    @dnt(a = 14)
    private final sqz z;

    private sra() {
        super("TextComponent");
        this.z = new sqz();
    }

    public static sqy a(dhe dheVar) {
        sqy sqyVar = new sqy();
        sqy.d(sqyVar, dheVar, new sra());
        return sqyVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void M(dhe dheVar) {
        baql baqlVar = new baql();
        baql baqlVar2 = new baql();
        baql baqlVar3 = new baql();
        baql baqlVar4 = new baql();
        srf.f(dheVar, this.x, this.b, this.y, this.c, this.v, this.w, this.d, this.f, this.g, baqlVar, baqlVar2, baqlVar3, baqlVar4);
        sqz sqzVar = this.z;
        sqzVar.c = (AtomicReference) baqlVar.a;
        sqzVar.d = (AtomicReference) baqlVar2.a;
        sqzVar.a = (AtomicReference) baqlVar3.a;
        sqzVar.b = (AtomicReference) baqlVar4.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void X(dlq dlqVar, dlq dlqVar2) {
        sqz sqzVar = (sqz) dlqVar;
        sqz sqzVar2 = (sqz) dlqVar2;
        sqzVar2.a = sqzVar.a;
        sqzVar2.b = sqzVar.b;
        sqzVar2.c = sqzVar.c;
        sqzVar2.d = sqzVar.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final boolean aa() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final boolean ac() {
        return true;
    }

    @Override // defpackage.dhk
    public final void ap() {
        sxi sxiVar = this.d;
        sqz sqzVar = this.z;
        srf.b(sxiVar, sqzVar.c, sqzVar.d, sqzVar.a, sqzVar.b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final dha b(dhe dheVar) {
        axpe axpeVar = this.x;
        sww swwVar = this.b;
        szl szlVar = this.y;
        syd sydVar = this.v;
        sxc sxcVar = this.c;
        Map map = this.w;
        sxi sxiVar = this.d;
        boolean z = this.f;
        boolean z2 = this.g;
        Boolean bool = this.a;
        sqz sqzVar = this.z;
        return srf.e(dheVar, axpeVar, swwVar, szlVar, sydVar, sxcVar, map, sxiVar, z, z2, bool, sqzVar.c, sqzVar.d, sqzVar.a, sqzVar.b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dha
    public final dlq m() {
        return this.z;
    }
}
