package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ CharSequence a;
    public final /* synthetic */ com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b b;
    private final /* synthetic */ int c;

    public /* synthetic */ g(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b bVar, CharSequence charSequence, int i) {
        this.c = i;
        this.b = bVar;
        this.a = charSequence;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b bVar = this.b;
            CharSequence charSequence = this.a;
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g gVar = bVar.a;
            if (gVar != null) {
                gVar.o(charSequence);
                return;
            }
            return;
        }
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b bVar2 = this.b;
        CharSequence charSequence2 = this.a;
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g gVar2 = bVar2.a;
        if (gVar2 != null) {
            gVar2.z(charSequence2);
        }
    }
}
