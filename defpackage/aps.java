package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aps {
    private final apt a;
    private final apo b;

    public aps(apt aptVar, apo apoVar) {
        aptVar.getClass();
        apoVar.getClass();
        this.a = aptVar;
        this.b = apoVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public aps(defpackage.apu r3) {
        /*
            r2 = this;
            r3.getClass()
            apt r0 = r3.getViewModelStore()
            r0.getClass()
            boolean r1 = r3 instanceof defpackage.aoc
            if (r1 == 0) goto L18
            aoc r3 = (defpackage.aoc) r3
            apo r3 = r3.getDefaultViewModelProviderFactory()
            r3.getClass()
            goto L1c
        L18:
            apq r3 = defpackage.ho.G()
        L1c:
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aps.<init>(apu):void");
    }

    public final apm a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return b(azul.a("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName), cls);
    }

    public final apm b(String str, Class cls) {
        apm a;
        str.getClass();
        apm a2 = this.a.a(str);
        if (!cls.isInstance(a2)) {
            apo apoVar = this.b;
            if (apoVar instanceof app) {
                a = ((app) apoVar).b(str, cls);
            } else {
                a = apoVar.a(cls);
            }
            apm apmVar = (apm) this.a.a.put(str, a);
            if (apmVar != null) {
                apmVar.d();
            }
            a.getClass();
            return a;
        }
        Object obj = this.b;
        apr aprVar = obj instanceof apr ? (apr) obj : null;
        if (aprVar != null) {
            a2.getClass();
            aprVar.c(a2);
        }
        if (a2 != null) {
            return a2;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public aps(defpackage.apu r1, defpackage.apo r2) {
        /*
            r0 = this;
            r1.getClass()
            r2.getClass()
            apt r1 = r1.getViewModelStore()
            r1.getClass()
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aps.<init>(apu, apo):void");
    }
}
