package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jdq implements akbl {
    final /* synthetic */ adah a;
    final /* synthetic */ apxf b;
    final /* synthetic */ jds c;

    public jdq(jds jdsVar, adah adahVar, apxf apxfVar) {
        this.c = jdsVar;
        this.a = adahVar;
        this.b = apxfVar;
    }

    @Override // defpackage.akbl
    public final /* synthetic */ void li(Object obj, int i) {
        String str = jds.a;
        String.format("onDismissed with event=%s", Integer.valueOf(i));
        if (i != 1) {
            if (this.a.d) {
                this.c.g.b();
            } else {
                final aczv aczvVar = this.c.g;
                ((vgz) aczvVar.a.get()).b(new amml() { // from class: aczt
                    @Override // defpackage.amml
                    public final Object apply(Object obj2) {
                        aczv aczvVar2 = aczv.this;
                        awvd awvdVar = (awvd) obj2;
                        String.format("RecordingIgnored: [id=%s][ignoredCount=%s]", awvdVar.c, Integer.valueOf(awvdVar.d));
                        if (awvdVar.d + 1 < 3) {
                            aone createBuilder = awvd.a.createBuilder();
                            String str2 = awvdVar.c;
                            createBuilder.copyOnWrite();
                            awvd awvdVar2 = (awvd) createBuilder.instance;
                            str2.getClass();
                            awvdVar2.b |= 1;
                            awvdVar2.c = str2;
                            int i2 = awvdVar.d;
                            createBuilder.copyOnWrite();
                            awvd awvdVar3 = (awvd) createBuilder.instance;
                            awvdVar3.b = 2 | awvdVar3.b;
                            awvdVar3.d = i2 + 1;
                            return (awvd) createBuilder.build();
                        }
                        aczvVar2.b.a(awvdVar.c);
                        return awvd.a;
                    }
                }, aczvVar.c);
            }
        }
        jds jdsVar = this.c;
        jdsVar.i = null;
        jdsVar.a().q(new acqx(acrb.MDX_AUTOCONNECT_PROMPT_ACTION_BUTTON), null);
        jdsVar.a().q(new acqx(acrb.MDX_AUTOCONNECT_PROMPT_DISMISS_BUTTON), null);
        jdsVar.a().t();
    }

    @Override // defpackage.akbl
    public final /* synthetic */ void lj(Object obj) {
        String str = jds.a;
        jds jdsVar = this.c;
        jdsVar.i = (akby) obj;
        if (this.a.c) {
            jdsVar.h.a();
        }
        jds jdsVar2 = this.c;
        jdsVar2.a().d(acsb.b(125598), this.b, null);
        jdsVar2.a().n(new acqx(acrb.MDX_AUTOCONNECT_PROMPT_ACTION_BUTTON));
        jdsVar2.a().n(new acqx(acrb.MDX_AUTOCONNECT_PROMPT_DISMISS_BUTTON));
    }
}
