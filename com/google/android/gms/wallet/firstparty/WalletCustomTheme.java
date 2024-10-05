package com.google.android.gms.wallet.firstparty;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.youtube.R;
import defpackage.qip;
import defpackage.rqx;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class WalletCustomTheme extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rqx(16);
    int a;
    int b;
    int c;
    Bundle d;
    String e;

    public WalletCustomTheme() {
        this.b = 0;
        this.c = 0;
        this.a = 0;
        this.d = new Bundle();
        this.e = "";
    }

    public WalletCustomTheme(int i, Bundle bundle, String str, int i2, int i3) {
        this.d = bundle;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.e = str;
    }

    public final void a() {
        this.a = R.style.youtube_wallet_custom_theme;
        this.b = R.style.youtube_wallet_custom_theme;
        this.c = R.style.youtube_wallet_custom_theme;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 2, this.a);
        qip.v(parcel, 3, this.d);
        qip.F(parcel, 4, this.e);
        qip.s(parcel, 5, this.b);
        qip.s(parcel, 6, this.c);
        qip.n(parcel, m);
    }
}
