package com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded;

import defpackage.bxe;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class f extends bxe {
    final /* synthetic */ MutedAutoplayIndicator b;

    public f(MutedAutoplayIndicator mutedAutoplayIndicator) {
        this.b = mutedAutoplayIndicator;
    }

    @Override // defpackage.bxe
    public final void a() {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.e
            @Override // java.lang.Runnable
            public final void run() {
                f.this.b.a();
            }
        });
    }
}
