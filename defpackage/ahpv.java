package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahpv implements ahpx {
    private final ahpu a;
    private final acsm b;
    private final apxf c;

    public ahpv(ahpu ahpuVar, acsm acsmVar, apxf apxfVar) {
        this.a = ahpuVar;
        this.b = acsmVar;
        this.c = apxfVar;
    }

    @Override // defpackage.ahpx
    public final ahpy a(apxf apxfVar) {
        ahpu ahpuVar = this.a;
        return new ahpy(ahpuVar.a, ahpuVar.b, apxfVar);
    }

    @Override // defpackage.ahpx
    public final ahqo b() {
        return ahqo.LOGGED_ATTACH_WATCH_NEXT;
    }

    @Override // defpackage.ahpx
    public final ahqs c() {
        return new ahqs(this.a.a, this.b);
    }

    @Override // defpackage.ahpx
    public final apxf d() {
        return this.c;
    }

    @Override // defpackage.ahpx
    public final Optional e(ahdv ahdvVar) {
        return Optional.empty();
    }
}
