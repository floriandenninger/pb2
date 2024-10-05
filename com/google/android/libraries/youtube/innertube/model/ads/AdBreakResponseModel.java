package com.google.android.libraries.youtube.innertube.model.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aamk;
import defpackage.amkq;
import defpackage.aowc;
import defpackage.aris;
import defpackage.arit;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AdBreakResponseModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aamk(2);
    public final aris a;
    private final long b;

    public AdBreakResponseModel(aris arisVar, long j) {
        arisVar.getClass();
        this.a = arisVar;
        this.b = j;
    }

    public final List a() {
        aowc aowcVar;
        ArrayList arrayList = new ArrayList();
        if (this.a.c.size() == 0) {
            return arrayList;
        }
        for (arit aritVar : this.a.c) {
            if (aritVar.b == 84813246) {
                aowcVar = (aowc) aritVar.c;
            } else {
                aowcVar = aowc.a;
            }
            if (aowcVar.c.size() > 0) {
                return (aritVar.b == 84813246 ? (aowc) aritVar.c : aowc.a).c;
            }
        }
        return arrayList;
    }

    public final boolean b() {
        return this.a.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        amkq.cm(parcel, this.a);
        parcel.writeLong(this.b);
    }
}
