package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class azyj implements azys {
    public final azzq a = new azzq();

    public azyj() {
        azth.o(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    private static final void a(azyr azyrVar) {
        ArrayList arrayList = 0;
        while (true) {
            azzt i = azyrVar.i();
            azyo azyoVar = i instanceof azyo ? (azyo) i : null;
            if (azyoVar == null) {
                break;
            }
            if (azyoVar.m()) {
                boolean z = azwq.a;
                if (arrayList == 0) {
                    arrayList = azyoVar;
                } else if (arrayList instanceof ArrayList) {
                    arrayList.add(azyoVar);
                } else {
                    ArrayList arrayList2 = new ArrayList(4);
                    arrayList2.add(arrayList);
                    arrayList2.add(azyoVar);
                    arrayList = arrayList2;
                }
            } else {
                ((azzz) azyoVar.g()).a.l();
            }
        }
        if (arrayList == 0) {
            return;
        }
        if (!(arrayList instanceof ArrayList)) {
            ((azyo) arrayList).c(azyrVar);
            return;
        }
        ArrayList arrayList3 = arrayList;
        int size = arrayList3.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i2 = size - 1;
            ((azyo) arrayList3.get(size)).c(azyrVar);
            if (i2 < 0) {
                return;
            } else {
                size = i2;
            }
        }
    }

    private static final void b(azyr azyrVar) {
        a(azyrVar);
        throw null;
    }

    protected Object d(Object obj) {
        throw null;
    }

    protected String e() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final azyr f() {
        azzt i = this.a.i();
        azyr azyrVar = i instanceof azyr ? (azyr) i : null;
        if (azyrVar == null) {
            return null;
        }
        a(azyrVar);
        return azyrVar;
    }

    @Override // defpackage.azys
    public final void g(Object obj) {
        Object d = d(obj);
        if (d == azyi.b) {
            return;
        }
        if (d == azyi.c) {
            azyr f = f();
            if (f == null) {
                return;
            }
            b(f);
            return;
        }
        if (d instanceof azyr) {
            b((azyr) d);
            return;
        }
        throw new IllegalStateException(azul.a("trySend returned ", d).toString());
    }

    public final String toString() {
        String a;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(azth.g(this));
        sb.append('@');
        sb.append(azth.h(this));
        sb.append('{');
        azzt h = this.a.h();
        if (h == this.a) {
            str = "EmptyQueue";
        } else {
            if (h instanceof azyr) {
                a = h.toString();
            } else {
                a = h instanceof azyo ? "ReceiveQueued" : azul.a("UNEXPECTED:", h);
            }
            azzt i = this.a.i();
            if (i != h) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(a);
                sb2.append(",queueSize=");
                azzq azzqVar = this.a;
                int i2 = 0;
                for (azzt azztVar = (azzt) azzqVar.g(); !azul.c(azztVar, azzqVar); azztVar = azztVar.h()) {
                    if (azztVar instanceof azzt) {
                        i2++;
                    }
                }
                sb2.append(i2);
                str = sb2.toString();
                if (i instanceof azyr) {
                    str = str + ",closedForSend=" + i;
                }
            } else {
                str = a;
            }
        }
        sb.append(str);
        sb.append('}');
        sb.append(e());
        return sb.toString();
    }
}
