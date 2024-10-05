package com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared;

import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.model.RemoteEmbedExceptionData;
import defpackage.ecq;
import defpackage.ecr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class b extends ecq implements c {
    public b() {
        super("com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.IEmbedErrorLoggingService");
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        a((RemoteEmbedExceptionData) ecr.a(parcel, RemoteEmbedExceptionData.CREATOR));
        return true;
    }
}
