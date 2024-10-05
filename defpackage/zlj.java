package defpackage;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import com.google.android.libraries.youtube.edit.audioswap.model.FeaturedTrackSelection;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zlj extends zlr {
    public ajjs a;
    public zly ae;
    public String af;
    public lu ag;
    public zli ah;
    private Button ai;
    public View b;
    public ProgressBar c;
    public View d;
    public ListView e;

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        ci C = C();
        zks zksVar = ((zkt) C).a().a;
        String str = this.af;
        final zlh zlhVar = new zlh(this, C);
        aauc f = zksVar.a.f();
        f.k();
        f.d("FEaudio_tracks");
        zhq.n(str, "Params for browse request cannot be empty.");
        f.v(str);
        ynm.n(this, zksVar.a.h(f, angq.a), new zfi() { // from class: zkp
            @Override // defpackage.zfi
            public final void a(Object obj) {
                zlh zlhVar2 = zlh.this;
                zga.d("Audio tracks browse request failed.", (Throwable) obj);
                zlhVar2.a();
            }
        }, new zfi() { // from class: zko
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.zfi
            public final void a(Object obj) {
                FeaturedTrackSelection featuredTrackSelection;
                aqwi aqwiVar;
                aqwi aqwiVar2;
                zlh zlhVar2 = zlh.this;
                BrowseResponseModel browseResponseModel = (BrowseResponseModel) obj;
                zkr zkrVar = null;
                aqyg aqygVar = null;
                Spanned spanned = null;
                zkrVar = null;
                if (browseResponseModel == null || browseResponseModel.j()) {
                    zga.b("Browse response is empty!");
                } else {
                    aamd f2 = browseResponseModel.f();
                    if (f2 != null) {
                        arjv arjvVar = browseResponseModel.a;
                        if ((arjvVar.b & 2) != 0) {
                            arjq arjqVar = arjvVar.d;
                            if (arjqVar == null) {
                                arjqVar = arjq.a;
                            }
                            if (arjqVar.b == 50236216) {
                                aqwiVar = (aqwi) arjqVar.c;
                            } else {
                                aqwiVar = aqwi.a;
                            }
                            if ((aqwiVar.b & 1) != 0) {
                                arjq arjqVar2 = arjvVar.d;
                                if (arjqVar2 == null) {
                                    arjqVar2 = arjq.a;
                                }
                                if (arjqVar2.b == 50236216) {
                                    aqwiVar2 = (aqwi) arjqVar2.c;
                                } else {
                                    aqwiVar2 = aqwi.a;
                                }
                                aqygVar = aqwiVar2.c;
                                if (aqygVar == null) {
                                    aqygVar = aqyg.a;
                                }
                            }
                            spanned = ajcq.b(aqygVar);
                        }
                        ArrayList arrayList = new ArrayList();
                        amru a = f2.a();
                        int size = a.size();
                        int i = 0;
                        for (int i2 = 0; i2 < size; i2++) {
                            Object obj2 = a.get(i2);
                            if (obj2 instanceof aalz) {
                                aalz aalzVar = (aalz) obj2;
                                askd askdVar = aalzVar.a;
                                asjz asjzVar = askdVar.h;
                                if (asjzVar == null) {
                                    asjzVar = asjz.a;
                                }
                                if ((asjzVar.b & 1) != 0) {
                                    asjz asjzVar2 = askdVar.h;
                                    if (asjzVar2 == null) {
                                        asjzVar2 = asjz.a;
                                    }
                                    asjy asjyVar = asjzVar2.c;
                                    if (asjyVar == null) {
                                        asjyVar = asjy.a;
                                    }
                                    if ((asjyVar.b & 1) != 0) {
                                        try {
                                            i = Color.parseColor(asjyVar.c);
                                        } catch (IllegalArgumentException e) {
                                            zga.d("Cannot parse color; defaulting to Color.TRANSPARENT.", e);
                                        }
                                    }
                                    i = 0;
                                }
                                for (Object obj3 : aalzVar.b()) {
                                    if (obj3 instanceof apgo) {
                                        arrayList.add(zks.a((apgo) obj3));
                                    }
                                }
                            }
                        }
                        zkr zkrVar2 = new zkr();
                        if (spanned != null && !arrayList.isEmpty()) {
                            zkrVar2.a = new FeaturedTrackSelection(spanned, arrayList, i);
                        }
                        zkrVar = zkrVar2;
                    }
                }
                if (zkrVar == null || (featuredTrackSelection = zkrVar.a) == null) {
                    zga.b("Audio tracks browse request error.");
                    zlhVar2.a();
                    return;
                }
                zlf b = ((zle) zlhVar2.a).b();
                zlhVar2.b.ag.p(featuredTrackSelection.b);
                zlj zljVar = zlhVar2.b;
                ci ciVar = zlhVar2.a;
                zljVar.ae = new zly(ciVar, featuredTrackSelection.a(ciVar), b, zlhVar2.b.a, false);
                zlj zljVar2 = zlhVar2.b;
                ListView listView = zljVar2.e;
                zly zlyVar = zljVar2.ae;
                zlyVar.getClass();
                listView.setAdapter((ListAdapter) zlyVar);
                zlhVar2.b.b.setVisibility(8);
                zlhVar2.b.e.setBackgroundColor(featuredTrackSelection.c);
                zlhVar2.b.e.setVisibility(0);
            }
        });
    }

    @Override // defpackage.ce
    public final void mD() {
        super.mD();
        zli zliVar = this.ah;
        if (zliVar != null) {
            zliVar.g();
        }
    }

    @Override // defpackage.ce
    public final void mQ(Bundle bundle) {
        bundle.putString("browse_params", this.af);
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        if (bundle != null) {
            this.af = bundle.getString("browse_params");
        }
        this.af.getClass();
        lu supportActionBar = ((ml) C()).getSupportActionBar();
        this.ag = supportActionBar;
        supportActionBar.getClass();
        zli zliVar = this.ah;
        if (zliVar != null) {
            zliVar.h();
        }
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.audio_swap_category_contents_selection, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.audio_swap_loading_view);
        this.b = findViewById;
        this.d = findViewById.findViewById(R.id.audio_swap_error_indicator);
        this.c = (ProgressBar) this.b.findViewById(R.id.audio_swap_loading_indicator);
        Button button = (Button) this.b.findViewById(R.id.audio_swap_retry_button);
        this.ai = button;
        button.setOnClickListener(new zlg(this));
        this.e = (ListView) inflate.findViewById(R.id.audio_swap_category_contents_selection_contents);
        this.b.getClass();
        this.d.getClass();
        this.c.getClass();
        this.e.getClass();
        n();
        a();
        return inflate;
    }

    public final void n() {
        this.b.setVisibility(0);
        this.c.setVisibility(0);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
    }
}
