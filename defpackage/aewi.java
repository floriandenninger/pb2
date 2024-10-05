package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aewi extends bjz {
    private final afea p;
    private final ArrayDeque q;

    public aewi(afea afeaVar) {
        super(1);
        this.q = new ArrayDeque();
        this.p = afeaVar;
    }

    @Override // defpackage.bjz
    public final int a(int i) {
        if (i == 17543 || i == 17827) {
            return 3;
        }
        if (i == 26568 || i == 29555 || i == 307544935) {
            return 1;
        }
        return super.a(i);
    }

    @Override // defpackage.bjz, defpackage.bih
    public final void f(long j, long j2) {
        this.q.clear();
        super.f(j, j2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bjz
    public final void k(int i) {
        String str;
        if (i == 26568) {
            aewh aewhVar = (aewh) this.q.removeFirst();
            String str2 = aewhVar.a;
            if (str2 != null && (str = aewhVar.b) != null) {
                afea afeaVar = this.p;
                aewt aewtVar = (aewt) afeaVar;
                if (aewtVar.a.isEmpty() || aewtVar.a.contains(str2)) {
                    try {
                        HashMap hashMap = new HashMap();
                        Iterator it = amnm.d("[\\r\\n]+").f(str).iterator();
                        while (it.hasNext()) {
                            List h = amnm.c(": ").h((String) it.next());
                            if (h.size() >= 2) {
                                hashMap.put((String) h.get(0), (String) h.get(1));
                            }
                        }
                        ((aewt) afeaVar).b.i(new aesh(str2, hashMap));
                    } catch (IOException e) {
                        aewtVar.b.j(e);
                    }
                }
            }
            i = 26568;
        }
        super.k(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bjz
    public final void l(int i, long j, long j2) {
        int i2;
        if (i == 26568) {
            this.q.addFirst(new aewh());
            i2 = 26568;
        } else {
            i2 = i;
        }
        super.l(i2, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bjz
    public final void m(int i, String str) {
        aewh aewhVar = (aewh) this.q.peekFirst();
        if (i == 17827) {
            afki.a(aewhVar);
            aewhVar.a = str;
        } else if (i == 17543) {
            afki.a(aewhVar);
            aewhVar.b = str;
            i = 17543;
        }
        super.m(i, str);
    }
}
