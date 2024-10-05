package defpackage;

import android.support.v4.widget.ContentLoadingProgressBar;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class lk implements Runnable {
    public final /* synthetic */ ContentLoadingProgressBar a;
    private final /* synthetic */ int b;

    public /* synthetic */ lk(ContentLoadingProgressBar contentLoadingProgressBar, int i) {
        this.b = i;
        this.a = contentLoadingProgressBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            ContentLoadingProgressBar contentLoadingProgressBar = this.a;
            contentLoadingProgressBar.c = false;
            if (contentLoadingProgressBar.d) {
                return;
            }
            contentLoadingProgressBar.a = System.currentTimeMillis();
            contentLoadingProgressBar.setVisibility(0);
            return;
        }
        if (i == 1) {
            ContentLoadingProgressBar contentLoadingProgressBar2 = this.a;
            contentLoadingProgressBar2.b = false;
            contentLoadingProgressBar2.a = -1L;
            contentLoadingProgressBar2.setVisibility(8);
            return;
        }
        if (i != 2) {
            ContentLoadingProgressBar contentLoadingProgressBar3 = this.a;
            contentLoadingProgressBar3.d = true;
            contentLoadingProgressBar3.removeCallbacks(contentLoadingProgressBar3.f);
            contentLoadingProgressBar3.c = false;
            long currentTimeMillis = System.currentTimeMillis();
            long j = contentLoadingProgressBar3.a;
            long j2 = currentTimeMillis - j;
            if (j2 >= 500 || j == -1) {
                contentLoadingProgressBar3.setVisibility(8);
                return;
            } else {
                if (contentLoadingProgressBar3.b) {
                    return;
                }
                contentLoadingProgressBar3.postDelayed(contentLoadingProgressBar3.e, 500 - j2);
                contentLoadingProgressBar3.b = true;
                return;
            }
        }
        ContentLoadingProgressBar contentLoadingProgressBar4 = this.a;
        contentLoadingProgressBar4.a = -1L;
        contentLoadingProgressBar4.d = false;
        contentLoadingProgressBar4.removeCallbacks(contentLoadingProgressBar4.e);
        contentLoadingProgressBar4.b = false;
        if (contentLoadingProgressBar4.c) {
            return;
        }
        contentLoadingProgressBar4.postDelayed(contentLoadingProgressBar4.f, 500L);
        contentLoadingProgressBar4.c = true;
    }
}
