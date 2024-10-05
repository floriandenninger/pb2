package com.google.android.libraries.youtube.innertube.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aamd;
import defpackage.ajcf;
import defpackage.asah;
import defpackage.asai;
import defpackage.aulp;
import defpackage.auov;
import defpackage.xes;
import defpackage.yny;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SearchResponseModel implements Parcelable, ajcf {
    public static final Parcelable.Creator CREATOR = new xes(20);
    public asah a;
    private aamd b;
    private Object c;

    public SearchResponseModel(asah asahVar) {
        this.a = asahVar;
    }

    @Override // defpackage.ajcf
    public final aulp a() {
        aulp aulpVar = this.a.g;
        return aulpVar == null ? aulp.a : aulpVar;
    }

    @Override // defpackage.ajcf
    public final Object b() {
        return this.c;
    }

    @Override // defpackage.ajcf
    public final void c(Object obj) {
        this.c = obj;
    }

    @Override // defpackage.ajcf
    public final byte[] d() {
        return this.a.h.I();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final aamd e() {
        aamd aamdVar = this.b;
        if (aamdVar != null) {
            return aamdVar;
        }
        asai asaiVar = this.a.e;
        if (asaiVar == null) {
            asaiVar = asai.a;
        }
        if (asaiVar.b == 49399797) {
            this.b = new aamd((auov) asaiVar.c);
        }
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        yny.I(this.a, parcel);
    }
}
