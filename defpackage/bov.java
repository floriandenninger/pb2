package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bov {
    public final Bundle a;
    private bph b;

    public bov(bph bphVar, boolean z) {
        if (bphVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle = new Bundle();
        this.a = bundle;
        this.b = bphVar;
        bundle.putBundle("selector", bphVar.b);
        bundle.putBoolean("activeScan", z);
    }

    private final void d() {
        if (this.b == null) {
            bph a = bph.a(this.a.getBundle("selector"));
            this.b = a;
            if (a == null) {
                this.b = bph.a;
            }
        }
    }

    public final bph a() {
        d();
        return this.b;
    }

    public final boolean b() {
        return this.a.getBoolean("activeScan");
    }

    public final boolean c() {
        d();
        bph bphVar = this.b;
        bphVar.c();
        return !bphVar.c.contains(null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bov) {
            bov bovVar = (bov) obj;
            if (a().equals(bovVar.a()) && b() == bovVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode() ^ b();
    }

    public final String toString() {
        return "DiscoveryRequest{ selector=" + a() + ", activeScan=" + b() + ", isValid=" + c() + " }";
    }
}
