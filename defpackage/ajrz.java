package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.text.style.ScaleXSpan;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajrz extends ajsf {
    private final ajut f;

    public ajrz(Context context, ajut ajutVar, ajsd ajsdVar, boolean z, ajsg ajsgVar, boolean z2) {
        super(context, ajsdVar, z, ajsgVar, z2);
        ajutVar.getClass();
        this.f = ajutVar;
    }

    private final void h(String str, StringBuilder sb) {
        if (!this.c || sb == null) {
            return;
        }
        sb.append(str);
    }

    public final void a(String str, avgg avggVar, float f, Object obj, int i, SpannableStringBuilder spannableStringBuilder, StringBuilder sb) {
        f(obj, i, spannableStringBuilder);
        ajrx ajrxVar = new ajrx();
        ajrxVar.a = obj;
        ajrxVar.b = i;
        int length = spannableStringBuilder.length();
        ajrxVar.c = length;
        ajrxVar.d = length + str.length();
        ajrxVar.e = f;
        spannableStringBuilder.append((CharSequence) str);
        h(c(avggVar), sb);
        h(" ", sb);
        this.e.a(ajrxVar, avggVar, Math.round(f), this);
    }

    public final void b(SpannableStringBuilder spannableStringBuilder, StringBuilder sb, List list, float f, Object obj, int i, boolean z) {
        Object imageSpan;
        f(obj, i, spannableStringBuilder);
        if (list == null || list.size() <= 0) {
            return;
        }
        float dimension = this.a.getResources().getDimension(R.dimen.badge_height);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ajry ajryVar = (ajry) it.next();
            if (!z || (ajryVar.b != arfr.VERIFIED && ajryVar.b != arfr.OWNER)) {
                if (f != 0.0f) {
                    spannableStringBuilder.append(" ");
                    if (f != 1.0f) {
                        spannableStringBuilder.setSpan(new ScaleXSpan(f), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    }
                }
                avgg avggVar = ajryVar.a;
                if (avggVar != null) {
                    a(" ", avggVar, dimension, obj, i, spannableStringBuilder, sb);
                } else if (ajryVar.b != arfr.UNKNOWN) {
                    int a = this.f.a(ajryVar.b);
                    if (a != 0) {
                        Drawable mutate = aii.a(this.a, a).mutate();
                        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                        Integer num = ajryVar.d;
                        if (num != null) {
                            mutate.setTint(num.intValue());
                        }
                        if (this.b) {
                            imageSpan = new ajse(mutate);
                        } else {
                            imageSpan = new ImageSpan(mutate);
                        }
                        spannableStringBuilder.append(" ");
                        spannableStringBuilder.setSpan(imageSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    }
                    if (!TextUtils.isEmpty(ajryVar.c)) {
                        h(ajryVar.c, sb);
                        h(" ", sb);
                    }
                }
            }
        }
    }
}
