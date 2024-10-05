package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.facebook.litho.ComponentHost;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhc extends akk {
    private static final Rect g = new Rect(0, 0, 1, 1);
    public dik f;
    private final View h;
    private final ic i;

    public dhc(View view, dik dikVar, boolean z, int i) {
        super(view);
        this.h = view;
        this.f = dikVar;
        this.i = new dhb(this);
        view.setFocusable(z);
        jw.V(view, i);
    }

    private static dum E(View view) {
        if (view instanceof ComponentHost) {
            return ((ComponentHost) view).c();
        }
        return null;
    }

    @Override // defpackage.akk, defpackage.ic
    public final kw a(View view) {
        dum E = E(this.h);
        if (E == null || !dju.a(E).b.ae()) {
            return null;
        }
        return super.a(view);
    }

    @Override // defpackage.ic
    public final void d(View view, ks ksVar) {
        int i;
        String str;
        diy diyVar;
        dum E = E(this.h);
        dik dikVar = this.f;
        if (dikVar != null && (diyVar = dikVar.n) != null) {
            ic icVar = this.i;
            if (did.f == null) {
                did.f = new dle();
            }
            did.f.a = view;
            did.f.b = ksVar;
            did.f.c = icVar;
            diyVar.a.l().K(diyVar, did.f);
            did.f.a = null;
            did.f.b = null;
            did.f.c = null;
        } else if (E != null) {
            super.d(view, ksVar);
            dju.a(E).b.T(view, ksVar);
        } else {
            super.d(view, ksVar);
        }
        dik dikVar2 = this.f;
        if (dikVar2 != null && (str = dikVar2.m) != null) {
            ksVar.r(str);
        }
        dik dikVar3 = this.f;
        if (dikVar3 == null || (i = dikVar3.s) == 0) {
            return;
        }
        ksVar.z(i == 1);
    }

    @Override // defpackage.akk
    protected final int k(float f, float f2) {
        dum E = E(this.h);
        if (E == null) {
            return CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        }
        dha dhaVar = dju.a(E).b;
        if (dhaVar.E() != 0) {
            Rect bounds = ((Drawable) E.a).getBounds();
            int D = dhaVar.D(((int) f) - bounds.left, ((int) f2) - bounds.top);
            if (D >= 0) {
                return D;
            }
        }
        return CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    }

    @Override // defpackage.akk
    protected final void m(List list) {
        dum E = E(this.h);
        if (E == null) {
            return;
        }
        int E2 = dju.a(E).b.E();
        for (int i = 0; i < E2; i++) {
            list.add(Integer.valueOf(i));
        }
    }

    @Override // defpackage.akk
    protected final void p(int i, AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.setContentDescription("");
    }

    @Override // defpackage.akk
    protected final void q(int i, ks ksVar) {
        dum E = E(this.h);
        if (E == null) {
            String valueOf = String.valueOf(this.h);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
            sb.append("No accessible mount item found for view: ");
            sb.append(valueOf);
            Log.e("ComponentAccessibility", sb.toString());
            ksVar.v("");
            ksVar.n(g);
            return;
        }
        Rect bounds = ((Drawable) E.a).getBounds();
        dha dhaVar = dju.a(E).b;
        ksVar.r(dhaVar.getClass().getName());
        if (i >= dhaVar.E()) {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("Received unrecognized virtual view id: ");
            sb2.append(i);
            Log.e("ComponentAccessibility", sb2.toString());
            ksVar.v("");
            ksVar.n(g);
            return;
        }
        dhaVar.U(ksVar, i, bounds.left, bounds.top);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.akk
    public final boolean u(int i, int i2) {
        return false;
    }
}
