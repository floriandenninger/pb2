package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import defpackage.alta;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bg implements Runnable {
    public final /* synthetic */ bk a;
    private final /* synthetic */ int b;

    public /* synthetic */ bg(bk bkVar, int i) {
        this.b = i;
        this.a = bkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                bk bkVar = this.a;
                bkVar.a.j = false;
                bkVar.b();
                return;
            } else {
                bk bkVar2 = this.a;
                bkVar2.a.j = false;
                bkVar2.b();
                return;
            }
        }
        bk bkVar3 = this.a;
        if (bkVar3.a.g.c.getVisibility() == 0) {
            alta.C("Shutter view is visible while video is playing.", new Object[0]);
        }
        bkVar3.a.x.kV();
        bn bnVar = bkVar3.a;
        bnVar.j = true;
        if (bnVar.f()) {
            bkVar3.a.B.g();
        }
    }
}
