package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aama {
    public aalx a;
    public aalx b;
    public aalx c;
    public aalx d;
    public aalx e;
    public aalx f;
    public aalx g;
    public aalx h;
    public aalx i;

    public aama(aphg aphgVar, amml ammlVar) {
        aphgVar.getClass();
        Iterator it = aphgVar.b.iterator();
        while (true) {
            if (it.hasNext()) {
                aphf aphfVar = (aphf) it.next();
                switch ((anaf.aT(aphfVar.c) != 0 ? r3 : 1) - 1) {
                    case 1:
                    case 5:
                        this.a = new aalx(aphfVar, ammlVar);
                        break;
                    case 2:
                        this.c = new aalx(aphfVar, ammlVar);
                        break;
                    case 3:
                        this.b = new aalx(aphfVar, ammlVar);
                        break;
                    case 4:
                        this.d = new aalx(aphfVar, ammlVar);
                        break;
                    case 6:
                        this.e = new aalx(aphfVar, ammlVar);
                        break;
                }
            } else {
                for (aphf aphfVar2 : aphgVar.c) {
                    int aT = anaf.aT(aphfVar2.c);
                    int i = (aT == 0 ? 1 : aT) - 1;
                    if (i == 1) {
                        this.f = new aalx(aphfVar2, ammlVar);
                    } else if (i == 2) {
                        this.h = new aalx(aphfVar2, ammlVar);
                    } else if (i == 3) {
                        this.g = new aalx(aphfVar2, ammlVar);
                    } else if (i == 4) {
                        this.i = new aalx(aphfVar2, ammlVar);
                    }
                }
                return;
            }
        }
    }

    public final aalx a(boolean z, boolean z2, boolean z3, boolean z4) {
        aalx aalxVar;
        aalx aalxVar2;
        aalx aalxVar3;
        aalx aalxVar4;
        boolean z5 = z2 && b();
        boolean z6 = z && c();
        boolean z7 = z3 && d();
        return z5 ? this.e : (z6 || z7) ? !z6 ? (!z4 || (aalxVar3 = this.h) == null) ? this.c : aalxVar3 : !z7 ? (!z4 || (aalxVar2 = this.g) == null) ? this.b : aalxVar2 : (!z4 || (aalxVar = this.i) == null) ? this.d : aalxVar : (!z4 || (aalxVar4 = this.f) == null) ? this.a : aalxVar4;
    }

    public final boolean b() {
        return this.e != null;
    }

    public final boolean c() {
        return this.b != null;
    }

    public final boolean d() {
        return this.c != null;
    }
}
