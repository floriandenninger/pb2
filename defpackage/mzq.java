package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mzq extends vw {
    final /* synthetic */ mzs d;

    public mzq(mzs mzsVar) {
        this.d = mzsVar;
    }

    @Override // defpackage.vw
    public final int b() {
        return this.d.b.size();
    }

    @Override // defpackage.vw
    public final /* synthetic */ wv f(ViewGroup viewGroup, int i) {
        return new wv(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.formfill_region_picker_item, viewGroup, false));
    }

    @Override // defpackage.vw
    public final /* synthetic */ void o(wv wvVar, int i) {
        final mzp mzpVar = (mzp) this.d.b.get(i);
        final mzj mzjVar = this.d.e;
        ((TextView) wvVar.a.findViewById(R.id.region_text)).setText(mzpVar.a);
        ((TextView) wvVar.a.findViewById(R.id.calling_code_text)).setText(wvVar.a.getContext().getResources().getString(R.string.calling_code, Integer.valueOf(mzpVar.c)));
        wvVar.a.setOnClickListener(new View.OnClickListener() { // from class: mzr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mzj mzjVar2 = mzj.this;
                mzp mzpVar2 = mzpVar;
                int i2 = wv.s;
                mzn mznVar = mzjVar2.a;
                mznVar.b.setText(mznVar.a.getResources().getString(R.string.region_with_calling_code, mzpVar2.b, Integer.valueOf(mzpVar2.c)));
                mznVar.i = mzpVar2.b;
                if (mznVar.l) {
                    mznVar.i();
                }
                mznVar.k();
                mznVar.j.dismiss();
            }
        });
    }
}
