package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anw {
    final int a;
    final Method b;

    public anw(int i, Method method) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anw)) {
            return false;
        }
        anw anwVar = (anw) obj;
        return this.a == anwVar.a && this.b.getName().equals(anwVar.b.getName());
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.getName().hashCode();
    }
}
