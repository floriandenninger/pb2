package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jhe {
    public static final long a = TimeUnit.MINUTES.toSeconds(30);
    public final azrw b;
    public final afsy c;
    public final agdu d;
    public final azrw e;
    public final fjs f;
    public final agpd g;
    public final aais h;
    public final shf i;
    private final Executor j;
    private final fjq k;

    public jhe(azrw azrwVar, afsy afsyVar, agdu agduVar, Executor executor, azrw azrwVar2, fjs fjsVar, fjq fjqVar, agpd agpdVar, aais aaisVar, shf shfVar) {
        this.b = azrwVar;
        this.c = afsyVar;
        this.d = agduVar;
        this.j = executor;
        this.e = azrwVar2;
        this.f = fjsVar;
        this.k = fjqVar;
        this.g = agpdVar;
        this.h = aaisVar;
        this.i = shfVar;
    }

    public final void a() {
        if (this.k.a()) {
            final int i = 0;
            this.j.execute(new Runnable(this) { // from class: jhd
                public final /* synthetic */ jhe a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (i != 0) {
                        jhe jheVar = this.a;
                        if (jheVar.f.f()) {
                            try {
                                agpd agpdVar = jheVar.g;
                                aone createBuilder = atpq.a.createBuilder();
                                createBuilder.copyOnWrite();
                                atpq atpqVar = (atpq) createBuilder.instance;
                                atpqVar.c = 2;
                                atpqVar.b = 1 | atpqVar.b;
                                String d = fhe.d();
                                createBuilder.copyOnWrite();
                                atpq atpqVar2 = (atpq) createBuilder.instance;
                                d.getClass();
                                atpqVar2.b = 2 | atpqVar2.b;
                                atpqVar2.d = d;
                                agpdVar.d((atpq) createBuilder.build());
                                return;
                            } catch (agpe e) {
                                String valueOf = String.valueOf(e.getMessage());
                                zga.b(valueOf.length() != 0 ? "Couldn't delete: ".concat(valueOf) : new String("Couldn't delete: "));
                                return;
                            }
                        }
                        return;
                    }
                    jhe jheVar2 = this.a;
                    asxi asxiVar = (asxi) jheVar2.h.a(jheVar2.c.c()).f(fhe.d()).g(asxi.class).X();
                    if (asxiVar != null) {
                        aakt b = asxiVar.b.b(asxiVar.c.f);
                        amkq.O(b == null || (b instanceof auld), "entityFromStore is not instance of RefreshEntityModel, key=refresh");
                        auld auldVar = (auld) b;
                        if (auldVar != null && TimeUnit.MILLISECONDS.toSeconds(jheVar2.i.c()) - auldVar.getRefreshTime().longValue() < jhe.a) {
                            return;
                        }
                    }
                    try {
                        agpd agpdVar2 = jheVar2.g;
                        aone createBuilder2 = atpq.a.createBuilder();
                        createBuilder2.copyOnWrite();
                        atpq atpqVar3 = (atpq) createBuilder2.instance;
                        atpqVar3.c = 3;
                        atpqVar3.b = 1 | atpqVar3.b;
                        String d2 = fhe.d();
                        createBuilder2.copyOnWrite();
                        atpq atpqVar4 = (atpq) createBuilder2.instance;
                        d2.getClass();
                        atpqVar4.b = 2 | atpqVar4.b;
                        atpqVar4.d = d2;
                        agpdVar2.d((atpq) createBuilder2.build());
                    } catch (agpe e2) {
                        String valueOf2 = String.valueOf(e2.getMessage());
                        zga.b(valueOf2.length() != 0 ? "Couldn't refresh: ".concat(valueOf2) : new String("Couldn't refresh: "));
                    }
                    if (jheVar2.f.m()) {
                        jvd jvdVar = (jvd) jheVar2.e.get();
                        yjk.e();
                        agss k = jvdVar.b.a().k();
                        if (k != null) {
                            k.h(jvd.a);
                        }
                    }
                    String c = ((agof) jheVar2.b.get()).c();
                    if ("NO_OP_STORE_TAG".equals(c)) {
                        return;
                    }
                    jheVar2.d.a(c);
                }
            });
        }
        if (!this.c.t() || this.k.b()) {
            return;
        }
        final int i2 = 1;
        this.j.execute(new Runnable(this) { // from class: jhd
            public final /* synthetic */ jhe a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (i2 != 0) {
                    jhe jheVar = this.a;
                    if (jheVar.f.f()) {
                        try {
                            agpd agpdVar = jheVar.g;
                            aone createBuilder = atpq.a.createBuilder();
                            createBuilder.copyOnWrite();
                            atpq atpqVar = (atpq) createBuilder.instance;
                            atpqVar.c = 2;
                            atpqVar.b = 1 | atpqVar.b;
                            String d = fhe.d();
                            createBuilder.copyOnWrite();
                            atpq atpqVar2 = (atpq) createBuilder.instance;
                            d.getClass();
                            atpqVar2.b = 2 | atpqVar2.b;
                            atpqVar2.d = d;
                            agpdVar.d((atpq) createBuilder.build());
                            return;
                        } catch (agpe e) {
                            String valueOf = String.valueOf(e.getMessage());
                            zga.b(valueOf.length() != 0 ? "Couldn't delete: ".concat(valueOf) : new String("Couldn't delete: "));
                            return;
                        }
                    }
                    return;
                }
                jhe jheVar2 = this.a;
                asxi asxiVar = (asxi) jheVar2.h.a(jheVar2.c.c()).f(fhe.d()).g(asxi.class).X();
                if (asxiVar != null) {
                    aakt b = asxiVar.b.b(asxiVar.c.f);
                    amkq.O(b == null || (b instanceof auld), "entityFromStore is not instance of RefreshEntityModel, key=refresh");
                    auld auldVar = (auld) b;
                    if (auldVar != null && TimeUnit.MILLISECONDS.toSeconds(jheVar2.i.c()) - auldVar.getRefreshTime().longValue() < jhe.a) {
                        return;
                    }
                }
                try {
                    agpd agpdVar2 = jheVar2.g;
                    aone createBuilder2 = atpq.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    atpq atpqVar3 = (atpq) createBuilder2.instance;
                    atpqVar3.c = 3;
                    atpqVar3.b = 1 | atpqVar3.b;
                    String d2 = fhe.d();
                    createBuilder2.copyOnWrite();
                    atpq atpqVar4 = (atpq) createBuilder2.instance;
                    d2.getClass();
                    atpqVar4.b = 2 | atpqVar4.b;
                    atpqVar4.d = d2;
                    agpdVar2.d((atpq) createBuilder2.build());
                } catch (agpe e2) {
                    String valueOf2 = String.valueOf(e2.getMessage());
                    zga.b(valueOf2.length() != 0 ? "Couldn't refresh: ".concat(valueOf2) : new String("Couldn't refresh: "));
                }
                if (jheVar2.f.m()) {
                    jvd jvdVar = (jvd) jheVar2.e.get();
                    yjk.e();
                    agss k = jvdVar.b.a().k();
                    if (k != null) {
                        k.h(jvd.a);
                    }
                }
                String c = ((agof) jheVar2.b.get()).c();
                if ("NO_OP_STORE_TAG".equals(c)) {
                    return;
                }
                jheVar2.d.a(c);
            }
        });
    }
}
