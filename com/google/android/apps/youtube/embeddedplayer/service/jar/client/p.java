package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.content.Intent;
import android.os.Parcel;
import defpackage.ecq;
import defpackage.ecr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class p extends ecq implements q {
    public p() {
        super("com.google.android.apps.youtube.embeddedplayer.service.jar.client.IApiPlayerClient");
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                s();
                parcel2.writeNoException();
                return true;
            case 2:
                n();
                parcel2.writeNoException();
                return true;
            case 3:
                r();
                parcel2.writeNoException();
                return true;
            case 4:
                m();
                parcel2.writeNoException();
                return true;
            case 5:
                l(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), ecr.j(parcel), ecr.j(parcel), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 6:
                f();
                parcel2.writeNoException();
                return true;
            case 7:
                x();
                parcel2.writeNoException();
                return true;
            case 8:
                w();
                parcel2.writeNoException();
                return true;
            case 9:
                j(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 10:
                p(parcel.readLong(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 11:
                o(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 12:
                v();
                parcel2.writeNoException();
                return true;
            case 13:
                t(parcel.readLong(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 14:
                g(ecr.j(parcel), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 15:
                u(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 16:
                k(ecr.j(parcel));
                parcel2.writeNoException();
                return true;
            case 17:
                q();
                parcel2.writeNoException();
                return true;
            case 18:
                i();
                parcel2.writeNoException();
                return true;
            case 19:
                h();
                parcel2.writeNoException();
                return true;
            case 20:
                String a = a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 21:
                z((Intent) ecr.a(parcel, Intent.CREATOR));
                parcel2.writeNoException();
                return true;
            case 22:
                y(parcel.readString());
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
