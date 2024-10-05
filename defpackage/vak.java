package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class vak {
    public final List a;

    public vak(List list, byte[] bArr) {
        this.a = list;
    }

    public vak(List list, char[] cArr) {
        this.a = list;
    }

    public vak(vak vakVar, byte[] bArr, byte[] bArr2) {
        this.a = vakVar.a;
    }

    public vak(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = amru.q();
    }

    private final List w(aepg aepgVar) {
        String str;
        int i;
        List list;
        pth pthVar = new pth(aepgVar.a);
        List list2 = this.a;
        while (pthVar.a() > 0) {
            int i2 = pthVar.i();
            int i3 = pthVar.b + pthVar.i();
            if (i2 == 134) {
                list2 = new ArrayList();
                int i4 = pthVar.i() & 31;
                for (int i5 = 0; i5 < i4; i5++) {
                    String v = pthVar.v(3);
                    int i6 = pthVar.i();
                    int i7 = i6 & 128;
                    if (i7 != 0) {
                        i = i6 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte i8 = (byte) pthVar.i();
                    pthVar.H(1);
                    if (i7 != 0) {
                        byte[] bArr = psg.a;
                        list = Collections.singletonList((i8 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    pmr pmrVar = new pmr();
                    pmrVar.k = str;
                    pmrVar.c = v;
                    pmrVar.C = i;
                    pmrVar.m = list;
                    list2.add(pmrVar.a());
                }
            }
            pthVar.G(i3);
        }
        return list2;
    }

    public vaj a(vaj vajVar) {
        return vajVar;
    }

    public vaj b(vaj vajVar) {
        return vajVar.e;
    }

    public final amru c() {
        return amru.o(this.a);
    }

    public final boolean d(int i) {
        return i >= 0 && i < this.a.size();
    }

    public final Runnable e(Runnable runnable) {
        if (!this.a.isEmpty()) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                runnable = ((ynf) it.next()).a(runnable);
            }
        }
        return runnable;
    }

    public final aieg f(int i) {
        if (i < 0 || i >= this.a.size()) {
            return null;
        }
        return (aieg) this.a.get(i);
    }

    public final aflc g() {
        return (aflc) this.a.get(0);
    }

    public final synchronized cqq h(Class cls) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            dbn dbnVar = (dbn) this.a.get(i);
            if (dbnVar.a.isAssignableFrom(cls)) {
                return dbnVar.b;
            }
        }
        return null;
    }

    public final synchronized void i(Class cls, cqq cqqVar) {
        this.a.add(new dbn(cls, cqqVar));
    }

    public final synchronized List j() {
        return this.a;
    }

    public final synchronized void k(cpz cpzVar) {
        this.a.add(cpzVar);
    }

    public final synchronized cpx l(Class cls) {
        for (dbj dbjVar : this.a) {
            if (dbjVar.a.isAssignableFrom(cls)) {
                return dbjVar.b;
            }
        }
        return null;
    }

    public final synchronized void m(Class cls, cpx cpxVar) {
        this.a.add(new dbj(cls, cpxVar));
    }

    public final synchronized czz n(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return dab.a;
        }
        for (daa daaVar : this.a) {
            if (daaVar.a(cls, cls2)) {
                return daaVar.c;
            }
        }
        String valueOf = String.valueOf(cls);
        String valueOf2 = String.valueOf(cls2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47 + String.valueOf(valueOf2).length());
        sb.append("No transcoder registered to transcode from ");
        sb.append(valueOf);
        sb.append(" to ");
        sb.append(valueOf2);
        throw new IllegalArgumentException(sb.toString());
    }

    public final synchronized List o(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (daa daaVar : this.a) {
            if (daaVar.a(cls, cls2) && !arrayList.contains(daaVar.b)) {
                arrayList.add(daaVar.b);
            }
        }
        return arrayList;
    }

    public final synchronized void p(Class cls, Class cls2, czz czzVar) {
        this.a.add(new daa(cls, cls2, czzVar));
    }

    public final void q(che cheVar) {
        this.a.add(cheVar);
    }

    public final void r(Path path) {
        int size = this.a.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                cls.g(path, (che) this.a.get(size));
            }
        }
    }

    public final bmt s(aepg aepgVar) {
        return new bmt(w(aepgVar));
    }

    public final bnb t(aepg aepgVar) {
        return new bnb(w(aepgVar));
    }

    public final synchronized boolean u(int i) {
        if (this.a.size() >= 256) {
            return false;
        }
        this.a.add(Integer.valueOf(i));
        return true;
    }

    public final void v(amvf amvfVar) {
        amkq.J(!amvfVar.m(), "range must not be empty, but was %s", amvfVar);
        this.a.add(amvfVar);
    }

    public vak(byte[] bArr, char[] cArr, byte[] bArr2) {
        this.a = new ArrayList();
    }

    public vak(short[] sArr, byte[] bArr) {
        this.a = new ArrayList();
    }

    public vak(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new ArrayList();
    }

    public vak(char[] cArr, byte[] bArr) {
        this.a = new ArrayList();
    }

    public vak(byte[] bArr, char[] cArr) {
        this.a = new ArrayList();
    }

    public vak(int[] iArr) {
        this.a = new ArrayList();
    }

    vak() {
        vaj vajVar = vaj.HIDDEN;
        throw null;
    }

    public vak(List list) {
        this.a = Collections.unmodifiableList(list);
    }

    public vak(byte[] bArr) {
        this.a = new ArrayList();
    }

    public vak(char[] cArr) {
        this.a = new CopyOnWriteArrayList();
    }

    public vak(argu arguVar) {
        if (arguVar == null || arguVar.c.size() == 0 || arguVar.c.size() == 0) {
            this.a = Collections.emptyList();
            return;
        }
        int size = arguVar.c.size();
        this.a = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            this.a.add(false);
        }
    }

    public vak(byte[] bArr, byte[] bArr2) {
        this.a = new ArrayList();
    }

    public vak(short[] sArr) {
        this.a = new ArrayList();
    }

    public vak(byte[] bArr, short[] sArr) {
        this.a = amkq.aO();
    }

    public vak(boolean[] zArr) {
        this.a = new ArrayList(1);
    }
}
