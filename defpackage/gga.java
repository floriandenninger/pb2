package defpackage;

import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class gga {
    public final /* synthetic */ InlinePlaybackLifecycleController a;
    public final /* synthetic */ ggg b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ggf d;

    public /* synthetic */ gga(InlinePlaybackLifecycleController inlinePlaybackLifecycleController, ggg gggVar, int i, ggf ggfVar) {
        this.a = inlinePlaybackLifecycleController;
        this.b = gggVar;
        this.c = i;
        this.d = ggfVar;
    }

    public final void a() {
        InlinePlaybackLifecycleController inlinePlaybackLifecycleController = this.a;
        ggg gggVar = this.b;
        int i = this.c;
        ggf ggfVar = this.d;
        if (gggVar.g != 2 && gggVar.c.contains(ggfVar)) {
            int i2 = gggVar.g;
            if (i2 != 1) {
                if (i2 != 3) {
                    return;
                }
                if (gggVar.f + 1 != i) {
                    if (i != 0) {
                        return;
                    } else {
                        i = 0;
                    }
                }
            } else if (gggVar.f + 1 != i) {
                return;
            }
            gggVar.a(ggfVar);
            String.valueOf(String.valueOf(ggfVar)).length();
            if (gggVar.b()) {
                return;
            }
            inlinePlaybackLifecycleController.a.post(new ggd(inlinePlaybackLifecycleController, i, gggVar, 1));
        }
    }
}
