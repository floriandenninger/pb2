package defpackage;

import android.content.Context;
import android.widget.PopupWindow;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rzy extends rzs {
    public final boolean f;
    public final sac g;

    public rzy(Context context) {
        super(context);
        this.f = true;
        sac sacVar = new sac(this);
        this.g = sacVar;
        final rzx rzxVar = new rzx(this);
        sacVar.a.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: sab
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ruo ruoVar;
                rzy rzyVar = rzx.this.a;
                if (!rzyVar.f || (ruoVar = rzyVar.b) == null) {
                    return;
                }
                ruoVar.x.g(Collections.emptyList());
            }
        });
    }

    @Override // defpackage.rzs, defpackage.rzj
    public final void a(ruv ruvVar) {
        if (this.d) {
            super.e(ruvVar.l(), ruvVar.x);
        }
    }

    @Override // defpackage.rzs, defpackage.rzj
    public final /* bridge */ /* synthetic */ void d(ruv ruvVar) {
    }

    @Override // defpackage.rzs
    public final sac f() {
        return this.g;
    }
}
