package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hes extends zys {
    final /* synthetic */ het a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hes(het hetVar, Context context, dd ddVar, acra acraVar) {
        super(context, ddVar, acraVar, true, true);
        this.a = hetVar;
    }

    @Override // defpackage.zys
    protected final View a() {
        if (!this.a.j()) {
            het hetVar = this.a;
            hetVar.b(het.a);
            hetVar.c(true);
            return hetVar.j;
        }
        het hetVar2 = this.a;
        hdh hdhVar = hetVar2.o.i;
        if (hdhVar != null) {
            hdhVar.a();
        }
        hetVar2.h(true, true);
        return hetVar2.k;
    }

    @Override // defpackage.zys
    protected final CharSequence c() {
        return this.a.f.getString(R.string.shorts_green_screen_title);
    }

    @Override // defpackage.zys, defpackage.zyz
    public final void d() {
        super.d();
        for (View view : this.a.c) {
            if (view != null) {
                view.setVisibility(0);
            }
        }
        if (this.a.q == het.b) {
            this.a.s.b(acsb.b(127083)).a();
        }
        this.a.c(false);
        this.a.q = null;
    }

    @Override // defpackage.zys, defpackage.zyz
    public final void e() {
        for (View view : this.a.c) {
            if (view != null) {
                view.setVisibility(4);
            }
        }
        super.e();
    }

    @Override // defpackage.zys
    protected final acsc mb() {
        return null;
    }

    @Override // defpackage.zys
    protected final boolean md() {
        return false;
    }
}
