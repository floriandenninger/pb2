package com.google.android.libraries.youtube.innertube.model.player;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aapi;
import defpackage.aomf;
import defpackage.awbj;
import defpackage.awbk;
import defpackage.yny;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class Vss3ConfigModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aapi(0);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final aomf f;
    private final awbj g;

    public Vss3ConfigModel(awbj awbjVar) {
        this.g = awbjVar;
        this.f = awbjVar.c;
        this.a = awbjVar.d;
        awbk awbkVar = awbjVar.b;
        awbkVar = awbkVar == null ? awbk.a : awbkVar;
        this.b = awbkVar.b;
        this.c = awbkVar.c;
        this.e = awbkVar.e;
        this.d = awbkVar.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        yny.I(this.g, parcel);
    }
}
