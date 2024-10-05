package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ob extends om {
    aee a;
    aeh b;

    public ob(ob obVar, og ogVar, Resources resources) {
        super(obVar, ogVar, resources);
        if (obVar != null) {
            this.a = obVar.a;
            this.b = obVar.b;
        } else {
            this.a = new aee();
            this.b = new aeh();
        }
    }

    public static long c(int i, int i2) {
        return i2 | (i << 32);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(int i) {
        if (i < 0) {
            return 0;
        }
        return ((Integer) this.b.f(i, 0)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(int[] iArr) {
        int m = super.m(iArr);
        return m >= 0 ? m : super.m(StateSet.WILD_CARD);
    }

    @Override // defpackage.om, defpackage.oj
    public final void d() {
        this.a = this.a.clone();
        this.b = this.b.clone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(int i, int i2, Drawable drawable, boolean z) {
        int f = super.f(drawable);
        long c = c(i, i2);
        long j = true != z ? 0L : 8589934592L;
        long j2 = f;
        this.a.i(c, Long.valueOf(j2 | j));
        if (z) {
            this.a.i(c(i2, i), Long.valueOf(4294967296L | j2 | j));
        }
    }

    @Override // defpackage.om, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new og(this, null);
    }

    @Override // defpackage.om, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new og(this, resources);
    }
}
