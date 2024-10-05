package defpackage;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azxm implements azxe {
    public final azxr a;
    private final azvm c;
    public final azvj b = azth.m(false);
    private final azvm d = azth.o(null);

    public azxm(azxr azxrVar, Throwable th) {
        this.a = azxrVar;
        this.c = azth.o(th);
    }

    public static final ArrayList i() {
        return new ArrayList(4);
    }

    public final Object c() {
        return this.d.a;
    }

    public final Throwable d() {
        return (Throwable) this.c.a;
    }

    public final void e(Throwable th) {
        Throwable d = d();
        if (d == null) {
            azvm azvmVar = this.c;
            int i = azvn.a;
            azvmVar.a = th;
            return;
        }
        if (th == d) {
            return;
        }
        Object c = c();
        if (c == null) {
            f(th);
            return;
        }
        if (!(c instanceof Throwable)) {
            if (!(c instanceof ArrayList)) {
                throw new IllegalStateException(azul.a("State is ", c).toString());
            }
            ((ArrayList) c).add(th);
        } else {
            if (th == c) {
                return;
            }
            ArrayList i2 = i();
            i2.add(c);
            i2.add(th);
            f(i2);
        }
    }

    public final void f(Object obj) {
        azvm azvmVar = this.d;
        int i = azvn.a;
        azvmVar.a = obj;
    }

    public final boolean g() {
        return d() != null;
    }

    public final boolean h() {
        return this.b.a();
    }

    @Override // defpackage.azxe
    public final azxr sp() {
        return this.a;
    }

    @Override // defpackage.azxe
    public final boolean sq() {
        return d() == null;
    }

    public final String toString() {
        return "Finishing[cancelling=" + g() + ", completing=" + h() + ", rootCause=" + d() + ", exceptions=" + c() + ", list=" + this.a + ']';
    }
}
