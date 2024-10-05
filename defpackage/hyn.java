package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hyn implements ykl {
    final /* synthetic */ hyo a;

    public hyn(hyo hyoVar) {
        this.a = hyoVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        this.a.u.d(new Runnable() { // from class: hyl
            @Override // java.lang.Runnable
            public final void run() {
                hyo hyoVar = hyn.this.a;
                hyoVar.u.g(hyoVar.x);
            }
        });
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        final Uri uri = (Uri) obj;
        final Drawable drawable = (Drawable) obj2;
        this.a.u.d(new Runnable() { // from class: hym
            @Override // java.lang.Runnable
            public final void run() {
                ammv ammvVar;
                hyn hynVar = hyn.this;
                Uri uri2 = uri;
                Drawable drawable2 = drawable;
                final hyo hyoVar = hynVar.a;
                yjk.f();
                hyoVar.u.e(uri2);
                hyoVar.t.setImageDrawable(drawable2);
                hyoVar.t.setOnClickListener(new View.OnClickListener() { // from class: hyk
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        axdw axdwVar;
                        hyo hyoVar2 = hyo.this;
                        ((iai) hyoVar2.u).x.h(hyoVar2.x, hyoVar2.w);
                        if (hyoVar2.u.a() != null) {
                            hyoVar2.u.a().I(3, new acqx(etx.I(hyoVar2.v).I()), null);
                            hyoVar2.u.a().n(new acqx(acsb.c(39103)));
                        }
                        hyq hyqVar = ((iai) hyoVar2.u).v;
                        if (hyqVar != null) {
                            hyqVar.a();
                        }
                        iai iaiVar = (iai) hyoVar2.u;
                        final ibw ibwVar = iaiVar.l;
                        aulq aulqVar = hyoVar2.x;
                        boolean z = iaiVar.u;
                        axdj j = axdk.j();
                        ammv G = etx.G(aulqVar);
                        if (G.h()) {
                            if (etx.H(aulqVar).size() > 1) {
                                ibwVar.f.mM().n(new acqx(acsb.c(65452)));
                            }
                            aone createBuilder = axdw.a.createBuilder();
                            aone createBuilder2 = axbp.a.createBuilder();
                            String str = (String) etx.F((Uri) G.c()).c();
                            createBuilder2.copyOnWrite();
                            axbp axbpVar = (axbp) createBuilder2.instance;
                            axbpVar.b = 1;
                            axbpVar.c = str;
                            createBuilder.copyOnWrite();
                            axdw axdwVar2 = (axdw) createBuilder.instance;
                            axbp axbpVar2 = (axbp) createBuilder2.build();
                            axbpVar2.getClass();
                            axdwVar2.c = axbpVar2;
                            axdwVar2.b |= 2;
                            List H = etx.H(aulqVar);
                            if (!H.isEmpty()) {
                                aone createBuilder3 = axdv.a.createBuilder();
                                createBuilder3.copyOnWrite();
                                axdv axdvVar = (axdv) createBuilder3.instance;
                                aony aonyVar = axdvVar.d;
                                if (!aonyVar.c()) {
                                    axdvVar.d = aonm.mutableCopy(aonyVar);
                                }
                                aolo.addAll((Iterable) H, (List) axdvVar.d);
                                String str2 = (String) H.get(0);
                                createBuilder3.copyOnWrite();
                                axdv axdvVar2 = (axdv) createBuilder3.instance;
                                str2.getClass();
                                axdvVar2.b |= 1;
                                axdvVar2.c = str2;
                                axdv axdvVar3 = (axdv) createBuilder3.build();
                                createBuilder.copyOnWrite();
                                axdw axdwVar3 = (axdw) createBuilder.instance;
                                axdvVar3.getClass();
                                axdwVar3.d = axdvVar3;
                                axdwVar3.b |= 4;
                            }
                            final List H2 = etx.H(aulqVar);
                            if (!H2.isEmpty()) {
                                ibwVar.c.execute(new Runnable() { // from class: ibt
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ibw ibwVar2 = ibw.this;
                                        Iterator it = H2.iterator();
                                        while (it.hasNext()) {
                                            ibwVar2.a.a(Uri.parse((String) it.next()), ibwVar2.d);
                                        }
                                    }
                                });
                            }
                            aone createBuilder4 = axdi.a.createBuilder();
                            createBuilder4.copyOnWrite();
                            axdi axdiVar = (axdi) createBuilder4.instance;
                            axdw axdwVar4 = (axdw) createBuilder.build();
                            axdwVar4.getClass();
                            axdiVar.d = axdwVar4;
                            axdiVar.c = 2;
                            createBuilder4.copyOnWrite();
                            axdi axdiVar2 = (axdi) createBuilder4.instance;
                            axdiVar2.b |= 4096;
                            axdiVar2.e = z;
                            boolean u = ibwVar.g.u();
                            createBuilder4.copyOnWrite();
                            axdi axdiVar3 = (axdi) createBuilder4.instance;
                            axdiVar3.b |= 8192;
                            axdiVar3.f = u;
                            j.copyOnWrite();
                            ((axdk) j.instance).F((axdi) createBuilder4.build());
                            j.copyOnWrite();
                            ((axdk) j.instance).G(512);
                            j.copyOnWrite();
                            ((axdk) j.instance).D(512);
                            ibwVar.b.aI(j);
                            axdi i = ((axdk) j.instance).i();
                            if (i.c == 2) {
                                axdwVar = (axdw) i.d;
                            } else {
                                axdwVar = axdw.a;
                            }
                            axdv axdvVar4 = axdwVar.d;
                            if (axdvVar4 == null) {
                                axdvVar4 = axdv.a;
                            }
                            if (axdvVar4.d.size() > 1) {
                                iax iaxVar = ibwVar.e;
                                iaxVar.c(Math.round((iaxVar.b / 2.0f) - iaxVar.g));
                                return;
                            }
                            return;
                        }
                        afsi.b(2, 24, "VideoFX: Static Sticker added without valid uri");
                    }
                });
                if (hyoVar.u.a() != null) {
                    acra a = hyoVar.u.a();
                    auyb auybVar = hyoVar.v;
                    a.v(auybVar, etx.I(auybVar), null);
                }
                auyb auybVar2 = hyoVar.v;
                if (auybVar2 == null) {
                    ammvVar = amlr.a;
                } else if ((auybVar2.b & 1) != 0) {
                    avgg avggVar = auybVar2.c;
                    if (avggVar == null) {
                        avggVar = avgg.a;
                    }
                    aott aottVar = avggVar.d;
                    if (aottVar == null) {
                        aottVar = aott.a;
                    }
                    aots aotsVar = aottVar.c;
                    if (aotsVar == null) {
                        aotsVar = aots.a;
                    }
                    ammvVar = ammv.j(aotsVar.c);
                } else if (auybVar2.d.size() != 0) {
                    aott aottVar2 = ((avgg) auybVar2.d.get(0)).d;
                    if (aottVar2 == null) {
                        aottVar2 = aott.a;
                    }
                    aots aotsVar2 = aottVar2.c;
                    if (aotsVar2 == null) {
                        aotsVar2 = aots.a;
                    }
                    ammvVar = ammv.j(aotsVar2.c);
                } else {
                    ammvVar = amlr.a;
                }
                hyoVar.t.setContentDescription((CharSequence) ammvVar.f());
            }
        });
    }
}
