package defpackage;

import com.google.android.libraries.youtube.livecreation.screencast.ScreencastHostService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class accp implements abvr {
    final /* synthetic */ ScreencastHostService a;
    private final int b;

    public accp(ScreencastHostService screencastHostService, boolean z) {
        this.a = screencastHostService;
        this.b = b(z);
    }

    private static final int b(boolean z) {
        return z ? 4 : 2;
    }

    @Override // defpackage.abvr
    public final void a(Object obj) {
        if (obj instanceof asrs) {
            asrs asrsVar = (asrs) obj;
            int i = this.b;
            asrsVar.copyOnWrite();
            asru asruVar = (asru) asrsVar.instance;
            asru asruVar2 = asru.a;
            asruVar.e = i - 1;
            asruVar.b |= 4;
            boolean z = this.a.getResources().getConfiguration().orientation == 1;
            asrsVar.copyOnWrite();
            asru asruVar3 = (asru) asrsVar.instance;
            asruVar3.d = b(z) - 1;
            asruVar3.b |= 2;
        }
    }
}
