package defpackage;

import android.view.View;
import android.widget.AdapterView;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xyz implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ xza a;

    public xyz(xza xzaVar) {
        this.a = xzaVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        aqip aqipVar = (aqip) this.a.ak.get(i);
        xza xzaVar = this.a;
        bajg bajgVar = xzaVar.aj;
        bajn f = bajk.f(bajn.j((int) TimeUnit.SECONDS.toMillis(aqipVar.f)));
        bajn f2 = bajk.f(bajgVar.k());
        if (f != f2) {
            long j2 = bajgVar.a;
            bajn k = f == null ? bajn.k() : f;
            if (k != f2) {
                j2 = k.n(f2.d(j2), j2);
            }
            bajgVar = new bajg(j2, bajgVar.b.b(f));
        }
        xzaVar.aj = bajgVar;
        this.a.aF();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
