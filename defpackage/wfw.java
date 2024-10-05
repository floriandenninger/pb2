package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wfw implements wfz {
    @Override // defpackage.wfv
    public final boolean a() {
        return false;
    }

    @Override // defpackage.wfz
    public final void b(wfx wfxVar) {
        zga.l("Fingerprint auth not available for pre M devices. Ignore fingerprint authenticate attempt");
        ((weo) wfxVar).f();
    }

    @Override // defpackage.wfz
    public final void c() {
        zga.l("Fingerprint auth not available for pre M devices. Ignore fingerprint cancel attempt");
    }
}
