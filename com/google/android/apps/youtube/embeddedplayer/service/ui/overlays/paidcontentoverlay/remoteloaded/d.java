package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.remoteloaded;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.b b;
    private final /* synthetic */ int c;

    public /* synthetic */ d(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.b bVar, boolean z, int i) {
        this.c = i;
        this.b = bVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.b bVar = this.b;
            bVar.a.b(this.a);
        } else if (i != 1) {
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.b bVar2 = this.b;
            bVar2.a.d(this.a);
        } else {
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.b bVar3 = this.b;
            bVar3.a.a(this.a);
        }
    }
}
