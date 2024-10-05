package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahqa implements ahpw {
    public final apxf a;
    private final acsl b;

    public ahqa(acsl acslVar, apxf apxfVar) {
        this.b = acslVar;
        this.a = apxfVar;
    }

    @Override // defpackage.ahpw
    public final /* bridge */ /* synthetic */ ahpx a(ahpe ahpeVar) {
        acsl acslVar;
        if (ahpeVar.u(this.a)) {
            acslVar = ahpeVar.b(this.a);
        } else {
            acslVar = this.b;
        }
        return new ahqb(this, acslVar);
    }

    @Override // defpackage.ahpw
    public final ahqo b() {
        return ahqo.LOGGED_NEW_SCREEN;
    }
}
