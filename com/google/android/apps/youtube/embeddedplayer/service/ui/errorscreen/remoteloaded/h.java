package com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ b a;
    private final /* synthetic */ int b;

    public /* synthetic */ h(b bVar, int i) {
        this.b = i;
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            b bVar = this.a;
            bVar.d = false;
            bVar.X();
        } else {
            b bVar2 = this.a;
            bVar2.d = true;
            bVar2.Z(1);
            bVar2.aa();
        }
    }
}
