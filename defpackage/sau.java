package defpackage;

import android.text.TextPaint;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sau implements CharSequence {
    private static final Pattern h = Pattern.compile("\n");
    public final String[] a;
    public int b;
    public int c;
    public int d;
    public int e;
    public final float[] f;
    public final TextPaint g = new TextPaint();
    private final CharSequence i;

    public sau(CharSequence charSequence) {
        sbt.h(charSequence);
        this.i = charSequence;
        String[] split = h.split(charSequence);
        this.a = split;
        this.f = new float[split.length];
    }

    public static sau a(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (charSequence instanceof sau) {
            return (sau) charSequence;
        }
        return new sau(charSequence);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.i.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.i.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.i.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.i.toString();
    }
}
