package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acrp implements ViewGroup.OnHierarchyChangeListener {
    private final acra a;

    public acrp(acra acraVar) {
        this.a = acraVar;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        if (this.a.c() == null) {
            return;
        }
        Object tag = view2.getTag(R.id.logging_directable_supplier_tag);
        if (tag instanceof acro) {
            acro acroVar = (acro) tag;
            acra acraVar = this.a;
            aooy aooyVar = acroVar.a;
            aomf aomfVar = acroVar.b;
            asht ashtVar = acroVar.c;
            acraVar.v(aooyVar, aomfVar, null);
        }
        acra acraVar2 = this.a;
        Object tag2 = view2.getTag(R.id.visual_element_container_tag);
        if (tag2 instanceof acqw) {
            acraVar2.u(((acqw) tag2).a, null);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        if (this.a.c() == null) {
            return;
        }
        Object tag = view2.getTag(R.id.logging_directable_supplier_tag);
        if (tag instanceof acro) {
            acro acroVar = (acro) tag;
            acra acraVar = this.a;
            acqx a = acqx.a(acroVar.a);
            asht ashtVar = acroVar.c;
            acraVar.q(a, null);
        }
    }
}
