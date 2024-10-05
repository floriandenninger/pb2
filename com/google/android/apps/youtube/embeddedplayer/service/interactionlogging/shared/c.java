package com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared;

import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;
import defpackage.ecq;
import defpackage.ecr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class c extends ecq implements d {
    public c() {
        super("com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.IEmbedInteractionLoggingService");
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                int a = a(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(a);
                return true;
            case 2:
                l(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 3:
                g(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 4:
                f(parcel.readInt(), (SimplePlaybackDescriptor) ecr.a(parcel, SimplePlaybackDescriptor.CREATOR), ecr.j(parcel));
                parcel2.writeNoException();
                return true;
            case 5:
                h(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 6:
                i(parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case 7:
                b(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 8:
                c(parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case 9:
                j(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 10:
                k(parcel.readInt(), parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case 11:
                d(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 12:
                e(parcel.readInt(), parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
