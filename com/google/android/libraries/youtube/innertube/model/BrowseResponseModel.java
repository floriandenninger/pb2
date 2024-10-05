package com.google.android.libraries.youtube.innertube.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aamd;
import defpackage.aarr;
import defpackage.ajcf;
import defpackage.amru;
import defpackage.arjv;
import defpackage.arjw;
import defpackage.arke;
import defpackage.aulp;
import defpackage.auov;
import defpackage.aypy;
import defpackage.ayqj;
import defpackage.oht;
import defpackage.xes;
import defpackage.yny;
import defpackage.zcz;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class BrowseResponseModel implements Parcelable, ajcf {
    public static final Parcelable.Creator CREATOR = new xes(19);
    public final arjv a;
    public Object b;
    private final Map c = new HashMap();
    private amru d;

    public BrowseResponseModel(arjv arjvVar) {
        this.a = arjvVar;
    }

    public static BrowseResponseModel e(byte[] bArr, aarr aarrVar) {
        if (bArr == null) {
            return null;
        }
        return new BrowseResponseModel((arjv) aarrVar.a(bArr, arjv.a));
    }

    @Override // defpackage.ajcf
    public final aulp a() {
        aulp aulpVar = this.a.i;
        return aulpVar == null ? aulp.a : aulpVar;
    }

    @Override // defpackage.ajcf
    public final Object b() {
        return this.b;
    }

    @Override // defpackage.ajcf
    public final void c(Object obj) {
        this.b = obj;
    }

    @Override // defpackage.ajcf
    public final byte[] d() {
        return this.a.j.I();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final aamd f() {
        auov auovVar;
        arjw arjwVar = this.a.f;
        if (arjwVar == null) {
            arjwVar = arjw.a;
        }
        if (arjwVar.b != 49399797) {
            return null;
        }
        arjw arjwVar2 = this.a.f;
        if (arjwVar2 == null) {
            arjwVar2 = arjw.a;
        }
        if (arjwVar2.b == 49399797) {
            auovVar = (auov) arjwVar2.c;
        } else {
            auovVar = auov.a;
        }
        return new aamd(auovVar);
    }

    public final amru g() {
        arke arkeVar;
        if (this.d == null) {
            arjw arjwVar = this.a.f;
            if (arjwVar == null) {
                arjwVar = arjw.a;
            }
            if (arjwVar.b == 58173949) {
                arkeVar = (arke) arjwVar.c;
            } else {
                arkeVar = arke.a;
            }
            this.d = (amru) ((ayqj) aypy.T(arkeVar.c).L(oht.r).Y(zcz.p).aD(zcz.h)).X();
        }
        return this.d;
    }

    public final Object h(String str, Object obj) {
        return this.c.containsKey(str) ? this.c.get(str) : obj;
    }

    public final void i(String str, Object obj) {
        this.c.put(str, obj);
    }

    public final boolean j() {
        return (this.a.b & 64) == 0;
    }

    public final byte[] k() {
        return this.a.toByteArray();
    }

    public final String toString() {
        arjv arjvVar = this.a;
        return arjvVar == null ? "(null)" : arjvVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        yny.I(this.a, parcel);
    }
}
