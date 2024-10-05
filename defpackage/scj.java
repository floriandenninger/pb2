package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class scj implements seu, sfa, ser {
    public ansd a = ansd.NOT_ASKED;
    public ser b;
    private final gxa c;

    public scj(gxa gxaVar, ser serVar) {
        this.c = gxaVar;
        this.b = serVar;
    }

    @Override // defpackage.sfa
    public final void a() {
        if (this.c.a()) {
            this.a = ansd.PREVIOUSLY_GRANTED;
            ser serVar = this.b;
            if (serVar != null) {
                serVar.d();
                return;
            }
            return;
        }
        gxa gxaVar = this.c;
        if (gxaVar.a()) {
            d();
            return;
        }
        aone createBuilder = atub.a.createBuilder();
        atua atuaVar = gxaVar.b;
        createBuilder.copyOnWrite();
        atub atubVar = (atub) createBuilder.instance;
        atubVar.c = atuaVar.m;
        atubVar.b |= 1;
        gxaVar.a.d((atub) createBuilder.build(), new gwz(this));
    }

    @Override // defpackage.seu
    public final void b() {
        this.b = null;
    }

    @Override // defpackage.seu
    public final void c(sev sevVar) {
    }

    @Override // defpackage.ser
    public final void d() {
        this.a = ansd.GRANTED;
        ser serVar = this.b;
        if (serVar != null) {
            serVar.d();
        }
    }
}
