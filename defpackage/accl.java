package defpackage;

import com.google.android.libraries.youtube.livecreation.controller.StreamConfig;
import com.google.android.libraries.youtube.livecreation.screencast.ScreencastHostService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class accl implements zfi {
    public final /* synthetic */ boolean a;
    private final /* synthetic */ int b;

    public /* synthetic */ accl(boolean z, int i) {
        this.b = i;
        this.a = z;
    }

    @Override // defpackage.zfi
    public final void a(Object obj) {
        if (this.b == 0) {
            int i = ScreencastHostService.s;
            ((StreamConfig) obj).o = this.a;
            return;
        }
        boolean z = this.a;
        hih hihVar = (hih) obj;
        if (hihVar != null) {
            hihVar.aH(z);
        }
    }
}
