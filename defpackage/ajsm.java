package defpackage;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import com.google.android.youtube.R;
import java.util.Arrays;
import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajsm {
    private static boolean a = false;
    private static final amru b;

    static {
        amrp f = amru.f();
        f.h(35);
        f.h(42);
        for (int i = 0; i <= 9; i++) {
            f.h(Integer.valueOf(i + 48));
        }
        b = f.g();
    }

    public static CharSequence a(CharSequence charSequence, int i, int i2, float f, int i3) {
        Spannable spannableString;
        if (!a) {
            Log.e("UnicodeEmojiUtils", "Try to use EmojiCompat before EmojiCompat.init() is called.");
        } else if (alr.b().a() == 1) {
            CharSequence d = alr.b().d(charSequence, i, i2);
            if ((f != 0.0f || i3 != 0) && (d instanceof Spannable)) {
                Spannable spannable = (Spannable) d;
                for (alw alwVar : (alw[]) spannable.getSpans(i, i2, alw.class)) {
                    spannable.setSpan(new ajxf(f, i3), spannable.getSpanStart(alwVar), spannable.getSpanEnd(alwVar), 33);
                }
            }
            return d;
        }
        if (f == 0.0f && i3 == 0) {
            return charSequence;
        }
        Matcher matcher = ajsl.a.matcher(charSequence.subSequence(i, i2));
        if (!matcher.find()) {
            return charSequence;
        }
        if (charSequence instanceof Spannable) {
            spannableString = (Spannable) charSequence;
        } else {
            spannableString = new SpannableString(charSequence);
        }
        matcher.reset();
        while (matcher.find()) {
            spannableString.setSpan(new ajxf(f, i3), matcher.start() + i, matcher.end() + i, 33);
        }
        return spannableString;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Context context) {
        amc amcVar = new amc(context, new aiy("Noto Color Emoji Compat", R.array.com_google_android_gms_fonts_certs));
        amcVar.a();
        amcVar.c(new amb(2000L));
        amru amruVar = b;
        amcVar.c = true;
        if (amruVar != null) {
            amcVar.d = new int[((amvj) amruVar).c];
            amxe it = amruVar.iterator();
            int i = 0;
            while (it.hasNext()) {
                amcVar.d[i] = ((Integer) it.next()).intValue();
                i++;
            }
            Arrays.sort(amcVar.d);
        } else {
            amcVar.d = null;
        }
        alr.f(amcVar);
        a = true;
        alr b2 = alr.b();
        b2.i(new ajsk(b2));
    }
}
