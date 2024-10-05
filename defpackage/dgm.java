package defpackage;

import android.content.res.ColorStateList;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgm {
    public float b;
    public float c;
    public float d;
    public int e;
    public int f;
    public int g;
    public CharSequence h;
    public ColorStateList i;
    public TextPaint a = new TextPaint(1);
    public float j = 1.0f;
    public float k = 0.0f;
    public boolean l = true;
    public TextUtils.TruncateAt m = null;
    public int n = Integer.MAX_VALUE;
    Layout.Alignment o = Layout.Alignment.ALIGN_NORMAL;
    ajn p = ajt.c;
    public int q = 0;
    boolean r = false;

    public final void a() {
        if (this.r) {
            TextPaint textPaint = new TextPaint(this.a);
            textPaint.set(this.a);
            this.a = textPaint;
            this.r = false;
        }
    }

    public final int hashCode() {
        int color = (((((((((((((((((((((((((((((((this.a.getColor() + 31) * 31) + Float.floatToIntBits(this.a.getTextSize())) * 31) + (this.a.getTypeface() != null ? this.a.getTypeface().hashCode() : 0)) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + this.e) * 31) + this.a.linkColor) * 31) + Float.floatToIntBits(this.a.density)) * 31) + Arrays.hashCode(this.a.drawableState)) * 31) + this.f) * 31) + this.g) * 31) + Float.floatToIntBits(this.j)) * 31) + Float.floatToIntBits(this.k)) * 31) + Float.floatToIntBits(Float.MAX_VALUE)) * 31) + (this.l ? 1 : 0)) * 31;
        TextUtils.TruncateAt truncateAt = this.m;
        int hashCode = (((color + (truncateAt != null ? truncateAt.hashCode() : 0)) * 961) + this.n) * 31;
        Layout.Alignment alignment = this.o;
        int hashCode2 = (hashCode + (alignment != null ? alignment.hashCode() : 0)) * 31;
        ajn ajnVar = this.p;
        int hashCode3 = (((((((hashCode2 + (ajnVar != null ? ajnVar.hashCode() : 0)) * 31) + this.q) * 961) + Arrays.hashCode((int[]) null)) * 31) + Arrays.hashCode((int[]) null)) * 31;
        CharSequence charSequence = this.h;
        return hashCode3 + (charSequence != null ? charSequence.hashCode() : 0);
    }
}
