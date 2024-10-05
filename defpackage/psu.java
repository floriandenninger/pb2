package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class psu {
    public final Object a;
    public psm b = new psm();
    public boolean c;
    public boolean d;

    public psu(Object obj) {
        this.a = obj;
    }

    public final void a(pst pstVar) {
        this.d = true;
        if (this.c) {
            pstVar.a(this.a, this.b.a());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((psu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
