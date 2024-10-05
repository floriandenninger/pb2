package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedList;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ajnc {
    private final Context a;
    private final ajos b;
    private final Queue c;
    private final Queue d;

    public ajnc(Context context, ajos ajosVar) {
        context.getClass();
        this.a = context;
        ajosVar.getClass();
        this.b = ajosVar;
        this.c = new LinkedList();
        this.d = new LinkedList();
    }

    protected abstract ViewGroup a(Context context);

    @Deprecated
    public final View c(ajok ajokVar, Object obj) {
        return f(ajokVar, obj, null);
    }

    public final ajok d(ajok ajokVar) {
        ajok ajokVar2 = (ajok) this.d.poll();
        if (ajokVar2 == null) {
            return new ajok(ajokVar);
        }
        ajokVar2.i(ajokVar);
        return ajokVar2;
    }

    public final void e(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) childAt;
                View childAt2 = viewGroup2.getChildAt(0);
                if (childAt2 != null) {
                    viewGroup2.removeAllViews();
                    ajok p = ahbw.p(childAt2);
                    if (p != null) {
                        p.h();
                        this.d.add(p);
                        ahbw.v(childAt2, null);
                    }
                    this.b.b(childAt2);
                }
                this.c.add(viewGroup2);
            }
        }
        viewGroup.removeAllViews();
    }

    public final View f(ajok ajokVar, Object obj, ViewGroup viewGroup) {
        View view;
        ViewGroup viewGroup2 = (ViewGroup) this.c.poll();
        if (viewGroup2 == null) {
            viewGroup2 = a(this.a);
        }
        if (obj != null) {
            int c = this.b.c(obj);
            ajom e = this.b.e(c, viewGroup);
            if (e == null) {
                view = null;
            } else {
                e.oB(ajokVar, obj);
                View a = e.a();
                ahbw.x(a, e, c);
                ahbw.v(a, ajokVar);
                view = a;
            }
            if (view != null) {
                viewGroup2.addView(view, -1, -2);
            }
        }
        return viewGroup2;
    }
}
