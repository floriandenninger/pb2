package defpackage;

import android.content.res.Resources;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ufb {
    public final int a;
    public final int b;
    private final int c;
    private final int d;

    public ufb(Resources resources) {
        this.c = resources.getDimensionPixelSize(R.dimen.og_apd_large_ring_width);
        this.d = resources.getDimensionPixelSize(R.dimen.og_apd_small_ring_width);
        this.a = resources.getDimensionPixelSize(R.dimen.og_apd_min_avatar_size_for_large_ring);
        this.b = resources.getDimensionPixelSize(R.dimen.og_apd_max_avatar_size_for_small_ring);
    }

    public final float a(int i, int i2, int i3) {
        int i4;
        if (i >= i2) {
            i4 = this.c;
        } else {
            if (i > i3) {
                return this.d + ((this.c - r0) * ((i - i3) / (i2 - i3)));
            }
            i4 = this.d;
        }
        return i4;
    }

    public final float b(int i) {
        return a(i, this.a, this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c(int i) {
        return i + Math.round(b(i) * 4.0f) + 2;
    }
}
