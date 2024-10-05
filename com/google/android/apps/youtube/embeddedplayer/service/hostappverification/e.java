package com.google.android.apps.youtube.embeddedplayer.service.hostappverification;

import defpackage.cnh;
import defpackage.cnq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class e extends cnq {
    public final int a;

    public e(int i) {
        this.a = i;
    }

    public static e a(cnh cnhVar) {
        int i = cnhVar.a;
        int i2 = 2;
        if (i != 400 && i != 403) {
            i2 = 1;
        }
        return new e(i2);
    }
}
