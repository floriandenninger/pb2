package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aflo implements swv {
    public final sxd a;
    public final shf b;

    public aflo(sxd sxdVar, shf shfVar) {
        this.a = sxdVar;
        this.b = shfVar;
    }

    @Override // defpackage.swv
    public final aomu a() {
        return aqdi.b;
    }

    @Override // defpackage.swv
    public final /* bridge */ /* synthetic */ ayph b(Object obj, swu swuVar) {
        final aqdi aqdiVar = (aqdi) obj;
        return ayph.t(new ayrm() { // from class: afln
            @Override // defpackage.ayrm
            public final void a() {
                aflo afloVar = aflo.this;
                aqdi aqdiVar2 = aqdiVar;
                sxd sxdVar = afloVar.a;
                String str = aqdiVar2.c;
                aone createBuilder = awql.a.createBuilder();
                long seconds = TimeUnit.MILLISECONDS.toSeconds(afloVar.b.c());
                createBuilder.copyOnWrite();
                awql awqlVar = (awql) createBuilder.instance;
                awqlVar.b |= 1;
                awqlVar.c = seconds;
                sxdVar.b(str, ((awql) createBuilder.build()).toByteArray());
            }
        });
    }

    @Override // defpackage.swv
    public final /* synthetic */ void c() {
    }
}
