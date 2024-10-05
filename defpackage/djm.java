package defpackage;

import androidx.viewpager.widget.ViewPager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class djm implements Runnable {
    final /* synthetic */ ViewPager a;
    final /* synthetic */ djn b;
    private final /* synthetic */ int c;

    public djm(ViewPager viewPager, djn djnVar, int i) {
        this.c = i;
        this.a = viewPager;
        this.b = djnVar;
    }

    public djm(djn djnVar, ViewPager viewPager, int i) {
        this.c = i;
        this.b = djnVar;
        this.a = viewPager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            this.a.e(this.b);
        } else {
            this.a.j(this.b);
        }
    }
}
