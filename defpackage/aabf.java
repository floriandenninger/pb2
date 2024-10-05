package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aabf implements Runnable {
    final /* synthetic */ Drawable a;

    public aabf(Drawable drawable) {
        this.a = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.setState(aabg.a);
    }
}
