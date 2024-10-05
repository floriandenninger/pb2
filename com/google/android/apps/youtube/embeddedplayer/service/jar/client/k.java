package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import defpackage.alvc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class k {
    public final /* synthetic */ alvc a;

    public k(alvc alvcVar) {
        this.a = alvcVar;
    }

    public final void a(boolean z) {
        alvc alvcVar = this.a;
        if (alvcVar.au()) {
            alvcVar.L = alvcVar.B();
            alvcVar.ar();
            if (!z) {
                if (alvcVar.G.isShowing()) {
                    alvcVar.G.dismiss();
                }
            } else {
                if (alvcVar.G.isShowing()) {
                    return;
                }
                alvcVar.G.show();
            }
        }
    }

    public final void b(boolean z) {
        this.a.am(z);
    }

    public final void c() {
        this.a.c();
        alvc alvcVar = this.a;
        if (alvcVar.L) {
            alvcVar.g();
        }
    }
}
