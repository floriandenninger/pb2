package defpackage;

import android.text.Layout;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pqg {
    public static final Comparator a = bea.l;
    public final ppp b;
    public final int c;

    public pqg(CharSequence charSequence, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
        ppo ppoVar = new ppo();
        ppoVar.a = charSequence;
        ppoVar.c = alignment;
        ppoVar.b(f, 0);
        ppoVar.e = i;
        ppoVar.f = f2;
        ppoVar.g = i2;
        ppoVar.h = -3.4028235E38f;
        if (z) {
            ppoVar.d(i3);
        }
        this.b = ppoVar.a();
        this.c = i4;
    }
}
