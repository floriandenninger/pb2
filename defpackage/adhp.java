package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adhp implements aioa {
    final /* synthetic */ adhq a;
    private final /* synthetic */ int b;

    public adhp(adhq adhqVar, int i) {
        this.b = i;
        this.a = adhqVar;
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        if (this.b == 0) {
            return new ayqx[]{aiocVar.ao().X(new ayrs() { // from class: adho
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    adhp adhpVar = adhp.this;
                    if (((ahdv) obj).c().a(aigk.NEW)) {
                        adhpVar.a.e();
                    }
                }
            })};
        }
        final byte[] bArr = null;
        return new ayqx[]{aiocVar.G().i.X(new ayrs(bArr) { // from class: adhn
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                adhp adhpVar = adhp.this;
                if (((ahej) obj).a() == 2) {
                    adhpVar.a.e();
                }
            }
        })};
    }
}
