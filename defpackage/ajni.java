package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ajni {
    public final int a;
    public final List b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public ajni(int i, List list, int i2, int i3, int i4, int i5, int i6) {
        amkq.E(i > 0);
        this.a = i;
        list.getClass();
        this.b = list;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
    }

    public static ajnh a() {
        return new ajnh();
    }

    public final Object b(int i) {
        if (i < 0 || i >= this.b.size()) {
            return null;
        }
        return this.b.get(i);
    }
}
