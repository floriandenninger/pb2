package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afdw {
    public final List a = new ArrayList();
    public final HashMap b = new HashMap();
    public int c;
    public long d;
    public boolean e;
    public final pft f;
    public final afdm g;
    private final ptk h;
    private final boolean i;
    private volatile boolean j;

    public afdw(pft pftVar, ptk ptkVar, boolean z, afdm afdmVar) {
        this.f = pftVar;
        this.h = ptkVar;
        this.i = z;
        this.g = afdmVar;
    }

    public final void a() {
        this.f.c(this.c);
    }

    public final void b(Object obj) {
        this.a.remove(obj);
        afdv afdvVar = (afdv) this.b.remove(obj);
        if (afdvVar != null) {
            this.c -= afdvVar.a;
        }
        c();
    }

    public final void c() {
        int a = this.f.a();
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i >= this.a.size()) {
                break;
            }
            afdv afdvVar = (afdv) this.b.get(this.a.get(i));
            if (afdvVar != null) {
                z |= afdvVar.c;
                z2 |= afdvVar.d != -1;
                i2 |= afdvVar.b;
            }
            i++;
        }
        boolean z3 = !this.a.isEmpty() && (z || z2) && i2 != 0 && a < this.c;
        this.e = z3;
        int i3 = true != this.i ? 0 : -10;
        if (z3) {
            if (!this.j) {
                this.h.a(i3);
                this.j = true;
            }
        } else if (this.j) {
            this.h.c(i3);
            this.j = false;
        }
        this.d = -1L;
        if (this.e) {
            for (int i4 = 0; i4 < this.a.size(); i4++) {
                afdv afdvVar2 = (afdv) this.b.get(this.a.get(i4));
                long j = afdvVar2 != null ? afdvVar2.d : -1L;
                if (j != -1) {
                    long j2 = this.d;
                    if (j2 == -1 || j < j2) {
                        this.d = j;
                    }
                }
            }
        }
    }
}
