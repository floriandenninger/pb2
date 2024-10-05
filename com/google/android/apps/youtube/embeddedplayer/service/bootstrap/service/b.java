package com.google.android.apps.youtube.embeddedplayer.service.bootstrap.service;

import defpackage.aabt;
import defpackage.aadx;
import defpackage.axqr;
import defpackage.azrw;
import defpackage.ynx;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b implements axqr {
    private final azrw a;

    public b(azrw azrwVar) {
        this.a = azrwVar;
    }

    public static b a(azrw azrwVar) {
        return new b(azrwVar);
    }

    @Override // defpackage.azrw
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ynx get() {
        final aabt aabtVar = (aabt) this.a.get();
        aabtVar.getClass();
        final int i = 1;
        azrw azrwVar = new azrw() { // from class: com.google.android.apps.youtube.embeddedplayer.service.bootstrap.service.a
            @Override // defpackage.azrw
            public final Object get() {
                return i != 0 ? aabtVar.c() : aabtVar.a();
            }
        };
        aabtVar.getClass();
        final int i2 = 0;
        return new aadx(azrwVar, new azrw() { // from class: com.google.android.apps.youtube.embeddedplayer.service.bootstrap.service.a
            @Override // defpackage.azrw
            public final Object get() {
                return i2 != 0 ? aabtVar.c() : aabtVar.a();
            }
        });
    }
}
