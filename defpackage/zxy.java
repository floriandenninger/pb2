package defpackage;

import android.database.DataSetObserver;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zxy extends DataSetObserver {
    final /* synthetic */ ChooseFilterView a;
    final /* synthetic */ zxz b;

    public zxy(zxz zxzVar, ChooseFilterView chooseFilterView) {
        this.b = zxzVar;
        this.a = chooseFilterView;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        zyj zyjVar = this.b.aH;
        if (zyjVar == null) {
            zga.l("Video view manager not ready.");
            return;
        }
        vsy vsyVar = zyjVar.d;
        if (vsyVar == null) {
            zga.l("Video in video view manager not set.");
            return;
        }
        vsyVar.B(this.a.c().c);
        if (this.a.c().u()) {
            return;
        }
        zxz zxzVar = this.b;
        final ChooseFilterView chooseFilterView = this.a;
        zxzVar.bx(new Runnable() { // from class: zxx
            @Override // java.lang.Runnable
            public final void run() {
                zxy zxyVar = zxy.this;
                ChooseFilterView chooseFilterView2 = chooseFilterView;
                if (zxyVar.b.aK() != null) {
                    zxyVar.b.aK().setVisibility(8);
                }
                chooseFilterView2.c().m();
            }
        });
    }
}
