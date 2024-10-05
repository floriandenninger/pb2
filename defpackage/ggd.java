package defpackage;

import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ggd implements Runnable {
    public final /* synthetic */ InlinePlaybackLifecycleController a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ggg c;
    private final /* synthetic */ int d;

    public /* synthetic */ ggd(InlinePlaybackLifecycleController inlinePlaybackLifecycleController, int i, ggg gggVar, int i2) {
        this.d = i2;
        this.a = inlinePlaybackLifecycleController;
        this.b = i;
        this.c = gggVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d != 0) {
            InlinePlaybackLifecycleController inlinePlaybackLifecycleController = this.a;
            int i = this.b;
            ggg gggVar = this.c;
            if (InlinePlaybackLifecycleController.r(i, gggVar)) {
                inlinePlaybackLifecycleController.n(i, gggVar);
                return;
            }
            return;
        }
        InlinePlaybackLifecycleController inlinePlaybackLifecycleController2 = this.a;
        int i2 = this.b;
        ggg gggVar2 = this.c;
        if (InlinePlaybackLifecycleController.r(i2, gggVar2)) {
            inlinePlaybackLifecycleController2.n(i2, gggVar2);
        }
    }
}
