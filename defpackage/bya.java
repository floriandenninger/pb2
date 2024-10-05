package defpackage;

import androidx.viewpager.widget.ViewPager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bya implements Runnable {
    final /* synthetic */ ViewPager a;

    public bya(ViewPager viewPager) {
        this.a = viewPager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.q(0);
        this.a.h();
    }
}
