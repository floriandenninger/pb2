package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Shader;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ez {
    public final Shader a;
    public int b;
    private final ColorStateList c;

    public ez(Shader shader, ColorStateList colorStateList, int i) {
        this.a = shader;
        this.c = colorStateList;
        this.b = i;
    }

    public static ez a(int i) {
        return new ez(null, null, i);
    }

    public final boolean b() {
        return this.a != null;
    }

    public final boolean c() {
        ColorStateList colorStateList;
        return this.a == null && (colorStateList = this.c) != null && colorStateList.isStateful();
    }

    public final boolean d(int[] iArr) {
        if (!c()) {
            return false;
        }
        ColorStateList colorStateList = this.c;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.b) {
            return false;
        }
        this.b = colorForState;
        return true;
    }

    public final boolean e() {
        return b() || this.b != 0;
    }
}
