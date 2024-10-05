package defpackage;

import dalvik.system.VMStack;

/* compiled from: PG */
/* loaded from: classes.dex */
class amzv extends amzm {
    @Override // defpackage.amzm
    public amxs a(Class cls, int i) {
        return amxs.a;
    }

    @Override // defpackage.amzm
    public String b(Class cls) {
        boolean z;
        boolean z2;
        StackTraceElement a;
        z = amzx.a;
        if (z) {
            try {
                if (cls.equals(amzx.p())) {
                    return VMStack.getStackClass2().getName();
                }
            } catch (Throwable unused) {
            }
        }
        z2 = amzx.b;
        if (!z2 || (a = anay.a(cls)) == null) {
            return null;
        }
        return a.getClassName();
    }
}
