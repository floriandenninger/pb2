package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qcp;
import defpackage.qip;
import defpackage.qko;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LaunchOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qcp(18);
    public boolean a;
    public String b;
    public boolean c;
    public CredentialsData d;

    public LaunchOptions() {
        this(false, qko.d(Locale.getDefault()), false, null);
    }

    public LaunchOptions(boolean z, String str, boolean z2, CredentialsData credentialsData) {
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = credentialsData;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LaunchOptions)) {
            return false;
        }
        LaunchOptions launchOptions = (LaunchOptions) obj;
        return this.a == launchOptions.a && qko.j(this.b, launchOptions.b) && this.c == launchOptions.c && qko.j(this.d, launchOptions.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, Boolean.valueOf(this.c), this.d});
    }

    public final String toString() {
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s, androidReceiverCompatible: %b)", Boolean.valueOf(this.a), this.b, Boolean.valueOf(this.c));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.o(parcel, 2, this.a);
        qip.F(parcel, 3, this.b);
        qip.o(parcel, 4, this.c);
        qip.E(parcel, 5, this.d, i);
        qip.n(parcel, m);
    }
}
