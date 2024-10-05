package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahqh implements ahqi {
    final /* synthetic */ ahqk a;
    private final apxf b;

    public ahqh(ahqk ahqkVar, apxf apxfVar) {
        this.a = ahqkVar;
        this.b = apxfVar;
    }

    @Override // defpackage.ahqi
    public final ahqj a(apxf apxfVar) {
        return new ahqj(this.a, apxfVar, true);
    }

    @Override // defpackage.ahqi
    public final ahqo b() {
        return ahqo.LOGGED_NEW_SCREEN;
    }

    @Override // defpackage.ahqi
    public final apxf c() {
        return this.b;
    }

    @Override // defpackage.ahqi
    public final Optional d(ahdv ahdvVar) {
        return Optional.of(new ahqf(this.a, ahdvVar.b(), ahdvVar.d()));
    }

    @Override // defpackage.ahqi
    public final void e() {
        if (this.a.a.u(this.b)) {
            this.a.a.b(this.b);
        }
    }
}
