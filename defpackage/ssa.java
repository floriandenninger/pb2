package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.libraries.elements.interfaces.IntersectionEngine;
import com.google.android.libraries.elements.interfaces.IntersectionObserver;
import com.google.android.libraries.elements.interfaces.IntersectionSubscription;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ssa implements syu {
    private final srz a;
    private final Rect b = new Rect();
    private final Rect c = new Rect();
    private final Rect d = new Rect();

    public ssa(Map map) {
        this.a = new srz(map);
    }

    @Override // defpackage.syu
    public final syt a(String str, Object obj) {
        srz srzVar = this.a;
        Map map = srzVar.b;
        if (map == null) {
            map = new HashMap();
            srzVar.b = map;
        }
        Set set = srzVar.c;
        if (set == null) {
            set = new aeb();
            srzVar.c = set;
        }
        Class<?> cls = obj.getClass();
        final sys sysVar = (sys) map.get(cls);
        if (sysVar == null) {
            azrw azrwVar = null;
            for (Class<?> cls2 = cls; cls2 != null && cls2 != Object.class; cls2 = cls2.getSuperclass()) {
                azrwVar = (azrw) srzVar.a.get(cls2);
                if (azrwVar != null) {
                    break;
                }
            }
            if (azrwVar == null) {
                String valueOf = String.valueOf(cls);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51);
                sb.append("Cannot find Provider<CollectionScrollStrategy> for ");
                sb.append(valueOf);
                throw new syf(sb.toString());
            }
            sysVar = (sys) azrwVar.get();
            map.put(cls, sysVar);
            set.add(sysVar);
        }
        if (sysVar.a == null) {
            sysVar.a = Collections.newSetFromMap(new WeakHashMap());
        }
        final IntersectionSubscription subscribe = ((IntersectionEngine) sysVar.b.get()).subscribe(str, (IntersectionObserver) obj);
        final syt sytVar = new syt() { // from class: sry
            @Override // defpackage.syt
            public final void a() {
                IntersectionSubscription intersectionSubscription = IntersectionSubscription.this;
                if (intersectionSubscription != null) {
                    intersectionSubscription.cancel();
                }
            }
        };
        Set set2 = sysVar.a;
        if (set2 != null) {
            set2.add(sytVar);
        }
        return new syt() { // from class: syr
            @Override // defpackage.syt
            public final void a() {
                sys sysVar2 = sys.this;
                syt sytVar2 = sytVar;
                sytVar2.a();
                Set set3 = sysVar2.a;
                if (set3 != null) {
                    set3.remove(sytVar2);
                }
            }
        };
    }

    @Override // defpackage.syu
    public final void b(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        wd wdVar = recyclerView.n;
        if (wdVar instanceof LinearLayoutManager) {
            Set<sys> a = this.a.a();
            Iterator it = a.iterator();
            char c = 0;
            loop0: while (true) {
                while (it.hasNext()) {
                    z = z || ((sys) it.next()).a();
                }
            }
            if (z) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) wdVar;
                recyclerView.getGlobalVisibleRect(this.b);
                int J2 = linearLayoutManager.J();
                int L = linearLayoutManager.L();
                while (J2 <= L) {
                    View S = wdVar.S(J2);
                    if (S != null) {
                        Object tag = S.getTag(333384171);
                        if (tag instanceof String) {
                            String str = (String) tag;
                            for (sys sysVar : a) {
                                if (sysVar.a()) {
                                    S.getGlobalVisibleRect(this.c);
                                    Rect rect = this.b;
                                    Rect rect2 = this.c;
                                    Rect rect3 = this.d;
                                    int[] iArr = new int[2];
                                    S.getLocationOnScreen(iArr);
                                    int width = iArr[c] + S.getWidth();
                                    if (rect2.right > rect.left && rect2.right < rect.right) {
                                        width = rect2.right;
                                    }
                                    int height = iArr[1] + S.getHeight();
                                    wd wdVar2 = wdVar;
                                    if (rect2.bottom > rect.top && rect2.bottom < rect.bottom) {
                                        height = rect2.bottom;
                                    }
                                    rect3.set(iArr[0], iArr[1], width, height);
                                    ((IntersectionEngine) sysVar.b.get()).onScroll(str, this.d, this.c, this.b, i, i2);
                                    wdVar = wdVar2;
                                    c = 0;
                                }
                            }
                        }
                    }
                    J2++;
                    wdVar = wdVar;
                    c = 0;
                }
            }
        }
    }

    @Override // defpackage.syu
    public final boolean c() {
        Iterator it = this.a.a().iterator();
        while (it.hasNext()) {
            if (((sys) it.next()).a()) {
                return true;
            }
        }
        return false;
    }
}
