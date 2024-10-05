package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.zhq;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RemoteEmbedExceptionData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.a(19);
    public final Throwable a;
    private Throwable b = null;

    public RemoteEmbedExceptionData(Parcel parcel) {
        this.a = (Throwable) parcel.readSerializable();
    }

    public RemoteEmbedExceptionData(Throwable th) {
        this.a = th;
    }

    private static BadParcelableException b(String str, Exception exc) {
        BadParcelableException badParcelableException = new BadParcelableException(str);
        badParcelableException.initCause(exc);
        return badParcelableException;
    }

    public final Throwable a(String str) {
        Throwable th = this.b;
        if (th != null) {
            return th;
        }
        Throwable th2 = this.a;
        if (th2 == null) {
            return null;
        }
        String canonicalName = th2.getClass().getCanonicalName();
        try {
            String message = this.a.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6 + String.valueOf(message).length());
            sb.append("Pkg: ");
            sb.append(str);
            sb.append(" ");
            sb.append(message);
            Throwable th3 = (Throwable) Class.forName(zhq.h(canonicalName)).getConstructor(String.class).newInstance(zhq.h(sb.toString()));
            th3.initCause(this.a.getCause());
            th3.setStackTrace(this.a.getStackTrace());
            this.b = th3;
            return th3;
        } catch (ClassNotFoundException e) {
            String valueOf = String.valueOf(canonicalName);
            throw b(valueOf.length() != 0 ? "Unable to find exception class for RemoteEmbedExceptionData exception: ".concat(valueOf) : new String("Unable to find exception class for RemoteEmbedExceptionData exception: "), e);
        } catch (IllegalAccessException e2) {
            String valueOf2 = String.valueOf(canonicalName);
            throw b(valueOf2.length() != 0 ? "Unable to call constructor for RemoteEmbedExceptionData exception: ".concat(valueOf2) : new String("Unable to call constructor for RemoteEmbedExceptionData exception: "), e2);
        } catch (InstantiationException e3) {
            String valueOf3 = String.valueOf(canonicalName);
            throw b(valueOf3.length() != 0 ? "Unable to instantiate RemoteEmbedExceptionData exception: ".concat(valueOf3) : new String("Unable to instantiate RemoteEmbedExceptionData exception: "), e3);
        } catch (NoSuchMethodException e4) {
            String valueOf4 = String.valueOf(canonicalName);
            throw b(valueOf4.length() != 0 ? "Could not find right constructor for RemoteEmbedExceptionData exception: ".concat(valueOf4) : new String("Could not find right constructor for RemoteEmbedExceptionData exception: "), e4);
        } catch (InvocationTargetException e5) {
            String valueOf5 = String.valueOf(canonicalName);
            throw b(valueOf5.length() != 0 ? "Exception thrown by invoked constructor for RemoteEmbedExceptionData exception: ".concat(valueOf5) : new String("Exception thrown by invoked constructor for RemoteEmbedExceptionData exception: "), e5);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.a);
    }
}
