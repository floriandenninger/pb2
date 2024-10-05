package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adjg extends adiz {
    public adjg(ypa ypaVar, aioc aiocVar, azrw azrwVar, azrw azrwVar2, adlt adltVar) {
        super(ypaVar, (adja) aiocVar.B(), azrwVar, azrwVar2, adltVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.adiz
    public final void a(adle adleVar) {
        this.a.d(new adjj(adleVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.adiz
    public final void b() {
        this.a.d(new adjh(true, aibu.DEFAULT, -1L));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.adiz
    public final void c(adle adleVar) {
        this.a.d(new adji(adleVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.adiz
    public final void d(aibu aibuVar) {
        this.a.d(new adjh(false, aibuVar, TimeUnit.MILLISECONDS.toSeconds(f().i())));
    }
}
