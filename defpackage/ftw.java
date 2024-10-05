package defpackage;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Spanned;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ftw implements View.OnClickListener {
    public final View a;
    public ImageView b;
    public TextView c;
    public apmp d;
    public ftv e;
    private final aahd f;
    private final ajut g;
    private final ysy h;
    private final int i;
    private final int j;
    private final aoae k;

    public ftw(aahd aahdVar, ajut ajutVar, ysy ysyVar, aoae aoaeVar, View view, byte[] bArr) {
        this.f = aahdVar;
        this.g = ajutVar;
        this.a = view;
        this.h = ysyVar;
        this.k = aoaeVar;
        this.b = (ImageView) view.findViewById(R.id.toggle_button_icon);
        this.c = (TextView) view.findViewById(R.id.toggle_button_text);
        view.setOnClickListener(this);
        this.i = view.getResources().getDimensionPixelSize(R.dimen.button_corner_radius);
        this.j = view.getResources().getDimensionPixelSize(R.dimen.button_outline_width);
    }

    private final GradientDrawable f(int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(this.i);
        gradientDrawable.setStroke(this.j, i2);
        return gradientDrawable;
    }

    public final void a() {
        this.a.setVisibility(8);
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        TextView textView = this.c;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public final void b(apmp apmpVar) {
        this.d = apmpVar;
        d();
        this.k.c(this.d, this.a);
    }

    public final void c() {
        apmp apmpVar;
        if (e() || (apmpVar = this.d) == null) {
            return;
        }
        aone builder = apmpVar.toBuilder();
        boolean z = this.d.e;
        builder.copyOnWrite();
        apmp apmpVar2 = (apmp) builder.instance;
        apmpVar2.b |= 8;
        apmpVar2.e = !z;
        apmp apmpVar3 = (apmp) builder.build();
        this.d = apmpVar3;
        ftv ftvVar = this.e;
        if (ftvVar != null) {
            ftvVar.a(apmpVar3.e);
        }
        d();
    }

    public final boolean e() {
        apmp apmpVar = this.d;
        return apmpVar == null || apmpVar.f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apxf apxfVar;
        apmp apmpVar = this.d;
        if (apmpVar == null) {
            return;
        }
        if (apmpVar.e) {
            apxfVar = apmpVar.p;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = apmpVar.k;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        }
        this.f.c(apxfVar, acrc.g(this.d));
        if (this.h.o()) {
            c();
        }
    }

    private static int g(apmp apmpVar) {
        apmq apmqVar;
        int aI;
        if (apmpVar.e) {
            apmq apmqVar2 = apmpVar.q;
            if (apmqVar2 == null) {
                apmqVar2 = apmq.a;
            }
            aI = anaf.aI(apmqVar2.b);
            if (aI == 0) {
                return 1;
            }
        } else {
            if (apmpVar.c == 1) {
                apmqVar = (apmq) apmpVar.d;
            } else {
                apmqVar = apmq.a;
            }
            aI = anaf.aI(apmqVar.b);
            if (aI == 0) {
                return 1;
            }
        }
        return aI;
    }

    public final void d() {
        apmp apmpVar;
        arfs arfsVar;
        apmp apmpVar2;
        aqyg aqygVar;
        Spanned b;
        aqyg aqygVar2;
        if (e()) {
            a();
            return;
        }
        GradientDrawable gradientDrawable = null;
        if (this.c != null && (apmpVar2 = this.d) != null) {
            if (apmpVar2.e) {
                if ((apmpVar2.b & 4096) != 0) {
                    aqygVar2 = apmpVar2.n;
                    if (aqygVar2 == null) {
                        aqygVar2 = aqyg.a;
                    }
                } else {
                    aqygVar2 = null;
                }
                b = ajcq.b(aqygVar2);
            } else {
                if ((apmpVar2.b & 64) != 0) {
                    aqygVar = apmpVar2.h;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                } else {
                    aqygVar = null;
                }
                b = ajcq.b(aqygVar);
            }
            whu.G(this.c, b);
        }
        apmp apmpVar3 = this.d;
        if (apmpVar3 != null) {
            int g = g(apmpVar3) - 1;
            if (g == 12) {
                this.c.setTextColor(wbs.Q(this.a.getContext(), R.attr.ytCallToAction));
            } else if (g == 13) {
                this.c.setTextColor(wbs.Q(this.a.getContext(), R.attr.ytTextSecondary));
            } else if (g == 15) {
                this.c.setTextColor(wbs.Q(this.a.getContext(), R.attr.ytOverlayTextPrimary));
            }
        }
        ImageView imageView = this.b;
        if (imageView != null && (apmpVar = this.d) != null) {
            boolean z = apmpVar.e;
            boolean z2 = true;
            if (!z ? (apmpVar.b & 32) == 0 : (apmpVar.b & 2048) == 0) {
                z2 = false;
            }
            if (z2) {
                if (z) {
                    arfsVar = apmpVar.m;
                    if (arfsVar == null) {
                        arfsVar = arfs.a;
                    }
                } else {
                    arfsVar = apmpVar.g;
                    if (arfsVar == null) {
                        arfsVar = arfs.a;
                    }
                }
                ImageView imageView2 = this.b;
                ajut ajutVar = this.g;
                arfr b2 = arfr.b(arfsVar.c);
                if (b2 == null) {
                    b2 = arfr.UNKNOWN;
                }
                imageView2.setImageResource(ajutVar.a(b2));
                this.b.setContentDescription(z ? apmpVar.o : apmpVar.i);
                if (this.c != null) {
                    ImageView imageView3 = this.b;
                    Drawable drawable = imageView3.getDrawable();
                    zau.e(drawable, this.c.getCurrentTextColor(), PorterDuff.Mode.SRC_IN);
                    imageView3.setImageDrawable(drawable);
                }
                this.b.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        apmp apmpVar4 = this.d;
        if (apmpVar4 != null) {
            int g2 = g(apmpVar4) - 1;
            if (g2 == 12) {
                gradientDrawable = f(0, wbs.Q(this.a.getContext(), R.attr.ytCallToAction));
            } else if (g2 == 13) {
                gradientDrawable = f(0, wbs.Q(this.a.getContext(), R.attr.ytTextSecondary));
            } else if (g2 == 15) {
                gradientDrawable = f(wbs.Q(this.a.getContext(), R.attr.ytOverlayButtonPrimary), 0);
            }
            if (gradientDrawable != null) {
                whu.F(this.a, gradientDrawable, 0);
            }
        }
        this.a.setVisibility(0);
    }
}
