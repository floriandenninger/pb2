package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afj {
    public int b;
    public boolean c;
    public final afk d;
    public afj e;
    public aff h;
    public final int i;
    public HashSet a = null;
    public int f = 0;
    int g = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;

    public afj(afk afkVar, int i) {
        this.d = afkVar;
        this.i = i;
    }

    public final int a() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int b() {
        afj afjVar;
        if (this.d.ag == 8) {
            return 0;
        }
        int i = this.g;
        return (i == Integer.MIN_VALUE || (afjVar = this.e) == null || afjVar.d.ag != 8) ? this.f : i;
    }

    public final void c(int i, ArrayList arrayList, agf agfVar) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                aco.b(((afj) it.next()).d, i, arrayList, agfVar);
            }
        }
    }

    public final void d() {
        HashSet hashSet;
        afj afjVar = this.e;
        if (afjVar != null && (hashSet = afjVar.a) != null) {
            hashSet.remove(this);
            if (this.e.a.size() == 0) {
                this.e.a = null;
            }
        }
        this.a = null;
        this.e = null;
        this.f = 0;
        this.g = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.c = false;
        this.b = 0;
    }

    public final void e(int i) {
        this.b = i;
        this.c = true;
    }

    public final boolean f() {
        afj afjVar;
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            afj afjVar2 = (afj) it.next();
            int i = afjVar2.i - 1;
            if (i == 1) {
                afjVar = afjVar2.d.L;
            } else if (i == 2) {
                afjVar = afjVar2.d.M;
            } else if (i != 3) {
                afjVar = i != 4 ? null : afjVar2.d.K;
            } else {
                afjVar = afjVar2.d.f45J;
            }
            if (afjVar.h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        return hashSet != null && hashSet.size() > 0;
    }

    public final boolean h() {
        return this.e != null;
    }

    public final void i() {
        aff affVar = this.h;
        if (affVar == null) {
            this.h = new aff(1);
        } else {
            affVar.c();
        }
    }

    public final void j(afj afjVar, int i, int i2) {
        if (afjVar == null) {
            d();
            return;
        }
        this.e = afjVar;
        if (afjVar.a == null) {
            afjVar.a = new HashSet();
        }
        HashSet hashSet = this.e.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f = i;
        this.g = i2;
    }

    public final String toString() {
        String str;
        String str2 = this.d.ah;
        switch (this.i) {
            case 2:
                str = "LEFT";
                break;
            case 3:
                str = "TOP";
                break;
            case 4:
                str = "RIGHT";
                break;
            case 5:
                str = "BOTTOM";
                break;
            case 6:
                str = "BASELINE";
                break;
            case 7:
                str = "CENTER";
                break;
            case 8:
                str = "CENTER_X";
                break;
            default:
                str = "CENTER_Y";
                break;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + str.length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }
}
