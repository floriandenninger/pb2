package com.google.android.libraries.youtube.logging.interaction;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aapi;
import defpackage.acsb;
import defpackage.acsc;
import defpackage.ajkn;
import defpackage.aooy;
import defpackage.apve;
import defpackage.apxf;
import defpackage.asgo;
import defpackage.atmb;
import defpackage.awav;
import defpackage.yny;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class InteractionLoggingScreen implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aapi(10);
    public final String a;
    public final String b;
    public final String c;
    public final apve d;
    public final awav e;
    public final int f;
    public final Map g;
    public final Map h;
    public final Set i;
    private final Set j;
    private int k;
    private int l;
    private asgo m;

    public InteractionLoggingScreen(Parcel parcel) {
        this.k = 1;
        this.l = 0;
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.e = (awav) yny.H(parcel, awav.a);
        this.m = (asgo) yny.H(parcel, asgo.a);
        this.f = parcel.readInt();
        this.d = (apve) yny.H(parcel, apve.a);
        int readInt = parcel.readInt();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            hashMap.put((awav) yny.H(parcel, awav.a), (GelVisibilityUpdate) parcel.readParcelable(GelVisibilityUpdate.class.getClassLoader()));
        }
        this.g = hashMap;
        int readInt2 = parcel.readInt();
        HashMap hashMap2 = new HashMap();
        for (int i2 = 0; i2 < readInt2; i2++) {
            hashMap2.put((awav) yny.H(parcel, awav.a), (awav) yny.H(parcel, awav.a));
        }
        this.h = hashMap2;
        int readInt3 = parcel.readInt();
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < readInt3; i3++) {
            hashSet.add(parcel.readString());
        }
        this.i = hashSet;
        int readInt4 = parcel.readInt();
        this.j = new HashSet();
        for (int i4 = 0; i4 < readInt4; i4++) {
            this.j.add(Integer.valueOf(parcel.readInt()));
        }
        this.k = parcel.readInt();
        this.l = parcel.readInt();
    }

    public static boolean f(apxf apxfVar) {
        return apxfVar != null && apxfVar.pY(atmb.b);
    }

    private static final boolean i(awav awavVar) {
        if (awavVar == null || awavVar.c.d() <= 0) {
            return awavVar != null && awavVar.d > 0;
        }
        return true;
    }

    public final synchronized int a() {
        int i;
        i = this.l;
        this.l = i + 1;
        return i;
    }

    public final int b(int i) {
        Set set = this.j;
        Integer valueOf = Integer.valueOf(i);
        if (!set.contains(valueOf)) {
            this.j.add(valueOf);
            return 0;
        }
        int i2 = this.k;
        this.k = i2 + 1;
        return i2;
    }

    public final acsc c() {
        return acsb.b(this.f);
    }

    public final void d(awav awavVar, awav awavVar2) {
        if (i(awavVar)) {
            this.h.put(awavVar, awavVar2);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(GelVisibilityUpdate gelVisibilityUpdate) {
        if (i(gelVisibilityUpdate.c)) {
            this.g.put(gelVisibilityUpdate.c, gelVisibilityUpdate);
        }
    }

    public final boolean g(awav awavVar) {
        if (i(awavVar)) {
            return this.h.containsKey(awavVar);
        }
        return false;
    }

    public final boolean h(awav awavVar) {
        GelVisibilityUpdate gelVisibilityUpdate;
        int i = (i(awavVar) && (gelVisibilityUpdate = (GelVisibilityUpdate) this.g.get(awavVar)) != null) ? gelVisibilityUpdate.e : 1;
        return i == 2 || i == 5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        yny.I(this.e, parcel);
        yny.I(this.m, parcel);
        parcel.writeInt(this.f);
        apve apveVar = this.d;
        if (apveVar != null) {
            yny.I(apveVar, parcel);
        } else {
            yny.I(apve.a, parcel);
        }
        Map map = this.g;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            yny.I((aooy) entry.getKey(), parcel);
            parcel.writeParcelable((Parcelable) entry.getValue(), i);
        }
        Map map2 = this.h;
        parcel.writeInt(map2.size());
        for (Map.Entry entry2 : map2.entrySet()) {
            yny.I((aooy) entry2.getKey(), parcel);
            yny.I((aooy) entry2.getValue(), parcel);
        }
        Set set = this.i;
        parcel.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString((String) it.next());
        }
        parcel.writeInt(this.j.size());
        Iterator it2 = this.j.iterator();
        while (it2.hasNext()) {
            parcel.writeInt(((Integer) it2.next()).intValue());
        }
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
    }

    public InteractionLoggingScreen(ajkn ajknVar, int i, awav awavVar, String str, String str2, byte[] bArr) {
        this.k = 1;
        this.l = 0;
        awavVar.getClass();
        this.a = ajknVar.b(16);
        this.g = new HashMap();
        this.j = new HashSet();
        this.h = new HashMap();
        this.i = new HashSet();
        this.f = i;
        this.b = str;
        this.c = str2;
        this.d = null;
        this.e = awavVar;
        this.m = asgo.a;
    }
}
