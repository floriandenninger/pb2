package defpackage;

import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.youtube.R;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class smh implements swv {
    private final /* synthetic */ int a;

    public smh(int i) {
        this.a = i;
    }

    @Override // defpackage.swv
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.swv
    public final aomu a() {
        return this.a != 0 ? awrj.b : asue.b;
    }

    @Override // defpackage.swv
    public final /* synthetic */ ayph b(Object obj, final swu swuVar) {
        if (this.a == 0) {
            final asue asueVar = (asue) obj;
            int i = asueVar.c;
            if ((i & 2) == 0 || (i & 1) == 0) {
                return ayph.f();
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                int ag = aobq.ag(asueVar.d);
                ahbl.k(ag != 0 ? ag : 1, asueVar.e, swuVar);
                return ayph.f();
            }
            return ayph.t(new ayrm() { // from class: smg
                @Override // defpackage.ayrm
                public final void a() {
                    asue asueVar2 = asue.this;
                    swu swuVar2 = swuVar;
                    int ag2 = aobq.ag(asueVar2.d);
                    if (ag2 == 0) {
                        ag2 = 1;
                    }
                    ahbl.k(ag2, asueVar2.e, swuVar2);
                }
            }).E(ayqr.a());
        }
        final awrj awrjVar = (awrj) obj;
        final View view = swuVar.a;
        if (view == null) {
            view = swuVar.b;
        }
        if (view == null) {
            return ayph.s(new IllegalStateException("Unable to locate the component's view."));
        }
        if ((awrjVar.c & 1) == 0 || awrjVar.d.isEmpty()) {
            return ayph.s(new IllegalArgumentException("No accessibility identifier has been provided."));
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getApplicationContext().getSystemService("accessibility");
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return ayph.f();
        }
        return ayph.t(new ayrm() { // from class: sly
            @Override // defpackage.ayrm
            public final void a() {
                dkp dkpVar;
                View view2;
                awrj awrjVar2 = awrj.this;
                View view3 = view;
                String str = awrjVar2.d;
                if (view3 instanceof dkp) {
                    dkpVar = (dkp) view3;
                } else {
                    ViewParent parent = view3.getParent();
                    while (parent != null && !(parent instanceof dkp)) {
                        parent = parent.getParent();
                    }
                    dkpVar = (dkp) parent;
                }
                if (dkpVar == null) {
                    throw new IllegalStateException("Unable to locate the root LithoView.");
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.add(dkpVar);
                while (true) {
                    if (arrayDeque.isEmpty()) {
                        view2 = null;
                        break;
                    }
                    view2 = (View) arrayDeque.pollFirst();
                    if (view2 != null) {
                        if (str.equals(view2.getTag(R.id.elements_accessibility_view_tag_id))) {
                            break;
                        }
                        if (view2 instanceof ViewGroup) {
                            ViewGroup viewGroup = (ViewGroup) view2;
                            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                                arrayDeque.add(viewGroup.getChildAt(i2));
                            }
                        }
                    }
                }
                if (view2 == null) {
                    String valueOf = String.valueOf(str);
                    throw new IllegalArgumentException(valueOf.length() != 0 ? "Unable to locate view with accessibility id: ".concat(valueOf) : new String("Unable to locate view with accessibility id: "));
                }
                jw.aq(view2, 64, null);
            }
        });
    }
}
