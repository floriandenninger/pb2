package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class oyc {
    public final String a;
    public final boolean b;

    public oyc(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == oyc.class) {
            oyc oycVar = (oyc) obj;
            if (TextUtils.equals(this.a, oycVar.a) && this.b == oycVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (true != this.b ? 1237 : 1231);
    }
}
