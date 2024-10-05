package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amlr extends ammv {
    public static final amlr a = new amlr();
    private static final long serialVersionUID = 0;

    private amlr() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.ammv
    public final ammv a(ammv ammvVar) {
        ammvVar.getClass();
        return ammvVar;
    }

    @Override // defpackage.ammv
    public final ammv b(amml ammlVar) {
        ammlVar.getClass();
        return a;
    }

    @Override // defpackage.ammv
    public final Object c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // defpackage.ammv
    public final Object d(amnv amnvVar) {
        Object obj = amnvVar.get();
        obj.getClass();
        return obj;
    }

    @Override // defpackage.ammv
    public final Object e(Object obj) {
        obj.getClass();
        return obj;
    }

    @Override // defpackage.ammv
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // defpackage.ammv
    public final Object f() {
        return null;
    }

    @Override // defpackage.ammv
    public final Set g() {
        return Collections.emptySet();
    }

    @Override // defpackage.ammv
    public final boolean h() {
        return false;
    }

    @Override // defpackage.ammv
    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
