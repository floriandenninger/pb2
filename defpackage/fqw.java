package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fqw extends fqz {
    private final ajco d;
    private final ajut e;
    private final float f;
    private final TextView g;
    private final ImageView h;
    private final Context i;

    public fqw(ajjz ajjzVar, Context context, ajut ajutVar, fqy fqyVar, View view) {
        super(view, ajjzVar, null);
        this.e = ajutVar;
        ajcn a = ajco.a();
        a.a = context;
        this.d = a.a();
        this.f = context.getResources().getDisplayMetrics().density;
        view.setVisibility(8);
        this.g = (TextView) view.findViewById(R.id.ad_cta_button_text);
        this.h = (ImageView) view.findViewById(R.id.ad_cta_button_icon);
        this.i = context;
        if (fqyVar != null) {
            b(fqyVar);
        }
    }

    public final void a(aowm aowmVar, acra acraVar) {
        aqyg aqygVar = null;
        if (acraVar != null) {
            acraVar.u(new acqx(aowmVar.o), null);
        }
        this.c = aowmVar;
        this.a.setVisibility(0);
        akbf b = akbc.b(this.i);
        TextView textView = this.g;
        if ((aowmVar.b & 1) != 0 && (aqygVar = aowmVar.e) == null) {
            aqygVar = aqyg.a;
        }
        whu.G(textView, ajcq.e(aqygVar, this.d, b));
        if ((aowmVar.b & 2) != 0) {
            this.h.setVisibility(0);
            ajjz ajjzVar = this.b;
            ImageView imageView = this.h;
            avgg avggVar = aowmVar.f;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            ajjzVar.k(imageView, avggVar, fqz.f(0));
        } else {
            arfs arfsVar = aowmVar.g;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
            arfr b2 = arfr.b(arfsVar.c);
            if (b2 == null) {
                b2 = arfr.UNKNOWN;
            }
            if (b2 != arfr.UNKNOWN) {
                this.h.setVisibility(0);
                ImageView imageView2 = this.h;
                ajut ajutVar = this.e;
                arfs arfsVar2 = aowmVar.g;
                if (arfsVar2 == null) {
                    arfsVar2 = arfs.a;
                }
                arfr b3 = arfr.b(arfsVar2.c);
                if (b3 == null) {
                    b3 = arfr.UNKNOWN;
                }
                imageView2.setImageResource(ajutVar.a(b3));
                aqyg aqygVar2 = aowmVar.e;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
                if (aqygVar2.c.size() > 0) {
                    aqyg aqygVar3 = aowmVar.e;
                    if (aqygVar3 == null) {
                        aqygVar3 = aqyg.a;
                    }
                    if ((((aqyi) aqygVar3.c.get(0)).b & 128) == 0) {
                        ImageView imageView3 = this.h;
                        aqyg aqygVar4 = aowmVar.e;
                        if (aqygVar4 == null) {
                            aqygVar4 = aqyg.a;
                        }
                        imageView3.setColorFilter(((aqyi) aqygVar4.c.get(0)).i);
                    } else {
                        aqyg aqygVar5 = aowmVar.e;
                        if (aqygVar5 == null) {
                            aqygVar5 = aqyg.a;
                        }
                        int i = ((aqyi) aqygVar5.c.get(0)).i;
                        aqyg aqygVar6 = aowmVar.e;
                        if (aqygVar6 == null) {
                            aqygVar6 = aqyg.a;
                        }
                        this.h.setColorFilter(akbc.b(this.i).a(i, ((aqyi) aqygVar6.c.get(0)).j));
                    }
                }
            } else {
                this.h.setVisibility(8);
            }
        }
        if (this.a.getBackground().getCurrent() instanceof GradientDrawable) {
            GradientDrawable gradientDrawable = (GradientDrawable) this.a.getBackground().getCurrent().mutate();
            int intValue = aowmVar.c == 3 ? ((Integer) aowmVar.d).intValue() : 0;
            if ((aowmVar.b & 16) != 0) {
                intValue = b.a(intValue, aowmVar.h);
            }
            gradientDrawable.setColor(intValue);
            gradientDrawable.setCornerRadius(this.f * aowmVar.i);
            int i2 = aowmVar.j;
            if ((aowmVar.b & 128) != 0) {
                i2 = b.a(i2, aowmVar.k);
            }
            gradientDrawable.setStroke(Math.round(this.f * aowmVar.l), i2);
            this.a.setBackground(gradientDrawable);
        }
    }

    @Override // defpackage.fqz
    public final void b(final fqy fqyVar) {
        this.a.setOnClickListener(new View.OnClickListener() { // from class: fqv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fqw fqwVar = fqw.this;
                fqy fqyVar2 = fqyVar;
                Object obj = fqwVar.c;
                if (obj == null || fqyVar2 == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(((aowm) obj).n);
                aowm aowmVar = (aowm) fqwVar.c;
                if ((aowmVar.b & 512) != 0) {
                    apxf apxfVar = aowmVar.m;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    arrayList.add(apxfVar);
                }
                fqyVar2.a(fqwVar.c, arrayList);
            }
        });
    }

    @Override // defpackage.fqz
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        a((aowm) obj, null);
    }
}
