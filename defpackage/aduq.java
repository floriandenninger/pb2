package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aduq implements aftf, ypd {
    public final afte a;
    public final ypa b;
    public final afcu c;
    private final aemv d;
    private final adyl e;
    private final aejn f;
    private final adyj g;
    private final axpg h;
    private final afhs i;

    public aduq(aemv aemvVar, adyl adylVar, aejn aejnVar, adyj adyjVar, afte afteVar, afhs afhsVar, axpg axpgVar, ypa ypaVar, afcu afcuVar) {
        this.d = aemvVar;
        this.e = adylVar;
        this.f = aejnVar;
        this.g = adyjVar;
        this.a = afteVar;
        this.i = afhsVar;
        this.h = axpgVar;
        this.b = ypaVar;
        this.c = afcuVar;
    }

    public final void a(boolean z) {
        this.d.A(z);
    }

    @Override // defpackage.aftf
    public final void j() {
    }

    @Override // defpackage.aftf
    public final void k() {
        if (this.i.p().aD) {
            this.e.k();
            this.f.a.evictAll();
            this.g.a.c();
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aftb.class, aftm.class, afto.class};
        }
        if (i != 0) {
            if (i == 1) {
                ((afgb) this.h.get()).d();
                return null;
            }
            if (i == 2) {
                ((afgb) this.h.get()).d();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        if (!this.i.p().aG) {
            return null;
        }
        adyl adylVar = this.e;
        adylVar.k();
        apdf a = apdg.a();
        apdh apdhVar = apdh.ANDROID_MEDIA_CACHE_WIPEOUT_REASON_ON_ACCOUNT_REMOVED;
        a.copyOnWrite();
        ((apdg) a.instance).d(apdhVar);
        apdg apdgVar = (apdg) a.build();
        arpn a2 = arpp.a();
        a2.copyOnWrite();
        ((arpp) a2.instance).cj(apdgVar);
        adylVar.c.c((arpp) a2.build());
        return null;
    }

    @Override // defpackage.aftf
    public final /* synthetic */ void l() {
    }
}
