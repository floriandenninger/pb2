package defpackage;

import android.view.animation.AnimationUtils;
import com.google.android.libraries.video.trim.VideoTrimView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vzl implements Runnable {
    final /* synthetic */ VideoTrimView a;
    private float b;
    private long c;

    public vzl(VideoTrimView videoTrimView) {
        this.a = videoTrimView;
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

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
    
        if ((r9 + r2) > r5) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
    
        r2 = r5 - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
    
        if ((r9 + r2) < r5) goto L24;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vzl.run():void");
    }
}
