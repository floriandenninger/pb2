package defpackage;

import android.location.Location;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qag implements qbv {
    private final Date a;
    private final int b;
    private final Set c;
    private final boolean d;
    private final Location e;
    private final int f;
    private final NativeAdOptionsParcel g;
    private final boolean i;
    private final List h = new ArrayList();
    private final Map j = new HashMap();

    public qag(Date date, int i, Set set, Location location, boolean z, int i2, NativeAdOptionsParcel nativeAdOptionsParcel, List list, boolean z2) {
        this.a = date;
        this.b = i;
        this.c = set;
        this.e = location;
        this.d = z;
        this.f = i2;
        this.g = nativeAdOptionsParcel;
        this.i = z2;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str.startsWith("custom:")) {
                    String[] split = str.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            this.j.put(split[1], true);
                        } else if ("false".equals(split[2])) {
                            this.j.put(split[1], false);
                        }
                    }
                } else {
                    this.h.add(str);
                }
            }
        }
    }

    @Override // defpackage.qbn
    @Deprecated
    public final int a() {
        return this.b;
    }

    @Override // defpackage.qbn
    public final int b() {
        return this.f;
    }

    @Override // defpackage.qbn
    public final Location c() {
        return this.e;
    }

    @Override // defpackage.qbn
    @Deprecated
    public final Date d() {
        return this.a;
    }

    @Override // defpackage.qbn
    public final Set e() {
        return this.c;
    }

    @Override // defpackage.qbn
    @Deprecated
    public final boolean f() {
        return this.i;
    }

    @Override // defpackage.qbn
    public final boolean g() {
        return this.d;
    }

    @Override // defpackage.qbv
    public final pvb h() {
        NativeAdOptionsParcel nativeAdOptionsParcel = this.g;
        pva pvaVar = new pva();
        if (nativeAdOptionsParcel != null) {
            int i = nativeAdOptionsParcel.a;
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        pvaVar.f = nativeAdOptionsParcel.g;
                        pvaVar.c = nativeAdOptionsParcel.h;
                    }
                    pvaVar.a = nativeAdOptionsParcel.b;
                    pvaVar.b = nativeAdOptionsParcel.c;
                    pvaVar.d = nativeAdOptionsParcel.d;
                }
                VideoOptionsParcel videoOptionsParcel = nativeAdOptionsParcel.f;
                if (videoOptionsParcel != null) {
                    pvaVar.g = new aiqb(videoOptionsParcel);
                }
            }
            pvaVar.e = nativeAdOptionsParcel.e;
            pvaVar.a = nativeAdOptionsParcel.b;
            pvaVar.b = nativeAdOptionsParcel.c;
            pvaVar.d = nativeAdOptionsParcel.d;
        }
        return pvaVar.a();
    }

    @Override // defpackage.qbv
    public final qcj i() {
        NativeAdOptionsParcel nativeAdOptionsParcel = this.g;
        qci qciVar = new qci();
        if (nativeAdOptionsParcel != null) {
            int i = nativeAdOptionsParcel.a;
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        qciVar.e = nativeAdOptionsParcel.g;
                        qciVar.b = nativeAdOptionsParcel.h;
                    }
                    qciVar.a = nativeAdOptionsParcel.b;
                    qciVar.c = nativeAdOptionsParcel.d;
                }
                VideoOptionsParcel videoOptionsParcel = nativeAdOptionsParcel.f;
                if (videoOptionsParcel != null) {
                    qciVar.f = new aiqb(videoOptionsParcel);
                }
            }
            qciVar.d = nativeAdOptionsParcel.e;
            qciVar.a = nativeAdOptionsParcel.b;
            qciVar.c = nativeAdOptionsParcel.d;
        }
        return qciVar.a();
    }

    @Override // defpackage.qbv
    public final Map j() {
        return this.j;
    }

    @Override // defpackage.qbv
    public final boolean k() {
        return this.h.contains("3");
    }

    @Override // defpackage.qbv
    public final boolean l() {
        return this.h.contains("6");
    }
}
