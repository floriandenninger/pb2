package defpackage;

import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abup implements swv {
    private final acfq a;

    public abup(acfq acfqVar) {
        this.a = acfqVar;
    }

    @Override // defpackage.swv
    public final aomu a() {
        return aozk.b;
    }

    @Override // defpackage.swv
    public final /* bridge */ /* synthetic */ ayph b(Object obj, swu swuVar) {
        aozk aozkVar = (aozk) obj;
        acfp acfpVar = this.a.a;
        if (acfpVar != null) {
            int i = aozkVar.c;
            if ((i & 1) == 0 || (i & 2) == 0) {
                whu.K(((aciq) acfpVar).qR(), R.string.lc_add_participant_failed, 0);
            }
            aciq aciqVar = (aciq) acfpVar;
            aciqVar.ap = aozkVar.e;
            String str = aozkVar.d;
            aciqVar.aG(21);
            aciqVar.o(str, 5);
        }
        return ayph.f();
    }

    @Override // defpackage.swv
    public final /* synthetic */ void c() {
    }
}
