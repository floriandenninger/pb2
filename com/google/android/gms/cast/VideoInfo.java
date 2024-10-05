package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qfh;
import defpackage.qip;
import defpackage.qkw;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class VideoInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public int b;
    public int c;

    static {
        new qkw("VideoInfo");
        CREATOR = new qfh(9);
    }

    public VideoInfo(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.cast.VideoInfo a(org.json.JSONObject r8) {
        /*
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "hdrType"
            java.lang.String r1 = r8.getString(r1)     // Catch: org.json.JSONException -> L71
            int r2 = r1.hashCode()     // Catch: org.json.JSONException -> L71
            r3 = 3218(0xc92, float:4.51E-42)
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == r3) goto L44
            r3 = 103158(0x192f6, float:1.44555E-40)
            if (r2 == r3) goto L3a
            r3 = 113729(0x1bc41, float:1.59368E-40)
            if (r2 == r3) goto L30
            r3 = 99136405(0x5e8b395, float:2.1883143E-35)
            if (r2 == r3) goto L26
            goto L4e
        L26:
            java.lang.String r2 = "hdr10"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L4e
            r1 = 1
            goto L4f
        L30:
            java.lang.String r2 = "sdr"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L4e
            r1 = 3
            goto L4f
        L3a:
            java.lang.String r2 = "hdr"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L4e
            r1 = 2
            goto L4f
        L44:
            java.lang.String r2 = "dv"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L4e
            r1 = 0
            goto L4f
        L4e:
            r1 = -1
        L4f:
            if (r1 == 0) goto L5e
            if (r1 == r7) goto L5c
            if (r1 == r6) goto L5a
            if (r1 == r5) goto L58
            goto L5f
        L58:
            r4 = 1
            goto L5f
        L5a:
            r4 = 4
            goto L5f
        L5c:
            r4 = 2
            goto L5f
        L5e:
            r4 = 3
        L5f:
            com.google.android.gms.cast.VideoInfo r1 = new com.google.android.gms.cast.VideoInfo     // Catch: org.json.JSONException -> L71
            java.lang.String r2 = "width"
            int r2 = r8.getInt(r2)     // Catch: org.json.JSONException -> L71
            java.lang.String r3 = "height"
            int r8 = r8.getInt(r3)     // Catch: org.json.JSONException -> L71
            r1.<init>(r2, r8, r4)     // Catch: org.json.JSONException -> L71
            return r1
        L71:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.VideoInfo.a(org.json.JSONObject):com.google.android.gms.cast.VideoInfo");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoInfo)) {
            return false;
        }
        VideoInfo videoInfo = (VideoInfo) obj;
        return this.b == videoInfo.b && this.a == videoInfo.a && this.c == videoInfo.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 2, this.a);
        qip.s(parcel, 3, this.b);
        qip.s(parcel, 4, this.c);
        qip.n(parcel, m);
    }
}
