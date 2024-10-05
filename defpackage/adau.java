package defpackage;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MdxPairingEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adau extends adav {
    public adat a;

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final adat adatVar = this.a;
        RecyclerView recyclerView = (RecyclerView) layoutInflater.inflate(R.layout.mdx_delete_tv_codes_fragment, viewGroup, false);
        aong aongVar = (aong) apxf.a.createBuilder();
        aongVar.e(MdxPairingEndpointOuterClass.mdxPairingEndpoint, atcc.a);
        adatVar.b.d(acsb.b(27857), (apxf) aongVar.build(), null);
        adatVar.d = new adas(layoutInflater.getContext(), new View.OnClickListener() { // from class: adam
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                adat adatVar2 = adat.this;
                adatVar2.b.I(3, new acqx(acsb.c(27858)), null);
                adga adgaVar = (adga) view.getTag();
                adaq adaqVar = new adaq();
                adaqVar.ae = new adao(adatVar2);
                Bundle bundle2 = new Bundle();
                bundle2.putString("deviceId", adgaVar.f().c);
                bundle2.putString("screenName", adgaVar.c());
                adaqVar.aE(adatVar2.a);
                adaqVar.af(bundle2);
                adaqVar.qh(adatVar2.a.C().getSupportFragmentManager(), "confirmRemoveDialog");
            }
        }, adatVar.b);
        layoutInflater.getContext();
        recyclerView.af(new LinearLayoutManager());
        recyclerView.ac(adatVar.d);
        return recyclerView;
    }
}
