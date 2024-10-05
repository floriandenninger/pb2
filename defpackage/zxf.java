package defpackage;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zxf extends zxg {
    final ayqw a = new ayqw();
    public zxk b;

    @Override // defpackage.ce
    public final void V() {
        super.V();
        if (this.a.b) {
            return;
        }
        this.a.qc();
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.album_list_fragment, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.album_list_recycler_view);
        qR();
        recyclerView.af(new LinearLayoutManager(1));
        TextView textView = (TextView) inflate.findViewById(R.id.album_list_header_selected_album);
        final zwy zwyVar = new zwy(qR(), this.b);
        recyclerView.ac(zwyVar);
        this.a.d(this.b.d.U().ax(new ayrs() { // from class: zxe
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                zwy zwyVar2 = zwy.this;
                zwyVar2.e.clear();
                zwyVar2.e.addAll((amru) obj);
                zwyVar2.f = false;
                zwyVar2.g = false;
                for (int i = 0; i < zwyVar2.b(); i++) {
                    zwt zwtVar = ((zwv) zwyVar2.e.get(i)).a;
                    if (zwtVar == zwt.IMAGE) {
                        zwyVar2.f = true;
                    } else if (zwtVar == zwt.VIDEO) {
                        zwyVar2.g = true;
                    }
                }
                zwyVar2.mw();
            }
        }));
        this.a.d(this.b.a().ax(new zxd(textView, 0)));
        return inflate;
    }
}
