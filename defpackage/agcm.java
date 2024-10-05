package defpackage;

import android.util.Base64;
import com.google.protos.youtube.api.innertube.StickerCatalogRendererOuterClass;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agcm {
    public final vgz a;

    public agcm(azrw azrwVar, axze axzeVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        vgz vgzVar = (vgz) azrwVar.get();
        this.a = vgzVar;
        if (axzeVar.m()) {
            vgzVar.a();
        }
    }

    public agcm(vgz vgzVar) {
        this.a = vgzVar;
    }

    public static ambx e(final vgz vgzVar) {
        amkq.F(vgzVar.b instanceof vgq, "Variant does not implement WarmableXDataStore");
        final agcm agcmVar = new agcm(vgzVar);
        final byte[] bArr = null;
        return new ambx(new anfy(agcmVar, bArr) { // from class: vgp
            public final /* synthetic */ agcm b;

            @Override // defpackage.anfy
            public final anhy a() {
                vgz vgzVar2 = vgz.this;
                return anfq.h(anfq.i(anht.q(((vgq) vgzVar2.b).d()), new vgs(vgzVar2, 1), angq.a), new amml(null) { // from class: vgo
                    @Override // defpackage.amml
                    public final Object apply(Object obj) {
                        return agcm.this;
                    }
                }, angq.a);
            }
        }, angq.a);
    }

    public final aosc a() {
        anhy a = this.a.a();
        if (!a.isDone()) {
            return null;
        }
        try {
            return (aosc) anaf.W(a);
        } catch (ExecutionException e) {
            zga.d("Error getting LiveCreationSchema from PDS", e);
            return null;
        }
    }

    public final String b() {
        aosc a = a();
        if (a == null) {
            return null;
        }
        return a.c;
    }

    public final zoo c(List list) {
        return new zoy(list, this.a);
    }

    public final aooy d() {
        return (aooy) ((vgq) this.a.b).e();
    }

    public final anhy f() {
        return this.a.a();
    }

    public final anhy g(aok aokVar) {
        return ynm.b(aokVar, this.a.a(), icu.b);
    }

    public final void h(final aulq aulqVar, aok aokVar) {
        aulqVar.getClass();
        final byte[] bArr = null;
        ynm.n(aokVar, g(aokVar), hue.i, new zfi(aulqVar, bArr, bArr) { // from class: iad
            public final /* synthetic */ aulq a;

            @Override // defpackage.zfi
            public final void a(Object obj) {
                agcm agcmVar = agcm.this;
                aulq aulqVar2 = this.a;
                List<aulq> list = (List) obj;
                if (list == null) {
                    return;
                }
                for (aulq aulqVar3 : list) {
                    if (!aulqVar3.pY(StickerCatalogRendererOuterClass.stickerRenderer) || !aulqVar2.pY(StickerCatalogRendererOuterClass.stickerRenderer)) {
                        auya auyaVar = (auya) aulqVar3.pX(StickerCatalogRendererOuterClass.dynamicStickerRenderer);
                        auya auyaVar2 = (auya) aulqVar2.pX(StickerCatalogRendererOuterClass.dynamicStickerRenderer);
                        if (aulqVar3.pY(StickerCatalogRendererOuterClass.dynamicStickerRenderer) && aulqVar2.pY(StickerCatalogRendererOuterClass.dynamicStickerRenderer)) {
                            int ai = aobq.ai(auyaVar.c);
                            if (ai == 0 || ai != 4) {
                                int ai2 = aobq.ai(auyaVar.c);
                                if (ai2 == 0) {
                                    ai2 = 1;
                                }
                                int ai3 = aobq.ai(auyaVar2.c);
                                if (ai2 == (ai3 != 0 ? ai3 : 1)) {
                                    list.remove(aulqVar3);
                                    break;
                                }
                            } else {
                                int ai4 = aobq.ai(auyaVar.c);
                                if (ai4 == 0) {
                                    ai4 = 1;
                                }
                                int ai5 = aobq.ai(auyaVar2.c);
                                if (ai4 == (ai5 != 0 ? ai5 : 1)) {
                                    aqyg aqygVar = auyaVar.d;
                                    if (aqygVar == null) {
                                        aqygVar = aqyg.a;
                                    }
                                    aqyg aqygVar2 = auyaVar2.d;
                                    if (aqygVar2 == null) {
                                        aqygVar2 = aqyg.a;
                                    }
                                    if (aqygVar.equals(aqygVar2)) {
                                        list.remove(aulqVar3);
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    } else if (etx.G(aulqVar3).equals(etx.G(aulqVar2))) {
                        list.remove(aulqVar3);
                        break;
                    }
                }
                list.add(0, aulqVar2);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                aone createBuilder = auyc.a.createBuilder();
                createBuilder.copyOnWrite();
                auyc auycVar = (auyc) createBuilder.instance;
                aony aonyVar = auycVar.b;
                if (!aonyVar.c()) {
                    auycVar.b = aonm.mutableCopy(aonyVar);
                }
                aolo.addAll((Iterable) arrayList, (List) auycVar.b);
                ynm.m(agcmVar.a.b(new fjz(Base64.encodeToString(((auyc) createBuilder.build()).toByteArray(), 0), 8), angq.a), gwr.g);
            }
        });
    }

    public final anhy j() {
        return anfq.h(this.a.a(), fjw.q, angq.a);
    }

    public final anhy k() {
        return anfq.h(this.a.a(), fjw.r, angq.a);
    }

    public final anhy l() {
        return this.a.b(new fjw(17), angq.a);
    }
}
