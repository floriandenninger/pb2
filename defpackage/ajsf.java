package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ajsf {
    final Context a;
    protected final boolean b;
    protected final boolean c;
    protected final boolean d;
    final ajsd e;
    private SpannableStringBuilder f;
    private final ajsg g;
    private Object h;
    private int i;

    public ajsf(Context context, ajsd ajsdVar, boolean z, ajsg ajsgVar) {
        this(context, ajsdVar, z, ajsgVar, true);
    }

    public static String c(avgg avggVar) {
        if (avggVar == null || (avggVar.b & 4) == 0) {
            return "";
        }
        aott aottVar = avggVar.d;
        if (aottVar == null) {
            aottVar = aott.a;
        }
        if ((aottVar.b & 1) == 0) {
            return "";
        }
        aott aottVar2 = avggVar.d;
        if (aottVar2 == null) {
            aottVar2 = aott.a;
        }
        aots aotsVar = aottVar2.c;
        if (aotsVar == null) {
            aotsVar = aots.a;
        }
        if ((aotsVar.b & 2) == 0) {
            return "";
        }
        aott aottVar3 = avggVar.d;
        if (aottVar3 == null) {
            aottVar3 = aott.a;
        }
        aots aotsVar2 = aottVar3.c;
        if (aotsVar2 == null) {
            aotsVar2 = aots.a;
        }
        return aotsVar2.c;
    }

    public final void d(ajrx ajrxVar, Bitmap bitmap) {
        int i;
        ImageSpan imageSpan;
        yjk.f();
        if (bitmap == null) {
            return;
        }
        Object obj = ajrxVar.a;
        if ((obj == null || obj.equals(this.h)) && (i = ajrxVar.b) != 0 && i == this.i) {
            if (this.b) {
                ajse ajseVar = new ajse(this.a, bitmap);
                imageSpan = ajseVar;
                if (this.d) {
                    ajseVar.a = this.a.getResources().getDimensionPixelOffset(R.dimen.emoji_padding);
                    imageSpan = ajseVar;
                }
            } else {
                imageSpan = new ImageSpan(this.a, bitmap);
            }
            float f = ajrxVar.e;
            Rect bounds = imageSpan.getDrawable().getBounds();
            bounds.right = bounds.left + ((int) (((bounds.right - bounds.left) * f) / (bounds.bottom - bounds.top)));
            bounds.bottom = bounds.top + ((int) f);
            imageSpan.getDrawable().setBounds(bounds);
            SpannableStringBuilder spannableStringBuilder = this.f;
            if (spannableStringBuilder != null) {
                int length = spannableStringBuilder.length();
                int i2 = ajrxVar.d;
                if (length >= i2) {
                    this.f.setSpan(imageSpan, ajrxVar.c, i2, 33);
                }
            }
            this.g.a(this.f, ajrxVar.b);
        }
    }

    public final void e() {
        f(null, 0, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f(Object obj, int i, SpannableStringBuilder spannableStringBuilder) {
        this.h = obj;
        this.i = i;
        this.f = spannableStringBuilder;
    }

    public final void g(aqyg aqygVar, CharSequence charSequence, SpannableStringBuilder spannableStringBuilder, StringBuilder sb, Object obj, int i) {
        int i2;
        float dimension = this.a.getResources().getDimension(R.dimen.emoji_height);
        if (aqygVar == null || aqygVar.c.size() <= 0) {
            return;
        }
        f(obj, i, spannableStringBuilder);
        int max = Math.max(spannableStringBuilder.length() - charSequence.length(), 0);
        int max2 = Math.max(sb.length() - charSequence.length(), 0);
        for (aqyi aqyiVar : aqygVar.c) {
            if (aqyiVar.pY(aqss.b)) {
                aqss aqssVar = (aqss) aqyiVar.pX(aqss.b);
                avgg avggVar = ((aqss) aqyiVar.pX(aqss.b)).f;
                if (avggVar == null) {
                    avggVar = avgg.a;
                }
                if ((aqssVar.c & 4) != 0 && avggVar.c.size() > 0) {
                    spannableStringBuilder.delete(max, aqyiVar.c.length() + max);
                    spannableStringBuilder.insert(max, "□");
                    ajrx ajrxVar = new ajrx();
                    ajrxVar.a = obj;
                    ajrxVar.b = i;
                    ajrxVar.e = dimension;
                    ajrxVar.c = max;
                    max++;
                    ajrxVar.d = max;
                    this.e.a(ajrxVar, avggVar, Math.round(dimension), this);
                    if (this.c) {
                        String c = c(avggVar);
                        if (!TextUtils.isEmpty(c)) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(c).length() + 2);
                            sb2.append(" ");
                            sb2.append(c);
                            sb2.append(" ");
                            sb.insert(max2, sb2.toString());
                            i2 = c.length() + 2;
                            max2 += i2;
                        }
                    }
                }
            }
            if (!aqyiVar.c.isEmpty()) {
                i2 = aqyiVar.c.length();
                max += i2;
                if (this.c) {
                    max2 += i2;
                }
            }
        }
    }

    public ajsf(Context context, ajsd ajsdVar, boolean z, ajsg ajsgVar, boolean z2) {
        this.h = null;
        context.getClass();
        this.a = context;
        ajsdVar.getClass();
        this.e = ajsdVar;
        this.b = z;
        ajsgVar.getClass();
        this.g = ajsgVar;
        this.d = z2;
        this.c = zev.e(context);
    }
}
