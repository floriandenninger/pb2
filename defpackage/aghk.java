package defpackage;

import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aghk {
    private final HashSet a;
    private final aghl b;
    private int c;

    public aghk(aghc aghcVar) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = new aghl(this, hashSet);
        this.c = aghcVar.k().size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized int a() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized aghl b() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized HashSet c() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(String str) {
        this.a.add(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e(String str) {
        this.a.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f(int i) {
        b().d();
        this.c = i;
    }
}
