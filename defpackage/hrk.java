package defpackage;

import android.view.animation.AnimationUtils;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim.ShortsVideoTrimView2;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hrk implements Runnable {
    final /* synthetic */ ShortsVideoTrimView2 a;
    private float b;
    private long c;

    public hrk(ShortsVideoTrimView2 shortsVideoTrimView2) {
        this.a = shortsVideoTrimView2;
    }

    public final void a(float f) {
        float f2 = this.b;
        if (f2 == f) {
            return;
        }
        if (f2 == 0.0f) {
            this.a.postOnAnimation(this);
            this.c = AnimationUtils.currentAnimationTimeMillis();
        }
        this.b = f;
    }

    public final boolean b() {
        return this.b != 0.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
    
        if ((r12 + r3) > r6) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0097, code lost:
    
        r3 = r6 - r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0095, code lost:
    
        if ((r12 + r3) < r6) goto L34;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hrk.run():void");
    }
}
