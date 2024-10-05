package defpackage;

import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bwh {
    private static final bwd b = new bwk(null);
    private static final ThreadLocal c = new ThreadLocal();
    static final ArrayList a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static adz a() {
        adz adzVar;
        ThreadLocal threadLocal = c;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (adzVar = (adz) weakReference.get()) != null) {
            return adzVar;
        }
        adz adzVar2 = new adz();
        threadLocal.set(new WeakReference(adzVar2));
        return adzVar2;
    }

    public static void b(ViewGroup viewGroup, bwd bwdVar) {
        ArrayList arrayList = a;
        if (arrayList.contains(viewGroup) || !jw.al(viewGroup)) {
            return;
        }
        arrayList.add(viewGroup);
        if (bwdVar == null) {
            bwdVar = b;
        }
        bwd clone = bwdVar.clone();
        ArrayList arrayList2 = (ArrayList) a().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ((bwd) arrayList2.get(i)).r(viewGroup);
            }
        }
        if (clone != null) {
            clone.m(viewGroup, true);
        }
        if (((ll) viewGroup.getTag(R.id.transition_current_scene)) == null) {
            viewGroup.setTag(R.id.transition_current_scene, null);
            if (clone == null || viewGroup == null) {
                return;
            }
            bwg bwgVar = new bwg(clone, viewGroup);
            viewGroup.addOnAttachStateChangeListener(bwgVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(bwgVar);
            return;
        }
        throw null;
    }

    public static void c(ViewGroup viewGroup) {
        a.remove(viewGroup);
        ArrayList arrayList = (ArrayList) a().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((bwd) arrayList2.get(size)).q(viewGroup);
            }
        }
    }
}
