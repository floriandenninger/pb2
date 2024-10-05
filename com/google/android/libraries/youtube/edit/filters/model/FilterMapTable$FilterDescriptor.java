package com.google.android.libraries.youtube.edit.filters.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.research.xeno.effect.Control;
import defpackage.amkq;
import defpackage.dsm;
import defpackage.xes;
import defpackage.zhq;
import defpackage.zoq;
import defpackage.zos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class FilterMapTable$FilterDescriptor implements Parcelable {
    public static final Parcelable.Creator CREATOR = new xes(17);
    public final String a;
    public boolean b;
    public String c;
    public Map d;
    public final List e = Collections.synchronizedList(new ArrayList());
    public dsm f;
    private final int g;
    private final String h;

    public FilterMapTable$FilterDescriptor(Parcel parcel) {
        this.a = parcel.readString();
        this.g = parcel.readInt();
        this.c = parcel.readString();
        this.h = parcel.readString();
        this.b = parcel.readInt() == 1;
        this.f = new dsm(parcel.readInt());
    }

    public static FilterMapTable$FilterDescriptor a(List list, String str) {
        if (list != null && str != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor = (FilterMapTable$FilterDescriptor) it.next();
                if (e(filterMapTable$FilterDescriptor.a, str)) {
                    return filterMapTable$FilterDescriptor;
                }
            }
        }
        return null;
    }

    public static boolean e(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        return (str == null || str2 == null || !amkq.e(str, str2)) ? false : true;
    }

    public static boolean h(String str) {
        return str == null || e(str, "NORMAL");
    }

    public final Control b(String str) {
        Map map = this.d;
        if (map == null) {
            return null;
        }
        return (Control) map.get(str);
    }

    public final String c(Context context) {
        return !TextUtils.isEmpty(this.h) ? this.h : context.getString(this.g);
    }

    public final void d() {
        this.b = false;
        synchronized (this.e) {
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((zoq) it.next()).a();
            }
            this.e.clear();
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean f(String str) {
        Map map = this.d;
        return map != null && map.containsKey(str);
    }

    public final boolean g() {
        return dsm.d(this.f);
    }

    public final boolean i() {
        return dsm.e(this.f);
    }

    public final String toString() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.g);
        parcel.writeString(this.c);
        parcel.writeString(this.h);
        parcel.writeInt(this.b ? 1 : 0);
        dsm dsmVar = this.f;
        parcel.writeInt(dsmVar != null ? dsmVar.c : 0);
    }

    public FilterMapTable$FilterDescriptor(String str, String str2, boolean z, boolean z2) {
        zhq.m(str);
        this.a = str;
        if (!z2 || zos.a.get(str) == null) {
            zhq.m(str2);
            this.h = str2;
            this.g = -1;
        } else {
            this.g = ((Integer) zos.a.get(str)).intValue();
            this.h = null;
        }
        this.b = z;
        this.c = str.toLowerCase(Locale.ENGLISH);
    }
}
