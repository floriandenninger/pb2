package defpackage;

import android.text.Spanned;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abxh {
    public final int a;
    public final Spanned b;

    public abxh() {
    }

    public abxh(int i, Spanned spanned) {
        this.a = i;
        this.b = spanned;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abxh) {
            abxh abxhVar = (abxh) obj;
            if (this.a == abxhVar.a) {
                Spanned spanned = this.b;
                Spanned spanned2 = abxhVar.b;
                if (spanned != null ? spanned.equals(spanned2) : spanned2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        Spanned spanned = this.b;
        return i ^ (spanned == null ? 0 : spanned.hashCode());
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
        sb.append("IconText{iconResId=");
        sb.append(i);
        sb.append(", spanned=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
