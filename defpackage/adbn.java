package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adbn implements ykl {
    final /* synthetic */ adbp a;

    public adbn(adbp adbpVar) {
        this.a = adbpVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        int Q = wbs.Q(this.a.a, R.attr.ytErrorBackground);
        this.a.f.j(Q);
        this.a.f.D(ColorStateList.valueOf(Q));
        this.a.f.q(-1);
        this.a.f.o(R.drawable.quantum_ic_error_black_18);
        adbp adbpVar = this.a;
        adbpVar.f.s(wbs.S(adbpVar.a, R.attr.ytTextPrimary));
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        this.a.f.q(-1);
        this.a.f.o(R.drawable.mdx_ic_done);
        adbp adbpVar = this.a;
        adbpVar.f.s(wbs.S(adbpVar.a, R.attr.ytCallToAction));
        this.a.i.getBackground().setColorFilter(wbs.Q(this.a.a, R.attr.ytCallToAction), PorterDuff.Mode.MULTIPLY);
        adbp adbpVar2 = this.a;
        adbpVar2.i.setTextColor(wbs.Q(adbpVar2.a, R.attr.ytTextPrimaryInverse));
        this.a.i.setEnabled(true);
        this.a.i.setTag(((adga) obj2).f().c);
    }
}
