package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ahaa;
import defpackage.alsz;
import defpackage.amkq;
import defpackage.antv;
import defpackage.qar;
import defpackage.qip;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class Thing extends AbstractSafeParcelable implements ReflectedParcelable, antv {
    public static final Parcelable.Creator CREATOR = new alsz(12);
    public final int a;
    public final Bundle b;
    public final Metadata c;
    public final String d;
    public final String e;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class Metadata extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new alsz(9);
        public final boolean a;
        public final int b;
        public final String c;
        public final Bundle d;
        public final Bundle e;

        public Metadata(boolean z, int i, String str, Bundle bundle, Bundle bundle2) {
            this.a = z;
            this.b = i;
            this.c = str;
            this.d = bundle == null ? new Bundle() : bundle;
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            this.e = bundle2;
            ClassLoader classLoader = getClass().getClassLoader();
            amkq.u(classLoader);
            bundle2.setClassLoader(classLoader);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Metadata)) {
                return false;
            }
            Metadata metadata = (Metadata) obj;
            return qar.j(Boolean.valueOf(this.a), Boolean.valueOf(metadata.a)) && qar.j(Integer.valueOf(this.b), Integer.valueOf(metadata.b)) && qar.j(this.c, metadata.c) && Thing.c(this.d, metadata.d) && Thing.c(this.e, metadata.e);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Integer.valueOf(this.b), this.c, Integer.valueOf(Thing.a(this.d)), Integer.valueOf(Thing.a(this.e))});
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("worksOffline: ");
            sb.append(this.a);
            sb.append(", score: ");
            sb.append(this.b);
            if (!this.c.isEmpty()) {
                sb.append(", accountEmail: ");
                sb.append(this.c);
            }
            if (!this.d.isEmpty()) {
                sb.append(", Properties { ");
                Thing.b(this.d, sb);
                sb.append("}");
            }
            if (!this.e.isEmpty()) {
                sb.append(", embeddingProperties { ");
                Thing.b(this.e, sb);
                sb.append("}");
            }
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int m = qip.m(parcel);
            qip.o(parcel, 1, this.a);
            qip.s(parcel, 2, this.b);
            qip.F(parcel, 3, this.c);
            qip.v(parcel, 4, this.d);
            qip.v(parcel, 5, this.e);
            qip.n(parcel, m);
        }
    }

    public Thing(int i, Bundle bundle, Metadata metadata, String str, String str2) {
        this.a = i;
        this.b = bundle;
        this.c = metadata;
        this.d = str;
        this.e = str2;
        ClassLoader classLoader = getClass().getClassLoader();
        amkq.u(classLoader);
        bundle.setClassLoader(classLoader);
    }

    public Thing(Bundle bundle, Metadata metadata, String str, String str2) {
        this.a = 10;
        this.b = bundle;
        this.c = metadata;
        this.d = str;
        this.e = str2;
    }

    public static int a(Bundle bundle) {
        ArrayList arrayList = new ArrayList(bundle.keySet());
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = bundle.get((String) arrayList.get(i));
            if (obj instanceof boolean[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((boolean[]) obj)));
            } else if (obj instanceof long[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((long[]) obj)));
            } else if (obj instanceof double[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((double[]) obj)));
            } else if (obj instanceof byte[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((byte[]) obj)));
            } else if (obj instanceof Object[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((Object[]) obj)));
            } else {
                arrayList2.add(Integer.valueOf(Arrays.hashCode(new Object[]{obj})));
            }
        }
        return Arrays.hashCode(arrayList2.toArray());
    }

    public static void b(Bundle bundle, StringBuilder sb) {
        try {
            Set<String> keySet = bundle.keySet();
            String[] strArr = (String[]) keySet.toArray(new String[keySet.size()]);
            Arrays.sort(strArr, ahaa.e);
            for (String str : strArr) {
                sb.append("{ key: '");
                sb.append(str);
                sb.append("' value: ");
                Object obj = bundle.get(str);
                if (obj == null) {
                    sb.append("<null>");
                } else if (obj.getClass().isArray()) {
                    sb.append("[ ");
                    for (int i = 0; i < Array.getLength(obj); i++) {
                        sb.append("'");
                        sb.append(Array.get(obj, i));
                        sb.append("' ");
                    }
                    sb.append("]");
                } else {
                    sb.append(obj.toString());
                }
                sb.append(" } ");
            }
        } catch (RuntimeException unused) {
            sb.append("<error>");
        }
    }

    public static boolean c(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !c((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
                obj2 = null;
            }
            if (obj instanceof boolean[]) {
                if (!(obj2 instanceof boolean[]) || !Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                    return false;
                }
            } else if (obj instanceof long[]) {
                if (!(obj2 instanceof long[]) || !Arrays.equals((long[]) obj, (long[]) obj2)) {
                    return false;
                }
            } else if (obj instanceof double[]) {
                if (!(obj2 instanceof double[]) || !Arrays.equals((double[]) obj, (double[]) obj2)) {
                    return false;
                }
            } else if (obj instanceof byte[]) {
                if (!(obj2 instanceof byte[]) || !Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                    return false;
                }
            } else if ((obj instanceof Object[]) && (!(obj2 instanceof Object[]) || !Arrays.equals((Object[]) obj, (Object[]) obj2))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Thing)) {
            return false;
        }
        Thing thing = (Thing) obj;
        return qar.j(Integer.valueOf(this.a), Integer.valueOf(thing.a)) && qar.j(this.d, thing.d) && qar.j(this.e, thing.e) && qar.j(this.c, thing.c) && c(this.b, thing.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.d, this.e, Integer.valueOf(this.c.hashCode()), Integer.valueOf(a(this.b))});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.e.equals("Thing") ? "Indexable" : this.e);
        sb.append(" { { id: ");
        if (this.d == null) {
            sb.append("<null>");
        } else {
            sb.append("'");
            sb.append(this.d);
            sb.append("'");
        }
        sb.append(" } Properties { ");
        b(this.b, sb);
        sb.append("} Metadata { ");
        sb.append(this.c.toString());
        sb.append(" } }");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.v(parcel, 1, this.b);
        qip.E(parcel, 2, this.c, i);
        qip.F(parcel, 3, this.d);
        qip.F(parcel, 4, this.e);
        qip.s(parcel, 1000, this.a);
        qip.n(parcel, m);
    }
}
