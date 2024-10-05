package defpackage;

import android.view.MenuItem;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lro implements fzk {
    private final aahd a;
    private final apmg b;

    public lro(aahd aahdVar, apmg apmgVar) {
        this.a = aahdVar;
        apmgVar.getClass();
        this.b = apmgVar;
    }

    @Override // defpackage.fze
    public final int g() {
        return R.id.add_connection;
    }

    @Override // defpackage.fze
    public final int h() {
        return R.menu.connections_overflow;
    }

    @Override // defpackage.fze
    public final fzd i() {
        return null;
    }

    @Override // defpackage.fze
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.fze
    public final boolean k() {
        return true;
    }

    @Override // defpackage.fze
    public final void l(MenuItem menuItem) {
    }

    @Override // defpackage.fze
    public final boolean m() {
        apmg apmgVar = this.b;
        if ((apmgVar.b & 16384) == 0) {
            return true;
        }
        aahd aahdVar = this.a;
        apxf apxfVar = apmgVar.o;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aahdVar.c(apxfVar, null);
        return true;
    }

    @Override // defpackage.fzk
    public final int n() {
        return 0;
    }

    @Override // defpackage.fzk
    public final CharSequence o() {
        return "";
    }
}
