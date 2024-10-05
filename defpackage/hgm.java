package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hgm implements hij {
    public final azrw a;
    public final hik b;
    public final hgo c;

    public hgm(azrw azrwVar, hik hikVar, hgo hgoVar) {
        this.a = azrwVar;
        this.b = hikVar;
        this.c = hgoVar;
    }

    @Override // defpackage.hij
    public final View a(ViewGroup viewGroup, final axdk axdkVar, final akcv akcvVar) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.shorts_edit_add_text_tooltip, viewGroup, false);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: hgl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hgm hgmVar = hgm.this;
                axdk axdkVar2 = axdkVar;
                akcv akcvVar2 = akcvVar;
                hgmVar.b.c(axdkVar2);
                akcvVar2.b(1);
                hgmVar.c.f();
                ((ida) hgmVar.a.get()).my(axdkVar2);
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
