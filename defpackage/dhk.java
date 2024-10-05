package defpackage;

import android.content.Context;
import android.view.View;
import com.facebook.litho.ComponentTree;
import com.facebook.yoga.YogaMeasureFunction;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dhk implements dix {
    public final int u;
    static final YogaMeasureFunction t = new dkq();
    private static final Map a = new HashMap();
    private static final AtomicInteger b = new AtomicInteger();

    public dhk() {
        int intValue;
        Class<?> cls = getClass();
        Map map = a;
        synchronized (map) {
            if (!map.containsKey(cls)) {
                map.put(cls, Integer.valueOf(b.incrementAndGet()));
            }
            intValue = ((Integer) map.get(cls)).intValue();
        }
        this.u = intValue;
    }

    public static diy H(Class cls, dhe dheVar, int i, Object[] objArr) {
        dha dhaVar;
        diy diyVar;
        if (dheVar == null || (dhaVar = dheVar.f) == null) {
            dhz.a(3, "ComponentContext:NoScopeEventHandler", "Creating event handler without scope.");
            return dky.d;
        }
        if (cls != dhaVar.getClass()) {
            String valueOf = String.valueOf(dhaVar.getClass().getSimpleName());
            dhz.a(2, valueOf.length() != 0 ? "ComponentLifecycle:WrongContextForEventHandler:".concat(valueOf) : new String("ComponentLifecycle:WrongContextForEventHandler:"), String.format("A Event handler from %s was created using a context from %s. Event Handlers must be created using a ComponentContext from its Component.", cls.getSimpleName(), dheVar.f.getClass().getSimpleName()));
        }
        dha dhaVar2 = dheVar.f;
        if (dhaVar2 == null) {
            dhz.a(3, "ComponentContext:NoScopeEventHandler", "Creating event handler without scope.");
            diyVar = dky.d;
        } else {
            diyVar = new diy(dhaVar2, i, objArr);
        }
        ComponentTree componentTree = dheVar.j;
        if (componentTree != null) {
            componentTree.B.z(dheVar.f.m, diyVar);
        }
        return diyVar;
    }

    public static void N(dhe dheVar, diw diwVar) {
        if (dheVar.f == null) {
            throw new RuntimeException("No component scope found for handler to throw error", diwVar.a);
        }
    }

    public static void ak(Exception exc) {
        boolean z = doa.a;
        if (exc instanceof RuntimeException) {
            throw ((RuntimeException) exc);
        }
        throw new RuntimeException(exc);
    }

    public static ammr as(dhe dheVar, String str, int i) {
        dha dhaVar = dheVar.f;
        return new ammr(dhaVar == null ? "" : dhaVar.m, i, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int D(int i, int i2) {
        return CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int E() {
        return 0;
    }

    protected int F() {
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public dha G(dhe dheVar, int i, int i2) {
        return dgu.a(dheVar).a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public dkt I() {
        getClass().getSimpleName();
        return new dij(F());
    }

    public final Object J(Context context) {
        return L(context);
    }

    @Override // defpackage.dix
    public Object K(diy diyVar, Object obj) {
        boolean z = doa.a;
        return null;
    }

    protected Object L(Context context) {
        throw new RuntimeException("Trying to mount a MountSpec that doesn't implement @OnCreateMountContent");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void M(dhe dheVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void O(dhe dheVar, Object obj) {
        dheVar.e = "mount";
        try {
            S(dheVar, obj);
        } catch (Exception e) {
            dheVar.f();
            ak(e);
        }
        dheVar.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void P(dhe dheVar, Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void Q(dhe dheVar, dhi dhiVar) {
    }

    public void R(dhe dheVar, dhi dhiVar, int i, int i2, dlo dloVar) {
        String valueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 89);
        sb.append("You must override onMeasure() if you return true in canMeasure(), ComponentLifecycle is: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    protected void S(dhe dheVar, Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void T(View view, ks ksVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void U(ks ksVar, int i, int i2, int i3) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void V(dhe dheVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void W(dhe dheVar, Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void X(dlq dlqVar, dlq dlqVar2) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean Y() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean Z() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean aa() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean ab() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean ac() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean ad() {
        return false;
    }

    public boolean ae() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean af() {
        return false;
    }

    protected boolean ag() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ah(dha dhaVar, dha dhaVar2) {
        if (ag()) {
            return ai(dhaVar, dhaVar2);
        }
        return true;
    }

    protected boolean ai(dha dhaVar, dha dhaVar2) {
        return !dhaVar.f(dhaVar2);
    }

    public int aj() {
        return 1;
    }

    public void al() {
    }

    public void am() {
    }

    public void an() {
    }

    public void ao() {
    }

    public void ap() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void aq() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void ar(Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public amsj at(dhe dheVar, amsj amsjVar) {
        return amsjVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void au(amsj amsjVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public dha b(dhe dheVar) {
        return dgu.a(dheVar).a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public dhi c(dhe dheVar) {
        return djt.c(dheVar, (dha) this, false);
    }
}
