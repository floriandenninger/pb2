package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ejt implements wub {
    public ejr a;
    private final azrw b;

    public ejt(azrw azrwVar) {
        azrwVar.getClass();
        this.b = azrwVar;
    }

    @Override // defpackage.wub
    public final wsx a(wsw wswVar, xgh xghVar, xev xevVar) {
        if (xghVar.c() != apae.SLOT_TYPE_FULLSCREEN_ENGAGEMENT) {
            throw new wua("FullscreenEngagementLayoutRenderingAdapterFactory received unsupported slot");
        }
        if (!whl.e(ejs.class, xghVar, xevVar)) {
            throw new wua("FullscreenEngagementLayoutRenderingAdapterFactory received unsupported metadata");
        }
        ejr ejrVar = this.a;
        if (ejrVar == null) {
            throw new wua("FullscreenEngagementLayoutRenderingAdapterFactory has no controller registered yet.");
        }
        return new ejs(ejrVar, (wsw) this.b.get(), xghVar, xevVar);
    }
}
