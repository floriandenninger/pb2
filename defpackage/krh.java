package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class krh extends kre {
    private TextView A;
    private fqw B;
    private fqw C;
    private final ajyw D;
    private TextView z;

    public krh(Context context, ajjz ajjzVar, ajyw ajywVar, aaea aaeaVar, acra acraVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(context, ajjzVar, aaeaVar, acraVar);
        this.D = ajywVar;
    }

    @Override // defpackage.kre, defpackage.kqt
    public final void c() {
        aqyg aqygVar;
        if (this.r == null || this.f == null) {
            return;
        }
        super.c();
        apxb apxbVar = ((apxa) this.r).d;
        if (apxbVar == null) {
            apxbVar = apxb.a;
        }
        int bX = amkq.bX(apxbVar.g);
        if (bX == 0) {
            bX = 1;
        }
        this.x = bX;
        apwz apwzVar = ((apxa) this.r).e;
        if (apwzVar == null) {
            apwzVar = apwz.a;
        }
        int bX2 = amkq.bX(apwzVar.c);
        if (bX2 == 0) {
            bX2 = 1;
        }
        this.y = bX2;
        this.f.setImageResource(R.drawable.website_linkout);
        apxa apxaVar = (apxa) this.r;
        if ((apxaVar.b & 1) != 0) {
            ajjz ajjzVar = this.a;
            ImageView imageView = this.f;
            avgg avggVar = apxaVar.c;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            krg krgVar = new krg(this);
            ajju a = ajjv.a();
            a.d(true);
            a.c = krgVar;
            ajjzVar.k(imageView, avggVar, a.a());
        }
        TextView textView = this.z;
        apxb apxbVar2 = ((apxa) this.r).d;
        if (apxbVar2 == null) {
            apxbVar2 = apxb.a;
        }
        aqyg aqygVar2 = null;
        if ((apxbVar2.b & 2) != 0) {
            apxb apxbVar3 = ((apxa) this.r).d;
            if (apxbVar3 == null) {
                apxbVar3 = apxb.a;
            }
            aqygVar = apxbVar3.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        TextView textView2 = this.A;
        apxb apxbVar4 = ((apxa) this.r).d;
        if (apxbVar4 == null) {
            apxbVar4 = apxb.a;
        }
        if ((apxbVar4.b & 4) != 0) {
            apxb apxbVar5 = ((apxa) this.r).d;
            if (apxbVar5 == null) {
                apxbVar5 = apxb.a;
            }
            aqygVar2 = apxbVar5.e;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        }
        textView2.setText(ajcq.b(aqygVar2));
        apxb apxbVar6 = ((apxa) this.r).d;
        if (apxbVar6 == null) {
            apxbVar6 = apxb.a;
        }
        aulq aulqVar = apxbVar6.c;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
            apxb apxbVar7 = ((apxa) this.r).d;
            if (apxbVar7 == null) {
                apxbVar7 = apxb.a;
            }
            aulq aulqVar2 = apxbVar7.c;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            aowm aowmVar = (aowm) aulqVar2.pX(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
            this.i = aowmVar.o;
            this.B.e(true);
            this.B.c(aowmVar);
        }
        apwz apwzVar2 = ((apxa) this.r).e;
        if (apwzVar2 == null) {
            apwzVar2 = apwz.a;
        }
        aulq aulqVar3 = apwzVar2.b;
        if (aulqVar3 == null) {
            aulqVar3 = aulq.a;
        }
        if (aulqVar3.pY(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
            apwz apwzVar3 = ((apxa) this.r).e;
            if (apwzVar3 == null) {
                apwzVar3 = apwz.a;
            }
            aulq aulqVar4 = apwzVar3.b;
            if (aulqVar4 == null) {
                aulqVar4 = aulq.a;
            }
            aowm aowmVar2 = (aowm) aulqVar4.pX(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
            this.j = aowmVar2.o;
            this.C.e(true);
            this.C.c(aowmVar2);
        }
        Drawable background = this.d.getBackground();
        apxb apxbVar8 = ((apxa) this.r).d;
        if (apxbVar8 == null) {
            apxbVar8 = apxb.a;
        }
        background.setColorFilter(apxbVar8.f, PorterDuff.Mode.SRC);
        if (((apxa) this.r).h) {
            this.d.setElevation(10.0f);
            this.e.setZ(10.0f);
            this.f.setZ(10.0f);
            this.h.setZ(10.0f);
        }
    }

    @Override // defpackage.kre, defpackage.kqt
    public final void d() {
        super.d();
        fqw fqwVar = this.B;
        if (fqwVar != null) {
            fqwVar.d();
            this.B.e(false);
        }
        fqw fqwVar2 = this.C;
        if (fqwVar2 != null) {
            fqwVar2.d();
            this.C.e(false);
        }
    }

    @Override // defpackage.kre
    protected final void h(View view) {
        this.c = whu.z(view, R.id.collapsible_ad_cta_overlay_stub, R.id.collapsible_ad_cta_overlay);
        this.d = this.c.findViewById(R.id.expanded_background_container);
        this.e = this.c.findViewById(R.id.expanded_metadata_container);
        this.f = (ImageView) this.c.findViewById(R.id.thumbnail_icon);
        this.z = (TextView) this.c.findViewById(R.id.expanded_title);
        this.A = (TextView) this.c.findViewById(R.id.expanded_description);
        fqw r = this.D.r(this, this.c.findViewById(R.id.expanded_cta_button));
        this.B = r;
        this.g = r.a;
        fqw r2 = this.D.r(this, this.c.findViewById(R.id.collapsed_cta_button));
        this.C = r2;
        this.h = r2.a;
        this.d.setOnClickListener(new krf(this, 1));
        this.f.setOnClickListener(new krf(this, 0));
    }
}
