package com.google.android.libraries.youtube.ads.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.afrd;
import defpackage.afre;
import defpackage.amkq;
import defpackage.amru;
import defpackage.aoye;
import defpackage.aoyi;
import defpackage.wbs;
import defpackage.xes;
import defpackage.xgy;
import defpackage.yny;
import defpackage.zga;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class VideoAdTrackingModel implements Parcelable, afre {
    public final aoyi b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;
    public final List j;
    public final List k;
    public final List l;
    public final List m;
    public final List n;
    public final List o;
    public final List p;
    public final List q;
    public final List r;
    public final List s;
    public final List t;
    public final List u;
    public final List v;
    public final List w;
    public final List x;
    public final List y;
    public final List z;
    public static final VideoAdTrackingModel a = new VideoAdTrackingModel(aoyi.a);
    public static final Parcelable.Creator CREATOR = new xes(8);

    public VideoAdTrackingModel(aoyi aoyiVar) {
        aoyiVar = aoyiVar == null ? aoyi.a : aoyiVar;
        this.c = a(aoyiVar.q);
        this.d = a(aoyiVar.o);
        this.e = a(aoyiVar.n);
        this.f = a(aoyiVar.m);
        this.g = a(aoyiVar.k);
        this.h = a(aoyiVar.i);
        this.i = a(aoyiVar.v);
        this.j = a(aoyiVar.p);
        this.k = a(aoyiVar.c);
        this.l = a(aoyiVar.s);
        this.m = a(aoyiVar.l);
        this.n = a(aoyiVar.b);
        this.o = a(aoyiVar.w);
        a(aoyiVar.d);
        this.p = a(aoyiVar.f);
        this.q = a(aoyiVar.j);
        this.r = a(aoyiVar.g);
        this.s = a(aoyiVar.t);
        this.t = a(aoyiVar.h);
        this.u = a(aoyiVar.r);
        this.v = a(aoyiVar.u);
        a(aoyiVar.k);
        this.w = a(aoyiVar.x);
        this.x = a(aoyiVar.y);
        a(aoyiVar.f88J);
        a(aoyiVar.G);
        a(aoyiVar.E);
        a(aoyiVar.O);
        a(aoyiVar.I);
        a(aoyiVar.A);
        a(aoyiVar.L);
        a(aoyiVar.H);
        this.y = a(aoyiVar.z);
        a(aoyiVar.B);
        a(aoyiVar.C);
        a(aoyiVar.F);
        a(aoyiVar.D);
        a(aoyiVar.M);
        this.z = a(aoyiVar.K);
        a(aoyiVar.N);
        this.b = aoyiVar;
    }

    private static amru a(List list) {
        if (list == null || list.isEmpty()) {
            return amru.q();
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aoye aoyeVar = (aoye) it.next();
            if (!TextUtils.isEmpty(aoyeVar.c)) {
                try {
                    wbs.ai(aoyeVar.c);
                    arrayList.add(aoyeVar);
                } catch (MalformedURLException unused) {
                    zga.l("Badly formed uri - ignoring");
                }
            }
        }
        return amru.o(arrayList);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof VideoAdTrackingModel) {
            return amkq.b(this.b, ((VideoAdTrackingModel) obj).b);
        }
        return false;
    }

    @Override // defpackage.afre
    public final /* bridge */ /* synthetic */ afrd h() {
        return new xgy(this);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            yny.I(this.b, parcel);
        }
    }
}
