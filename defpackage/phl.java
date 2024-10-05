package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class phl implements Comparable {
    public final String a;
    public final long b;
    public final long c;
    public final boolean d;
    public final File e;
    public final long f;

    public phl(String str, long j, long j2, long j3, File file) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = file != null;
        this.e = file;
        this.f = j3;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(phl phlVar) {
        if (!this.a.equals(phlVar.a)) {
            return this.a.compareTo(phlVar.a);
        }
        long j = this.b - phlVar.b;
        if (j == 0) {
            return 0;
        }
        return j >= 0 ? 1 : -1;
    }

    public final boolean b() {
        return !this.d;
    }

    public final boolean c() {
        return this.c == -1;
    }
}
