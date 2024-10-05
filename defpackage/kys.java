package defpackage;

import j$.time.Instant;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kys {
    public avgg a;
    public int b;
    public String c;
    public apxf d;
    public String f;
    public String g;
    private String i;
    private String j;
    private Instant l;
    private final List k = new ArrayList();
    public int h = 1;
    public boolean e = true;

    public final kyt a() {
        if (this.l == null) {
            e(0L);
        }
        boolean z = this.e;
        String str = this.i;
        String str2 = this.j;
        int i = this.h;
        avgg avggVar = this.a;
        int i2 = this.b;
        List list = this.k;
        Instant instant = this.l;
        instant.getClass();
        return new kyt(z, str, str2, i, avggVar, i2, list, instant, this.c, this.d, this.f, this.g);
    }

    public final void b(avgg avggVar) {
        List list = this.k;
        avggVar.getClass();
        list.add(avggVar);
    }

    public final void c(String str) {
        str.getClass();
        this.i = str;
    }

    public final void d(String str) {
        str.getClass();
        this.j = str;
    }

    public final void e(long j) {
        Instant ofEpochMilli = Instant.ofEpochMilli(j);
        ofEpochMilli.getClass();
        this.l = ofEpochMilli;
    }
}
