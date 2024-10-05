package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dyp implements Iterator {
    final /* synthetic */ dyq a;
    private int b = 0;
    private final /* synthetic */ int c;

    public dyp(dyq dyqVar, int i) {
        this.c = i;
        this.a = dyqVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c != 0 ? this.b < this.a.a.length() : this.b < this.a.a.length();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (this.c != 0) {
            if (this.b < this.a.a.length()) {
                int i = this.b;
                this.b = i + 1;
                return new dyq(String.valueOf(i));
            }
            throw new NoSuchElementException();
        }
        if (this.b < this.a.a.length()) {
            String str = this.a.a;
            int i2 = this.b;
            this.b = i2 + 1;
            return new dyq(String.valueOf(str.charAt(i2)));
        }
        throw new NoSuchElementException();
    }
}
