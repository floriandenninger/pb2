package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aanb implements Comparable {
    public final String a;
    public final String b;
    public final boolean c;

    public aanb(String str, String str2, boolean z) {
        zhq.m(str);
        this.a = str;
        zhq.m(str2);
        this.b = str2;
        this.c = z;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        aanb aanbVar = (aanb) obj;
        if (aanbVar == null) {
            return 1;
        }
        return this.b.compareTo(aanbVar.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aanb)) {
            return false;
        }
        aanb aanbVar = (aanb) obj;
        return this.a.equals(aanbVar.a) && this.b.equals(aanbVar.b) && this.c == aanbVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c)});
    }
}
