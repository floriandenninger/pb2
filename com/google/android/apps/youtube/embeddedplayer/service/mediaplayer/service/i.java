package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service;

import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.n;
import defpackage.afkx;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ n a;
    private final /* synthetic */ int b;

    public /* synthetic */ i(n nVar, int i) {
        this.b = i;
        this.a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afkx afkxVar;
        afkx afkxVar2;
        int i = this.b;
        if (i == 0) {
            e eVar = this.a.a;
            if (eVar == null || (afkxVar = eVar.b) == null) {
                return;
            }
            afkxVar.b();
            return;
        }
        if (i != 1) {
            e eVar2 = this.a.a;
            if (eVar2 == null || (afkxVar2 = eVar2.b) == null) {
                return;
            }
            afkxVar2.b();
            return;
        }
        e eVar3 = this.a.a;
        if (eVar3 != null) {
            eVar3.c = null;
            afkx afkxVar3 = eVar3.b;
            if (afkxVar3 != null) {
                afkxVar3.d();
            }
        }
    }
}
