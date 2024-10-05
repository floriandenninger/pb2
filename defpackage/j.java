package defpackage;

import java.text.Format;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class j {
    final int a;
    final String b;
    final Number c;
    final double d;
    int e;
    Format f;
    String g;
    boolean h;

    public j(int i, String str, Number number, double d) {
        this.a = i;
        this.b = str;
        if (d == 0.0d) {
            this.c = number;
        } else {
            this.c = Double.valueOf(number.doubleValue() - d);
        }
        this.d = d;
    }

    public final String toString() {
        throw new AssertionError("PluralSelectorContext being formatted, rather than its number");
    }
}
