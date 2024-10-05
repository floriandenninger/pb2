package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioRelativeLayout;
import com.google.android.youtube.R;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xuw implements View.OnLayoutChangeListener, ajom {
    private final xzy a;
    private final ajjz b;
    private final DisplayMetrics c;
    private final View d;
    private final FixedAspectRatioRelativeLayout e;
    private final ImageView f;
    private final boolean g;
    private final ImageView h;
    private apiq i;
    private boolean j;

    public xuw(Context context, ajjz ajjzVar, afri afriVar, aadw aadwVar, Executor executor) {
        ajjzVar.getClass();
        this.b = ajjzVar;
        this.c = context.getResources().getDisplayMetrics();
        View inflate = View.inflate(context, R.layout.backstage_image, null);
        this.d = inflate;
        this.e = (FixedAspectRatioRelativeLayout) inflate.findViewById(R.id.image_layout);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.image_view);
        this.f = imageView;
        this.h = (ImageView) inflate.findViewById(R.id.backstage_image_badge);
        boolean d = d(aadwVar);
        this.g = d;
        if (d) {
            this.a = new xzy(ajjzVar, afriVar, imageView, executor);
        } else {
            this.a = null;
        }
    }

    public static boolean d(aadw aadwVar) {
        apwy b = aadwVar.b();
        if (b == null) {
            return true;
        }
        atej atejVar = b.k;
        if (atejVar == null) {
            atejVar = atej.a;
        }
        if ((atejVar.c & 524288) == 0) {
            return true;
        }
        atej atejVar2 = b.k;
        if (atejVar2 == null) {
            atejVar2 = atej.a;
        }
        apcv apcvVar = atejVar2.A;
        if (apcvVar == null) {
            apcvVar = apcv.a;
        }
        return apcvVar.b;
    }

    private final void e() {
        if (this.i == null || this.f.getWidth() == 0) {
            return;
        }
        xzy xzyVar = this.a;
        avgg avggVar = this.i.b;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        boolean z = this.j;
        int width = xzyVar.c.getWidth();
        if (width != 0 && avggVar != null) {
            xzyVar.f = z;
            Uri D = ahbw.D(avggVar, width);
            if (xzyVar.c.getWidth() == 0 || D == null || D.toString().isEmpty()) {
                xzyVar.c.setImageDrawable(null);
                xzyVar.e = null;
            } else if (!D.equals(xzyVar.e)) {
                xzyVar.a.m(D, new xzx(xzyVar.c, xzyVar.b, xzyVar.d, xzyVar.f));
                xzyVar.e = D;
            }
        }
        this.f.removeOnLayoutChangeListener(this);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        if (this.g) {
            this.a.a();
            this.f.removeOnLayoutChangeListener(this);
        } else {
            this.b.e(this.f);
        }
        this.i = null;
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        int i;
        apiq apiqVar = (apiq) obj;
        avgg avggVar = apiqVar.b;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        if (ahbw.L(avggVar)) {
            this.j = false;
            if (ajokVar.j("postsV2FullThumbnailStyle", false)) {
                this.j = true;
            }
            ajokVar.a.u(new acqx(apiqVar.c), null);
            this.i = apiqVar;
            this.h.setVisibility(8);
            if (this.j) {
                this.h.setVisibility(0);
            }
            avgg avggVar2 = apiqVar.b;
            if (avggVar2 == null) {
                avggVar2 = avgg.a;
            }
            avgf F = ahbw.F(avggVar2);
            int i2 = F.d;
            if (i2 <= 0 || (i = F.e) <= 0) {
                FixedAspectRatioRelativeLayout fixedAspectRatioRelativeLayout = this.e;
                fixedAspectRatioRelativeLayout.a = 1.0f;
                fixedAspectRatioRelativeLayout.b(Integer.MAX_VALUE);
                this.e.a(Integer.MAX_VALUE);
                if (this.g) {
                    this.a.a();
                    return;
                } else {
                    this.b.e(this.f);
                    return;
                }
            }
            FixedAspectRatioRelativeLayout fixedAspectRatioRelativeLayout2 = this.e;
            fixedAspectRatioRelativeLayout2.a = i2 / i;
            fixedAspectRatioRelativeLayout2.b(yjk.K(this.c, i2));
            this.e.a(yjk.K(this.c, F.e));
            if (this.g) {
                this.f.addOnLayoutChangeListener(this);
                e();
                return;
            }
            ajjz ajjzVar = this.b;
            ImageView imageView = this.f;
            avgg avggVar3 = apiqVar.b;
            if (avggVar3 == null) {
                avggVar3 = avgg.a;
            }
            ajjzVar.h(imageView, avggVar3);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        e();
    }
}
