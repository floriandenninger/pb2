package com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class f implements Handler.Callback {
    final /* synthetic */ h a;

    public f(h hVar) {
        this.a = hVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int nextInt;
        h hVar = this.a;
        boolean j = (hVar.m == 4 || !h.a.contains(hVar.c.getContext().getPackageName()) || hVar.o.f()) ? hVar.j() : true;
        boolean i = hVar.i();
        boolean l = hVar.l();
        if (!j) {
            hVar.i++;
        }
        if (!i) {
            hVar.j++;
        }
        if (!l) {
            hVar.k++;
        }
        if (hVar.i >= 3) {
            hVar.d.c();
            hVar.i = 0;
        } else if (hVar.j >= 3) {
            hVar.d.a();
            hVar.j = 0;
        } else if (hVar.k >= 3) {
            hVar.d.b();
            hVar.k = 0;
        }
        if (hVar.o.f()) {
            hVar.f.sendEmptyMessageDelayed(0, 200L);
        } else {
            if (!j || !i) {
                nextInt = hVar.e.nextInt(300) + 300;
            } else {
                nextInt = hVar.e.nextInt(2000) + 1000;
            }
            hVar.f.sendEmptyMessageDelayed(0, nextInt);
        }
        return true;
    }
}
