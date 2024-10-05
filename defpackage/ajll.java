package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajll extends ajlj {
    final ctm c;

    public ajll(cuk cukVar, ctm ctmVar, aef aefVar) {
        super(cukVar, aefVar);
        this.c = ctmVar;
    }

    @Override // defpackage.ajlj
    protected final ctd f(afpz afpzVar) {
        return new ajlk(afpzVar, this.c);
    }

    @Override // defpackage.ajlj
    protected final boolean h(ctd ctdVar) {
        return ctdVar instanceof ajlk;
    }
}
