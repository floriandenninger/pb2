package defpackage;

import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gqw implements aaha, ewk {
    public static final /* synthetic */ int e = 0;
    public final gpz a;
    public final Executor b;
    public final jvy c;
    public final jmq d;
    private final Executor f;
    private final fif g;

    public gqw(gpz gpzVar, Executor executor, Executor executor2, fif fifVar, jvy jvyVar, jmq jmqVar) {
        this.a = gpzVar;
        this.b = executor;
        this.f = executor2;
        this.c = jvyVar;
        this.g = fifVar;
        this.d = jmqVar;
    }

    @Override // defpackage.aaha
    public final void kE(final apxf apxfVar, final Map map) {
        anhy i;
        if (!apxfVar.pY(atrs.a)) {
            throw new aahm("Command is not an OfflineWatchEndpoint.");
        }
        final atrr atrrVar = (atrr) apxfVar.pX(atrs.a);
        if (atrrVar.c.isEmpty()) {
            i = anaf.O(gqv.a(Optional.empty(), true));
        } else {
            i = anfq.i(anfq.h(anht.q(wbs.I(this.g.a(atrrVar.c).x(gpd.e).S(Optional.empty()))), new gbr(7), this.b), new anfz() { // from class: gqu
                @Override // defpackage.anfz
                public final anhy a(Object obj) {
                    anhy O;
                    gqw gqwVar = gqw.this;
                    Optional optional = (Optional) obj;
                    if (optional.isPresent()) {
                        jmq jmqVar = gqwVar.d;
                        jmt jmtVar = (jmt) optional.get();
                        if (jmtVar.a() == agnv.class) {
                            O = jmqVar.a.d(jmtVar);
                        } else if (jmtVar.a() == awil.class) {
                            O = jmqVar.b.d(jmtVar);
                        } else if (jmtVar.a() == asxs.class) {
                            O = jmqVar.c.d(jmtVar);
                        } else {
                            String valueOf = String.valueOf(jmtVar.a());
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 77);
                            sb.append("CompositeDownloadStateChecker.isVideoPlayableAsync does not have support for ");
                            sb.append(valueOf);
                            throw new UnsupportedOperationException(sb.toString());
                        }
                    } else {
                        O = anaf.O(false);
                    }
                    return anfq.h(anht.q(O), new jmv(optional, 1), gqwVar.b);
                }
            }, this.b);
        }
        ynm.k(i, this.f, egw.r, new ynl() { // from class: gqt
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                gqw gqwVar = gqw.this;
                apxf apxfVar2 = apxfVar;
                Map map2 = map;
                atrr atrrVar2 = atrrVar;
                gqv gqvVar = (gqv) obj;
                if (gqvVar.b) {
                    gqwVar.a.kE(apxfVar2, map2);
                    return;
                }
                jvy jvyVar = gqwVar.c;
                String str = atrrVar2.c;
                Optional optional = gqvVar.a;
                Optional of = Optional.of(atrrVar2.d);
                if (!optional.isPresent()) {
                    if (!of.isPresent() || ((String) of.get()).isEmpty()) {
                        jvyVar.e.m(null, str, null, true);
                        return;
                    } else {
                        jvyVar.d.i((String) of.get(), str);
                        return;
                    }
                }
                jmt jmtVar = (jmt) optional.get();
                if (jmtVar.a() == agnv.class) {
                    jvyVar.a.b(str, jmtVar, of);
                    return;
                }
                if (jmtVar.a() == awil.class) {
                    jvyVar.b.b(str, jmtVar, of);
                    return;
                }
                if (jmtVar.a() == asxs.class) {
                    jvyVar.c.b(str, jmtVar, of);
                    return;
                }
                String valueOf = String.valueOf(jmtVar.a());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 76);
                sb.append("CompositeUnplayableDownloadedVideoClickController does not have support for ");
                sb.append(valueOf);
                throw new UnsupportedOperationException(sb.toString());
            }
        });
    }
}
