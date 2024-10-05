package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adeu implements AdapterView.OnItemClickListener {
    final /* synthetic */ adev a;

    public adeu(adev adevVar) {
        this.a = adevVar;
    }

    public final void a(AdapterView adapterView, View view, int i, long j) {
        bpv bpvVar = (bpv) adapterView.getItemAtPosition(i);
        if (!adee.d(bpvVar) || ((Boolean) this.a.o.get()).booleanValue()) {
            adev adevVar = this.a;
            if (adevVar.m != null) {
                if (adevVar.r.containsKey(bpvVar.c)) {
                    adev adevVar2 = this.a;
                    adevVar2.q.I(3, (acsa) adevVar2.r.get(bpvVar.c), this.a.p(bpvVar));
                }
                this.a.m.onItemClick(adapterView, view, i, j);
                return;
            }
            return;
        }
        this.a.n.d(new adbs(bpvVar));
        this.a.dismiss();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(final AdapterView adapterView, final View view, final int i, final long j) {
        bpv bpvVar = (bpv) adapterView.getItemAtPosition(i);
        if (!this.a.p.a(adee.d(bpvVar), new adct() { // from class: adet
            @Override // defpackage.adct
            public final void a() {
                adeu.this.a(adapterView, view, i, j);
            }
        }, bpvVar.d)) {
            a(adapterView, view, i, j);
        } else {
            this.a.dismiss();
        }
    }
}
