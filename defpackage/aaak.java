package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaak implements aabn {
    private final ajjz a;
    private ImageSpan b;

    public aaak(ajjz ajjzVar) {
        ajjzVar.getClass();
        this.a = ajjzVar;
    }

    @Override // defpackage.aabn
    public final wv a(Context context, ViewGroup viewGroup, zzz zzzVar, boolean z) {
        return new aaaj(LayoutInflater.from(context).inflate(true != z ? R.layout.info_card_simple_watch_next : R.layout.info_card_simple, viewGroup, false));
    }

    @Override // defpackage.aabn
    public final void b(Context context, aaaa aaaaVar, wv wvVar, aabq aabqVar) {
        aqyg aqygVar;
        apxf apxfVar;
        avgg avggVar;
        aqyg aqygVar2;
        aaaj aaajVar = (aaaj) wvVar;
        arhi d = aaaaVar.d();
        aqyg aqygVar3 = null;
        if ((d.b & 2) != 0) {
            aqygVar = d.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b = ajcq.b(aqygVar);
        if ((d.b & 64) != 0) {
            apxfVar = d.h;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        apxfVar.getClass();
        if ((d.b & 1) != 0) {
            avggVar = d.c;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
        } else {
            avggVar = null;
        }
        avggVar.getClass();
        if ((d.b & 4) != 0) {
            aqygVar2 = d.e;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        Spanned b2 = ajcq.b(aqygVar2);
        if ((d.b & 32) != 0 && (aqygVar3 = d.g) == null) {
            aqygVar3 = aqyg.a;
        }
        CharSequence b3 = ajcq.b(aqygVar3);
        if (b3 != null) {
            b3 = b3.toString().toUpperCase(context.getResources().getConfiguration().locale);
        }
        this.a.h(aaajVar.t, avggVar);
        whu.G(aaajVar.u, b2);
        whu.G(aaajVar.v, b);
        if (b3 != null) {
            if (d.f) {
                TextView textView = aaajVar.w;
                if (this.b == null) {
                    this.b = new ImageSpan(context, BitmapFactory.decodeResource(context.getResources(), R.drawable.info_card_link), 1);
                }
                ImageSpan imageSpan = this.b;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(b3);
                spannableStringBuilder.append((char) 160);
                spannableStringBuilder.append((char) 160);
                spannableStringBuilder.append((char) 8195);
                spannableStringBuilder.append((char) 8195);
                spannableStringBuilder.setSpan(imageSpan, spannableStringBuilder.length() - 2, spannableStringBuilder.length(), 17);
                textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
            } else {
                aaajVar.w.setText(b3);
            }
            aaajVar.w.setContentDescription(b3);
            aaajVar.w.setVisibility(0);
        } else {
            aaajVar.w.setVisibility(8);
        }
        aaajVar.a.setOnClickListener(new aaai(aabqVar, apxfVar));
    }
}
