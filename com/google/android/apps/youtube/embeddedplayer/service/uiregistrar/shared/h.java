package com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared;

import android.os.Handler;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.h;
import defpackage.ecq;
import defpackage.rql;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class h extends ecq implements i {
    public final rql a;
    private final Handler b;

    public h(Handler handler, rql rqlVar, byte[] bArr) {
        super("com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.IUiElementRegistrarService");
        this.b = handler;
        this.a = rqlVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.i
    public final void a(final int i) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service.b
            @Override // java.lang.Runnable
            public final void run() {
                h hVar = h.this;
                hVar.a.c(i);
            }
        });
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        a(parcel.readInt());
        parcel2.writeNoException();
        return true;
    }

    public h() {
        super("com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.IUiElementRegistrarService");
    }
}
