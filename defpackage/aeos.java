package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeos {
    public static final aeos a = new aeos(new ArrayDeque(), new ArrayDeque(), new ArrayDeque(), new ArrayDeque(), -1, "EMPTY");
    ArrayDeque b;
    ArrayDeque c;
    ArrayDeque d;
    ArrayDeque e;
    long f;
    String g;

    public aeos(afim afimVar) {
        this.f = -1L;
        this.b = new ArrayDeque();
        this.c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = new ArrayDeque();
        this.b.addAll(afimVar.b);
        this.c.addAll(afimVar.d);
        this.d.addAll(afimVar.c);
        this.e.addAll(afimVar.e);
        this.f = afimVar.f;
        this.g = afimVar.g;
    }

    public aeos(ArrayDeque arrayDeque, ArrayDeque arrayDeque2, ArrayDeque arrayDeque3, ArrayDeque arrayDeque4, long j, String str) {
        this.b = arrayDeque;
        this.c = arrayDeque2;
        this.d = arrayDeque3;
        this.e = arrayDeque4;
        this.f = j;
        this.g = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aeos a(aeos aeosVar) {
        return new aeos(aeosVar.b, aeosVar.c, aeosVar.d, aeosVar.e, aeosVar.f, aeosVar.g);
    }
}
