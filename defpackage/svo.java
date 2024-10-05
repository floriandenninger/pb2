package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.yoga.YogaEdge;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.Component;
import com.google.android.libraries.elements.interfaces.DebuggerCallback;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.android.libraries.elements.interfaces.FaultObserver;
import com.google.android.libraries.elements.interfaces.FaultSubscription;
import com.google.android.libraries.elements.interfaces.Observer;
import com.google.android.libraries.elements.interfaces.Snapshot;
import com.google.android.libraries.elements.interfaces.Subscription;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class svo extends DebuggerCallback implements Application.ActivityLifecycleCallbacks, sxe {
    public static final /* synthetic */ int d = 0;
    public final Handler a;
    public final swb b;
    public final azrw c;
    private final ammv f;
    private final svn g;
    private Subscription i;
    private FaultSubscription j;
    private final Set e = new HashSet();
    private final Object h = new Object();
    private final Observer k = new svk(this);
    private final FaultObserver l = new svl(this);

    public svo(Context context, azrw azrwVar, ammv ammvVar) {
        Application application;
        doa.a = true;
        this.c = azrwVar;
        this.b = new swb();
        this.a = new Handler(Looper.getMainLooper());
        this.f = ammvVar;
        this.g = new svn(this);
        while ((context instanceof ContextWrapper) && !(context instanceof Activity) && !(context instanceof Application) && !(context instanceof Service)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof Application) {
            application = (Application) context;
        } else if (context instanceof Activity) {
            application = ((Activity) context).getApplication();
        } else if (context instanceof Service) {
            application = ((Service) context).getApplication();
        } else {
            throw new IllegalStateException("Could not get Application from context");
        }
        if (application == null) {
            throw new IllegalStateException("Failed to fetch Application");
        }
        application.registerActivityLifecycleCallbacks(this);
    }

    public static awrv d(float f, float f2, float f3, float f4) {
        if (f == 0.0f && f2 == 0.0f && f3 == 0.0f && f4 == 0.0f) {
            return null;
        }
        aone createBuilder = awrv.a.createBuilder();
        createBuilder.copyOnWrite();
        awrv awrvVar = (awrv) createBuilder.instance;
        awrvVar.b |= 1;
        awrvVar.c = f;
        createBuilder.copyOnWrite();
        awrv awrvVar2 = (awrv) createBuilder.instance;
        awrvVar2.b |= 2;
        awrvVar2.d = f2;
        createBuilder.copyOnWrite();
        awrv awrvVar3 = (awrv) createBuilder.instance;
        awrvVar3.b |= 4;
        awrvVar3.e = f3;
        createBuilder.copyOnWrite();
        awrv awrvVar4 = (awrv) createBuilder.instance;
        awrvVar4.b |= 8;
        awrvVar4.f = f4;
        return (awrv) createBuilder.build();
    }

    public static aone g(Snapshot snapshot, Set set) {
        aone createBuilder = awsf.a.createBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            aone createBuilder2 = awse.a.createBuilder();
            createBuilder2.copyOnWrite();
            awse awseVar = (awse) createBuilder2.instance;
            str.getClass();
            awseVar.b |= 1;
            awseVar.c = str;
            byte[] findNoCopy = snapshot.findNoCopy(str);
            if (findNoCopy != null) {
                aomf x = aomf.x(findNoCopy);
                createBuilder2.copyOnWrite();
                awse awseVar2 = (awse) createBuilder2.instance;
                awseVar2.b |= 2;
                awseVar2.d = x;
            }
            awse awseVar3 = (awse) createBuilder2.build();
            createBuilder.copyOnWrite();
            awsf awsfVar = (awsf) createBuilder.instance;
            awseVar3.getClass();
            aony aonyVar = awsfVar.c;
            if (!aonyVar.c()) {
                awsfVar.c = aonm.mutableCopy(aonyVar);
            }
            awsfVar.c.add(awseVar3);
        }
        return createBuilder;
    }

    static void h(View view, aone aoneVar) {
        awrx awrxVar;
        if (view != null && view.isShown()) {
            if (view instanceof dkp) {
                dkp dkpVar = (dkp) view;
                String f = svv.f(dkpVar);
                if (f == null) {
                    awrxVar = null;
                } else {
                    final aone createBuilder = awrx.a.createBuilder();
                    createBuilder.copyOnWrite();
                    awrx awrxVar2 = (awrx) createBuilder.instance;
                    awrxVar2.b |= 1;
                    awrxVar2.d = f;
                    svv.i(dkpVar, new hw() { // from class: svg
                        @Override // defpackage.hw
                        public final void accept(Object obj) {
                            awrw awrwVar;
                            awrt awrtVar;
                            aone aoneVar2 = aone.this;
                            Pair pair = (Pair) obj;
                            int i = svo.d;
                            int[] iArr = (int[]) pair.first;
                            dic dicVar = (dic) pair.second;
                            Object j = dicVar.j();
                            if (j instanceof svt) {
                                synchronized (((svt) j).e) {
                                    awrtVar = ((svt) j).d;
                                }
                                aoneVar2.copyOnWrite();
                                awrx awrxVar3 = (awrx) aoneVar2.instance;
                                awrx awrxVar4 = awrx.a;
                                awrtVar.getClass();
                                aony aonyVar = awrxVar3.c;
                                if (!aonyVar.c()) {
                                    awrxVar3.c = aonm.mutableCopy(aonyVar);
                                }
                                awrxVar3.c.add(awrtVar);
                            }
                            String l = dicVar.l();
                            if (l == null) {
                                awrwVar = null;
                            } else {
                                aone createBuilder2 = awrw.a.createBuilder();
                                createBuilder2.copyOnWrite();
                                awrw awrwVar2 = (awrw) createBuilder2.instance;
                                awrwVar2.b |= 1;
                                awrwVar2.c = l;
                                Rect b = dicVar.b();
                                aone createBuilder3 = awrs.a.createBuilder();
                                int i2 = iArr[0];
                                int i3 = b.left;
                                createBuilder3.copyOnWrite();
                                awrs awrsVar = (awrs) createBuilder3.instance;
                                awrsVar.b |= 1;
                                awrsVar.c = i2 + i3;
                                int i4 = iArr[1];
                                int i5 = b.top;
                                createBuilder3.copyOnWrite();
                                awrs awrsVar2 = (awrs) createBuilder3.instance;
                                awrsVar2.b |= 2;
                                awrsVar2.d = i4 + i5;
                                int width = b.width();
                                createBuilder3.copyOnWrite();
                                awrs awrsVar3 = (awrs) createBuilder3.instance;
                                awrsVar3.b |= 4;
                                awrsVar3.e = width;
                                int height = b.height();
                                createBuilder3.copyOnWrite();
                                awrs awrsVar4 = (awrs) createBuilder3.instance;
                                awrsVar4.b |= 8;
                                awrsVar4.f = height;
                                awrs awrsVar5 = (awrs) createBuilder3.build();
                                createBuilder2.copyOnWrite();
                                awrw awrwVar3 = (awrw) createBuilder2.instance;
                                awrsVar5.getClass();
                                awrwVar3.d = awrsVar5;
                                awrwVar3.b |= 2;
                                dut i6 = dicVar.i();
                                awrv d2 = svo.d(i6.c(YogaEdge.LEFT), i6.c(YogaEdge.TOP), i6.c(YogaEdge.RIGHT), i6.c(YogaEdge.BOTTOM));
                                if (d2 != null) {
                                    createBuilder2.copyOnWrite();
                                    awrw awrwVar4 = (awrw) createBuilder2.instance;
                                    awrwVar4.e = d2;
                                    awrwVar4.b |= 8;
                                }
                                awrv d3 = svo.d(i6.a(YogaEdge.LEFT), i6.a(YogaEdge.TOP), i6.a(YogaEdge.RIGHT), i6.a(YogaEdge.BOTTOM));
                                if (d3 != null) {
                                    createBuilder2.copyOnWrite();
                                    awrw awrwVar5 = (awrw) createBuilder2.instance;
                                    awrwVar5.f = d3;
                                    awrwVar5.b |= 16;
                                }
                                awrv d4 = svo.d(i6.d(YogaEdge.LEFT), i6.d(YogaEdge.TOP), i6.d(YogaEdge.RIGHT), i6.d(YogaEdge.BOTTOM));
                                if (d4 != null) {
                                    createBuilder2.copyOnWrite();
                                    awrw awrwVar6 = (awrw) createBuilder2.instance;
                                    awrwVar6.g = d4;
                                    awrwVar6.b |= 32;
                                }
                                awrwVar = (awrw) createBuilder2.build();
                            }
                            if (awrwVar != null) {
                                aoneVar2.copyOnWrite();
                                awrx awrxVar5 = (awrx) aoneVar2.instance;
                                awrx awrxVar6 = awrx.a;
                                aony aonyVar2 = awrxVar5.e;
                                if (!aonyVar2.c()) {
                                    awrxVar5.e = aonm.mutableCopy(aonyVar2);
                                }
                                awrxVar5.e.add(awrwVar);
                            }
                        }
                    });
                    awrxVar = (awrx) createBuilder.build();
                }
                if (awrxVar != null) {
                    aoneVar.copyOnWrite();
                    awry awryVar = (awry) aoneVar.instance;
                    awry awryVar2 = awry.a;
                    aony aonyVar = awryVar.c;
                    if (!aonyVar.c()) {
                        awryVar.c = aonm.mutableCopy(aonyVar);
                    }
                    awryVar.c.add(awrxVar);
                    return;
                }
                return;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    h(viewGroup.getChildAt(i), aoneVar);
                }
            }
        }
    }

    private final Set i() {
        HashSet hashSet = new HashSet();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            View peekDecorView = ((Activity) it.next()).getWindow().peekDecorView();
            if (peekDecorView.hasWindowFocus()) {
                hashSet.add(peekDecorView);
            }
        }
        hashSet.addAll(svv.g());
        return hashSet;
    }

    private final void j() {
        synchronized (this.h) {
            Subscription subscription = this.i;
            if (subscription != null) {
                subscription.cancel();
            }
            FaultSubscription faultSubscription = this.j;
            if (faultSubscription != null) {
                faultSubscription.cancel();
            }
        }
    }

    @Override // defpackage.sxe
    public final boolean a() {
        return true;
    }

    @Override // defpackage.sxe
    public final boolean b() {
        return this.g.a.get();
    }

    public final dkp c(String str) {
        Iterator it = i().iterator();
        while (it.hasNext()) {
            dkp b = svv.b((View) it.next(), str);
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    @Override // com.google.android.libraries.elements.interfaces.DebuggerCallback
    public final void configureLiveUpdating(byte[] bArr) {
        try {
            awru awruVar = (awru) aonm.parseFrom(awru.a, bArr, aomw.a());
            j();
            if (awruVar.b) {
                if (this.f.h()) {
                    synchronized (this.h) {
                        this.i = ((ByteStore) this.f.c()).subscribe(null, this.k);
                        this.j = ((ByteStore) this.f.c()).subscribeToFaults(this.l);
                    }
                }
                svn svnVar = this.g;
                if (svnVar.a.getAndSet(true)) {
                    return;
                }
                svnVar.c.a.post(new svm(svnVar));
                return;
            }
            this.g.a();
        } catch (aoob e) {
            Log.w("ElementsDebugger", "Failed to parse ConfigureLiveUpdating message", e);
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.DebuggerCallback
    public final void connected() {
    }

    @Override // com.google.android.libraries.elements.interfaces.DebuggerCallback
    public final void disconnected() {
        j();
        this.g.a();
    }

    public final awry e() {
        Set i = i();
        Set set = this.e;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (!set.isEmpty()) {
            ((Activity) set.iterator().next()).getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        } else if (i.isEmpty()) {
            displayMetrics = null;
        } else {
            ((View) i.iterator().next()).getDisplay().getRealMetrics(displayMetrics);
        }
        if (displayMetrics == null) {
            Log.w("ElementsDebugger", "Could not get DisplayMetrics");
            return null;
        }
        aone createBuilder = awry.a.createBuilder();
        aone createBuilder2 = awrs.a.createBuilder();
        createBuilder2.copyOnWrite();
        awrs awrsVar = (awrs) createBuilder2.instance;
        awrsVar.b |= 1;
        awrsVar.c = 0.0f;
        createBuilder2.copyOnWrite();
        awrs awrsVar2 = (awrs) createBuilder2.instance;
        awrsVar2.b |= 2;
        awrsVar2.d = 0.0f;
        int i2 = displayMetrics.widthPixels;
        createBuilder2.copyOnWrite();
        awrs awrsVar3 = (awrs) createBuilder2.instance;
        awrsVar3.b |= 4;
        awrsVar3.e = i2;
        int i3 = displayMetrics.heightPixels;
        createBuilder2.copyOnWrite();
        awrs awrsVar4 = (awrs) createBuilder2.instance;
        awrsVar4.b |= 8;
        awrsVar4.f = i3;
        awrs awrsVar5 = (awrs) createBuilder2.build();
        createBuilder.copyOnWrite();
        awry awryVar = (awry) createBuilder.instance;
        awrsVar5.getClass();
        awryVar.d = awrsVar5;
        awryVar.b |= 1;
        Iterator it = i.iterator();
        while (it.hasNext()) {
            h((View) it.next(), createBuilder);
        }
        return (awry) createBuilder.build();
    }

    public final void f(awsf awsfVar) {
        ((DebuggerClient) this.c.get()).sendStoreSnapshot(awsfVar.toByteArray());
    }

    @Override // com.google.android.libraries.elements.interfaces.DebuggerCallback
    public final void getStoreSnapshot() {
        Snapshot snapshot;
        if (this.f.h() && (snapshot = ((ByteStore) this.f.c()).snapshot()) != null) {
            f((awsf) g(snapshot, snapshot.keys()).build());
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.DebuggerCallback
    public final void highlightElements(byte[] bArr) {
        try {
            final awsd awsdVar = (awsd) aonm.parseFrom(awsd.a, bArr, aomw.a());
            this.a.post(new Runnable() { // from class: svj
                @Override // java.lang.Runnable
                public final void run() {
                    svo svoVar = svo.this;
                    awsd awsdVar2 = awsdVar;
                    svoVar.b.b();
                    for (awrr awrrVar : awsdVar2.b) {
                        dkp c = svoVar.c(awrrVar.c);
                        if (c == null) {
                            String valueOf = String.valueOf(awrrVar.c);
                            Log.w("ElementsDebugger", valueOf.length() != 0 ? "Highlight requested for non-existing LithoView: ".concat(valueOf) : new String("Highlight requested for non-existing LithoView: "));
                        } else {
                            dic a = svv.a(dic.f(c), awrrVar.d);
                            if (a == null) {
                                String valueOf2 = String.valueOf(awrrVar.d);
                                Log.w("ElementsDebugger", valueOf2.length() != 0 ? "Highlight requested for non-existing Component: ".concat(valueOf2) : new String("Highlight requested for non-existing Component: "));
                            } else {
                                swb swbVar = svoVar.b;
                                dkp h = a.h();
                                if (h != null) {
                                    swa swaVar = new swa(a);
                                    swbVar.a.add(Pair.create(h, swaVar));
                                    h.addOnAttachStateChangeListener(swbVar);
                                    h.getOverlay().add(swaVar);
                                    h.invalidate();
                                }
                            }
                        }
                    }
                }
            });
        } catch (aoob e) {
            Log.w("ElementsDebugger", "Failed to parse PutSelectedElements message", e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.e.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.e.add(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // com.google.android.libraries.elements.interfaces.DebuggerCallback
    public final void traverseViewHierarchy() {
        this.a.post(new Runnable() { // from class: svh
            @Override // java.lang.Runnable
            public final void run() {
                svo svoVar = svo.this;
                awry e = svoVar.e();
                if (e != null) {
                    ((DebuggerClient) svoVar.c.get()).traverseViewHierarchyResponse(e.toByteArray());
                }
            }
        });
    }

    @Override // com.google.android.libraries.elements.interfaces.DebuggerCallback
    public final void updateComponentModel(byte[] bArr) {
        try {
            final awrp awrpVar = (awrp) aonm.parseFrom(awrp.a, bArr, aomw.a());
            this.a.post(new Runnable() { // from class: svi
                @Override // java.lang.Runnable
                public final void run() {
                    svo svoVar = svo.this;
                    awrp awrpVar2 = awrpVar;
                    awrr awrrVar = awrpVar2.b;
                    if (awrrVar == null) {
                        awrrVar = awrr.a;
                    }
                    dkp c = svoVar.c(awrrVar.c);
                    if (c == null) {
                        String valueOf = String.valueOf(awrrVar.c);
                        Log.w("ElementsDebugger", valueOf.length() != 0 ? "Highlight requested for non-existing LithoView: ".concat(valueOf) : new String("Highlight requested for non-existing LithoView: "));
                        return;
                    }
                    svt svtVar = (svt) svv.c(c).get(awrrVar.d);
                    if (svtVar != null) {
                        awog awogVar = awrpVar2.c;
                        if (awogVar == null) {
                            awogVar = awog.a;
                        }
                        synchronized (svtVar.e) {
                            Component component = svtVar.b;
                            if (component != null) {
                                component.debugSetModel(awogVar.toByteArray());
                            } else {
                                svtVar.a.c(syv.d(awogVar));
                            }
                        }
                    }
                }
            });
        } catch (aoob e) {
            Log.w("ElementsDebugger", "Failed to parse UpdateComponentModel message", e);
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.DebuggerCallback
    public final void updateStoreEntry(byte[] bArr) {
        if (this.f.h()) {
            try {
                awsg awsgVar = (awsg) aonm.parseFrom(awsg.a, bArr, aomw.a());
                ByteStore byteStore = (ByteStore) this.f.c();
                String str = awsgVar.b;
                aols aolsVar = awsgVar.c;
                if (aolsVar == null) {
                    aolsVar = aols.a;
                }
                byteStore.set(str, aolsVar.c.I());
            } catch (aoob e) {
                Log.w("ElementsDebugger", "Failed to parse UpdateStoreEntry message", e);
            }
        }
    }
}
