package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.EventParams;
import com.google.android.gms.measurement.internal.EventParcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rfq {
    public String a;
    public String b;
    public long c;
    public Bundle d;

    public rfq(String str, String str2, Bundle bundle, long j) {
        this.a = str;
        this.b = str2;
        this.d = bundle;
        this.c = j;
    }

    public static rfq b(EventParcel eventParcel) {
        return new rfq(eventParcel.a, eventParcel.c, eventParcel.b.a(), eventParcel.d);
    }

    public EventParcel a() {
        return new EventParcel(this.a, new EventParams(new Bundle(this.d)), this.b, this.c);
    }

    public String toString() {
        String str = this.b;
        String str2 = this.a;
        String valueOf = String.valueOf(this.d);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }
}
