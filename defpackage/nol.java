package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import j$.util.Optional;
import j$.util.function.Consumer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nol extends nnv implements AdapterView.OnItemClickListener, kfu {
    public acqz ae;
    public aaea af;
    public kfw ag;
    public wjt ah;
    public afsy ai;
    public wju aj;
    public VideoQuality[] ak;
    public int al;
    public int am;
    public boolean an;
    public ahyt ao;
    public acra ap;
    public int aq;
    private final List ar = new ArrayList();
    private nok as = new noj(this, 1);

    @Override // defpackage.ce
    public final void X() {
        super.X();
        dismiss();
    }

    @Override // defpackage.uyt
    protected final /* bridge */ /* synthetic */ ListAdapter aH() {
        ajxn b = this.as.b();
        atcl atclVar = this.af.a().i;
        if (atclVar == null) {
            atclVar = atcl.a;
        }
        atcm atcmVar = atclVar.k;
        if (atcmVar == null) {
            atcmVar = atcm.a;
        }
        if (atcmVar.f) {
            acra mM = this.ae.mM();
            this.ap = mM;
            Optional ofNullable = Optional.ofNullable(mM);
            InteractionLoggingScreen interactionLoggingScreen = (InteractionLoggingScreen) ofNullable.map(mjq.q).orElse(null);
            if (interactionLoggingScreen == null) {
                this.ap = null;
            } else {
                final acsa acsaVar = new acsa(interactionLoggingScreen, acsb.c(93924));
                ofNullable.ifPresent(new Consumer() { // from class: nog
                    @Override // j$.util.function.Consumer
                    public final void accept(Object obj) {
                        ((acra) obj).n(acsa.this);
                    }

                    @Override // j$.util.function.Consumer
                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer.CC.$default$andThen(this, consumer);
                    }
                });
                this.ar.clear();
                for (int i = 0; i < b.getCount(); i++) {
                    nnp nnpVar = (nnp) b.getItem(i);
                    if (nnpVar != null) {
                        final acsa acsaVar2 = new acsa(interactionLoggingScreen, acsb.c(93925));
                        final aone createBuilder = asis.a.createBuilder();
                        String d = nnpVar.d();
                        createBuilder.copyOnWrite();
                        asis asisVar = (asis) createBuilder.instance;
                        d.getClass();
                        asisVar.b |= 1;
                        asisVar.c = d;
                        if (nnpVar.g) {
                            createBuilder.copyOnWrite();
                            asis.a((asis) createBuilder.instance);
                        }
                        ofNullable.ifPresent(new Consumer() { // from class: nof
                            @Override // j$.util.function.Consumer
                            public final void accept(Object obj) {
                                acsa acsaVar3 = acsa.this;
                                acsa acsaVar4 = acsaVar;
                                aone aoneVar = createBuilder;
                                acra acraVar = (acra) obj;
                                acraVar.F(acsaVar3, acsaVar4);
                                aone createBuilder2 = asht.a.createBuilder();
                                createBuilder2.copyOnWrite();
                                asht ashtVar = (asht) createBuilder2.instance;
                                asis asisVar2 = (asis) aoneVar.build();
                                asisVar2.getClass();
                                ashtVar.y = asisVar2;
                                ashtVar.c |= 32768;
                                acraVar.u(acsaVar3, (asht) createBuilder2.build());
                            }

                            @Override // j$.util.function.Consumer
                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer.CC.$default$andThen(this, consumer);
                            }
                        });
                        this.ar.add(acsaVar2);
                    }
                }
            }
        } else {
            this.ap = null;
        }
        return b;
    }

    @Override // defpackage.uyt
    protected final AdapterView.OnItemClickListener aJ() {
        return this;
    }

    @Override // defpackage.uyt
    protected final String aK() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ajxn aM() {
        return (ajxn) this.aD;
    }

    public final void aN(String str, int i) {
        if (this.ap == null || i >= this.ar.size()) {
            return;
        }
        acra acraVar = this.ap;
        acsa acsaVar = (acsa) this.ar.get(i);
        aone createBuilder = asht.a.createBuilder();
        aone createBuilder2 = asis.a.createBuilder();
        createBuilder2.copyOnWrite();
        asis asisVar = (asis) createBuilder2.instance;
        str.getClass();
        asisVar.b |= 1;
        asisVar.c = str;
        createBuilder.copyOnWrite();
        asht ashtVar = (asht) createBuilder.instance;
        asis asisVar2 = (asis) createBuilder2.build();
        asisVar2.getClass();
        ashtVar.y = asisVar2;
        ashtVar.c |= 32768;
        acraVar.I(3, acsaVar, (asht) createBuilder.build());
    }

    @Override // defpackage.kfv
    public final void b(ahyt ahytVar) {
        this.ao = ahytVar;
    }

    @Override // defpackage.kfv
    public final void c(ci ciVar) {
        if (ar() || av()) {
            return;
        }
        qi(ciVar.getSupportFragmentManager(), "VIDEO_QUALITIES_MENU_BOTTOM_SHEET_FRAGMENT");
    }

    @Override // defpackage.uyt
    protected final int mA() {
        return 0;
    }

    @Override // defpackage.uyt, defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.as.a(layoutInflater, viewGroup, bundle);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.as.onItemClick(adapterView, view, i, j);
    }

    @Override // defpackage.kfu
    public final void a(VideoQuality[] videoQualityArr, int i, int i2, boolean z, int i3) {
        if (this.ak != videoQualityArr && this.aq != i3) {
            this.aq = i3;
            if (i3 == 3) {
                this.as = new noj(this, 0);
            } else {
                this.as = new noj(this, 1);
            }
        }
        if (this.ak != videoQualityArr || this.al != i) {
            this.ak = videoQualityArr;
            this.al = i;
            this.am = i2;
            if (aM() != null) {
                aM().notifyDataSetChanged();
            }
        }
        this.an = z;
    }
}
