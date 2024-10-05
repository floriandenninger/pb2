package defpackage;

import android.view.View;
import com.google.android.libraries.youtube.metadataeditor.geo.LocationSearchView;
import com.google.android.youtube.R;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class acjb implements zfi {
    public final /* synthetic */ acjl a;
    private final /* synthetic */ int b;

    public /* synthetic */ acjb(acjl acjlVar, int i) {
        this.b = i;
        this.a = acjlVar;
    }

    @Override // defpackage.zfi
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            acjl acjlVar = this.a;
            View view = (View) obj;
            if (acjlVar.e == null) {
                acjlVar.e = acjlVar.aO.d((LocationSearchView) view, new acjc(acjlVar));
            }
            acjlVar.e.a();
            acjlVar.d = R.id.pre_stream_location_search;
            return;
        }
        if (i == 1) {
            this.a.d = R.id.pre_stream_content;
            return;
        }
        if (i == 2) {
            acjl acjlVar2 = this.a;
            View view2 = (View) obj;
            if (acjlVar2.as == null) {
                advq advqVar = acjlVar2.aM;
                aciw aciwVar = new aciw(acjlVar2);
                abxp abxpVar = (abxp) advqVar.a.get();
                abxpVar.getClass();
                Executor executor = (Executor) advqVar.b.get();
                executor.getClass();
                view2.getClass();
                acjlVar2.as = new acgz(abxpVar, executor, view2, aciwVar);
            }
            acgz acgzVar = acjlVar2.as;
            acgzVar.e.w();
            acgzVar.e.mw();
            acgzVar.b.setText((CharSequence) null);
            acgzVar.b.requestFocus();
            whu.J(acgzVar.b);
            return;
        }
        acjl acjlVar3 = this.a;
        aqzu aqzuVar = ((aqzq) obj).c;
        if (aqzuVar == null) {
            aqzuVar = aqzu.a;
        }
        acjlVar3.aF(aqzuVar);
    }
}
