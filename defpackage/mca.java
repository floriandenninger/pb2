package defpackage;

import android.view.ViewTreeObserver;
import com.google.protos.youtube.api.innertube.FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mca implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand a;
    final /* synthetic */ ammv b;
    final /* synthetic */ mcd c;

    public mca(mcd mcdVar, FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand filterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand, ammv ammvVar) {
        this.c = mcdVar;
        this.a = filterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand;
        this.b = ammvVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.a.d;
        if (i >= 0 && i <= this.c.a.size() && this.b.h()) {
            aptg aptgVar = (aptg) this.b.c();
            this.c.a.add(i, aptgVar);
            mcd mcdVar = this.c;
            mcdVar.e = true;
            if (mcdVar.j.h() && i <= ((Integer) this.c.j.c()).intValue()) {
                mcd mcdVar2 = this.c;
                mcdVar2.j = ammv.j(Integer.valueOf(((Integer) mcdVar2.j.c()).intValue() + 1));
            }
            if (this.c.f.h() && i <= ((Integer) this.c.f.c()).intValue()) {
                mcd mcdVar3 = this.c;
                mcdVar3.f = ammv.j(Integer.valueOf(((Integer) mcdVar3.f.c()).intValue() + 1));
            }
            if (this.a.f) {
                mcd mcdVar4 = this.c;
                ammv ammvVar = mcdVar4.f;
                mcdVar4.f = ammv.j(Integer.valueOf(i));
                if (ammvVar.h()) {
                    this.c.v(((Integer) ammvVar.c()).intValue(), false);
                } else if (this.c.j.h()) {
                    mcd mcdVar5 = this.c;
                    mcdVar5.v(((Integer) mcdVar5.j.c()).intValue(), false);
                }
                this.c.v(i, true);
                mcd mcdVar6 = this.c;
                azrl azrlVar = mcdVar6.k;
                if (azrlVar != null) {
                    ammv ammvVar2 = mcdVar6.f;
                    ammv ammvVar3 = mcdVar6.d;
                    azrlVar.c(mbm.e(ammvVar, ammvVar2, ammvVar3, ammvVar3));
                }
                aahd aahdVar = this.c.b;
                apxf apxfVar = aptgVar.g;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.c(apxfVar, amrz.k("sectionListController", this.c.l));
            }
            FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand filterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand = this.a;
            if ((filterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand.b & 32) != 0) {
                aahd aahdVar2 = this.c.b;
                apxf apxfVar2 = filterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand.e;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                aahdVar2.a(apxfVar2);
            }
        }
        this.c.g.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
