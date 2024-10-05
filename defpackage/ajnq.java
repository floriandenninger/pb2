package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.LinkedList;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajnq extends ajmz {
    private final SparseArray b = new SparseArray(16);

    private final Queue g(int i) {
        Queue queue = (Queue) this.b.get(i);
        if (queue != null) {
            return queue;
        }
        LinkedList linkedList = new LinkedList();
        this.b.put(i, linkedList);
        return linkedList;
    }

    @Override // defpackage.ajmz
    protected final ajom a(int i) {
        return (ajom) g(i).poll();
    }

    @Override // defpackage.ajos
    public final void b(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            view.getContext();
            afsi.b(2, 2, "View must not have a parent when recycled.");
            if (parent instanceof ViewGroup) {
                if (parent instanceof RecyclerView) {
                    afsi.b(2, 2, "Cannot call removeView on a RecyclerView parent.");
                } else {
                    ((ViewGroup) parent).removeView(view);
                }
            }
        }
        int n = ahbw.n(view);
        ajom q = ahbw.q(view);
        if (n == -1 || q == null) {
            return;
        }
        ahbw.u(q, this);
        g(n).offer(q);
    }
}
