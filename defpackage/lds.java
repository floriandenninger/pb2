package defpackage;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MenuRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lds extends ajpc {
    private final Context a;
    private final ajjz b;
    private final aahd c;
    private final ajuw d;
    private final ajut e;
    private final int f;
    private final FrameLayout g;
    private ajoi h;

    public lds(Context context, ajjz ajjzVar, aahd aahdVar, ajuw ajuwVar, ajut ajutVar) {
        this.a = context;
        this.b = ajjzVar;
        this.d = ajuwVar;
        this.c = aahdVar;
        this.e = ajutVar;
        this.g = new FrameLayout(context);
        this.f = wbs.W(context, R.attr.ytCallToAction).orElse(0);
    }

    private final void f(TextView textView, int i, int i2, int i3) {
        Drawable drawable = this.a.getResources().getDrawable(i);
        int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.fact_check_open_in_new_icon_bottom_margin);
        drawable.setBounds(0, 0, i2, i2);
        drawable.mutate().setColorFilter(i3, PorterDuff.Mode.SRC_IN);
        ldr ldrVar = new ldr(drawable, dimensionPixelSize);
        String valueOf = String.valueOf(textView.getText());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2);
        sb.append(valueOf);
        sb.append("  ");
        SpannableString spannableString = new SpannableString(sb.toString());
        int length = spannableString.length();
        spannableString.setSpan(ldrVar, length - 1, length, 33);
        textView.setText(spannableString);
    }

    private final void g(ajok ajokVar, aqvt aqvtVar) {
        aulq aulqVar = aqvtVar.b;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(MenuRendererOuterClass.menuRenderer)) {
            View findViewById = this.g.findViewById(R.id.contextual_menu_anchor);
            aulq aulqVar2 = aqvtVar.b;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            this.d.e(this.g, findViewById, (atdc) aulqVar2.pX(MenuRendererOuterClass.menuRenderer), aqvtVar, ajokVar.a);
        }
        ImageView imageView = (ImageView) this.g.findViewById(R.id.image);
        ajjz ajjzVar = this.b;
        avgg avggVar = aqvtVar.c;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        ajjzVar.h(imageView, avggVar);
        imageView.setColorFilter((ColorFilter) null);
        YouTubeTextView youTubeTextView = (YouTubeTextView) this.g.findViewById(R.id.box_title);
        aqyg aqygVar = aqvtVar.d;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        youTubeTextView.setText(ajcq.b(aqygVar));
        YouTubeTextView youTubeTextView2 = (YouTubeTextView) this.g.findViewById(R.id.claim_text);
        aqyg aqygVar2 = aqvtVar.h;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        youTubeTextView2.setText(ajcq.b(aqygVar2));
        YouTubeTextView youTubeTextView3 = (YouTubeTextView) this.g.findViewById(R.id.rating_text);
        aqyg aqygVar3 = aqvtVar.j;
        if (aqygVar3 == null) {
            aqygVar3 = aqyg.a;
        }
        youTubeTextView3.setText(ajcq.b(aqygVar3));
    }

    private final void h(arfr arfrVar, int i) {
        ImageView imageView = (ImageView) this.g.findViewById(R.id.box_title_icon);
        if (imageView != null) {
            imageView.setImageResource(this.e.a(arfrVar));
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().mutate().setColorFilter(wbs.W(this.a, i).orElse(0), PorterDuff.Mode.SRC_IN);
            }
        }
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.g;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.h.c();
    }

    @Override // defpackage.ajpc
    public final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aqvt aqvtVar = (aqvt) obj;
        this.g.removeAllViews();
        LayoutInflater from = LayoutInflater.from(this.a);
        int aX = aocz.aX(aqvtVar.l);
        if (aX == 0 || aX != 2) {
            int aX2 = aocz.aX(aqvtVar.l);
            if (aX2 == 0 || aX2 != 4) {
                int aX3 = aocz.aX(aqvtVar.l);
                if (aX3 == 0 || aX3 != 3) {
                    int aX4 = aocz.aX(aqvtVar.l);
                    if (aX4 == 0) {
                        aX4 = 1;
                    }
                    StringBuilder sb = new StringBuilder(79);
                    sb.append("Unexpected FactCheckRendererStyle value '");
                    sb.append(aX4 - 1);
                    sb.append("'. Defaulting to EXTENSIVE.");
                    Log.w("FactCheckPresenter", sb.toString());
                }
                this.g.addView(from.inflate(R.layout.fact_check_extensive, (ViewGroup) null));
                g(ajokVar, aqvtVar);
                YouTubeTextView youTubeTextView = (YouTubeTextView) this.g.findViewById(R.id.article_title);
                aqyg aqygVar = aqvtVar.g;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
                youTubeTextView.setText(ajcq.b(aqygVar));
                arfs arfsVar = aqvtVar.i;
                if (arfsVar == null) {
                    arfsVar = arfs.a;
                }
                if ((arfsVar.b & 1) != 0) {
                    ajut ajutVar = this.e;
                    arfs arfsVar2 = aqvtVar.i;
                    if (arfsVar2 == null) {
                        arfsVar2 = arfs.a;
                    }
                    arfr b = arfr.b(arfsVar2.c);
                    if (b == null) {
                        b = arfr.UNKNOWN;
                    }
                    f(youTubeTextView, ajutVar.a(b), this.a.getResources().getDimensionPixelSize(R.dimen.fact_check_open_in_new_icon_size), this.f);
                }
                arfs arfsVar3 = aqvtVar.e;
                if (arfsVar3 == null) {
                    arfsVar3 = arfs.a;
                }
                if ((arfsVar3.b & 1) != 0) {
                    arfs arfsVar4 = aqvtVar.e;
                    if (arfsVar4 == null) {
                        arfsVar4 = arfs.a;
                    }
                    arfr b2 = arfr.b(arfsVar4.c);
                    if (b2 == null) {
                        b2 = arfr.UNKNOWN;
                    }
                    h(b2, R.attr.ytIconActiveOther);
                }
            } else {
                this.g.addView(from.inflate(R.layout.fact_check_v2, (ViewGroup) null));
                g(ajokVar, aqvtVar);
                YouTubeTextView youTubeTextView2 = (YouTubeTextView) this.g.findViewById(R.id.source_text);
                aqyg aqygVar2 = aqvtVar.k;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
                youTubeTextView2.setText(ajcq.b(aqygVar2));
                YouTubeTextView youTubeTextView3 = (YouTubeTextView) this.g.findViewById(R.id.article_title);
                aqyg aqygVar3 = aqvtVar.g;
                if (aqygVar3 == null) {
                    aqygVar3 = aqyg.a;
                }
                youTubeTextView3.setText(ajcq.b(aqygVar3));
                arfs arfsVar5 = aqvtVar.i;
                if (arfsVar5 == null) {
                    arfsVar5 = arfs.a;
                }
                if ((arfsVar5.b & 1) != 0) {
                    ajut ajutVar2 = this.e;
                    arfs arfsVar6 = aqvtVar.i;
                    if (arfsVar6 == null) {
                        arfsVar6 = arfs.a;
                    }
                    arfr b3 = arfr.b(arfsVar6.c);
                    if (b3 == null) {
                        b3 = arfr.UNKNOWN;
                    }
                    f(youTubeTextView3, ajutVar2.a(b3), this.a.getResources().getDimensionPixelSize(R.dimen.fact_check_open_in_new_icon_size), this.f);
                }
                arfs arfsVar7 = aqvtVar.e;
                if (arfsVar7 == null) {
                    arfsVar7 = arfs.a;
                }
                if ((arfsVar7.b & 1) != 0) {
                    arfs arfsVar8 = aqvtVar.e;
                    if (arfsVar8 == null) {
                        arfsVar8 = arfs.a;
                    }
                    arfr b4 = arfr.b(arfsVar8.c);
                    if (b4 == null) {
                        b4 = arfr.UNKNOWN;
                    }
                    h(b4, R.attr.ytTextPrimary);
                }
                ImageView imageView = (ImageView) this.g.findViewById(R.id.image);
                imageView.setBackgroundResource(R.drawable.rounded_outline_2dp);
                imageView.setClipToOutline(true);
            }
        } else {
            this.g.addView(from.inflate(R.layout.fact_check_compact, (ViewGroup) null));
            g(ajokVar, aqvtVar);
            TextView textView = (TextView) this.g.findViewById(R.id.box_title);
            ajut ajutVar3 = this.e;
            arfs arfsVar9 = aqvtVar.i;
            if (arfsVar9 == null) {
                arfsVar9 = arfs.a;
            }
            arfr b5 = arfr.b(arfsVar9.c);
            if (b5 == null) {
                b5 = arfr.UNKNOWN;
            }
            f(textView, ajutVar3.a(b5), this.a.getResources().getDimensionPixelSize(R.dimen.fact_check_open_in_new_icon_size), this.f);
        }
        ajoi ajoiVar = new ajoi(this.c, this.g);
        this.h = ajoiVar;
        acra acraVar = ajokVar.a;
        apxf apxfVar = aqvtVar.f;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        ajoiVar.a(acraVar, apxfVar, ajokVar.e());
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqvt) obj).m.I();
    }
}
