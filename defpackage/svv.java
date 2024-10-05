package defpackage;

import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.ComponentTree;
import com.google.android.youtube.R;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class svv {
    public static final /* synthetic */ int a = 0;
    private static final AtomicInteger b = new AtomicInteger();
    private static final aomw c;
    private static final aomw d;

    static {
        aomw c2 = aomw.c();
        c2.e(awrq.b);
        c = c2;
        aomw c3 = aomw.c();
        c3.e(awoe.b);
        c3.e(awou.b);
        d = c3;
    }

    public static dic a(dic dicVar, String str) {
        View view;
        Object obj;
        if (dicVar == null) {
            return null;
        }
        if (str.equals(dicVar.l())) {
            return dicVar;
        }
        dha W = dicVar.b.W();
        if (W == null || !dha.z(W)) {
            view = null;
        } else {
            if (dicVar.o()) {
                dhe X = dicVar.b.X();
                ComponentTree componentTree = X == null ? null : X.j;
                dkp lithoView = componentTree == null ? null : componentTree.getLithoView();
                dkv dkvVar = lithoView == null ? null : lithoView.s;
                if (dkvVar != null) {
                    int a2 = dkvVar.a();
                    for (int i = 0; i < a2; i++) {
                        dum g = dkvVar.g(i);
                        dha dhaVar = g == null ? null : dju.a(g).b;
                        if (dhaVar != null && dhaVar == dicVar.b.W()) {
                            obj = g.a;
                            break;
                        }
                    }
                }
            }
            obj = null;
            view = (View) obj;
        }
        if (view != null) {
            dic l = l(view, str);
            if (l != null) {
                return l;
            }
        } else {
            Iterator it = dicVar.m().iterator();
            while (it.hasNext()) {
                dic a3 = a((dic) it.next(), str);
                if (a3 != null) {
                    return a3;
                }
            }
        }
        return null;
    }

    public static dkp b(View view, String str) {
        if (view instanceof dkp) {
            dkp dkpVar = (dkp) view;
            if (str.equals(f(dkpVar))) {
                return dkpVar;
            }
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            dkp b2 = b(viewGroup.getChildAt(i), str);
            if (b2 != null) {
                return b2;
            }
        }
        return null;
    }

    public static amrz c(View view) {
        final amrw h = amrz.h();
        i(view, new hw() { // from class: svu
            @Override // defpackage.hw
            public final void accept(Object obj) {
                amrw amrwVar = amrw.this;
                int i = svv.a;
                Object j = ((dic) ((Pair) obj).second).j();
                if (j instanceof svt) {
                    amrwVar.g(ammx.d(((svt) j).c), j);
                }
            }
        });
        return h.c();
    }

    public static aoqa d() {
        long currentTimeMillis = System.currentTimeMillis();
        aone createBuilder = aoqa.a.createBuilder();
        createBuilder.copyOnWrite();
        ((aoqa) createBuilder.instance).b = currentTimeMillis / 1000;
        createBuilder.copyOnWrite();
        ((aoqa) createBuilder.instance).c = ((int) (currentTimeMillis % 1000)) * 1000000;
        return (aoqa) createBuilder.build();
    }

    public static awsn e(sxc sxcVar) {
        aone createBuilder = awsn.a.createBuilder();
        String num = Integer.toString(b.getAndIncrement());
        createBuilder.copyOnWrite();
        awsn awsnVar = (awsn) createBuilder.instance;
        num.getClass();
        awsnVar.b |= 2;
        awsnVar.d = num;
        String str = sxcVar.s;
        String str2 = sxcVar.t;
        if (str == null || str2 == null) {
            return (awsn) createBuilder.build();
        }
        aone createBuilder2 = awrr.a.createBuilder();
        createBuilder2.copyOnWrite();
        awrr awrrVar = (awrr) createBuilder2.instance;
        awrrVar.b |= 2;
        awrrVar.d = str;
        createBuilder2.copyOnWrite();
        awrr awrrVar2 = (awrr) createBuilder2.instance;
        awrrVar2.b |= 1;
        awrrVar2.c = str2;
        createBuilder.copyOnWrite();
        awsn awsnVar2 = (awsn) createBuilder.instance;
        awrr awrrVar3 = (awrr) createBuilder2.build();
        awrrVar3.getClass();
        awsnVar2.c = awrrVar3;
        awsnVar2.b |= 1;
        return (awsn) createBuilder.build();
    }

    public static String f(View view) {
        Object tag = view.getTag(R.id.elements_tree_debug_id);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }

    public static List g() {
        List q;
        ArrayList arrayList = new ArrayList();
        try {
            Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
            Object invoke = cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            if (invoke == null) {
                q = amru.q();
            } else {
                Field declaredField = cls.getDeclaredField("mViews");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(invoke);
                if (obj == null) {
                    q = amru.q();
                } else if (obj instanceof List) {
                    q = (List) obj;
                } else if (obj instanceof View[]) {
                    q = Arrays.asList((Object[]) obj);
                } else {
                    q = amru.q();
                }
            }
        } catch (Exception e) {
            Log.w("ElementsDebugger", "Failed to get root views from WindowManager", e);
            q = amru.q();
        }
        for (Object obj2 : q) {
            if (obj2 instanceof View) {
                View view = (View) obj2;
                if (view.getWindowVisibility() == 0 && view.hasWindowFocus()) {
                    arrayList.add(view);
                }
            }
        }
        return arrayList;
    }

    public static void h(dic dicVar, hw hwVar, int[] iArr) {
        if (dicVar == null) {
            return;
        }
        hwVar.accept(Pair.create(iArr, dicVar));
        Iterator it = dicVar.m().iterator();
        while (it.hasNext()) {
            h((dic) it.next(), hwVar, iArr);
        }
    }

    public static void i(View view, hw hwVar) {
        if (view == null) {
            return;
        }
        if (view instanceof dkp) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            h(dic.f((dkp) view), hwVar, iArr);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), hwVar);
            }
        }
    }

    public static awrt j(aoam aoamVar, syv syvVar, byte[] bArr, String str) {
        try {
            ByteBuffer k = szz.k(aoamVar.ax(), 287553821);
            if (k == null) {
                Log.w("Elements", "Failed to create debugger info: ELEMENT_SERIALIZED_PROTO_BYTES missing");
                return null;
            }
            awos awosVar = (awos) aonm.parseFrom(awos.a, k, aomw.b());
            aone createBuilder = awrt.a.createBuilder();
            createBuilder.copyOnWrite();
            awrt awrtVar = (awrt) createBuilder.instance;
            awosVar.getClass();
            awrtVar.e = awosVar;
            awrtVar.b |= 4;
            if (syvVar != null) {
                awog awogVar = (awog) aonm.parseFrom(awog.a, syvVar.e(), aomw.b());
                createBuilder.copyOnWrite();
                awrt awrtVar2 = (awrt) createBuilder.instance;
                awogVar.getClass();
                awrtVar2.d = awogVar;
                awrtVar2.b |= 2;
            }
            if (bArr != null) {
                awoc awocVar = (awoc) aonm.parseFrom(awoc.a, bArr, d);
                createBuilder.copyOnWrite();
                awrt awrtVar3 = (awrt) createBuilder.instance;
                awocVar.getClass();
                awrtVar3.f = awocVar;
                awrtVar3.b |= 8;
            }
            if (str != null) {
                createBuilder.copyOnWrite();
                awrt awrtVar4 = (awrt) createBuilder.instance;
                awrtVar4.b |= 1;
                awrtVar4.c = str;
            }
            return (awrt) createBuilder.build();
        } catch (IOException e) {
            Log.w("Elements", "Failed to create debugger info: failed to parse ELEMENT_SERIALIZED_PROTO_BYTES", e);
            return null;
        }
    }

    public static String k(aoam aoamVar) {
        if (aoamVar == null) {
            return null;
        }
        try {
            ByteBuffer k = szz.k(aoamVar, 224886694);
            if (k == null) {
                Log.w("Elements", "Failed to get debugger id: PROPERTIES_SERIALIZED_PROTO_BYTES_ID missing");
                return null;
            }
            awpr awprVar = (awpr) aonm.parseFrom(awpr.a, k, c);
            if (!awprVar.pY(awrq.b)) {
                Log.w("Elements", "Failed to get debugger id: DebuggerProperties missing");
                return null;
            }
            awrq awrqVar = (awrq) awprVar.pX(awrq.b);
            if ((awrqVar.c & 2) != 0) {
                return awrqVar.d;
            }
            Log.w("Elements", "Failed to get debugger id: DebuggerProperties.debugger_id missing");
            return null;
        } catch (IOException e) {
            Log.w("Elements", "Failed to get debugger id: failed to parse PROPERTIES_SERIALIZED_PROTO_BYTES_ID", e);
            return null;
        }
    }

    private static dic l(View view, String str) {
        if (view == null) {
            return null;
        }
        if (view instanceof dkp) {
            return a(dic.f((dkp) view), str);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                dic l = l(viewGroup.getChildAt(i), str);
                if (l != null) {
                    return l;
                }
            }
        }
        return null;
    }
}
