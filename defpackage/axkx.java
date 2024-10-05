package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class axkx implements axlc {
    public final String a;
    public final List b = new ArrayList();
    Map c = new HashMap();

    public axkx(String str) {
        this.a = str;
    }

    @Override // defpackage.axlc
    public final long a() {
        long j = 0;
        for (long j2 : m()) {
            j += j2;
        }
        return j;
    }

    @Override // defpackage.axlc
    public dfh b() {
        throw null;
    }

    @Override // defpackage.axlc
    public final String c() {
        return this.a;
    }

    @Override // defpackage.axlc
    public List d() {
        throw null;
    }

    @Override // defpackage.axlc
    public final List e() {
        return this.b;
    }

    @Override // defpackage.axlc
    public List f() {
        throw null;
    }

    @Override // defpackage.axlc
    public final Map g() {
        return this.c;
    }

    @Override // defpackage.axlc
    public long[] h() {
        throw null;
    }
}
