package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amna extends ammv {
    private static final long serialVersionUID = 0;
    public final Object a;

    public amna(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.ammv
    public final ammv a(ammv ammvVar) {
        ammvVar.getClass();
        return this;
    }

    @Override // defpackage.ammv
    public final ammv b(amml ammlVar) {
        Object apply = ammlVar.apply(this.a);
        apply.getClass();
        return new amna(apply);
    }

    @Override // defpackage.ammv
    public final Object c() {
        return this.a;
    }

    @Override // defpackage.ammv
    public final Object d(amnv amnvVar) {
        amnvVar.getClass();
        return this.a;
    }

    @Override // defpackage.ammv
    public final Object e(Object obj) {
        obj.getClass();
        return this.a;
    }

    @Override // defpackage.ammv
    public final boolean equals(Object obj) {
        if (obj instanceof amna) {
            return this.a.equals(((amna) obj).a);
        }
        return false;
    }

    @Override // defpackage.ammv
    public final Object f() {
        return this.a;
    }

    @Override // defpackage.ammv
    public final Set g() {
        return Collections.singleton(this.a);
    }

    @Override // defpackage.ammv
    public final boolean h() {
        return true;
    }

    @Override // defpackage.ammv
    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
