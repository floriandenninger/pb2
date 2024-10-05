package defpackage;

import android.os.Build;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alie {
    static final int a;
    public static boolean b;
    public static Constructor c;
    public static Object d;
    public CharSequence e;
    public final TextPaint f;
    public final int g;
    public int h;
    public boolean n;
    public Layout.Alignment i = Layout.Alignment.ALIGN_NORMAL;
    public int j = Integer.MAX_VALUE;
    public float k = 1.0f;
    public int l = a;
    public boolean m = true;
    public TextUtils.TruncateAt o = null;

    static {
        a = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    public alie(CharSequence charSequence, TextPaint textPaint, int i) {
        this.e = charSequence;
        this.f = textPaint;
        this.g = i;
        this.h = charSequence.length();
    }
}
