package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.os.RemoteException;
import defpackage.alta;
import defpackage.aluy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class n {
    private boolean c;
    private long b = 0;
    private final List a = new ArrayList();
    private int d = 0;

    private final void d() {
        int i = this.d;
        if ((i == 2 || i == 3) && this.c) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                try {
                    ((aluy) it.next()).a(this.b);
                } catch (RemoteException unused) {
                    alta.B("Problem sending getDuration result to client.", new Object[0]);
                }
            }
            this.a.clear();
        }
    }

    public final synchronized void a(long j) {
        this.b = j;
        this.c = true;
        d();
    }

    public final synchronized void b(int i) {
        this.d = i;
        if (i == 5) {
            this.c = false;
        }
        d();
    }

    public final synchronized void c(aluy aluyVar) {
        if (aluyVar == null) {
            return;
        }
        this.a.add(aluyVar);
        d();
    }
}
