package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adnq implements aioa {
    final /* synthetic */ adnr a;

    public adnq(adnr adnrVar) {
        this.a = adnrVar;
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        return new ayqx[]{aiocVar.G().a.X(new ayrs() { // from class: adnp
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                adnq adnqVar = adnq.this;
                ahef ahefVar = (ahef) obj;
                if (!adnqVar.a.g && ahefVar.c().a(aign.VIDEO_PLAYING) && adnqVar.a.b.a == 1) {
                    adnqVar.a.e();
                }
            }
        })};
    }
}
