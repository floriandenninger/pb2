package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment$SavedState;
import android.support.v4.app.FragmentManager$LaunchedFragmentInfo;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ce implements ComponentCallbacks, View.OnCreateContextMenuListener, aok, apu, aoc, bue, aad {
    static final Object f = new Object();
    public co A;
    dd B;
    public ce C;
    public int D;
    public int E;
    public String F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    boolean f154J;
    public boolean K;
    boolean L;
    public boolean M;
    public ViewGroup N;
    public View O;
    boolean P;
    boolean Q;
    public cb R;
    boolean S;
    LayoutInflater T;
    boolean U;
    public String V;
    public aoe W;
    private int WG;
    public aom X;
    dq Y;
    aow Z;
    apo aa;
    bud ab;
    public final AtomicInteger ac;
    public final ArrayList ad;
    int g;
    Bundle h;
    SparseArray i;
    Bundle j;
    Boolean k;
    public String l;
    public Bundle m;
    ce n;
    String o;
    int p;
    public Boolean q;
    boolean r;
    public boolean s;
    boolean t;
    public boolean u;
    boolean v;
    boolean w;
    boolean x;
    int y;
    public dd z;

    public ce() {
        this.g = -1;
        this.l = UUID.randomUUID().toString();
        this.o = null;
        this.q = null;
        this.B = new dd();
        this.L = true;
        this.Q = true;
        new bw(this);
        this.W = aoe.RESUMED;
        this.Z = new aow();
        this.ac = new AtomicInteger();
        this.ad = new ArrayList();
        mh();
    }

    @Deprecated
    public static ce aB(Context context, String str) {
        try {
            return (ce) cn.a(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            throw new cc("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (InstantiationException e2) {
            throw new cc("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new cc("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new cc("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }

    private final int jV() {
        if (this.W == aoe.INITIALIZED || this.C == null) {
            return this.W.ordinal();
        }
        return Math.min(this.W.ordinal(), this.C.jV());
    }

    private final ce kw(boolean z) {
        String str;
        if (z) {
            anf.c(this);
        }
        ce ceVar = this.n;
        if (ceVar != null) {
            return ceVar;
        }
        dd ddVar = this.z;
        if (ddVar == null || (str = this.o) == null) {
            return null;
        }
        return ddVar.d(str);
    }

    private final void mh() {
        this.X = new aom(this);
        this.ab = bud.a(this);
        this.aa = null;
    }

    @Deprecated
    public final ce B() {
        return kw(true);
    }

    public final ci C() {
        co coVar = this.A;
        if (coVar == null) {
            return null;
        }
        return (ci) coVar.b;
    }

    public final ci D() {
        ci C = C();
        if (C != null) {
            return C;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final View I() {
        return this.O;
    }

    public final View K() {
        View view = this.O;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final aae L(aam aamVar, abb abbVar, aac aacVar) {
        if (this.g > 1) {
            throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
        }
        AtomicReference atomicReference = new AtomicReference();
        cd cdVar = new cd(this, abbVar, atomicReference, aamVar, aacVar);
        if (this.g >= 0) {
            cdVar.a();
        } else {
            this.ad.add(cdVar);
        }
        return new ca(atomicReference);
    }

    public final aok M() {
        dq dqVar = this.Y;
        if (dqVar != null) {
            return dqVar;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public final Object N() {
        co coVar = this.A;
        if (coVar == null) {
            return null;
        }
        return ((ch) coVar).a;
    }

    public final String O(int i) {
        return qX().getString(i);
    }

    public final String P(int i, Object... objArr) {
        return qX().getString(i, objArr);
    }

    public void Q(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.D));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.E));
        printWriter.print(" mTag=");
        printWriter.println(this.F);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.g);
        printWriter.print(" mWho=");
        printWriter.print(this.l);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.y);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.r);
        printWriter.print(" mRemoving=");
        printWriter.print(this.s);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.u);
        printWriter.print(" mInLayout=");
        printWriter.println(this.v);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.G);
        printWriter.print(" mDetached=");
        printWriter.print(this.H);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.L);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.K);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.I);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.Q);
        if (this.z != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.z);
        }
        if (this.A != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.A);
        }
        if (this.C != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.C);
        }
        if (this.m != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.m);
        }
        if (this.h != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.h);
        }
        if (this.i != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.i);
        }
        if (this.j != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.j);
        }
        ce kw = kw(false);
        if (kw != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(kw);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.p);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(aq());
        if (qS() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(qS());
        }
        if (qT() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(qT());
        }
        if (qU() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(qU());
        }
        if (qV() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(qV());
        }
        if (this.N != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.N);
        }
        if (this.O != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.O);
        }
        if (qR() != null) {
            apw.a(this).c(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.B + ":");
        this.B.E(str + "  ", fileDescriptor, printWriter, strArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void R() {
        mh();
        this.V = this.l;
        this.l = UUID.randomUUID().toString();
        this.r = false;
        this.s = false;
        this.u = false;
        this.v = false;
        this.w = false;
        this.y = 0;
        this.z = null;
        this.B = new dd();
        this.A = null;
        this.D = 0;
        this.E = 0;
        this.F = null;
        this.G = false;
        this.H = false;
    }

    @Deprecated
    public void S(Bundle bundle) {
        this.M = true;
    }

    @Deprecated
    public void T(int i, int i2, Intent intent) {
        if (dd.W(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" received the following in onActivityResult(): requestCode: ");
            sb.append(i);
            sb.append(" resultCode: ");
            sb.append(i2);
            sb.append(" data: ");
            sb.append(intent);
        }
    }

    @Deprecated
    public void U(Activity activity) {
        this.M = true;
    }

    public void V() {
        this.M = true;
    }

    public void W(boolean z) {
    }

    public void X() {
        this.M = true;
    }

    @Deprecated
    public void Y(int i, String[] strArr, int[] iArr) {
    }

    public void Z() {
        this.M = true;
    }

    public final void aA() {
    }

    public final void aC() {
        this.M = true;
        co coVar = this.A;
        if ((coVar == null ? null : coVar.b) != null) {
            this.M = true;
        }
    }

    public void aD() {
    }

    @Deprecated
    public final void aE(ce ceVar) {
        if (ceVar != null) {
            anf.g(this, ceVar);
        }
        dd ddVar = this.z;
        dd ddVar2 = ceVar != null ? ceVar.z : null;
        if (ddVar != null && ddVar2 != null && ddVar != ddVar2) {
            throw new IllegalArgumentException("Fragment " + ceVar + " must share the same FragmentManager to be set as a target fragment");
        }
        for (ce ceVar2 = ceVar; ceVar2 != null; ceVar2 = ceVar2.kw(false)) {
            if (ceVar2.equals(this)) {
                throw new IllegalArgumentException("Setting " + ceVar + " as the target of " + this + " would create a target cycle");
            }
        }
        if (ceVar == null) {
            this.o = null;
        } else {
            if (this.z == null || ceVar.z == null) {
                this.o = null;
                this.n = ceVar;
                this.p = 0;
            }
            this.o = ceVar.l;
        }
        this.n = null;
        this.p = 0;
    }

    public void aa(View view, Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ab() {
        aa(this.O, this.h);
        this.B.C(2);
    }

    @Deprecated
    public final void ac(String[] strArr, int i) {
        if (this.A == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        dd mO = mO();
        if (mO.s != null) {
            mO.t.addLast(new FragmentManager$LaunchedFragmentInfo(this.l, i));
            mO.s.b(strArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ad(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.B.N(parcelable);
        this.B.s();
    }

    public final void ae(int i, int i2, int i3, int i4) {
        if (this.R == null && i == 0) {
            if (i2 != 0) {
                i = 0;
            } else if (i3 != 0) {
                i = 0;
                i2 = 0;
            } else {
                if (i4 == 0) {
                    return;
                }
                i = 0;
                i2 = 0;
                i3 = 0;
            }
        }
        qY().b = i;
        qY().c = i2;
        qY().d = i3;
        qY().e = i4;
    }

    public final void af(Bundle bundle) {
        if (this.z != null && au()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.m = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ag(View view) {
        qY().m = view;
    }

    public final void ah(Fragment$SavedState fragment$SavedState) {
        Bundle bundle;
        if (this.z != null) {
            throw new IllegalStateException("Fragment already added");
        }
        Bundle bundle2 = null;
        if (fragment$SavedState != null && (bundle = fragment$SavedState.a) != null) {
            bundle2 = bundle;
        }
        this.h = bundle2;
    }

    public final void ai(boolean z) {
        if (this.L != z) {
            this.L = z;
            if (this.K && ar() && !this.G) {
                this.A.c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aj(int i) {
        if (this.R == null && i == 0) {
            return;
        }
        qY();
        this.R.f = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ak(boolean z) {
        if (this.R == null) {
            return;
        }
        qY().a = z;
    }

    @Deprecated
    public final void al(boolean z) {
        anf.d(this);
        this.I = z;
        dd ddVar = this.z;
        if (ddVar == null) {
            this.f154J = true;
        } else if (z) {
            ddVar.y.a(this);
        } else {
            ddVar.y.e(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void am(ArrayList arrayList, ArrayList arrayList2) {
        qY();
        cb cbVar = this.R;
        cbVar.g = arrayList;
        cbVar.h = arrayList2;
    }

    @Deprecated
    public final void an(boolean z) {
        anf.e(this, z);
        if (!this.Q && z && this.g < 5 && this.z != null && ar() && this.U) {
            dd ddVar = this.z;
            ddVar.J(ddVar.j(this));
        }
        this.Q = z;
        boolean z2 = false;
        if (this.g < 5 && !z) {
            z2 = true;
        }
        this.P = z2;
        if (this.h != null) {
            this.k = Boolean.valueOf(z);
        }
    }

    public final void ao(Intent intent) {
        co coVar = this.A;
        if (coVar == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        coVar.e(intent, -1, null);
    }

    @Deprecated
    public final void ap(Intent intent, int i, Bundle bundle) {
        if (this.A == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        dd mO = mO();
        if (mO.q != null) {
            mO.t.addLast(new FragmentManager$LaunchedFragmentInfo(this.l, i));
            if (intent != null && bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            mO.q.b(intent);
            return;
        }
        mO.m.e(intent, i, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean aq() {
        cb cbVar = this.R;
        if (cbVar == null) {
            return false;
        }
        return cbVar.a;
    }

    public final boolean ar() {
        return this.A != null && this.r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean as() {
        return this.y > 0;
    }

    public final boolean at() {
        return this.g >= 7;
    }

    public final boolean au() {
        dd ddVar = this.z;
        if (ddVar == null) {
            return false;
        }
        return ddVar.Y();
    }

    public final boolean av() {
        View view;
        return (!ar() || this.G || (view = this.O) == null || view.getWindowToken() == null || this.O.getVisibility() != 0) ? false : true;
    }

    public final boolean aw(String str) {
        co coVar = this.A;
        if (coVar != null) {
            return aih.j(((ch) coVar).a, str);
        }
        return false;
    }

    public final void ax() {
    }

    public final void ay() {
    }

    @Deprecated
    public final LayoutInflater az() {
        co coVar = this.A;
        if (coVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        ch chVar = (ch) coVar;
        LayoutInflater cloneInContext = chVar.a.getLayoutInflater().cloneInContext(chVar.a);
        cloneInContext.setFactory2(this.B.c);
        return cloneInContext;
    }

    public apo getDefaultViewModelProviderFactory() {
        Application application;
        if (this.z == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.aa == null) {
            Context applicationContext = qW().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (!(applicationContext instanceof Application)) {
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                } else {
                    application = (Application) applicationContext;
                    break;
                }
            }
            if (application == null && dd.W(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not find Application instance from Context ");
                sb.append(qW().getApplicationContext());
                sb.append(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.aa = new apj(application, this, this.m);
        }
        return this.aa;
    }

    @Override // defpackage.aok
    public final aof getLifecycle() {
        return this.X;
    }

    @Override // defpackage.bue
    public final buc getSavedStateRegistry() {
        return this.ab.a;
    }

    @Override // defpackage.apu
    public final apt getViewModelStore() {
        if (this.z == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (jV() != aoe.INITIALIZED.ordinal()) {
            de deVar = this.z.y;
            apt aptVar = (apt) deVar.d.get(this.l);
            if (aptVar != null) {
                return aptVar;
            }
            apt aptVar2 = new apt();
            deVar.d.put(this.l, aptVar2);
            return aptVar2;
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    public cl kA() {
        return new bx(this);
    }

    public void ku(Context context) {
        this.M = true;
        co coVar = this.A;
        Activity activity = coVar == null ? null : coVar.b;
        if (activity != null) {
            this.M = false;
            U(activity);
        }
    }

    public void lN(Bundle bundle) {
        this.M = true;
    }

    public void lO(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.B.noteStateNotSaved();
        this.x = true;
        this.Y = new dq(this, getViewModelStore());
        View mg = mg(layoutInflater, viewGroup, bundle);
        this.O = mg;
        if (mg == null) {
            if (this.Y.a == null) {
                this.Y = null;
                return;
            }
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
        this.Y.b();
        ho.F(this.O, this.Y);
        arr.b(this.O, this.Y);
        js.i(this.O, this.Y);
        this.Z.l(this.Y);
    }

    public LayoutInflater lW(Bundle bundle) {
        return az();
    }

    public void lY() {
        this.M = true;
    }

    public void lZ() {
        this.M = true;
    }

    public void mD() {
        this.M = true;
    }

    public final dd mN() {
        if (this.A != null) {
            return this.B;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final dd mO() {
        dd ddVar = this.z;
        if (ddVar != null) {
            return ddVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final LayoutInflater mP() {
        LayoutInflater layoutInflater = this.T;
        return layoutInflater == null ? mf(null) : layoutInflater;
    }

    public void mQ(Bundle bundle) {
    }

    public void mR(Bundle bundle) {
        this.M = true;
        ad(bundle);
        dd ddVar = this.B;
        if (ddVar.l > 0) {
            return;
        }
        ddVar.s();
    }

    public void mS() {
        this.M = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final LayoutInflater mf(Bundle bundle) {
        LayoutInflater lW = lW(bundle);
        this.T = lW;
        return lW;
    }

    public View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.WG;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.M = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        D().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.M = true;
    }

    public Context qR() {
        co coVar = this.A;
        if (coVar == null) {
            return null;
        }
        return coVar.c;
    }

    public final int qS() {
        cb cbVar = this.R;
        if (cbVar == null) {
            return 0;
        }
        return cbVar.b;
    }

    public final int qT() {
        cb cbVar = this.R;
        if (cbVar == null) {
            return 0;
        }
        return cbVar.c;
    }

    public final int qU() {
        cb cbVar = this.R;
        if (cbVar == null) {
            return 0;
        }
        return cbVar.d;
    }

    public final int qV() {
        cb cbVar = this.R;
        if (cbVar == null) {
            return 0;
        }
        return cbVar.e;
    }

    public final Context qW() {
        Context qR = qR();
        if (qR != null) {
            return qR;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final Resources qX() {
        return qW().getResources();
    }

    public final cb qY() {
        if (this.R == null) {
            this.R = new cb();
        }
        return this.R;
    }

    @Override // defpackage.aad
    public final aae registerForActivityResult(aam aamVar, aac aacVar) {
        return L(aamVar, new by(this), aacVar);
    }

    @Deprecated
    public final void startActivityForResult(Intent intent, int i) {
        ap(intent, i, null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.l);
        if (this.D != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.D));
        }
        if (this.F != null) {
            sb.append(" tag=");
            sb.append(this.F);
        }
        sb.append(")");
        return sb.toString();
    }

    public ce(int i) {
        this();
        this.WG = i;
    }
}
