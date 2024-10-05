package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agf {
    static int a;
    public int c;
    public int d;
    final ArrayList b = new ArrayList();
    ArrayList e = null;
    private int f = -1;

    public agf(int i) {
        this.c = -1;
        this.d = 0;
        int i2 = a;
        a = i2 + 1;
        this.c = i2;
        this.d = i;
    }

    public final int a(afb afbVar, int i) {
        int o;
        int o2;
        if (this.b.size() == 0) {
            return 0;
        }
        ArrayList arrayList = this.b;
        afk afkVar = ((afk) arrayList.get(0)).T;
        afbVar.k();
        afkVar.b(afbVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((afk) arrayList.get(i2)).b(afbVar, false);
        }
        if (i == 0) {
            afl aflVar = (afl) afkVar;
            if (aflVar.at > 0) {
                acm.b(aflVar, afbVar, arrayList, 0);
            }
        }
        if (i == 1) {
            afl aflVar2 = (afl) afkVar;
            if (aflVar2.au > 0) {
                acm.b(aflVar2, afbVar, arrayList, 1);
            }
        }
        try {
            afbVar.j();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.e = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.e.add(new acp((afk) arrayList.get(i3)));
        }
        if (i == 0) {
            afl aflVar3 = (afl) afkVar;
            o = afb.o(aflVar3.f45J);
            o2 = afb.o(aflVar3.L);
            afbVar.k();
        } else {
            afl aflVar4 = (afl) afkVar;
            o = afb.o(aflVar4.K);
            o2 = afb.o(aflVar4.M);
            afbVar.k();
        }
        return o2 - o;
    }

    public final void b(ArrayList arrayList) {
        int size = this.b.size();
        if (this.f != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                agf agfVar = (agf) arrayList.get(i);
                if (this.f == agfVar.c) {
                    c(this.d, agfVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final void c(int i, agf agfVar) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            afk afkVar = (afk) arrayList.get(i2);
            agfVar.d(afkVar);
            if (i != 0) {
                afkVar.ao = agfVar.c;
            } else {
                afkVar.an = agfVar.c;
            }
        }
        this.f = agfVar.c;
    }

    public final boolean d(afk afkVar) {
        if (this.b.contains(afkVar)) {
            return false;
        }
        this.b.add(afkVar);
        return true;
    }

    public final String toString() {
        int i = this.d;
        String str = i == 0 ? "Horizontal" : i == 1 ? "Vertical" : "Both";
        int i2 = this.c;
        StringBuilder sb = new StringBuilder(str.length() + 16);
        sb.append(str);
        sb.append(" [");
        sb.append(i2);
        sb.append("] <");
        String sb2 = sb.toString();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            afk afkVar = (afk) arrayList.get(i3);
            String valueOf = String.valueOf(sb2);
            String str2 = afkVar.ah;
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str2).length());
            sb3.append(valueOf);
            sb3.append(" ");
            sb3.append(str2);
            sb2 = sb3.toString();
        }
        return String.valueOf(sb2).concat(" >");
    }
}
