package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dog {
    public static dog a;
    private final ArrayList b = new ArrayList();
    private final ArrayList c = new ArrayList();
    private final Map d = new HashMap();
    private boolean e = false;
    private final doe f;

    public dog(doe doeVar) {
        this.f = doeVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void a(long j) {
        if (this.e) {
            this.c.clear();
            if (this.b.size() != 0) {
                doy doyVar = new doy();
                aeg aegVar = new aeg();
                int size = this.b.size();
                for (int i = 0; i < size; i++) {
                    ArrayList arrayList = ((doj) this.b.get(i)).c;
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        dop dopVar = (dop) arrayList.get(i2);
                        ArrayList arrayList2 = dopVar.b;
                        int size3 = arrayList2 == null ? 0 : arrayList2.size();
                        if (size3 == 0) {
                            doyVar.add(dopVar);
                        } else {
                            aegVar.put(dopVar, Integer.valueOf(size3));
                        }
                    }
                }
                if (!aegVar.isEmpty() && doyVar.isEmpty()) {
                    throw new doh("Graph has nodes, but they represent a cycle with no leaf nodes!");
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.addAll(doyVar);
                while (!arrayDeque.isEmpty()) {
                    dop dopVar2 = (dop) arrayDeque.pollFirst();
                    this.c.add(dopVar2);
                    for (dop dopVar3 : dopVar2.h()) {
                        int intValue = ((Integer) aegVar.get(dopVar3)).intValue() - 1;
                        aegVar.put(dopVar3, Integer.valueOf(intValue));
                        if (intValue == 0) {
                            arrayDeque.addLast(dopVar3);
                        } else if (intValue < 0) {
                            throw new doh("Detected cycle.");
                        }
                    }
                }
                if (this.c.size() != aegVar.j + doyVar.size()) {
                    throw new doh("Had unreachable nodes in graph -- this likely means there was a cycle");
                }
                Collections.reverse(this.c);
                this.e = false;
            }
        }
        int size4 = this.c.size();
        for (int i3 = 0; i3 < size4; i3++) {
            dop dopVar4 = (dop) this.c.get(i3);
            float a2 = dopVar4.a(j);
            if (j != dopVar4.d) {
                dopVar4.d = j;
                dopVar4.c = a2;
            } else {
                throw new RuntimeException("Got a calculate value call multiple times in the same frame. This isn't expected.");
            }
        }
        int size5 = this.c.size();
        for (int i4 = 0; i4 < size5; i4++) {
            dop dopVar5 = (dop) this.c.get(i4);
            azpg azpgVar = (azpg) this.d.get(dopVar5);
            if (!azpgVar.a) {
                Iterator it = dopVar5.h().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((azpg) this.d.get((dop) it.next())).a) {
                            break;
                        }
                    } else if (!(dopVar5 instanceof dom) || ((dom) dopVar5).b()) {
                        azpgVar.a = true;
                    }
                }
            }
        }
        int size6 = this.b.size();
        while (true) {
            size6--;
            if (size6 >= 0) {
                doj dojVar = (doj) this.b.get(size6);
                ArrayList arrayList3 = dojVar.c;
                int size7 = arrayList3.size();
                int i5 = 0;
                while (true) {
                    if (i5 < size7) {
                        if (!((azpg) this.d.get(arrayList3.get(i5))).a) {
                            break;
                        } else {
                            i5++;
                        }
                    } else {
                        dnr dnrVar = dojVar.f;
                        if (dnrVar != null) {
                            dns dnsVar = dnrVar.a;
                            dnsVar.h();
                            dnsVar.d();
                        }
                        dojVar.b();
                    }
                }
            }
        }
    }

    public final synchronized void b(doj dojVar) {
        if (!dojVar.d) {
            String valueOf = String.valueOf(dojVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
            sb.append("Expected added GraphBinding to be active: ");
            sb.append(valueOf);
            throw new RuntimeException(sb.toString());
        }
        this.b.add(dojVar);
        ArrayList arrayList = dojVar.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            dop dopVar = (dop) arrayList.get(i);
            azpg azpgVar = (azpg) this.d.get(dopVar);
            if (azpgVar != null) {
                azpgVar.b++;
            } else {
                azpg azpgVar2 = new azpg(null, null);
                azpgVar2.b = 1;
                this.d.put(dopVar, azpgVar2);
            }
        }
        if (this.b.size() == 1) {
            doe doeVar = this.f;
            if (doeVar.c != null) {
                if (!doeVar.d) {
                    doeVar.d = true;
                    doeVar.a();
                } else {
                    throw new RuntimeException("Tried to start but was already running.");
                }
            } else {
                throw new RuntimeException("Must set a binding graph first.");
            }
        }
        this.e = true;
    }

    public final synchronized void c(doj dojVar) {
        if (this.b.remove(dojVar)) {
            ArrayList arrayList = dojVar.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                dop dopVar = (dop) arrayList.get(i);
                azpg azpgVar = (azpg) this.d.get(dopVar);
                int i2 = azpgVar.b - 1;
                azpgVar.b = i2;
                if (i2 == 0) {
                    this.d.remove(dopVar);
                }
            }
            if (this.b.isEmpty()) {
                doe doeVar = this.f;
                if (doeVar.d) {
                    doeVar.d = false;
                    dnx dnxVar = doeVar.a;
                    dnw dnwVar = doeVar.b;
                    dnwVar.a.set(null);
                    if (((dnz) dnxVar).c == null) {
                        ((dnz) dnxVar).b.removeCallbacks(dnwVar.b());
                    } else {
                        ((dnz) dnxVar).c.removeFrameCallback(dnwVar.a());
                    }
                    doeVar.e = false;
                    this.c.clear();
                    if (!this.d.isEmpty()) {
                        throw new RuntimeException("Failed to clean up all nodes");
                    }
                } else {
                    throw new RuntimeException("Tried to stop but wasn't running.");
                }
            }
            this.e = true;
        } else {
            throw new RuntimeException("Tried to unregister non-existent binding");
        }
    }
}
