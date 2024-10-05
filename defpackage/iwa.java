package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.loading.SpecificNetworkErrorViewLoadingFrameLayout;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iwa extends ivo implements fad {
    public fae ct;
    public fjs cu;
    public axpg cv;
    public String cw;
    private final List cx = new ArrayList();
    private boolean cy;
    private cnq cz;

    @Override // defpackage.fad
    public final boolean a() {
        return this.cy;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ivj
    public final void bi(cnq cnqVar) {
        arjv arjvVar;
        arke arkeVar;
        aveh avehVar;
        if (!this.bQ) {
            this.cz = cnqVar;
            super.bi(cnqVar);
            return;
        }
        if (!"FElibrary".equals(((aplt) this.ai.pX(BrowseEndpointOuterClass.browseEndpoint)).c) || !(cnqVar instanceof cng)) {
            String str = this.aI.a(cnqVar).a;
            Iterator it = this.cx.iterator();
            while (it.hasNext()) {
                ((ivy) it.next()).g(str);
            }
            return;
        }
        fap fapVar = (fap) this.aP.get();
        try {
            apxf apxfVar = this.ai;
            fae faeVar = this.ct;
            String str2 = ((aplt) apxfVar.pX(BrowseEndpointOuterClass.browseEndpoint)).c;
            BrowseResponseModel browseResponseModel = null;
            BrowseResponseModel g = str2.equals("FElibrary") ? fapVar.g() : null;
            if (g == null) {
                arjv i = fapVar.i();
                if (i != null) {
                    i = faeVar.b(i);
                }
                if (i != null) {
                    browseResponseModel = new BrowseResponseModel(i);
                }
            } else {
                browseResponseModel = g;
            }
            if (browseResponseModel != null && (arjvVar = browseResponseModel.a) != null && (arjvVar.b & 64) != 0) {
                arjw arjwVar = arjvVar.f;
                if (arjwVar == null) {
                    arjwVar = arjw.a;
                }
                if (arjwVar.b == 58173949) {
                    arkeVar = (arke) arjwVar.c;
                } else {
                    arkeVar = arke.a;
                }
                if (arkeVar.c.size() > 0 && ((arjy) arkeVar.c.get(0)).b == 58174010) {
                    arjy arjyVar = (arjy) arkeVar.c.get(0);
                    if (arjyVar.b == 58174010) {
                        avehVar = (aveh) arjyVar.c;
                    } else {
                        avehVar = aveh.a;
                    }
                    aone builder = avehVar.toBuilder();
                    builder.copyOnWrite();
                    aveh avehVar2 = (aveh) builder.instance;
                    str2.getClass();
                    avehVar2.b |= 1;
                    avehVar2.c = str2;
                    aveh avehVar3 = (aveh) builder.build();
                    aong aongVar = (aong) browseResponseModel.a.toBuilder();
                    arjw arjwVar2 = browseResponseModel.a.f;
                    if (arjwVar2 == null) {
                        arjwVar2 = arjw.a;
                    }
                    aone builder2 = arjwVar2.toBuilder();
                    aone builder3 = arkeVar.toBuilder();
                    aone builder4 = ((arjy) arkeVar.c.get(0)).toBuilder();
                    builder4.copyOnWrite();
                    arjy arjyVar2 = (arjy) builder4.instance;
                    avehVar3.getClass();
                    arjyVar2.c = avehVar3;
                    arjyVar2.b = 58174010;
                    builder3.copyOnWrite();
                    arke arkeVar2 = (arke) builder3.instance;
                    arjy arjyVar3 = (arjy) builder4.build();
                    arjyVar3.getClass();
                    arkeVar2.a();
                    arkeVar2.c.set(0, arjyVar3);
                    builder2.copyOnWrite();
                    arjw arjwVar3 = (arjw) builder2.instance;
                    arke arkeVar3 = (arke) builder3.build();
                    arkeVar3.getClass();
                    arjwVar3.c = arkeVar3;
                    arjwVar3.b = 58173949;
                    aongVar.copyOnWrite();
                    arjv arjvVar2 = (arjv) aongVar.instance;
                    arjw arjwVar4 = (arjw) builder2.build();
                    arjwVar4.getClass();
                    arjvVar2.f = arjwVar4;
                    arjvVar2.b |= 64;
                    browseResponseModel = new BrowseResponseModel((arjv) aongVar.build());
                }
            }
            if (browseResponseModel != null) {
                this.cy = true;
                iuy a = iuz.a();
                a.c(apxfVar);
                a.b(browseResponseModel);
                a.e(true);
                a.f(false);
                a.d(false);
                super.aF(a.a());
            }
        } catch (IOException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb.append("Failed to get offline browse: ");
            sb.append(valueOf);
            zga.b(sb.toString());
            String O = O(R.string.offline_not_available);
            SpecificNetworkErrorViewLoadingFrameLayout specificNetworkErrorViewLoadingFrameLayout = (SpecificNetworkErrorViewLoadingFrameLayout) ((ivj) this).c.get();
            fgw fgwVar = specificNetworkErrorViewLoadingFrameLayout.c;
            fgwVar.getClass();
            fgwVar.e(O);
            specificNetworkErrorViewLoadingFrameLayout.c.d(false);
            specificNetworkErrorViewLoadingFrameLayout.c.b(false);
            specificNetworkErrorViewLoadingFrameLayout.h(3);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ivj
    public final void bj(apxf apxfVar) {
        super.bj(apxfVar);
        this.cx.clear();
        this.cz = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ivj
    public final void bk(iuz iuzVar) {
        apxf s;
        super.bk(iuzVar);
        BrowseResponseModel browseResponseModel = iuzVar.b;
        if (browseResponseModel != null && this.bQ && !evr.aM(this.av) && !this.cu.h()) {
            amru g = browseResponseModel.g();
            int size = g.size();
            int i = 0;
            while (i < size) {
                aame aameVar = (aame) g.get(i);
                aone builder = aameVar.a.toBuilder();
                if (!"FEaccount".equals(((aveh) builder.instance).c)) {
                    i++;
                    if ("FElibrary".equals(((aveh) builder.instance).c)) {
                    }
                }
                aone createBuilder = aved.a.createBuilder();
                auov auovVar = auov.a;
                createBuilder.copyOnWrite();
                aved avedVar = (aved) createBuilder.instance;
                auovVar.getClass();
                avedVar.c = auovVar;
                avedVar.b |= 1;
                builder.copyOnWrite();
                aveh avehVar = (aveh) builder.instance;
                aved avedVar2 = (aved) createBuilder.build();
                avedVar2.getClass();
                avehVar.k = avedVar2;
                avehVar.b |= 8192;
                aameVar.b((aveh) builder.build());
                break;
            }
        }
        BrowseResponseModel browseResponseModel2 = iuzVar.b;
        String str = this.cw;
        if (str == null || str.isEmpty() || browseResponseModel2 == null) {
            return;
        }
        amru g2 = browseResponseModel2.g();
        int size2 = g2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            aame aameVar2 = (aame) g2.get(i2);
            aone builder2 = aameVar2.a.toBuilder();
            boolean equals = this.cw.equals(((aveh) builder2.instance).c);
            builder2.copyOnWrite();
            aveh avehVar2 = (aveh) builder2.instance;
            avehVar2.b |= 8;
            avehVar2.f = equals;
            if (equals && (s = s()) != null && s.pY(BrowseEndpointOuterClass.browseEndpoint)) {
                aone builder3 = ((aplt) s.pX(BrowseEndpointOuterClass.browseEndpoint)).toBuilder();
                String str2 = ((aveh) builder2.instance).c;
                builder3.copyOnWrite();
                aplt apltVar = (aplt) builder3.instance;
                str2.getClass();
                apltVar.b |= 1;
                apltVar.c = str2;
                aplt apltVar2 = (aplt) builder3.build();
                aong aongVar = (aong) s.toBuilder();
                aongVar.e(BrowseEndpointOuterClass.browseEndpoint, apltVar2);
                bs((apxf) aongVar.build());
            }
            aameVar2.b((aveh) builder2.build());
        }
        this.cw = null;
    }

    @Override // defpackage.ivj
    protected final void bl(ajwx ajwxVar) {
        if (this.bQ) {
            ivy ivyVar = new ivy(this);
            cnq cnqVar = this.cz;
            if (cnqVar == null) {
                ajvn a = ajvo.a();
                a.a = ajtw.a();
                ivyVar.f(a.a());
            } else {
                ivyVar.g(this.aI.a(cnqVar).a);
            }
            this.cx.add(ivyVar);
            mgr mgrVar = (mgr) ajwxVar;
            ajng ajngVar = mgrVar.e;
            if (ajngVar == ivyVar) {
                return;
            }
            if (ajngVar != null) {
                mgrVar.d.q(ajngVar);
            }
            mgrVar.e = ivyVar;
            mgrVar.d.m(ivyVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ivj
    public final void bo() {
        super.bo();
        this.d.e(new ivz(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ivj
    public final boolean bz() {
        rxm rxmVar = this.bX;
        return (rxmVar == null || !rxmVar.a) && super.bz();
    }

    @Override // defpackage.ivj, defpackage.ito
    public final void l() {
        if (this.cy || this.bQ || this.cz != null || n() == 3) {
            lo();
        }
    }

    @Override // defpackage.ivj, defpackage.ajxa
    public final void lo() {
        if (!this.bX.a) {
            super.lo();
            return;
        }
        View view = this.O;
        if (view != null) {
            view.postDelayed(new Runnable() { // from class: ivw
                @Override // java.lang.Runnable
                public final void run() {
                    iwa iwaVar = iwa.this;
                    iwaVar.bC();
                    iwaVar.aY.b();
                }
            }, qX().getInteger(android.R.integer.config_longAnimTime));
        }
    }

    @Override // defpackage.ivj, defpackage.ce
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        bundle.putBoolean("instance_is_rendering_offline_browse_response", this.cy);
    }

    @Override // defpackage.ivj, defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (bundle != null) {
            this.cy = bundle.getBoolean("instance_is_rendering_offline_browse_response");
        }
        return super.mg(layoutInflater, viewGroup, bundle);
    }
}
