package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class afx implements afv {
    final agg d;
    int e;
    public int f;
    public afv a = null;
    public boolean b = false;
    public boolean c = false;
    int l = 1;
    int g = 1;
    afy h = null;
    public boolean i = false;
    final List j = new ArrayList();
    final List k = new ArrayList();

    public afx(agg aggVar) {
        this.d = aggVar;
    }

    public final void a(afv afvVar) {
        this.j.add(afvVar);
        if (this.i) {
            afvVar.f();
        }
    }

    public final void b() {
        this.k.clear();
        this.j.clear();
        this.i = false;
        this.f = 0;
        this.c = false;
        this.b = false;
    }

    public void c(int i) {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f = i;
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((afv) it.next()).f();
        }
    }

    @Override // defpackage.afv
    public final void f() {
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            if (!((afx) it.next()).i) {
                return;
            }
        }
        this.c = true;
        afv afvVar = this.a;
        if (afvVar != null) {
            afvVar.f();
        }
        if (this.b) {
            this.d.f();
            return;
        }
        afx afxVar = null;
        int i = 0;
        for (afx afxVar2 : this.k) {
            if (!(afxVar2 instanceof afy)) {
                i++;
                afxVar = afxVar2;
            }
        }
        if (afxVar != null && i == 1 && afxVar.i) {
            afy afyVar = this.h;
            if (afyVar != null) {
                if (!afyVar.i) {
                    return;
                } else {
                    this.e = this.g * afyVar.f;
                }
            }
            c(afxVar.f + this.e);
        }
        afv afvVar2 = this.a;
        if (afvVar2 != null) {
            afvVar2.f();
        }
    }

    public final String toString() {
        String str;
        String str2 = this.d.d.ah;
        switch (this.l) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        String valueOf = String.valueOf(this.i ? Integer.valueOf(this.f) : "unresolved");
        int size = this.k.size();
        int size2 = this.j.size();
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 33 + str.length() + String.valueOf(valueOf).length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        sb.append("(");
        sb.append(valueOf);
        sb.append(") <t=");
        sb.append(size);
        sb.append(":d=");
        sb.append(size2);
        sb.append(">");
        return sb.toString();
    }
}
