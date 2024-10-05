package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.qmu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CloudMessagingMessengerCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = new qmu(1);
    Messenger a;

    public CloudMessagingMessengerCompat(IBinder iBinder) {
        this.a = new Messenger(iBinder);
    }

    public final IBinder a() {
        Messenger messenger = this.a;
        messenger.getClass();
        return messenger.getBinder();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((CloudMessagingMessengerCompat) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final void b(Message message) {
        Messenger messenger = this.a;
        messenger.getClass();
        messenger.send(message);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.a;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
