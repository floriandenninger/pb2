package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
import com.google.android.youtube.R;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hky extends zys {
    final /* synthetic */ Context a;
    final /* synthetic */ List b;
    final /* synthetic */ hkz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hky(hkz hkzVar, Context context, dd ddVar, acra acraVar, Context context2, List list) {
        super(context, ddVar, acraVar, true, true);
        this.c = hkzVar;
        this.a = context2;
        this.b = list;
    }

    @Override // defpackage.zys
    protected final View a() {
        return this.c.b;
    }

    @Override // defpackage.zys
    protected final CharSequence c() {
        return this.a.getString(R.string.shorts_filter_presets_title);
    }

    @Override // defpackage.zys, defpackage.zyz
    public final void d() {
        super.d();
        for (View view : this.b) {
            if (view != null) {
                view.setVisibility(0);
            }
        }
        ChooseFilterView chooseFilterView = this.c.b;
        if (chooseFilterView == null) {
            return;
        }
        if (chooseFilterView.f) {
            chooseFilterView.j();
        }
        this.c.b();
    }

    @Override // defpackage.zys, defpackage.zyz
    public final void e() {
        acsc acscVar;
        hkz hkzVar = this.c;
        jqr jqrVar = hkzVar.l;
        if (jqrVar != null && (acscVar = hkzVar.i) != null) {
            hfq a = jqrVar.a(acscVar);
            a.h(true);
            a.a();
        }
        for (View view : this.b) {
            if (view != null) {
                view.setVisibility(4);
            }
        }
        ChooseFilterView chooseFilterView = this.c.b;
        if (chooseFilterView == null) {
            return;
        }
        if (!chooseFilterView.f) {
            chooseFilterView.j();
            ChooseFilterView chooseFilterView2 = this.c.b;
            if (chooseFilterView2 != null && (chooseFilterView2.c() == null || !this.c.b.c().r())) {
                if (this.c.c != null) {
                    afsi.b(1, 24, "[ShortsCreation][Android][Camera]Opened empty preset drawer");
                }
                if (this.c.e != null) {
                    afsi.b(1, 24, "[ShortsCreation][Android][Edit]Opened empty preset drawer");
                }
            }
        }
        this.c.b();
        super.e();
    }

    @Override // defpackage.zys
    protected final View lR() {
        return this.c.f;
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
