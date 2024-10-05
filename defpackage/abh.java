package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abh {
    public final int a;
    public final CharSequence b;

    public abh(int i, CharSequence charSequence) {
        this.a = i;
        this.b = charSequence;
    }

    private static String a(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof abh) {
            abh abhVar = (abh) obj;
            if (this.a == abhVar.a) {
                CharSequence charSequence = abhVar.b;
                String a = a(this.b);
                String a2 = a(charSequence);
                if (a == null && a2 == null) {
                    return true;
                }
                if (a != null && a.equals(a2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), a(this.b)});
    }
}
