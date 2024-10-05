package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PaneFragmentPanelDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelsConfiguration;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gqa implements aaha, ewk {
    private final Context a;
    private final giv b;
    private final gjk c;
    private final ypa d;
    private final afsy e;
    private final fjs f;
    private final its g;
    private final iyq h;
    private final azrw i;
    private final aadw j;
    private final rxm k;
    private final lkb l;

    public gqa(Context context, giv givVar, ypa ypaVar, afsy afsyVar, rxm rxmVar, fjs fjsVar, lkb lkbVar, its itsVar, azrw azrwVar, gjk gjkVar, aadw aadwVar, iyq iyqVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = context;
        givVar.getClass();
        this.b = givVar;
        ypaVar.getClass();
        this.d = ypaVar;
        afsyVar.getClass();
        this.e = afsyVar;
        this.k = rxmVar;
        this.f = fjsVar;
        this.l = lkbVar;
        this.g = itsVar;
        this.h = iyqVar;
        this.i = azrwVar;
        this.c = gjkVar;
        this.j = aadwVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        PaneDescriptor k;
        awfs awfsVar;
        int aN = anaf.aN(((aplt) apxfVar.pX(BrowseEndpointOuterClass.browseEndpoint)).k);
        final int i = 1;
        if (aN == 0) {
            aN = 1;
        }
        final int i2 = 0;
        if (aN == 5) {
            final gqc gqcVar = (gqc) this.i.get();
            aauc f = gqcVar.b.f();
            aone builder = ((aplt) apxfVar.pX(BrowseEndpointOuterClass.browseEndpoint)).toBuilder();
            f.d(((aplt) builder.instance).c);
            f.v(((aplt) builder.instance).d);
            f.l(apxfVar.c);
            if ((((aplt) builder.instance).b & 64) != 0) {
                aone createBuilder = arjp.a.createBuilder();
                aplw aplwVar = ((aplt) builder.instance).h;
                if (aplwVar == null) {
                    aplwVar = aplw.a;
                }
                createBuilder.ah(aplwVar.d);
                aplw aplwVar2 = ((aplt) builder.instance).h;
                if (aplwVar2 == null) {
                    aplwVar2 = aplw.a;
                }
                if (aplwVar2.b == 328644166) {
                    awfsVar = (awfs) aplwVar2.c;
                } else {
                    awfsVar = awfs.a;
                }
                createBuilder.copyOnWrite();
                arjp arjpVar = (arjp) createBuilder.instance;
                awfsVar.getClass();
                arjpVar.c = awfsVar;
                arjpVar.b = 328644166;
                f.t = (arjp) createBuilder.build();
                builder.copyOnWrite();
                aplt apltVar = (aplt) builder.instance;
                apltVar.h = null;
                apltVar.b &= -65;
            }
            gqcVar.f.show(gqcVar.a.getFragmentManager(), ycs.a);
            ynm.n(gqcVar.a, gqcVar.b.h(f, gqcVar.g), new zfi() { // from class: gqb
                @Override // defpackage.zfi
                public final void a(Object obj) {
                    if (i2 == 0) {
                        gqc gqcVar2 = gqcVar;
                        gqcVar2.f.dismiss();
                        gqcVar2.d.e((Throwable) obj);
                        return;
                    }
                    gqc gqcVar3 = gqcVar;
                    BrowseResponseModel browseResponseModel = (BrowseResponseModel) obj;
                    gqcVar3.f.dismiss();
                    gqcVar3.c.mM().D(new acqx(browseResponseModel.d()));
                    arjv arjvVar = browseResponseModel.a;
                    if (arjvVar.n.size() != 0) {
                        gqcVar3.e.b(arjvVar.n);
                    }
                    if (arjvVar.o.size() != 0) {
                        gqcVar3.e.b(arjvVar.o);
                    }
                }
            }, new zfi() { // from class: gqb
                @Override // defpackage.zfi
                public final void a(Object obj) {
                    if (i == 0) {
                        gqc gqcVar2 = gqcVar;
                        gqcVar2.f.dismiss();
                        gqcVar2.d.e((Throwable) obj);
                        return;
                    }
                    gqc gqcVar3 = gqcVar;
                    BrowseResponseModel browseResponseModel = (BrowseResponseModel) obj;
                    gqcVar3.f.dismiss();
                    gqcVar3.c.mM().D(new acqx(browseResponseModel.d()));
                    arjv arjvVar = browseResponseModel.a;
                    if (arjvVar.n.size() != 0) {
                        gqcVar3.e.b(arjvVar.n);
                    }
                    if (arjvVar.o.size() != 0) {
                        gqcVar3.e.b(arjvVar.o);
                    }
                }
            });
            return;
        }
        this.d.d(new fea());
        boolean z = (((Integer) yjj.t(map, "com.google.android.apps.youtube.app.endpoint.flags", 0)).intValue() & 16) != 0;
        if (!"FElibrary".equals(((aplt) apxfVar.pX(BrowseEndpointOuterClass.browseEndpoint)).c) || !this.e.t() || (this.k.a && !this.f.d())) {
            i = 0;
        }
        if (!evr.ap(this.j)) {
            if (i != 0 && yjk.O(this.a) == 4) {
                k = this.l.k(apxfVar);
            }
            if (map != null) {
            }
            k = this.g.a(apxfVar);
        } else {
            if (i != 0) {
                k = this.h.a(apxfVar);
            }
            if (map != null || !map.containsKey("com.google.android.libraries.youtube.rendering.presenter.PresentContext")) {
                k = this.g.a(apxfVar);
            } else {
                ajok ajokVar = (ajok) map.get("com.google.android.libraries.youtube.rendering.presenter.PresentContext");
                k = this.g.c(apxfVar, false, ajokVar.j("nested_fragment_key", false), ajokVar.j("selection_panel", false));
            }
        }
        k.b.putBoolean("pivot", z);
        ammy ammyVar = (ammy) yjj.u(map, "replace_pane_predicate", ammy.class);
        if (ammyVar == null && aN == 2) {
            ammyVar = new gin();
        }
        k.c = ammyVar;
        asvu asvuVar = this.j.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        if (asvuVar.cg && "FEnotifications_inbox".equals(((aplt) apxfVar.pX(BrowseEndpointOuterClass.browseEndpoint)).c) && this.e.t() && (!this.k.a || this.f.d())) {
            this.c.b(PanelsConfiguration.b(PaneFragmentPanelDescriptor.b(k)));
        }
        this.b.d(k);
    }
}
