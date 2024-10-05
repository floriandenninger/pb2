package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.youtube.R;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajpa extends ajmz implements ajov {
    private final wj b;
    private final ajoz c;

    public ajpa() {
        this(amvo.b, amvo.b, new wj());
    }

    @Override // defpackage.ajmz
    protected final ajom a(int i) {
        wv b = this.b.b(i);
        if (b == null) {
            return null;
        }
        if (b instanceof ajor) {
            return ((ajor) b).t;
        }
        Object tag = b.a.getTag(R.id.litho_presenter_tag);
        if (tag instanceof ajom) {
            return (ajom) tag;
        }
        return null;
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
        ahbw.u(q, this);
        wj wjVar = this.b;
        ajor ajorVar = (ajor) q.a().getTag(R.id.presenter_adapter_viewholder_tag);
        if (ajorVar == null) {
            ajoz ajozVar = this.c;
            ajozVar.d = q;
            ajor ajorVar2 = (ajor) ajozVar.mv(null, n);
            ajozVar.d = null;
            q.a().setTag(R.id.presenter_adapter_viewholder_tag, ajorVar2);
            ajorVar = ajorVar2;
        }
        wjVar.f(ajorVar);
    }

    @Override // defpackage.ajov
    public final wj g() {
        return this.b;
    }

    public ajpa(Map map, Map map2, wj wjVar) {
        super(map, map2);
        this.c = new ajoz();
        this.b = wjVar;
    }
}
