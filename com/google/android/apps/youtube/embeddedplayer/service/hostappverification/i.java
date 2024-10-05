package com.google.android.apps.youtube.embeddedplayer.service.hostappverification;

import defpackage.cnh;
import defpackage.cnn;
import defpackage.cnq;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class i implements cnn {
    private static final Random a = new Random();
    private int b = 2500;
    private int c;

    @Override // defpackage.cnn
    public final int a() {
        return this.c;
    }

    @Override // defpackage.cnn
    public final int b() {
        return this.b;
    }

    @Override // defpackage.cnn
    public final void c(cnq cnqVar) {
        this.c++;
        int nextInt = a.nextInt(100);
        int i = this.b;
        this.b = nextInt + 1 + i + i;
        if (this.c > 3) {
            throw cnqVar;
        }
        cnh cnhVar = cnqVar.b;
        if (cnhVar == null) {
            throw cnqVar;
        }
        int i2 = cnhVar.a;
        if (i2 < 500) {
            throw cnqVar;
        }
        if (i2 > 599) {
            throw cnqVar;
        }
    }
}
