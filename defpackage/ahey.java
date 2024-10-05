package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahey {
    public final Set a;
    public boolean b;

    public ahey(byte[] bArr, byte[] bArr2) {
        this.a = Collections.newSetFromMap(new WeakHashMap());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahew) it.next()).a(this.b);
        }
    }

    public final void b(oir oirVar) {
        oirVar.getClass();
        this.a.add(oirVar);
    }

    public final void c() {
        d(false);
    }

    public final void d(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((oir) it.next()).a(z);
        }
    }

    public final void e(ohi ohiVar) {
        this.a.add(ohiVar);
    }

    public final void f(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ohi) it.next()).pg(!this.b);
        }
    }

    public final boolean g() {
        return !this.b;
    }

    public ahey(byte[] bArr) {
        this.a = Collections.newSetFromMap(new WeakHashMap());
    }

    public ahey() {
        this.a = Collections.newSetFromMap(new WeakHashMap());
        this.b = false;
    }
}
