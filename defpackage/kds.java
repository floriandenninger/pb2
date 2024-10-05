package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MetadataBadgeRendererOuterClass;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kds implements kdf {
    private final ajoy A;
    public kdv a;
    private final Context b;
    private final acra c;
    private final ajjz d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private TextView m;
    private TextView n;
    private TextView o;
    private ImageView p;
    private View q;
    private kdg r;
    private View s;
    private TextView t;
    private View u;
    private TextView v;
    private View w;
    private fhg x;
    private boolean y;
    private long z;

    public kds(Context context, acra acraVar, ajjz ajjzVar, ajoy ajoyVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.b = context;
        acraVar.getClass();
        this.c = acraVar;
        ajjzVar.getClass();
        this.d = ajjzVar;
        this.A = ajoyVar;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.autonav_explicit_action_button_vertical_margin);
        this.g = dimensionPixelSize;
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.autonav_explicit_action_button_vertical_margin_fullscreen);
        this.h = dimensionPixelSize2;
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.autonav_explicit_action_button_height);
        this.i = dimensionPixelSize3;
        int dimensionPixelSize4 = context.getResources().getDimensionPixelSize(R.dimen.autonav_explicit_action_button_height_fullscreen);
        this.j = dimensionPixelSize4;
        this.k = context.getResources().getDimensionPixelSize(R.dimen.autonav_info_panel_margin_bottom);
        this.l = context.getResources().getDimensionPixelSize(R.dimen.autonav_info_panel_margin_bottom_fullscreen);
        this.e = dimensionPixelSize3 + dimensionPixelSize + dimensionPixelSize;
        this.f = dimensionPixelSize4 + dimensionPixelSize2 + dimensionPixelSize2;
    }

    private final void h(fhg fhgVar) {
        kdg kdgVar = this.r;
        boolean b = fhgVar.b();
        int i = R.style.TextAppearance_YouTube_Spec_Body2a;
        if (b && !this.y) {
            i = R.style.TextAppearance_YouTube_Spec_Display1;
        }
        YouTubeTextView youTubeTextView = kdgVar.d;
        youTubeTextView.setTextAppearance(youTubeTextView.getContext(), i);
        YouTubeTextView youTubeTextView2 = kdgVar.d;
        youTubeTextView2.setTextColor(wbs.Q(youTubeTextView2.getContext(), R.attr.ytOverlayTextPrimary));
    }

    @Override // defpackage.kdf
    public final int a() {
        fhg fhgVar = this.x;
        return (fhgVar == null || !fhgVar.b()) ? this.e : this.f;
    }

    @Override // defpackage.kdf
    public final void b(kdv kdvVar, ViewGroup viewGroup) {
        this.a = kdvVar;
        LayoutInflater.from(this.b).inflate(R.layout.explicit_actions_autonav_view, viewGroup, true);
        this.m = (TextView) viewGroup.findViewById(R.id.countdown_text);
        this.n = (TextView) viewGroup.findViewById(R.id.title);
        this.o = (TextView) viewGroup.findViewById(R.id.alternative_title);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.close_button);
        this.p = imageView;
        imageView.setOnClickListener(new kdr(this, 1));
        View findViewById = viewGroup.findViewById(R.id.cancel);
        this.s = findViewById;
        findViewById.setOnClickListener(new kdr(this, 0));
        this.t = (TextView) viewGroup.findViewById(R.id.cancel_text);
        View findViewById2 = viewGroup.findViewById(R.id.play);
        this.u = findViewById2;
        findViewById2.setOnClickListener(new kdr(this, 2));
        this.v = (TextView) viewGroup.findViewById(R.id.play_text);
        this.w = viewGroup.findViewById(R.id.action_bar);
        this.q = viewGroup.findViewById(R.id.info_panel);
        this.r = new kdg(this.q, this.d, this.b, this.A, null, null, null, null);
    }

    @Override // defpackage.kdf
    public final void c(int i, int i2) {
        if (this.y != (i2 > i)) {
            this.y = i2 > i;
            h(this.x);
        }
    }

    @Override // defpackage.kdf
    public final void d(fhg fhgVar) {
        fhg fhgVar2 = this.x;
        if (fhgVar2 == fhgVar) {
            return;
        }
        if (fhgVar2 == null || fhgVar2.b() != fhgVar.b()) {
            yny.z(this.w, yny.h(yny.n(fhgVar.b() ? this.j : this.i), yny.k(fhgVar.b() ? this.h : this.g)), ViewGroup.MarginLayoutParams.class);
            yny.z(this.q, yny.k(fhgVar.b() ? this.l : this.k), ViewGroup.MarginLayoutParams.class);
            h(fhgVar);
        }
        this.x = fhgVar;
    }

    @Override // defpackage.kdf
    public final void e(long j, long j2) {
        long seconds = TimeUnit.MILLISECONDS.toSeconds((j2 - j) + 999);
        if (this.z != seconds) {
            this.z = seconds;
            TextView textView = this.m;
            String l = Long.toString(seconds);
            String string = textView.getResources().getString(R.string.up_next_in, Long.valueOf(seconds));
            int indexOf = string.indexOf(l);
            SpannableString spannableString = new SpannableString(string);
            if (indexOf != -1) {
                spannableString.setSpan(new ForegroundColorSpan(wbs.Q(textView.getContext(), R.attr.ytOverlayTextPrimary)), indexOf, l.length() + indexOf, 33);
            }
            textView.setText(spannableString);
        }
    }

    @Override // defpackage.kdf
    public final void f(boolean z) {
        whu.I(this.m, !z);
        whu.I(this.n, z);
    }

    @Override // defpackage.kdf
    public final void g(atzm atzmVar) {
        String str;
        aqyg aqygVar;
        String str2;
        aqyg aqygVar2;
        String str3;
        aqyg aqygVar3;
        aqyg aqygVar4;
        kdg kdgVar = this.r;
        kdgVar.i = atzmVar;
        kdgVar.j = false;
        kdgVar.j = true;
        aqyg aqygVar5 = null;
        if (kdgVar.i != null) {
            ajjz ajjzVar = kdgVar.a;
            ImageView imageView = kdgVar.f;
            avgg avggVar = kdgVar.a().j;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            ajjzVar.h(imageView, avggVar);
            YouTubeTextView youTubeTextView = kdgVar.d;
            if ((kdgVar.a().b & 2) != 0) {
                aqygVar3 = kdgVar.a().d;
                if (aqygVar3 == null) {
                    aqygVar3 = aqyg.a;
                }
            } else {
                aqygVar3 = null;
            }
            youTubeTextView.setText(ajcq.b(aqygVar3));
            TextView textView = kdgVar.e;
            if ((kdgVar.a().b & 4) != 0) {
                aqygVar4 = kdgVar.a().e;
                if (aqygVar4 == null) {
                    aqygVar4 = aqyg.a;
                }
            } else {
                aqygVar4 = null;
            }
            textView.setText(ajcq.b(aqygVar4));
            fkc.m(kdgVar.g, null, null, kdgVar.a().k, null);
            kdgVar.h.setContentDescription(kdgVar.d.getText());
            whu.I(kdgVar.c, false);
            kdgVar.c.removeAllViews();
            atzm atzmVar2 = kdgVar.i;
            aony<aulq> aonyVar = atzmVar2 != null ? atzmVar2.n : null;
            if (aonyVar != null && !aonyVar.isEmpty()) {
                for (aulq aulqVar : aonyVar) {
                    if (aulqVar.pY(MetadataBadgeRendererOuterClass.metadataBadgeRenderer)) {
                        atdu atduVar = (atdu) aulqVar.pX(MetadataBadgeRendererOuterClass.metadataBadgeRenderer);
                        View inflate = LayoutInflater.from(kdgVar.b).inflate(R.layout.metadata_badge, (ViewGroup) kdgVar.c, false);
                        kdgVar.k.I(kdgVar.b, inflate).f(atduVar);
                        kdgVar.c.addView(inflate);
                    }
                }
                whu.I(kdgVar.c, true);
            }
        }
        apmg b = ahbj.b(atzmVar);
        if (b != null) {
            this.r.b(new kdr(this, 3));
            whu.I(this.u, true);
            TextView textView2 = this.v;
            if ((b.b & 256) != 0) {
                aqygVar2 = b.i;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
            } else {
                aqygVar2 = null;
            }
            textView2.setText(ajcq.b(aqygVar2));
            View view = this.u;
            if ((b.b & 65536) != 0) {
                aots aotsVar = b.r;
                if (aotsVar == null) {
                    aotsVar = aots.a;
                }
                str3 = aotsVar.c;
            } else {
                str3 = null;
            }
            view.setContentDescription(str3);
            this.c.u(new acqx(b.t.I()), null);
        } else {
            this.r.b(null);
            whu.I(this.u, false);
        }
        apmg a = ahbj.a(atzmVar);
        if (a != null) {
            ImageView imageView2 = this.p;
            if ((a.b & 65536) != 0) {
                aots aotsVar2 = a.r;
                if (aotsVar2 == null) {
                    aotsVar2 = aots.a;
                }
                str = aotsVar2.c;
            } else {
                str = null;
            }
            imageView2.setContentDescription(str);
            TextView textView3 = this.t;
            if ((a.b & 256) != 0) {
                aqygVar = a.i;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            textView3.setText(ajcq.b(aqygVar));
            View view2 = this.s;
            if ((65536 & a.b) != 0) {
                aots aotsVar3 = a.r;
                if (aotsVar3 == null) {
                    aotsVar3 = aots.a;
                }
                str2 = aotsVar3.c;
            } else {
                str2 = null;
            }
            view2.setContentDescription(str2);
            whu.I(this.s, true);
            this.c.u(new acqx(a.t.I()), null);
        } else {
            ImageView imageView3 = this.p;
            imageView3.setContentDescription(imageView3.getResources().getString(R.string.accessibility_close_button));
            whu.I(this.s, false);
        }
        if (atzmVar == null) {
            return;
        }
        TextView textView4 = this.n;
        if ((atzmVar.b & 1) != 0 && (aqygVar5 = atzmVar.c) == null) {
            aqygVar5 = aqyg.a;
        }
        textView4.setText(ajcq.b(aqygVar5));
        if ((atzmVar.b & 8) == 0) {
            whu.I(this.o, false);
            return;
        }
        TextView textView5 = this.o;
        aqyg aqygVar6 = atzmVar.f;
        if (aqygVar6 == null) {
            aqygVar6 = aqyg.a;
        }
        textView5.setText(ajcq.b(aqygVar6));
        this.o.setFocusable(true);
        whu.I(this.o, true);
    }
}
