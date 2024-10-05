package defpackage;

import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import java.io.IOException;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jui implements izo {
    public final azrw a;
    public final azrw b;
    private final ayqi c;

    public jui(ayqi ayqiVar, azrw azrwVar, azrw azrwVar2) {
        this.c = ayqiVar;
        this.a = azrwVar;
        this.b = azrwVar2;
    }

    @Override // defpackage.izo
    public final ayps a(aauc aaucVar) {
        Object p;
        amnv amnvVar = new amnv() { // from class: juh
            @Override // defpackage.amnv
            public final Object get() {
                final jui juiVar = jui.this;
                return juiVar.b(new Callable() { // from class: juf
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        arjv arjvVar;
                        BrowseResponseModel browseResponseModel;
                        jum jumVar = (jum) jui.this.a.get();
                        arjv arjvVar2 = null;
                        if (evr.aM((aadw) jumVar.c.get()) && ((ysy) jumVar.g.get()).p()) {
                            aone createBuilder = aswd.a.createBuilder();
                            createBuilder.copyOnWrite();
                            aswd aswdVar = (aswd) createBuilder.instance;
                            aswdVar.b |= 1;
                            aswdVar.c = true;
                            boolean h = ((fjs) jumVar.f.get()).h();
                            createBuilder.copyOnWrite();
                            aswd aswdVar2 = (aswd) createBuilder.instance;
                            aswdVar2.b |= 4;
                            aswdVar2.e = h;
                            aadg c = ((aadd) jumVar.d.get()).c();
                            if (c.b.a() == aadj.AVAILABLE || c.b.a() == aadj.STALE) {
                                arjvVar = (arjv) c.a;
                                createBuilder.copyOnWrite();
                                aswd aswdVar3 = (aswd) createBuilder.instance;
                                aswdVar3.b |= 2;
                                aswdVar3.d = true;
                            } else {
                                arjvVar = null;
                            }
                            acpl acplVar = (acpl) jumVar.e.get();
                            arpn a = arpp.a();
                            a.copyOnWrite();
                            ((arpp) a.instance).cT((aswd) createBuilder.build());
                            acplVar.c((arpp) a.build());
                        } else {
                            arjvVar = null;
                        }
                        if (arjvVar == null) {
                            try {
                                fap fapVar = (fap) jumVar.a.get();
                                arjvVar = (arjv) fapVar.b().c();
                                if (arjvVar == null) {
                                    arjvVar = fae.c(fapVar.e.a());
                                }
                            } catch (IOException unused) {
                                arjvVar = null;
                            }
                            if (arjvVar == null) {
                                try {
                                    browseResponseModel = ((fap) jumVar.a.get()).g();
                                } catch (IOException unused2) {
                                    browseResponseModel = null;
                                }
                                if (browseResponseModel != null && browseResponseModel.a != null) {
                                    arjv c2 = fae.c(browseResponseModel.a);
                                    if (c2 != null) {
                                        ((fap) jumVar.a.get()).l(c2);
                                        arjvVar2 = c2;
                                    }
                                }
                                return ammv.i(arjvVar2).b(jpt.j);
                            }
                        }
                        arjvVar2 = arjvVar;
                        return ammv.i(arjvVar2).b(jpt.j);
                    }
                });
            }
        };
        amml ammlVar = new amml() { // from class: jue
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                final jui juiVar = jui.this;
                final String str = (String) obj;
                return juiVar.b(new Callable() { // from class: jug
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        agni e;
                        jui juiVar2 = jui.this;
                        String str2 = str;
                        ajyw ajywVar = (ajyw) juiVar2.b.get();
                        yjk.e();
                        zhq.m(str2);
                        arjv arjvVar = null;
                        if (((fjs) ajywVar.a.get()).j() && (e = ((agof) ajywVar.b.get()).a().i().e(str2)) != null) {
                            jti jtiVar = (jti) ajywVar.c.get();
                            auov auovVar = (auov) jtiVar.g(agni.class, auov.class, e, null);
                            aubg aubgVar = (aubg) jtiVar.g(agni.class, aubg.class, e, null);
                            if (auovVar != null && aubgVar != null) {
                                aone createBuilder = aveh.a.createBuilder();
                                createBuilder.copyOnWrite();
                                aveh avehVar = (aveh) createBuilder.instance;
                                avehVar.b |= 8;
                                avehVar.f = true;
                                aone createBuilder2 = aved.a.createBuilder();
                                createBuilder2.copyOnWrite();
                                aved avedVar = (aved) createBuilder2.instance;
                                avedVar.c = auovVar;
                                avedVar.b |= 1;
                                createBuilder.copyOnWrite();
                                aveh avehVar2 = (aveh) createBuilder.instance;
                                aved avedVar2 = (aved) createBuilder2.build();
                                avedVar2.getClass();
                                avehVar2.k = avedVar2;
                                avehVar2.b |= 8192;
                                aveh avehVar3 = (aveh) createBuilder.build();
                                aone createBuilder3 = arjy.a.createBuilder();
                                createBuilder3.copyOnWrite();
                                arjy arjyVar = (arjy) createBuilder3.instance;
                                avehVar3.getClass();
                                arjyVar.c = avehVar3;
                                arjyVar.b = 58174010;
                                arjy arjyVar2 = (arjy) createBuilder3.build();
                                aong aongVar = (aong) arjv.a.createBuilder();
                                arnd arndVar = arnd.a;
                                aongVar.copyOnWrite();
                                arjv arjvVar2 = (arjv) aongVar.instance;
                                arndVar.getClass();
                                arjvVar2.c = arndVar;
                                arjvVar2.b |= 1;
                                aone createBuilder4 = arjq.a.createBuilder();
                                createBuilder4.copyOnWrite();
                                arjq arjqVar = (arjq) createBuilder4.instance;
                                arjqVar.c = aubgVar;
                                arjqVar.b = 53272665;
                                aongVar.copyOnWrite();
                                arjv arjvVar3 = (arjv) aongVar.instance;
                                arjq arjqVar2 = (arjq) createBuilder4.build();
                                arjqVar2.getClass();
                                arjvVar3.d = arjqVar2;
                                arjvVar3.b |= 2;
                                aone createBuilder5 = arjw.a.createBuilder();
                                aone createBuilder6 = arke.a.createBuilder();
                                createBuilder6.copyOnWrite();
                                arke arkeVar = (arke) createBuilder6.instance;
                                arjyVar2.getClass();
                                arkeVar.a();
                                arkeVar.c.add(arjyVar2);
                                createBuilder5.copyOnWrite();
                                arjw arjwVar = (arjw) createBuilder5.instance;
                                arke arkeVar2 = (arke) createBuilder6.build();
                                arkeVar2.getClass();
                                arjwVar.c = arkeVar2;
                                arjwVar.b = 58173949;
                                aongVar.copyOnWrite();
                                arjv arjvVar4 = (arjv) aongVar.instance;
                                arjw arjwVar2 = (arjw) createBuilder5.build();
                                arjwVar2.getClass();
                                arjvVar4.f = arjwVar2;
                                arjvVar4.b |= 64;
                                arjvVar = (arjv) aongVar.build();
                            }
                        }
                        return ammv.i(arjvVar).b(jpt.k);
                    }
                });
            }
        };
        String str = aaucVar.c;
        if ("FElibrary".equals(str)) {
            p = amnvVar.get();
        } else {
            String d = evr.d(str);
            if (ammx.e(d)) {
                p = ayps.p();
            } else {
                p = ammlVar.apply(d);
            }
        }
        return (ayps) p;
    }

    public final ayps b(Callable callable) {
        return ayps.u(callable).G(this.c).h(hxj.e).f();
    }
}
