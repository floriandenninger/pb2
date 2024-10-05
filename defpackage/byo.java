package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class byo {
    public static final byo a = new byn().a();
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public long g;
    public byq h;
    public int i;

    public byo() {
        this.i = 1;
        this.f = -1L;
        this.g = -1L;
        this.h = new byq();
    }

    public final boolean a() {
        return this.h.a() > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        byo byoVar = (byo) obj;
        if (this.b == byoVar.b && this.c == byoVar.c && this.d == byoVar.d && this.e == byoVar.e && this.f == byoVar.f && this.g == byoVar.g && this.i == byoVar.i) {
            return this.h.equals(byoVar.h);
        }
        return false;
    }

    public byo(byn bynVar) {
        this.i = 1;
        this.f = -1L;
        this.g = -1L;
        this.h = new byq();
        this.b = bynVar.a;
        this.c = false;
        this.i = bynVar.c;
        this.d = false;
        this.e = false;
        if (Build.VERSION.SDK_INT >= 24) {
            this.h = bynVar.b;
            this.f = -1L;
            this.g = -1L;
        }
    }

    public final int hashCode() {
        int i = this.i;
        if (i != 0) {
            boolean z = this.b;
            boolean z2 = this.c;
            boolean z3 = this.d;
            boolean z4 = this.e;
            long j = this.f;
            long j2 = this.g;
            return (((((((((((((i * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 31) + (z4 ? 1 : 0)) * 31) + ((int) ((j >>> 32) ^ j))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + this.h.hashCode();
        }
        throw null;
    }

    public byo(byo byoVar) {
        this.i = 1;
        this.f = -1L;
        this.g = -1L;
        this.h = new byq();
        this.b = byoVar.b;
        this.c = byoVar.c;
        this.i = byoVar.i;
        this.d = byoVar.d;
        this.e = byoVar.e;
        this.h = byoVar.h;
    }
}
