package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hjz implements hij {
    private final azrw a;

    public hjz(azrw azrwVar) {
        this.a = azrwVar;
    }

    @Override // defpackage.hij
    public final View a(ViewGroup viewGroup, final axdk axdkVar, final akcv akcvVar) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.timeline_tooltip_entry, viewGroup, false);
        final hjs hjsVar = (hjs) this.a.get();
        jqr jqrVar = new jqr(hjsVar.a());
        hfq a = jqrVar.a(acsb.c(118661));
        a.h(true);
        a.a();
        hfq a2 = jqrVar.a(acsb.c(118662));
        a2.h(true);
        a2.a();
        inflate.setOnClickListener(new View.OnClickListener() { // from class: hjy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                akcv akcvVar2 = akcv.this;
                hjs hjsVar2 = hjsVar;
                axdk axdkVar2 = axdkVar;
                akcvVar2.b(1);
                hjsVar2.f(axdkVar2.e(), 118662);
            }
        });
        return inflate;
    }

    @Override // defpackage.hij
    public final boolean b(axdk axdkVar) {
        axdy axdyVar;
        axdi i = axdkVar.i();
        if (i.c == 1) {
            axdyVar = (axdy) i.d;
        } else {
            axdyVar = axdy.a;
        }
        return !axdyVar.c.isEmpty();
    }
}
