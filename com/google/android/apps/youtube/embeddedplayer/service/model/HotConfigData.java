package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.amkq;
import defpackage.aqrt;
import defpackage.yny;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class HotConfigData implements BusSupported$Data {
    public static final Parcelable.Creator CREATOR;
    public final aqrt a;

    static {
        new HotConfigData(aqrt.a);
        CREATOR = new com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.a(12);
    }

    public HotConfigData(aqrt aqrtVar) {
        this.a = aqrtVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.model.BusSupported$Data
    public final b d() {
        return b.HOT_CONFIG_DATA;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof HotConfigData) {
            return amkq.b(this.a, ((HotConfigData) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        yny.I(this.a, parcel);
    }
}
