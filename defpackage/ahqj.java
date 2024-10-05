package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahqj implements ahqi {
    final /* synthetic */ ahqk a;
    private final apxf b;
    private final boolean c;

    public ahqj(ahqk ahqkVar, apxf apxfVar, boolean z) {
        this.a = ahqkVar;
        this.b = apxfVar;
        this.c = z;
    }

    @Override // defpackage.ahqi
    public final ahqj a(apxf apxfVar) {
        return new ahqj(this.a, apxfVar, true);
    }

    @Override // defpackage.ahqi
    public final ahqo b() {
        return ahqo.NEW;
    }

    @Override // defpackage.ahqi
    public final apxf c() {
        return this.b;
    }

    @Override // defpackage.ahqi
    public final Optional d(ahdv ahdvVar) {
        return Optional.of(new ahqh(this.a, ahdvVar.d()));
    }

    @Override // defpackage.ahqi
    public final void e() {
        if (this.c) {
            this.a.a.k(this.b);
        }
        ahpe ahpeVar = this.a.a;
        ahpeVar.p(ahpeVar.v(this.b));
    }
}
