package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.AdThumbnailDetailsButtonRendererOuterClass;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class not implements nqb {
    public final aahd a;
    public final wzq b;
    public final apbo c;
    private final Context d;
    private final ajjz e;
    private final acra f;
    private final ajco g;
    private View h;
    private ImageView i;
    private View j;
    private TextView k;
    private View l;
    private View m;
    private final ajyw n;

    public not(Context context, ajjz ajjzVar, aahd aahdVar, wzq wzqVar, ajyw ajywVar, acra acraVar, apbo apboVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.d = context;
        this.e = ajjzVar;
        this.a = aahdVar;
        this.b = wzqVar;
        this.f = acraVar;
        this.c = apboVar;
        this.n = ajywVar;
        ajcn a = ajco.a();
        a.a = context;
        this.g = a.a();
    }

    private final void n() {
        if (this.h != null) {
            return;
        }
        View inflate = LayoutInflater.from(this.d).inflate(R.layout.ad_compact_engagement_panel_header, (ViewGroup) null, false);
        this.h = inflate;
        inflate.setOnClickListener(new View.OnClickListener() { // from class: nor
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                not notVar = not.this;
                apbo apboVar = notVar.c;
                if ((apboVar.b & 64) == 0 || notVar.b.d(apboVar)) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", notVar.c);
                aahd aahdVar = notVar.a;
                apxf apxfVar = notVar.c.i;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.c(apxfVar, hashMap);
            }
        });
        this.h.setClickable((this.c.b & 64) != 0);
        this.i = (ImageView) this.h.findViewById(R.id.primary_image);
        this.j = this.h.findViewById(R.id.ad_badge);
        this.k = (TextView) this.h.findViewById(R.id.primary_text);
        this.l = this.h.findViewById(R.id.cta_button);
        this.m = this.h.findViewById(R.id.close_button);
    }

    @Override // defpackage.nqb
    public final View a() {
        return null;
    }

    @Override // defpackage.nqb
    public final View b() {
        n();
        return this.h;
    }

    @Override // defpackage.nqb
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.nqb
    public final void d() {
        aqyg aqygVar;
        n();
        this.f.n(new acqx(this.c.j));
        Drawable background = this.h.getBackground();
        if (background != null && (background.getCurrent() instanceof GradientDrawable)) {
            GradientDrawable gradientDrawable = (GradientDrawable) background.getCurrent().mutate();
            gradientDrawable.setColor(this.c.c);
            this.h.setBackground(gradientDrawable);
        }
        apbo apboVar = this.c;
        final int i = 1;
        if ((apboVar.b & 2) == 0) {
            this.i.setVisibility(8);
        } else {
            ajjz ajjzVar = this.e;
            ImageView imageView = this.i;
            avgg avggVar = apboVar.d;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            nhk nhkVar = new nhk(2);
            ajju a = ajjv.a();
            a.d(true);
            a.c = nhkVar;
            ajjzVar.k(imageView, avggVar, a.a());
        }
        whu.I(this.j, !this.c.e);
        TextView textView = this.k;
        apbo apboVar2 = this.c;
        if ((apboVar2.b & 8) != 0) {
            aqygVar = apboVar2.f;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView, ajcq.d(aqygVar, this.g));
        aulq aulqVar = this.c.g;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
            final int i2 = 0;
            fqw r = this.n.r(new fqy(this) { // from class: nos
                public final /* synthetic */ not a;

                {
                    this.a = this;
                }

                @Override // defpackage.fqy
                public final void a(Object obj, List list) {
                    if (i2 != 0) {
                        not notVar = this.a;
                        if (notVar.b.d(obj)) {
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
                        whl.J(notVar.a, list, hashMap);
                        return;
                    }
                    not notVar2 = this.a;
                    if (notVar2.b.d(obj)) {
                        return;
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
                    whl.J(notVar2.a, list, hashMap2);
                }
            }, this.l);
            aulq aulqVar2 = this.c.g;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            r.c((aowm) aulqVar2.pX(AdCtaButtonRendererOuterClass.adCtaButtonRenderer));
        } else {
            this.l.setVisibility(8);
        }
        aulq aulqVar3 = this.c.h;
        if (aulqVar3 == null) {
            aulqVar3 = aulq.a;
        }
        if (aulqVar3.pY(AdThumbnailDetailsButtonRendererOuterClass.adThumbnailDetailsButtonRenderer)) {
            frb frbVar = new frb(this.m, this.e, new fqy(this) { // from class: nos
                public final /* synthetic */ not a;

                {
                    this.a = this;
                }

                @Override // defpackage.fqy
                public final void a(Object obj, List list) {
                    if (i != 0) {
                        not notVar = this.a;
                        if (notVar.b.d(obj)) {
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
                        whl.J(notVar.a, list, hashMap);
                        return;
                    }
                    not notVar2 = this.a;
                    if (notVar2.b.d(obj)) {
                        return;
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
                    whl.J(notVar2.a, list, hashMap2);
                }
            });
            aulq aulqVar4 = this.c.h;
            if (aulqVar4 == null) {
                aulqVar4 = aulq.a;
            }
            frbVar.a((aoyu) aulqVar4.pX(AdThumbnailDetailsButtonRendererOuterClass.adThumbnailDetailsButtonRenderer), null);
            return;
        }
        this.m.setVisibility(8);
    }

    @Override // defpackage.nqb
    public final void e(boolean z) {
    }

    @Override // defpackage.nqb
    public final void f(boolean z) {
    }

    @Override // defpackage.nqb
    public final void g(auwh auwhVar) {
    }

    @Override // defpackage.nqb
    public final void h(nqe nqeVar) {
    }

    @Override // defpackage.nqb
    public final void i(nqc nqcVar) {
    }

    @Override // defpackage.nqb
    public final void j(CharSequence charSequence) {
    }

    @Override // defpackage.nqb
    public final void k(CharSequence charSequence) {
    }

    @Override // defpackage.nqb
    public final boolean l() {
        return false;
    }

    @Override // defpackage.nqb
    public final void m(nqr nqrVar) {
    }
}
