package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.comment.image.ImagePreviewSelectView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.HintRendererOuterClass;
import com.google.protos.youtube.api.innertube.ImagePreviewSelectRendererOuterClass;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xth extends xry implements xta {
    public xtb a;
    public argh ae;
    public xuh af;
    public vgz ag;
    private MenuItem ah;
    public shf b;
    public aahd c;
    public ImagePreviewSelectView d;
    public argg e;

    private final void o(xuh xuhVar) {
        if (this.d == null || xuhVar == null || xuhVar.c == null) {
            return;
        }
        this.ah.setEnabled(true);
        this.af = xuhVar;
        ImagePreviewSelectView imagePreviewSelectView = this.d;
        Drawable drawable = xuhVar.c;
        argf argfVar = xuhVar.d;
        imagePreviewSelectView.h = 0.0f;
        imagePreviewSelectView.j.reset();
        imagePreviewSelectView.k.reset();
        imagePreviewSelectView.l = false;
        imagePreviewSelectView.i.set(0.0f, 0.0f);
        imagePreviewSelectView.m.set(0.0f, 0.0f, 0.0f, 0.0f);
        imagePreviewSelectView.n = 0.0f;
        imagePreviewSelectView.o = 0;
        imagePreviewSelectView.p = 1;
        imagePreviewSelectView.f = drawable;
        imagePreviewSelectView.g = argfVar;
        if (drawable == null) {
            imagePreviewSelectView.p = 1;
        } else if (drawable.getIntrinsicHeight() == drawable.getIntrinsicWidth()) {
            imagePreviewSelectView.p = 4;
        } else if (drawable.getIntrinsicHeight() < drawable.getIntrinsicWidth()) {
            imagePreviewSelectView.p = 2;
        } else {
            imagePreviewSelectView.p = 3;
        }
        imagePreviewSelectView.a.setImageDrawable(drawable);
        whu.I(imagePreviewSelectView.a, false);
        whu.I(imagePreviewSelectView.b, false);
        whu.I(imagePreviewSelectView.c, false);
        whu.I(imagePreviewSelectView.d, false);
        whu.I(imagePreviewSelectView.e, false);
        int i = imagePreviewSelectView.p;
        if (i == 2) {
            whu.I(imagePreviewSelectView.a, true);
            whu.I(imagePreviewSelectView.b, true);
            whu.I(imagePreviewSelectView.c, true);
        } else if (i == 3) {
            whu.I(imagePreviewSelectView.a, true);
            whu.I(imagePreviewSelectView.d, true);
            whu.I(imagePreviewSelectView.e, true);
        } else if (i == 4) {
            whu.I(imagePreviewSelectView.a, true);
        }
        imagePreviewSelectView.requestLayout();
    }

    @Override // defpackage.xta
    public final void g(xuh xuhVar, apmg apmgVar) {
    }

    @Override // defpackage.ce
    public final void lZ() {
        this.a.f(this);
        super.lZ();
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        this.e = null;
        try {
            argg arggVar = (argg) amkq.cj(this.m, "image_preview_select_endpoint", argg.a, aomw.b());
            this.e = arggVar;
            if ((arggVar.b & 1) != 0) {
                aulq aulqVar = arggVar.c;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                if (aulqVar.pY(ImagePreviewSelectRendererOuterClass.imagePreviewSelectRenderer)) {
                    aulq aulqVar2 = this.e.c;
                    if (aulqVar2 == null) {
                        aulqVar2 = aulq.a;
                    }
                    this.ae = (argh) aulqVar2.pX(ImagePreviewSelectRendererOuterClass.imagePreviewSelectRenderer);
                    return;
                }
            }
            zga.b("PreviewSelectRenderer is missing.");
        } catch (aoob e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        aqyg aqygVar;
        arec arecVar;
        View inflate = layoutInflater.inflate(R.layout.image_preview_select_fragment, viewGroup, false);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        toolbar.o(R.string.accessibility_navigation_back_button);
        toolbar.l(R.menu.image_preview_select_action_menu);
        argh arghVar = this.ae;
        if ((arghVar.b & 1) != 0) {
            aqygVar = arghVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        toolbar.x(ajcq.b(aqygVar));
        toolbar.q = new yq() { // from class: xtc
            /* JADX WARN: Removed duplicated region for block: B:32:0x00ff  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x0115  */
            @Override // defpackage.yq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean a(android.view.MenuItem r15) {
                /*
                    Method dump skipped, instructions count: 357
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.xtc.a(android.view.MenuItem):boolean");
            }
        };
        toolbar.r(new View.OnClickListener() { // from class: xtd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xth.this.C().onBackPressed();
            }
        });
        if ((this.ae.b & 2) != 0) {
            MenuItem findItem = toolbar.g().findItem(R.id.save_button);
            this.ah = findItem;
            aqyg aqygVar2 = this.ae.d;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            findItem.setTitle(ajcq.b(aqygVar2));
            this.ah.setEnabled(false);
        }
        final View findViewById = inflate.findViewById(R.id.tooltip);
        final TextView textView = (TextView) inflate.findViewById(R.id.tooltip_text);
        final View findViewById2 = inflate.findViewById(R.id.dismiss_button);
        whu.I(findViewById, false);
        argh arghVar2 = this.ae;
        if ((arghVar2.b & 4) != 0) {
            aulq aulqVar = arghVar2.e;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (aulqVar.pY(HintRendererOuterClass.hintRenderer)) {
                aulq aulqVar2 = this.ae.e;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                final arej arejVar = (arej) aulqVar2.pX(HintRendererOuterClass.hintRenderer);
                areg aregVar = arejVar.d;
                if (aregVar == null) {
                    aregVar = areg.a;
                }
                if (aregVar.b == 106514900) {
                    arecVar = (arec) aregVar.c;
                } else {
                    arecVar = arec.a;
                }
                if ((arecVar.b & 2) != 0) {
                    ynm.n(this, anfq.h(this.ag.a(), wgr.n, angq.a), oph.i, new zfi() { // from class: xtf
                        @Override // defpackage.zfi
                        public final void a(Object obj) {
                            arec arecVar2;
                            final xth xthVar = xth.this;
                            arej arejVar2 = arejVar;
                            final View view = findViewById;
                            TextView textView2 = textView;
                            View view2 = findViewById2;
                            ammv ammvVar = (ammv) obj;
                            if (ammvVar.h()) {
                                arei areiVar = arejVar2.g;
                                if (areiVar == null) {
                                    areiVar = arei.a;
                                }
                                if ((areiVar.b & 1) == 0) {
                                    return;
                                }
                                long longValue = ((Long) ammvVar.c()).longValue();
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                arei areiVar2 = arejVar2.g;
                                if (areiVar2 == null) {
                                    areiVar2 = arei.a;
                                }
                                if (longValue + timeUnit.toMillis(areiVar2.c) >= xthVar.b.c()) {
                                    return;
                                }
                            }
                            whu.I(view, true);
                            areg aregVar2 = arejVar2.d;
                            if (aregVar2 == null) {
                                aregVar2 = areg.a;
                            }
                            if (aregVar2.b == 106514900) {
                                arecVar2 = (arec) aregVar2.c;
                            } else {
                                arecVar2 = arec.a;
                            }
                            aqyg aqygVar3 = arecVar2.f;
                            if (aqygVar3 == null) {
                                aqygVar3 = aqyg.a;
                            }
                            textView2.setText(aahk.a(aqygVar3, xthVar.c, false));
                            view2.setOnClickListener(new View.OnClickListener() { // from class: xte
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    final xth xthVar2 = xth.this;
                                    whu.I(view, false);
                                    ynm.n(xthVar2, xthVar2.ag.b(new amml() { // from class: xtg
                                        @Override // defpackage.amml
                                        public final Object apply(Object obj2) {
                                            xth xthVar3 = xth.this;
                                            aone builder = ((awuo) obj2).toBuilder();
                                            long c = xthVar3.b.c();
                                            builder.copyOnWrite();
                                            awuo awuoVar = (awuo) builder.instance;
                                            awuoVar.b |= 1;
                                            awuoVar.c = c;
                                            return (awuo) builder.build();
                                        }
                                    }, angq.a), oph.h, oph.j);
                                }
                            });
                        }
                    });
                }
            }
        }
        this.d = (ImagePreviewSelectView) inflate.findViewById(R.id.image_preview_select_view);
        this.a.c(this);
        o(this.a.d);
        return inflate;
    }

    @Override // defpackage.xta
    public final void qI(xuh xuhVar) {
        o(xuhVar);
    }
}
