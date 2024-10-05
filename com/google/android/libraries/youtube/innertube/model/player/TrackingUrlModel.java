package com.google.android.libraries.youtube.innertube.model.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aaph;
import defpackage.aapi;
import defpackage.anaf;
import defpackage.aolo;
import defpackage.aone;
import defpackage.aonm;
import defpackage.aonu;
import defpackage.asuq;
import defpackage.asur;
import defpackage.asuu;
import defpackage.owk;
import defpackage.yny;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class TrackingUrlModel implements Comparable, Parcelable {
    public final String b;
    public final Set c;
    public final Set d;
    private final int e;
    public static final Set a = Collections.emptySet();
    public static final Parcelable.Creator CREATOR = new aapi(1);

    public TrackingUrlModel(owk owkVar) {
        aaph aaphVar;
        this.b = (owkVar.b & 1) != 0 ? owkVar.c : "";
        this.c = new HashSet();
        Iterator it = owkVar.d.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            Set set = this.c;
            aaph[] values = aaph.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    aaphVar = values[i];
                    if (aaphVar.g == intValue) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    aaphVar = aaph.NO_OP;
                    break;
                }
            }
            set.add(aaphVar);
        }
        this.e = (owkVar.b & 2) != 0 ? owkVar.e : -1;
        this.d = new HashSet();
        if (owkVar.f.size() != 0) {
            Iterator it2 = owkVar.f.iterator();
            while (it2.hasNext()) {
                asuq b = asuq.b(((Integer) it2.next()).intValue());
                if (b != null) {
                    this.d.add(b);
                }
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(TrackingUrlModel trackingUrlModel) {
        int i = this.e;
        int i2 = trackingUrlModel.e;
        if (i != i2) {
            return i < i2 ? -1 : 1;
        }
        return this.b.compareTo(trackingUrlModel.b);
    }

    public final int b(int i) {
        int i2 = this.e;
        return i2 == -1 ? i : i2;
    }

    public final Uri c() {
        return Uri.parse(this.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TrackingUrlModel)) {
            return false;
        }
        TrackingUrlModel trackingUrlModel = (TrackingUrlModel) obj;
        return this == trackingUrlModel || (trackingUrlModel.compareTo(this) == 0 && hashCode() == trackingUrlModel.hashCode());
    }

    public final int hashCode() {
        return ((((((this.b.hashCode() + 31) * 31) + this.c.hashCode()) * 31) + this.e) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "@" + this.e + "baseUrl->" + this.b + "params->" + this.c + "headers->" + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        aone createBuilder = owk.a.createBuilder();
        String str = this.b;
        createBuilder.copyOnWrite();
        owk owkVar = (owk) createBuilder.instance;
        str.getClass();
        owkVar.b |= 1;
        owkVar.c = str;
        int i2 = this.e;
        createBuilder.copyOnWrite();
        owk owkVar2 = (owk) createBuilder.instance;
        owkVar2.b |= 2;
        owkVar2.e = i2;
        int[] iArr = new int[this.c.size()];
        int i3 = 0;
        int i4 = 0;
        for (aaph aaphVar : this.c) {
            aaph aaphVar2 = aaph.MS;
            iArr[i4] = aaphVar.g;
            i4++;
        }
        List ai = anaf.ai(iArr);
        createBuilder.copyOnWrite();
        owk owkVar3 = (owk) createBuilder.instance;
        aonu aonuVar = owkVar3.d;
        if (!aonuVar.c()) {
            owkVar3.d = aonm.mutableCopy(aonuVar);
        }
        aolo.addAll((Iterable) ai, (List) owkVar3.d);
        int[] iArr2 = new int[this.d.size()];
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            iArr2[i3] = ((asuq) it.next()).g;
            i3++;
        }
        List ai2 = anaf.ai(iArr2);
        createBuilder.copyOnWrite();
        owk owkVar4 = (owk) createBuilder.instance;
        aonu aonuVar2 = owkVar4.f;
        if (!aonuVar2.c()) {
            owkVar4.f = aonm.mutableCopy(aonuVar2);
        }
        aolo.addAll((Iterable) ai2, (List) owkVar4.f);
        yny.I((owk) createBuilder.build(), parcel);
    }

    public TrackingUrlModel(asuu asuuVar) {
        this(asuuVar, a);
    }

    public TrackingUrlModel(asuu asuuVar, Set set) {
        this.b = asuuVar.c;
        set.getClass();
        this.c = set;
        int i = asuuVar.d;
        this.e = i == 0 ? -1 : i;
        this.d = new HashSet();
        for (asur asurVar : asuuVar.e) {
            Set set2 = this.d;
            asuq b = asuq.b(asurVar.c);
            if (b == null) {
                b = asuq.UNKNOWN;
            }
            set2.add(b);
        }
    }
}
