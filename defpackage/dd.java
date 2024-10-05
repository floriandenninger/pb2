package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.BackStackRecordState;
import android.support.v4.app.BackStackState;
import android.support.v4.app.Fragment$SavedState;
import android.support.v4.app.FragmentContainerView;
import android.support.v4.app.FragmentManagerState;
import android.support.v4.app.FragmentState;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dd {
    private boolean A;
    private ArrayList B;
    private boolean E;
    private ArrayList F;
    private ArrayList G;
    private ArrayList H;
    ArrayList b;
    public zy d;
    public ArrayList i;
    public co m;
    public cl n;
    public ce o;
    ce p;
    public aae q;
    public aae r;
    public aae s;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public de y;
    private final ArrayList z = new ArrayList();
    public final dl a = new dl();
    public final cq c = new cq(this);
    public final zw e = new cu(this);
    public final AtomicInteger f = new AtomicInteger();
    private final Map C = DesugarCollections.synchronizedMap(new HashMap());
    public final Map g = DesugarCollections.synchronizedMap(new HashMap());
    public final Map h = DesugarCollections.synchronizedMap(new HashMap());
    public final cs j = new cs(this);
    public final CopyOnWriteArrayList k = new CopyOnWriteArrayList();
    int l = -1;
    private final cn D = new cv(this);

    /* renamed from: J, reason: collision with root package name */
    private final d f181J = new d();
    ArrayDeque t = new ArrayDeque();
    private final Runnable I = new cw(this);

    public static boolean W(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static final boolean ab(ce ceVar) {
        if (ceVar.K && ceVar.L) {
            return true;
        }
        dl dlVar = ceVar.B.a;
        ArrayList<ce> arrayList = new ArrayList();
        for (dj djVar : dlVar.b.values()) {
            if (djVar != null) {
                arrayList.add(djVar.b);
            } else {
                arrayList.add(null);
            }
        }
        boolean z = false;
        for (ce ceVar2 : arrayList) {
            if (ceVar2 != null) {
                z = ab(ceVar2);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    static final boolean ac(ce ceVar) {
        if (ceVar == null) {
            return true;
        }
        return ceVar.L && (ceVar.z == null || ac(ceVar.C));
    }

    static final void ag(ce ceVar) {
        if (W(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("show: ");
            sb.append(ceVar);
        }
        if (ceVar.G) {
            ceVar.G = false;
            ceVar.S = !ceVar.S;
        }
    }

    private final ViewGroup ak(ce ceVar) {
        ViewGroup viewGroup = ceVar.N;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (ceVar.E > 0 && this.n.b()) {
            View a = this.n.a(ceVar.E);
            if (a instanceof ViewGroup) {
                return (ViewGroup) a;
            }
        }
        return null;
    }

    private final Set al() {
        HashSet hashSet = new HashSet();
        Iterator it = this.a.e().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((dj) it.next()).b.N;
            if (viewGroup != null) {
                aj();
                hashSet.add(eo.g(viewGroup));
            }
        }
        return hashSet;
    }

    private final void am() {
        if (Y()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private final void an() {
        this.A = false;
        this.G.clear();
        this.F.clear();
    }

    private final void ao() {
        if (this.E) {
            this.E = false;
            av();
        }
    }

    private final void ap() {
        Iterator it = al().iterator();
        while (it.hasNext()) {
            ((eo) it.next()).c();
        }
    }

    private final void aq(boolean z) {
        if (this.A) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.m == null) {
            if (this.x) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        if (Looper.myLooper() != this.m.d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            am();
        }
        if (this.F == null) {
            this.F = new ArrayList();
            this.G = new ArrayList();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:312:0x05ac, code lost:
    
        if (r14 == r13) goto L236;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ar(java.util.ArrayList r30, java.util.ArrayList r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 2224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dd.ar(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    private final void as() {
        for (eo eoVar : al()) {
        }
    }

    private final void at(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((bf) arrayList.get(i)).s) {
                if (i2 != i) {
                    ar(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((bf) arrayList.get(i2)).s) {
                        i2++;
                    }
                }
                ar(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            ar(arrayList, arrayList2, i2, size);
        }
    }

    private final void au(ce ceVar) {
        ViewGroup ak = ak(ceVar);
        if (ak == null || ceVar.qS() + ceVar.qT() + ceVar.qU() + ceVar.qV() <= 0) {
            return;
        }
        if (ak.getTag(R.id.visible_removing_fragment_view_tag) == null) {
            ak.setTag(R.id.visible_removing_fragment_view_tag, ceVar);
        }
        ((ce) ak.getTag(R.id.visible_removing_fragment_view_tag)).ak(ceVar.aq());
    }

    private final void av() {
        Iterator it = this.a.e().iterator();
        while (it.hasNext()) {
            J((dj) it.next());
        }
    }

    private final void aw(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new ds());
        co coVar = this.m;
        if (coVar != null) {
            try {
                ((ch) coVar).a.dump("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            E("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void A() {
        this.v = false;
        this.w = false;
        this.y.g = false;
        C(7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void B() {
        this.v = false;
        this.w = false;
        this.y.g = false;
        C(5);
    }

    public final void C(int i) {
        try {
            this.A = true;
            for (dj djVar : this.a.b.values()) {
                if (djVar != null) {
                    djVar.c = i;
                }
            }
            I(i, false);
            Iterator it = al().iterator();
            while (it.hasNext()) {
                ((eo) it.next()).c();
            }
            this.A = false;
            ah(true);
        } catch (Throwable th) {
            this.A = false;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void D() {
        this.w = true;
        this.y.g = true;
        C(4);
    }

    public final void E(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        dl dlVar = this.a;
        String str3 = str + "    ";
        if (!dlVar.b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (dj djVar : dlVar.b.values()) {
                printWriter.print(str);
                if (djVar != null) {
                    ce ceVar = djVar.b;
                    printWriter.println(ceVar);
                    ceVar.Q(str3, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = dlVar.a.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                ce ceVar2 = (ce) dlVar.a.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(ceVar2.toString());
            }
        }
        ArrayList arrayList = this.B;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                ce ceVar3 = (ce) this.B.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(ceVar3.toString());
            }
        }
        ArrayList arrayList2 = this.b;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                bf bfVar = (bf) this.b.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(bfVar.toString());
                bfVar.g(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f.get());
        synchronized (this.z) {
            int size4 = this.z.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    Object obj = (db) this.z.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.m);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.n);
        if (this.o != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.o);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.l);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.v);
        printWriter.print(" mStopped=");
        printWriter.print(this.w);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.x);
        if (this.u) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.u);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void F(db dbVar, boolean z) {
        if (!z) {
            if (this.m == null) {
                if (!this.x) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            am();
        }
        synchronized (this.z) {
            if (this.m == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            this.z.add(dbVar);
            synchronized (this.z) {
                if (this.z.size() == 1) {
                    this.m.d.removeCallbacks(this.I);
                    this.m.d.post(this.I);
                    R();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void G(db dbVar, boolean z) {
        if (z && (this.m == null || this.x)) {
            return;
        }
        aq(z);
        dbVar.i(this.F, this.G);
        this.A = true;
        try {
            at(this.F, this.G);
            an();
            R();
            ao();
            this.a.h();
        } catch (Throwable th) {
            an();
            throw th;
        }
    }

    final void H(ce ceVar) {
        if (W(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("hide: ");
            sb.append(ceVar);
        }
        if (ceVar.G) {
            return;
        }
        ceVar.G = true;
        ceVar.S = true ^ ceVar.S;
        au(ceVar);
    }

    final void I(int i, boolean z) {
        co coVar;
        if (this.m != null || i == -1) {
            if (z || i != this.l) {
                this.l = i;
                dl dlVar = this.a;
                ArrayList arrayList = dlVar.a;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    dj djVar = (dj) dlVar.b.get(((ce) arrayList.get(i2)).l);
                    if (djVar != null) {
                        djVar.e();
                    }
                }
                for (dj djVar2 : dlVar.b.values()) {
                    if (djVar2 != null) {
                        djVar2.e();
                        ce ceVar = djVar2.b;
                        if (ceVar.s && !ceVar.as()) {
                            boolean z2 = ceVar.t;
                            dlVar.j(djVar2);
                        }
                    }
                }
                av();
                if (this.u && (coVar = this.m) != null && this.l == 7) {
                    coVar.c();
                    this.u = false;
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("No activity");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void J(dj djVar) {
        ce ceVar = djVar.b;
        if (ceVar.P) {
            if (this.A) {
                this.E = true;
            } else {
                ceVar.P = false;
                djVar.e();
            }
        }
    }

    public final void K() {
        F(new dc(this, -1, 0), false);
    }

    public final void L(Bundle bundle, String str, ce ceVar) {
        if (ceVar.z != this) {
            aw(new IllegalStateException("Fragment " + ceVar + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, ceVar.l);
    }

    final void M(ce ceVar) {
        if (W(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("remove: ");
            sb.append(ceVar);
            sb.append(" nesting=");
            sb.append(ceVar.y);
        }
        boolean z = !ceVar.as();
        if (!ceVar.H || z) {
            this.a.k(ceVar);
            if (ab(ceVar)) {
                this.u = true;
            }
            ceVar.s = true;
            au(ceVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void N(Parcelable parcelable) {
        FragmentManagerState fragmentManagerState;
        ArrayList arrayList;
        dj djVar;
        if (parcelable == null || (arrayList = (fragmentManagerState = (FragmentManagerState) parcelable).a) == null) {
            return;
        }
        dl dlVar = this.a;
        dlVar.c.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            FragmentState fragmentState = (FragmentState) arrayList.get(i);
            dlVar.c.put(fragmentState.b, fragmentState);
        }
        this.a.b.clear();
        ArrayList arrayList2 = fragmentManagerState.b;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            FragmentState c = this.a.c((String) arrayList2.get(i2), null);
            if (c != null) {
                ce ceVar = (ce) this.y.b.get(c.b);
                if (ceVar != null) {
                    if (W(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("restoreSaveState: re-attaching retained ");
                        sb.append(ceVar);
                    }
                    djVar = new dj(this.j, this.a, ceVar, c);
                } else {
                    djVar = new dj(this.j, this.a, this.m.c.getClassLoader(), h(), c);
                }
                ce ceVar2 = djVar.b;
                ceVar2.z = this;
                if (W(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("restoreSaveState: active (");
                    sb2.append(ceVar2.l);
                    sb2.append("): ");
                    sb2.append(ceVar2);
                }
                djVar.f(this.m.c.getClassLoader());
                this.a.i(djVar);
                djVar.c = this.l;
            }
        }
        for (ce ceVar3 : new ArrayList(this.y.b.values())) {
            if (!this.a.l(ceVar3.l)) {
                if (W(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Discarding retained Fragment ");
                    sb3.append(ceVar3);
                    sb3.append(" that was not found in the set of active Fragments ");
                    sb3.append(fragmentManagerState.b);
                }
                this.y.e(ceVar3);
                ceVar3.z = this;
                dj djVar2 = new dj(this.j, this.a, ceVar3);
                djVar2.c = 1;
                djVar2.e();
                ceVar3.s = true;
                djVar2.e();
            }
        }
        dl dlVar2 = this.a;
        ArrayList<String> arrayList3 = fragmentManagerState.c;
        dlVar2.a.clear();
        if (arrayList3 != null) {
            for (String str : arrayList3) {
                ce a = dlVar2.a(str);
                if (a == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (W(2)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("restoreSaveState: added (");
                    sb4.append(str);
                    sb4.append("): ");
                    sb4.append(a);
                }
                dlVar2.g(a);
            }
        }
        BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.d;
        if (backStackRecordStateArr != null) {
            this.b = new ArrayList(backStackRecordStateArr.length);
            int i3 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr2 = fragmentManagerState.d;
                if (i3 >= backStackRecordStateArr2.length) {
                    break;
                }
                BackStackRecordState backStackRecordState = backStackRecordStateArr2[i3];
                bf bfVar = new bf(this);
                int i4 = 0;
                int i5 = 0;
                while (i4 < backStackRecordState.a.length) {
                    dm dmVar = new dm();
                    int i6 = i4 + 1;
                    dmVar.a = backStackRecordState.a[i4];
                    if (W(2)) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Instantiate ");
                        sb5.append(bfVar);
                        sb5.append(" op #");
                        sb5.append(i5);
                        sb5.append(" base fragment #");
                        sb5.append(backStackRecordState.a[i6]);
                    }
                    dmVar.h = aoe.values()[backStackRecordState.c[i5]];
                    dmVar.i = aoe.values()[backStackRecordState.d[i5]];
                    int[] iArr = backStackRecordState.a;
                    int i7 = i6 + 1;
                    dmVar.c = iArr[i6] != 0;
                    int i8 = i7 + 1;
                    int i9 = iArr[i7];
                    dmVar.d = i9;
                    int i10 = i8 + 1;
                    int i11 = iArr[i8];
                    dmVar.e = i11;
                    int i12 = i10 + 1;
                    int i13 = iArr[i10];
                    dmVar.f = i13;
                    int i14 = iArr[i12];
                    dmVar.g = i14;
                    bfVar.e = i9;
                    bfVar.f = i11;
                    bfVar.g = i13;
                    bfVar.h = i14;
                    bfVar.o(dmVar);
                    i5++;
                    i4 = i12 + 1;
                }
                bfVar.i = backStackRecordState.e;
                bfVar.l = backStackRecordState.f;
                bfVar.j = true;
                bfVar.m = backStackRecordState.h;
                bfVar.n = backStackRecordState.i;
                bfVar.o = backStackRecordState.j;
                bfVar.p = backStackRecordState.k;
                bfVar.q = backStackRecordState.l;
                bfVar.r = backStackRecordState.m;
                bfVar.s = backStackRecordState.n;
                bfVar.c = backStackRecordState.g;
                for (int i15 = 0; i15 < backStackRecordState.b.size(); i15++) {
                    String str2 = (String) backStackRecordState.b.get(i15);
                    if (str2 != null) {
                        ((dm) bfVar.d.get(i15)).b = d(str2);
                    }
                }
                bfVar.c(1);
                if (W(2)) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("restoreAllState: back stack #");
                    sb6.append(i3);
                    sb6.append(" (index ");
                    sb6.append(bfVar.c);
                    sb6.append("): ");
                    sb6.append(bfVar);
                    PrintWriter printWriter = new PrintWriter(new ds());
                    bfVar.h("  ", printWriter, false);
                    printWriter.close();
                }
                this.b.add(bfVar);
                i3++;
            }
        } else {
            this.b = null;
        }
        this.f.set(fragmentManagerState.e);
        String str3 = fragmentManagerState.f;
        if (str3 != null) {
            ce d = d(str3);
            this.p = d;
            x(d);
        }
        ArrayList arrayList4 = fragmentManagerState.g;
        if (arrayList4 != null) {
            for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                this.C.put((String) arrayList4.get(i16), (BackStackState) fragmentManagerState.h.get(i16));
            }
        }
        ArrayList arrayList5 = fragmentManagerState.i;
        if (arrayList5 != null) {
            for (int i17 = 0; i17 < arrayList5.size(); i17++) {
                Bundle bundle = (Bundle) fragmentManagerState.j.get(i17);
                bundle.setClassLoader(this.m.c.getClassLoader());
                this.g.put((String) arrayList5.get(i17), bundle);
            }
        }
        this.t = new ArrayDeque(fragmentManagerState.k);
    }

    final void O(ce ceVar, boolean z) {
        ViewGroup ak = ak(ceVar);
        if (ak == null || !(ak instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) ak).a = !z;
    }

    final void P(ce ceVar, aoe aoeVar) {
        if (ceVar.equals(d(ceVar.l)) && (ceVar.A == null || ceVar.z == this)) {
            ceVar.W = aoeVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + ceVar + " is not an active fragment of FragmentManager " + this);
    }

    final void Q(ce ceVar) {
        if (ceVar == null || (ceVar.equals(d(ceVar.l)) && (ceVar.A == null || ceVar.z == this))) {
            ce ceVar2 = this.p;
            this.p = ceVar;
            x(ceVar2);
            x(this.p);
            return;
        }
        throw new IllegalArgumentException("Fragment " + ceVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void R() {
        synchronized (this.z) {
            if (!this.z.isEmpty()) {
                this.e.b = true;
            } else {
                this.e.b = a() > 0 && X(this.o);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean S(MenuItem menuItem) {
        if (this.l <= 0) {
            return false;
        }
        for (ce ceVar : this.a.f()) {
            if (ceVar != null && !ceVar.G && ceVar.B.S(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean T(Menu menu, MenuInflater menuInflater) {
        if (this.l <= 0) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (ce ceVar : this.a.f()) {
            if (ceVar != null && ac(ceVar) && !ceVar.G) {
                if ((ceVar.K && ceVar.L) | ceVar.B.T(menu, menuInflater)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(ceVar);
                    z = true;
                }
            }
        }
        if (this.B != null) {
            for (int i = 0; i < this.B.size(); i++) {
                ce ceVar2 = (ce) this.B.get(i);
                if (arrayList != null) {
                    arrayList.contains(ceVar2);
                }
            }
        }
        this.B = arrayList;
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean U(MenuItem menuItem) {
        if (this.l <= 0) {
            return false;
        }
        for (ce ceVar : this.a.f()) {
            if (ceVar != null && !ceVar.G && ceVar.B.U(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean V(Menu menu) {
        if (this.l <= 0) {
            return false;
        }
        boolean z = false;
        for (ce ceVar : this.a.f()) {
            if (ceVar != null && ac(ceVar) && !ceVar.G) {
                if (ceVar.B.V(menu) | (ceVar.K && ceVar.L)) {
                    z = true;
                }
            }
        }
        return z;
    }

    final boolean X(ce ceVar) {
        if (ceVar == null) {
            return true;
        }
        dd ddVar = ceVar.z;
        return ceVar.equals(ddVar.p) && X(ddVar.o);
    }

    public final boolean Y() {
        return this.v || this.w;
    }

    public final boolean Z() {
        return ae(0);
    }

    public final int a() {
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public final void aa() {
        ah(true);
        as();
    }

    public final void ad(int i, boolean z) {
        if (i < 0) {
            throw new IllegalArgumentException("Bad id: " + i);
        }
        F(new dc(this, i, 1), z);
    }

    public final boolean ae(int i) {
        ah(false);
        aq(true);
        ce ceVar = this.p;
        if (ceVar != null && ceVar.mN().Z()) {
            return true;
        }
        boolean af = af(this.F, this.G, -1, i);
        if (af) {
            this.A = true;
            try {
                at(this.F, this.G);
            } finally {
                an();
            }
        }
        R();
        ao();
        this.a.h();
        return af;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean af(java.util.ArrayList r5, java.util.ArrayList r6, int r7, int r8) {
        /*
            r4 = this;
            java.util.ArrayList r0 = r4.b
            r1 = 0
            r2 = -1
            if (r0 == 0) goto L59
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto L59
        Ld:
            if (r7 >= 0) goto L1b
            if (r8 == 0) goto L13
            r7 = 0
            goto L5a
        L13:
            java.util.ArrayList r7 = r4.b
            int r7 = r7.size()
            int r7 = r7 + r2
            goto L5a
        L1b:
            java.util.ArrayList r0 = r4.b
            int r0 = r0.size()
            int r0 = r0 + r2
        L22:
            if (r0 < 0) goto L34
            java.util.ArrayList r3 = r4.b
            java.lang.Object r3 = r3.get(r0)
            bf r3 = (defpackage.bf) r3
            int r3 = r3.c
            if (r7 != r3) goto L31
            goto L34
        L31:
            int r0 = r0 + (-1)
            goto L22
        L34:
            if (r0 >= 0) goto L38
        L36:
            r7 = r0
            goto L5a
        L38:
            if (r8 == 0) goto L4c
        L3a:
            if (r0 <= 0) goto L36
            int r8 = r0 + (-1)
            java.util.ArrayList r3 = r4.b
            java.lang.Object r3 = r3.get(r8)
            bf r3 = (defpackage.bf) r3
            int r3 = r3.c
            if (r7 != r3) goto L36
            r0 = r8
            goto L3a
        L4c:
            java.util.ArrayList r7 = r4.b
            int r7 = r7.size()
            int r7 = r7 + r2
            if (r0 != r7) goto L56
            goto L59
        L56:
            int r7 = r0 + 1
            goto L5a
        L59:
            r7 = -1
        L5a:
            if (r7 >= 0) goto L5d
            return r1
        L5d:
            java.util.ArrayList r8 = r4.b
            int r8 = r8.size()
            int r8 = r8 + r2
        L64:
            r0 = 1
            if (r8 < r7) goto L7c
            java.util.ArrayList r1 = r4.b
            java.lang.Object r1 = r1.remove(r8)
            bf r1 = (defpackage.bf) r1
            r5.add(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.add(r0)
            int r8 = r8 + (-1)
            goto L64
        L7c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dd.af(java.util.ArrayList, java.util.ArrayList, int, int):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ah(boolean z) {
        aq(z);
        while (true) {
            ArrayList arrayList = this.F;
            ArrayList arrayList2 = this.G;
            synchronized (this.z) {
                if (this.z.isEmpty()) {
                    break;
                }
                try {
                    int size = this.z.size();
                    boolean z2 = false;
                    for (int i = 0; i < size; i++) {
                        z2 |= ((db) this.z.get(i)).i(arrayList, arrayList2);
                    }
                    if (!z2) {
                        break;
                    }
                    this.A = true;
                    try {
                        at(this.F, this.G);
                    } finally {
                        an();
                    }
                } finally {
                    this.z.clear();
                    this.m.d.removeCallbacks(this.I);
                }
            }
        }
        R();
        ao();
        this.a.h();
    }

    public final void ai(ej ejVar, boolean z) {
        this.j.a.add(new cr(ejVar, z, null, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final d aj() {
        ce ceVar = this.o;
        return ceVar != null ? ceVar.z.aj() : this.f181J;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Parcelable b() {
        ArrayList arrayList;
        int size;
        as();
        ap();
        ah(true);
        this.v = true;
        this.y.g = true;
        dl dlVar = this.a;
        ArrayList arrayList2 = new ArrayList(dlVar.b.size());
        for (dj djVar : dlVar.b.values()) {
            if (djVar != null) {
                ce ceVar = djVar.b;
                FragmentState fragmentState = new FragmentState(ceVar);
                ce ceVar2 = djVar.b;
                if (ceVar2.g < 0 || fragmentState.m != null) {
                    fragmentState.m = ceVar2.h;
                } else {
                    fragmentState.m = djVar.a();
                    if (djVar.b.o != null) {
                        if (fragmentState.m == null) {
                            fragmentState.m = new Bundle();
                        }
                        fragmentState.m.putString("android:target_state", djVar.b.o);
                        int i = djVar.b.p;
                        if (i != 0) {
                            fragmentState.m.putInt("android:target_req_state", i);
                        }
                    }
                }
                djVar.a.c(djVar.b.l, fragmentState);
                arrayList2.add(ceVar.l);
                if (W(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Saved state of ");
                    sb.append(ceVar);
                    sb.append(": ");
                    sb.append(ceVar.h);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList(this.a.c.values());
        BackStackRecordState[] backStackRecordStateArr = null;
        if (arrayList3.isEmpty()) {
            return null;
        }
        dl dlVar2 = this.a;
        synchronized (dlVar2.a) {
            if (dlVar2.a.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(dlVar2.a.size());
                Iterator it = dlVar2.a.iterator();
                while (it.hasNext()) {
                    ce ceVar3 = (ce) it.next();
                    arrayList.add(ceVar3.l);
                    if (W(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("saveAllState: adding fragment (");
                        sb2.append(ceVar3.l);
                        sb2.append("): ");
                        sb2.append(ceVar3);
                    }
                }
            }
        }
        ArrayList arrayList4 = this.b;
        if (arrayList4 != null && (size = arrayList4.size()) > 0) {
            backStackRecordStateArr = new BackStackRecordState[size];
            for (int i2 = 0; i2 < size; i2++) {
                backStackRecordStateArr[i2] = new BackStackRecordState((bf) this.b.get(i2));
                if (W(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("saveAllState: adding back stack #");
                    sb3.append(i2);
                    sb3.append(": ");
                    sb3.append(this.b.get(i2));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.a = arrayList3;
        fragmentManagerState.b = arrayList2;
        fragmentManagerState.c = arrayList;
        fragmentManagerState.d = backStackRecordStateArr;
        fragmentManagerState.e = this.f.get();
        ce ceVar4 = this.p;
        if (ceVar4 != null) {
            fragmentManagerState.f = ceVar4.l;
        }
        fragmentManagerState.g.addAll(this.C.keySet());
        fragmentManagerState.h.addAll(this.C.values());
        fragmentManagerState.i.addAll(this.g.keySet());
        fragmentManagerState.j.addAll(this.g.values());
        fragmentManagerState.k = new ArrayList(this.t);
        return fragmentManagerState;
    }

    public final Fragment$SavedState c(ce ceVar) {
        Bundle a;
        dj d = this.a.d(ceVar.l);
        if (d == null || !d.b.equals(ceVar)) {
            aw(new IllegalStateException("Fragment " + ceVar + " is not currently in the FragmentManager"));
        }
        if (d.b.g < 0 || (a = d.a()) == null) {
            return null;
        }
        return new Fragment$SavedState(a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ce d(String str) {
        return this.a.a(str);
    }

    public final ce e(int i) {
        dl dlVar = this.a;
        int size = dlVar.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                ce ceVar = (ce) dlVar.a.get(size);
                if (ceVar != null && ceVar.D == i) {
                    return ceVar;
                }
            } else {
                for (dj djVar : dlVar.b.values()) {
                    if (djVar != null) {
                        ce ceVar2 = djVar.b;
                        if (ceVar2.D == i) {
                            return ceVar2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public final ce f(String str) {
        dl dlVar = this.a;
        if (str != null) {
            int size = dlVar.a.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ce ceVar = (ce) dlVar.a.get(size);
                if (ceVar != null && str.equals(ceVar.F)) {
                    return ceVar;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (dj djVar : dlVar.b.values()) {
            if (djVar != null) {
                ce ceVar2 = djVar.b;
                if (str.equals(ceVar2.F)) {
                    return ceVar2;
                }
            }
        }
        return null;
    }

    public final ce g(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        ce d = d(string);
        if (d == null) {
            aw(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return d;
    }

    public final cn h() {
        ce ceVar = this.o;
        return ceVar != null ? ceVar.z.h() : this.D;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dj i(ce ceVar) {
        String str = ceVar.V;
        if (str != null) {
            anf.a(ceVar, str);
        }
        if (W(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("add: ");
            sb.append(ceVar);
        }
        dj j = j(ceVar);
        ceVar.z = this;
        this.a.i(j);
        if (!ceVar.H) {
            this.a.g(ceVar);
            ceVar.s = false;
            if (ceVar.O == null) {
                ceVar.S = false;
            }
            if (ab(ceVar)) {
                this.u = true;
            }
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dj j(ce ceVar) {
        dj d = this.a.d(ceVar.l);
        if (d != null) {
            return d;
        }
        dj djVar = new dj(this.j, this.a, ceVar);
        djVar.f(this.m.c.getClassLoader());
        djVar.c = this.l;
        return djVar;
    }

    public final dn k() {
        return new bf(this);
    }

    public final List l() {
        return this.a.f();
    }

    public final void m(df dfVar) {
        this.k.add(dfVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [aak, co] */
    /* JADX WARN: Type inference failed for: r5v9, types: [bue, co] */
    public final void n(co coVar, cl clVar, ce ceVar) {
        String str;
        if (this.m != null) {
            throw new IllegalStateException("Already attached");
        }
        this.m = coVar;
        this.n = clVar;
        this.o = ceVar;
        if (ceVar != null) {
            m(new cx());
        } else if (coVar instanceof df) {
            m(coVar);
        }
        if (this.o != null) {
            R();
        }
        if (coVar instanceof zz) {
            zy onBackPressedDispatcher = ((ch) coVar).a.getOnBackPressedDispatcher();
            this.d = onBackPressedDispatcher;
            onBackPressedDispatcher.b(ceVar != null ? ceVar : coVar, this.e);
        }
        if (ceVar != null) {
            de deVar = ceVar.z.y;
            de deVar2 = (de) deVar.c.get(ceVar.l);
            if (deVar2 == null) {
                deVar2 = new de(deVar.e);
                deVar.c.put(ceVar.l, deVar2);
            }
            this.y = deVar2;
        } else if (coVar instanceof apu) {
            this.y = (de) new aps(coVar.getViewModelStore(), de.a).a(de.class);
        } else {
            this.y = new de(false);
        }
        this.y.g = Y();
        this.a.d = this.y;
        ?? r5 = this.m;
        if ((r5 instanceof bue) && ceVar == null) {
            buc savedStateRegistry = r5.getSavedStateRegistry();
            savedStateRegistry.b("android:support:fragments", new bub() { // from class: ct
                @Override // defpackage.bub
                public final Bundle a() {
                    dd ddVar = dd.this;
                    Bundle bundle = new Bundle();
                    Parcelable b = ddVar.b();
                    if (b != null) {
                        bundle.putParcelable("android:support:fragments", b);
                    }
                    return bundle;
                }
            });
            Bundle a = savedStateRegistry.a("android:support:fragments");
            if (a != null) {
                N(a.getParcelable("android:support:fragments"));
            }
        }
        ?? r52 = this.m;
        if (r52 instanceof aak) {
            aaj activityResultRegistry = r52.getActivityResultRegistry();
            if (ceVar != null) {
                str = ceVar.l + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.q = activityResultRegistry.a(str2 + "StartActivityForResult", new aap(), new cy(this, 1));
            this.r = activityResultRegistry.a(str2 + "StartIntentSenderForResult", new cz(), new cy(this, 0));
            this.s = activityResultRegistry.a(str2 + "RequestPermissions", new aan(), new cy(this, 2));
        }
    }

    public void noteStateNotSaved() {
        if (this.m == null) {
            return;
        }
        this.v = false;
        this.w = false;
        this.y.g = false;
        for (ce ceVar : this.a.f()) {
            if (ceVar != null) {
                ceVar.B.noteStateNotSaved();
            }
        }
    }

    final void o(ce ceVar) {
        if (W(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("attach: ");
            sb.append(ceVar);
        }
        if (ceVar.H) {
            ceVar.H = false;
            if (ceVar.r) {
                return;
            }
            this.a.g(ceVar);
            if (W(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("add from attach: ");
                sb2.append(ceVar);
            }
            if (ab(ceVar)) {
                this.u = true;
            }
        }
    }

    final void p(ce ceVar) {
        if (W(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("detach: ");
            sb.append(ceVar);
        }
        if (ceVar.H) {
            return;
        }
        ceVar.H = true;
        if (ceVar.r) {
            if (W(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("remove from detach: ");
                sb2.append(ceVar);
            }
            this.a.k(ceVar);
            if (ab(ceVar)) {
                this.u = true;
            }
            au(ceVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q() {
        this.v = false;
        this.w = false;
        this.y.g = false;
        C(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r(Configuration configuration) {
        for (ce ceVar : this.a.f()) {
            if (ceVar != null) {
                ceVar.onConfigurationChanged(configuration);
                ceVar.B.r(configuration);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s() {
        this.v = false;
        this.w = false;
        this.y.g = false;
        C(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t() {
        this.x = true;
        ah(true);
        ap();
        co coVar = this.m;
        if (coVar instanceof apu ? this.a.d.f : true ^ ((Activity) coVar.c).isChangingConfigurations()) {
            Iterator it = this.C.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((BackStackState) it.next()).a.iterator();
                while (it2.hasNext()) {
                    this.a.d.c((String) it2.next());
                }
            }
        }
        C(-1);
        this.m = null;
        this.n = null;
        this.o = null;
        if (this.d != null) {
            this.e.c();
            this.d = null;
        }
        aae aaeVar = this.q;
        if (aaeVar != null) {
            aaeVar.a();
            this.r.a();
            this.s.a();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        ce ceVar = this.o;
        if (ceVar != null) {
            sb.append(ceVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.o)));
            sb.append("}");
        } else {
            co coVar = this.m;
            if (coVar != null) {
                sb.append(coVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.m)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void u() {
        for (ce ceVar : this.a.f()) {
            if (ceVar != null) {
                ceVar.onLowMemory();
                ceVar.B.u();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v(boolean z) {
        for (ce ceVar : this.a.f()) {
            if (ceVar != null) {
                ceVar.B.v(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void w(Menu menu) {
        if (this.l <= 0) {
            return;
        }
        for (ce ceVar : this.a.f()) {
            if (ceVar != null && !ceVar.G) {
                ceVar.B.w(menu);
            }
        }
    }

    public final void x(ce ceVar) {
        if (ceVar == null || !ceVar.equals(d(ceVar.l))) {
            return;
        }
        boolean X = ceVar.z.X(ceVar);
        Boolean bool = ceVar.q;
        if (bool == null || bool.booleanValue() != X) {
            ceVar.q = Boolean.valueOf(X);
            dd ddVar = ceVar.B;
            ddVar.R();
            ddVar.x(ddVar.p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void y() {
        C(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void z(boolean z) {
        for (ce ceVar : this.a.f()) {
            if (ceVar != null) {
                ceVar.aD();
                ceVar.B.z(z);
            }
        }
    }
}
