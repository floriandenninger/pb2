package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czf extends cze {
    private czf(Drawable drawable) {
        super(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ctd g(Drawable drawable) {
        if (drawable != null) {
            return new czf(drawable);
        }
        return null;
    }

    @Override // defpackage.ctd
    public final int a() {
        return Math.max(1, this.a.getIntrinsicWidth() * this.a.getIntrinsicHeight() * 4);
    }

    @Override // defpackage.ctd
    public final Class b() {
        return this.a.getClass();
    }

    @Override // defpackage.ctd
    public final void e() {
    }
}
