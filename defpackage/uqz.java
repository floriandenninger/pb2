package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uqz {
    private final und a;

    public uqz() {
    }

    public uqz(und undVar) {
        this.a = undVar;
    }

    public static uqz a(Activity activity) {
        return new uqz(new und(activity.getClass().getName()));
    }

    public final String b() {
        return this.a.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof uqz) && b().equals(((uqz) obj).b());
    }

    public final int hashCode() {
        return (b().hashCode() * 31) ^ 1231;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder("null".length() + 70 + String.valueOf(valueOf).length());
        sb.append("MeasurementKey{rawStringEventName=null, noPiiEventName=");
        sb.append(valueOf);
        sb.append(", isActivity=true}");
        return sb.toString();
    }
}
