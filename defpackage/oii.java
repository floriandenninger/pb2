package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oii implements aioa, wom, ypd {
    public final ajpd a;
    public frp b;
    public aqcg c;
    final oih d;
    public ftt e;
    private final sxd f;
    private boolean g = false;
    private boolean h = false;

    public oii(sxd sxdVar) {
        ajpd ajpdVar = new ajpd();
        this.a = ajpdVar;
        this.f = sxdVar;
        oih oihVar = new oih(this);
        this.d = oihVar;
        ajpdVar.i(oihVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ahef ahefVar) {
        oih oihVar = this.d;
        oihVar.a = ahefVar.c();
        if (oihVar.a == aign.NEW) {
            oihVar.b.d(false);
        } else if (oihVar.a == aign.VIDEO_REQUESTED) {
            oihVar.f();
        }
        int ordinal = ahefVar.c().ordinal();
        if (ordinal == 0) {
            this.g = false;
            this.h = false;
        } else if (ordinal == 7 && !this.h) {
            this.h = true;
            this.g = ahefVar.b() != null;
            b();
            c();
        }
    }

    public final void b() {
        ftt fttVar;
        ftt fttVar2;
        if (!this.h || (fttVar = this.e) == null || this.a.contains(fttVar) || !this.g || this.a.size() != 0 || (fttVar2 = this.e) == null) {
            return;
        }
        this.a.add(fttVar2);
    }

    public final void c() {
        aqcg aqcgVar;
        if (this.g && this.a.size() == 0 && this.h && (aqcgVar = this.c) != null) {
            this.a.add(aqcgVar);
        }
    }

    public final void d(boolean z) {
        aone createBuilder = aqdf.a.createBuilder();
        createBuilder.copyOnWrite();
        aqdf aqdfVar = (aqdf) createBuilder.instance;
        aqdfVar.c |= 1;
        aqdfVar.d = z;
        this.f.b(aalt.d(aqdf.b.a(), "COMPANION_AD_SLOT_STATE_CLIENT"), ((aqdf) createBuilder.build()).toByteArray());
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        return new ayqx[]{aiocVar.G().b.Y(new ayrs() { // from class: oig
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                oii.this.a((ahef) obj);
            }
        }, nua.r)};
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahef.class};
        }
        if (i == 0) {
            a((ahef) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
