package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.AdThumbnailDetailsButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.CompactCompanionAdRendererOuterClass;
import com.google.protos.youtube.api.innertube.CompactCompanionExtensionRendererOuterClass;
import com.google.protos.youtube.api.innertube.MenuRendererOuterClass;
import com.google.protos.youtube.api.innertube.PrefilledFormCompanionExtensionRendererOuterClass;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class meo implements wnb, wna {
    public final aahd a;
    public final wzq b;
    public aqbm c;
    public xbw d;
    private final ajjz e;
    private final acra f;
    private String g = "";
    private boolean h;
    private final met i;
    private final mer j;
    private View k;
    private ImageView l;
    private TextView m;
    private TextView n;
    private TextView o;
    private TextView p;
    private ImageView q;
    private fqw r;
    private View s;
    private View t;
    private frb u;
    private final ajyw v;

    public meo(ajjz ajjzVar, aahd aahdVar, acra acraVar, wzq wzqVar, met metVar, mer merVar, ajyw ajywVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.e = ajjzVar;
        this.a = aahdVar;
        this.f = acraVar;
        this.b = wzqVar;
        this.i = metVar;
        this.j = merVar;
        this.v = ajywVar;
    }

    private final void c(View view) {
        if (view != null) {
            whu.z(view, R.id.compact_companion_card_stub, R.id.compact_companion_card).setVisibility(8);
        }
        aqbm aqbmVar = this.c;
        if (aqbmVar != null && (aqbmVar.b & 256) != 0) {
            aulq aulqVar = aqbmVar.k;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (aulqVar.pY(CompactCompanionExtensionRendererOuterClass.compactCompanionExtensionRenderer)) {
                this.i.b(aulqVar.pX(CompactCompanionExtensionRendererOuterClass.compactCompanionExtensionRenderer));
            } else if (aulqVar.pY(PrefilledFormCompanionExtensionRendererOuterClass.prefilledFormCompanionExtensionRenderer)) {
                this.i.b(aulqVar.pX(PrefilledFormCompanionExtensionRendererOuterClass.prefilledFormCompanionExtensionRenderer));
            } else {
                this.i.b(null);
            }
        }
        View view2 = this.k;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        fqw fqwVar = this.r;
        if (fqwVar != null) {
            fqwVar.d();
        }
        frb frbVar = this.u;
        if (frbVar != null) {
            frbVar.d();
        }
        xbw xbwVar = this.d;
        if (xbwVar != null) {
            xbwVar.c();
        }
    }

    private final void g() {
        View view;
        if (!this.h || (view = this.k) == null || this.c == null) {
            return;
        }
        view.setVisibility(0);
    }

    private static final void l(TextView textView, View view, aqbl aqblVar) {
        if (aqblVar == null) {
            textView.setText("");
            view.setVisibility(8);
            return;
        }
        aqyg aqygVar = aqblVar.b;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        textView.setText(ajcq.b(aqygVar));
        whu.I(view, aqblVar.c);
    }

    @Override // defpackage.wmz
    public final void a() {
        g();
    }

    public final void b(Object obj, List list) {
        if (this.b.d(obj)) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.c);
        whl.J(this.a, list, hashMap);
    }

    @Override // defpackage.wmz
    public final void d(View view, ajok ajokVar) {
        aqbl aqblVar;
        aqbl aqblVar2;
        atdc atdcVar;
        aqev aqevVar;
        if (this.c != null) {
            View view2 = this.k;
            if (view2 == null || view2.getParent() != view) {
                c(view);
                View z = whu.z(view, R.id.compact_companion_card_stub, R.id.compact_companion_card);
                this.k = z;
                this.l = (ImageView) z.findViewById(R.id.thumbnail);
                this.m = (TextView) this.k.findViewById(R.id.heading_text);
                this.n = (TextView) this.k.findViewById(R.id.heading_ad_badge);
                this.o = (TextView) this.k.findViewById(R.id.subheading_text);
                this.p = (TextView) this.k.findViewById(R.id.subheading_ad_badge);
                this.q = (ImageView) this.k.findViewById(R.id.contextual_menu_anchor);
                this.t = this.k.findViewById(R.id.action_button);
                this.s = this.k.findViewById(R.id.secondary_button);
            }
            ajjz ajjzVar = this.e;
            ImageView imageView = this.l;
            avgg avggVar = this.c.c;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            ajjzVar.h(imageView, avggVar);
            TextView textView = this.m;
            TextView textView2 = this.n;
            aqbm aqbmVar = this.c;
            if ((aqbmVar.b & 2) != 0) {
                aqblVar = aqbmVar.d;
                if (aqblVar == null) {
                    aqblVar = aqbl.a;
                }
            } else {
                aqblVar = null;
            }
            l(textView, textView2, aqblVar);
            TextView textView3 = this.o;
            TextView textView4 = this.p;
            aqbm aqbmVar2 = this.c;
            if ((aqbmVar2.b & 4) != 0) {
                aqblVar2 = aqbmVar2.e;
                if (aqblVar2 == null) {
                    aqblVar2 = aqbl.a;
                }
            } else {
                aqblVar2 = null;
            }
            l(textView3, textView4, aqblVar2);
            this.k.setBackgroundColor(this.c.h);
            final int i = 1;
            this.r = this.v.r(new fqy(this) { // from class: men
                public final /* synthetic */ meo a;

                {
                    this.a = this;
                }

                @Override // defpackage.fqy
                public final void a(Object obj, List list) {
                    if (i == 0) {
                        meo meoVar = this.a;
                        if (obj == null || meoVar.b.d(obj)) {
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
                        hashMap.put("MacrosConverters.CustomConvertersKey", new afxe[]{meoVar.d});
                        whl.J(meoVar.a, list, hashMap);
                        return;
                    }
                    this.a.b(obj, list);
                }
            }, this.t);
            this.u = new frb(this.s, this.e, null);
            this.d = new xbw(this.k, null);
            aqbm aqbmVar3 = this.c;
            if (aqbmVar3 != null && (aqbmVar3.b & 256) != 0) {
                aulq aulqVar = aqbmVar3.k;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                if (aulqVar.pY(CompactCompanionExtensionRendererOuterClass.compactCompanionExtensionRenderer)) {
                    this.i.a(this.k, aulqVar.pX(CompactCompanionExtensionRendererOuterClass.compactCompanionExtensionRenderer));
                } else if (aulqVar.pY(PrefilledFormCompanionExtensionRendererOuterClass.prefilledFormCompanionExtensionRenderer)) {
                    this.i.a(this.k, aulqVar.pX(PrefilledFormCompanionExtensionRendererOuterClass.prefilledFormCompanionExtensionRenderer));
                } else {
                    this.i.a(this.k, null);
                }
            }
            aulq aulqVar2 = this.c.f;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            if (aulqVar2.pY(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
                fqw fqwVar = this.r;
                aulq aulqVar3 = this.c.f;
                if (aulqVar3 == null) {
                    aulqVar3 = aulq.a;
                }
                fqwVar.a((aowm) aulqVar3.pX(AdCtaButtonRendererOuterClass.adCtaButtonRenderer), this.f);
            } else {
                this.r.d();
            }
            aulq aulqVar4 = this.c.g;
            if (aulqVar4 == null) {
                aulqVar4 = aulq.a;
            }
            if (aulqVar4.pY(AdThumbnailDetailsButtonRendererOuterClass.adThumbnailDetailsButtonRenderer)) {
                aulq aulqVar5 = this.c.g;
                if (aulqVar5 == null) {
                    aulqVar5 = aulq.a;
                }
                aoyu aoyuVar = (aoyu) aulqVar5.pX(AdThumbnailDetailsButtonRendererOuterClass.adThumbnailDetailsButtonRenderer);
                if ((aoyuVar.b & 8) != 0) {
                    aahd aahdVar = this.a;
                    apxf apxfVar = aoyuVar.f;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.c(apxfVar, null);
                    aone builder = aoyuVar.toBuilder();
                    builder.copyOnWrite();
                    aoyu aoyuVar2 = (aoyu) builder.instance;
                    aoyuVar2.f = null;
                    aoyuVar2.b &= -9;
                    aoyuVar = (aoyu) builder.build();
                    aone builder2 = this.c.toBuilder();
                    aulq aulqVar6 = this.c.g;
                    if (aulqVar6 == null) {
                        aulqVar6 = aulq.a;
                    }
                    aong aongVar = (aong) aulqVar6.toBuilder();
                    aongVar.e(AdThumbnailDetailsButtonRendererOuterClass.adThumbnailDetailsButtonRenderer, aoyuVar);
                    builder2.copyOnWrite();
                    aqbm aqbmVar4 = (aqbm) builder2.instance;
                    aulq aulqVar7 = (aulq) aongVar.build();
                    aulqVar7.getClass();
                    aqbmVar4.g = aulqVar7;
                    aqbmVar4.b |= 16;
                    this.c = (aqbm) builder2.build();
                }
                final int i2 = 0;
                this.u.b(new fqy(this) { // from class: men
                    public final /* synthetic */ meo a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.fqy
                    public final void a(Object obj, List list) {
                        if (i2 == 0) {
                            meo meoVar = this.a;
                            if (obj == null || meoVar.b.d(obj)) {
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
                            hashMap.put("MacrosConverters.CustomConvertersKey", new afxe[]{meoVar.d});
                            whl.J(meoVar.a, list, hashMap);
                            return;
                        }
                        this.a.b(obj, list);
                    }
                });
                this.u.a(aoyuVar, this.f);
            } else {
                this.u.d();
            }
            mer merVar = this.j;
            View rootView = this.k.getRootView();
            ImageView imageView2 = this.q;
            aulq aulqVar8 = this.c.i;
            if (aulqVar8 == null) {
                aulqVar8 = aulq.a;
            }
            if (aulqVar8.pY(MenuRendererOuterClass.menuRenderer)) {
                aulq aulqVar9 = this.c.i;
                if (aulqVar9 == null) {
                    aulqVar9 = aulq.a;
                }
                atdcVar = (atdc) aulqVar9.pX(MenuRendererOuterClass.menuRenderer);
            } else {
                atdcVar = null;
            }
            aqbm aqbmVar5 = this.c;
            if ((aqbmVar5.b & 2048) != 0) {
                aqev aqevVar2 = aqbmVar5.n;
                if (aqevVar2 == null) {
                    aqevVar2 = aqev.a;
                }
                aqevVar = aqevVar2;
            } else {
                aqevVar = null;
            }
            merVar.a(rootView, imageView2, atdcVar, aqevVar, this.c, acra.l);
            this.k.setOnClickListener(new View.OnClickListener() { // from class: mem
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    meo meoVar = meo.this;
                    aqbm aqbmVar6 = meoVar.c;
                    if (aqbmVar6 == null || (aqbmVar6.b & 128) == 0) {
                        return;
                    }
                    apxf apxfVar2 = aqbmVar6.j;
                    if (apxfVar2 == null) {
                        apxfVar2 = apxf.a;
                    }
                    meoVar.b(aqbmVar6, amru.r(apxfVar2));
                }
            });
            this.f.u(new acqx(this.c.o), null);
            aahd aahdVar2 = this.a;
            aqbm aqbmVar6 = this.c;
            whl.I(aahdVar2, aqbmVar6.l, aqbmVar6);
            aone builder3 = this.c.toBuilder();
            builder3.copyOnWrite();
            ((aqbm) builder3.instance).l = aqbm.emptyProtobufList();
            this.c = (aqbm) builder3.build();
            g();
        }
    }

    @Override // defpackage.wmz
    public final void e(View view) {
        this.g = "";
        this.h = false;
        c(view);
        this.c = null;
    }

    @Override // defpackage.wmz
    public final void f() {
        this.h = true;
        g();
    }

    @Override // defpackage.wmz
    public final void h(xad xadVar) {
        aahd aahdVar = this.a;
        aqbm aqbmVar = this.c;
        apxf apxfVar = null;
        if (aqbmVar != null && (aqbmVar.b & 512) != 0 && (apxfVar = aqbmVar.m) == null) {
            apxfVar = apxf.a;
        }
        mfm.c(aahdVar, aqbmVar, apxfVar, this.u);
    }

    @Override // defpackage.wnb
    public final boolean i(String str, aqde aqdeVar, ashd ashdVar) {
        this.g = str;
        this.c = null;
        if ((aqdeVar.b & 8) == 0) {
            return false;
        }
        aqbm aqbmVar = aqdeVar.f;
        if (aqbmVar == null) {
            aqbmVar = aqbm.a;
        }
        this.c = aqbmVar;
        return true;
    }

    @Override // defpackage.wna
    public final boolean j(String str, aulq aulqVar) {
        this.g = str;
        if (aulqVar == null || !aulqVar.pY(CompactCompanionAdRendererOuterClass.compactCompanionAdRenderer)) {
            return false;
        }
        this.c = (aqbm) aulqVar.pX(CompactCompanionAdRendererOuterClass.compactCompanionAdRenderer);
        return true;
    }

    @Override // defpackage.wna
    public final boolean k(aulq aulqVar, boolean z) {
        if (!j(this.g, aulqVar)) {
            return false;
        }
        this.h = true;
        return true;
    }
}
