package defpackage;

import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bf extends dn implements db {
    final dd a;
    boolean b;
    public int c;

    public bf(dd ddVar) {
        ddVar.h();
        co coVar = ddVar.m;
        if (coVar != null) {
            coVar.c.getClassLoader();
        }
        this.c = -1;
        this.a = ddVar;
    }

    @Override // defpackage.dn
    public final int a() {
        return b(false);
    }

    final int b(boolean z) {
        if (this.b) {
            throw new IllegalStateException("commit already called");
        }
        if (dd.W(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Commit: ");
            sb.append(this);
            PrintWriter printWriter = new PrintWriter(new ds());
            g("  ", printWriter);
            printWriter.close();
        }
        this.b = true;
        if (this.j) {
            this.c = this.a.f.getAndIncrement();
        } else {
            this.c = -1;
        }
        this.a.F(this, z);
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(int i) {
        if (this.j) {
            if (dd.W(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Bump nesting in ");
                sb.append(this);
                sb.append(" by ");
                sb.append(i);
            }
            int size = this.d.size();
            for (int i2 = 0; i2 < size; i2++) {
                dm dmVar = (dm) this.d.get(i2);
                ce ceVar = dmVar.b;
                if (ceVar != null) {
                    ceVar.y += i;
                    if (dd.W(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Bump nesting of ");
                        sb2.append(dmVar.b);
                        sb2.append(" to ");
                        sb2.append(dmVar.b.y);
                    }
                }
            }
        }
    }

    @Override // defpackage.dn
    public final void d() {
        t();
        this.a.G(this, false);
    }

    @Override // defpackage.dn
    public final void e() {
        t();
        this.a.G(this, true);
    }

    @Override // defpackage.dn
    public final void f(int i, ce ceVar, String str, int i2) {
        String str2 = ceVar.V;
        if (str2 != null) {
            anf.a(ceVar, str2);
        }
        Class<?> cls = ceVar.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = ceVar.F;
                if (str3 == null || str.equals(str3)) {
                    ceVar.F = str;
                } else {
                    throw new IllegalStateException("Can't change tag of fragment " + ceVar + ": was " + ceVar.F + " now " + str);
                }
            }
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException("Can't add fragment " + ceVar + " with tag " + str + " to container view with no id");
                }
                int i3 = ceVar.D;
                if (i3 == 0 || i3 == i) {
                    ceVar.D = i;
                    ceVar.E = i;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + ceVar + ": was " + ceVar.D + " now " + i);
                }
            }
            o(new dm(i2, ceVar));
            ceVar.z = this.a;
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    public final void g(String str, PrintWriter printWriter) {
        h(str, printWriter, true);
    }

    public final void h(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.l);
            printWriter.print(" mIndex=");
            printWriter.print(this.c);
            printWriter.print(" mCommitted=");
            printWriter.println(this.b);
            if (this.i != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.i));
            }
            if (this.e != 0 || this.f != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.e));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f));
            }
            if (this.g != 0 || this.h != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.g));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.h));
            }
            if (this.m != 0 || this.n != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.m));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.n);
            }
            if (this.o != 0 || this.p != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.o));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.p);
            }
        }
        if (this.d.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            dm dmVar = (dm) this.d.get(i);
            switch (dmVar.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + dmVar.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(dmVar.b);
            if (z) {
                if (dmVar.d != 0 || dmVar.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(dmVar.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(dmVar.e));
                }
                if (dmVar.f != 0 || dmVar.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(dmVar.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(dmVar.g));
                }
            }
        }
    }

    @Override // defpackage.db
    public final boolean i(ArrayList arrayList, ArrayList arrayList2) {
        if (dd.W(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Run: ");
            sb.append(this);
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.j) {
            return true;
        }
        dd ddVar = this.a;
        if (ddVar.b == null) {
            ddVar.b = new ArrayList();
        }
        ddVar.b.add(this);
        return true;
    }

    @Override // defpackage.dn
    public final boolean j() {
        return this.d.isEmpty();
    }

    @Override // defpackage.dn
    public final void k() {
        b(true);
    }

    @Override // defpackage.dn
    public final void l(ce ceVar) {
        dd ddVar = ceVar.z;
        if (ddVar == null || ddVar == this.a) {
            o(new dm(4, ceVar));
            return;
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + ceVar.toString() + " is already attached to a FragmentManager.");
    }

    @Override // defpackage.dn
    public final void m(ce ceVar) {
        dd ddVar = ceVar.z;
        if (ddVar == null || ddVar == this.a) {
            o(new dm(3, ceVar));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + ceVar.toString() + " is already attached to a FragmentManager.");
    }

    @Override // defpackage.dn
    public final void n(ce ceVar) {
        dd ddVar = ceVar.z;
        if (ddVar == null || ddVar == this.a) {
            o(new dm(5, ceVar));
            return;
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + ceVar.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.c >= 0) {
            sb.append(" #");
            sb.append(this.c);
        }
        if (this.l != null) {
            sb.append(" ");
            sb.append(this.l);
        }
        sb.append("}");
        return sb.toString();
    }
}
