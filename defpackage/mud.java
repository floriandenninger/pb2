package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ChipCloudRendererOuterClass;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mud extends ajpc {
    public final View a;
    public final azrl b;
    public ajss c;
    public ohm d;
    private final RecyclerView e;
    private final ajpd f;
    private final ajnw g;
    private final nyl h;
    private final aakv i;
    private final ayqi j;
    private ohk k;
    private ayqx l;
    private String m;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [ajos, java.lang.Object] */
    public mud(Context context, ajvb ajvbVar, ayqi ayqiVar, ajoy ajoyVar, aadw aadwVar, aahv aahvVar, afsy afsyVar) {
        this.j = ayqiVar;
        if (evr.ar(aadwVar)) {
            this.a = LayoutInflater.from(context).inflate(R.layout.related_chip_cloud_reduced_margins, (ViewGroup) null);
        } else {
            this.a = LayoutInflater.from(context).inflate(R.layout.related_chip_cloud, (ViewGroup) null);
        }
        RecyclerView recyclerView = (RecyclerView) this.a.findViewById(R.id.related_chip_cloud);
        this.e = recyclerView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.ab(0);
        recyclerView.af(linearLayoutManager);
        recyclerView.ae(null);
        ajox b = ajoyVar.b(ajvbVar.get(), new ViewGroup.LayoutParams(-2, -2));
        this.b = azrl.e();
        nyl nylVar = new nyl();
        this.h = nylVar;
        ajnw ajnwVar = new ajnw();
        this.g = ajnwVar;
        ajnwVar.a = nylVar;
        b.rU(ajnwVar);
        b.rU(new ajol() { // from class: mua
            @Override // defpackage.ajol
            public final void a(ajok ajokVar, ajng ajngVar, final int i) {
                final mud mudVar = mud.this;
                fro.f(ajokVar, new ajof() { // from class: mtz
                    @Override // defpackage.ajof
                    public final boolean h(View view) {
                        mud mudVar2 = mud.this;
                        int i2 = i;
                        if (mudVar2.d.e() == i2) {
                            mudVar2.g(0);
                            mudVar2.d.g();
                            return true;
                        }
                        mudVar2.g(i2);
                        return false;
                    }
                });
                ajokVar.g(amrz.k("chipSelected", ajngVar.c(i)));
                ajss ajssVar = mudVar.c;
                if (ajssVar != null) {
                    ajokVar.g(amrz.k("sectionListController", ajssVar));
                }
                ohm ohmVar = mudVar.d;
                if (ohmVar != null) {
                    ajokVar.g(amrz.k("sectionController", ohmVar));
                }
                fro.e(ajokVar, mudVar.b.Y(new fih(i, 3)));
            }
        });
        ajpd ajpdVar = new ajpd();
        this.f = ajpdVar;
        b.h(ajpdVar);
        recyclerView.ac(b);
        recyclerView.aB(new muc(this, context.getResources().getDimensionPixelSize(R.dimen.watch_next_chip_left_margin)));
        this.i = aahvVar.a(afsyVar.c());
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        ayqx ayqxVar = this.l;
        if (ayqxVar != null && !ayqxVar.e()) {
            ayrz.c((AtomicReference) this.l);
        }
        this.m = null;
        this.f.clear();
        this.d = null;
        this.c = null;
        this.k = null;
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aulg aulgVar = (aulg) obj;
        Object c = ajokVar.c("watchNextChipsVisibilityPredicate");
        ammy ammyVar = c instanceof ammy ? (ammy) c : null;
        this.h.A(ammyVar == null || ammyVar.a(this.a) ? ajokVar.a : null);
        Object c2 = ajokVar.c("sectionListController");
        if (c2 instanceof ajss) {
            this.c = (ajss) c2;
        }
        Object c3 = ajokVar.c("sectionController");
        if (!(c3 instanceof ohm)) {
            zga.b("A RelatedChipsSectionController is required for the RelatedChipCloud.");
            return;
        }
        ohm ohmVar = (ohm) c3;
        this.d = ohmVar;
        int e = ohmVar.e();
        aulq aulqVar = aulgVar.c;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(ChipCloudRendererOuterClass.chipCloudRenderer)) {
            aulq aulqVar2 = aulgVar.c;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            for (aptk aptkVar : ((aptj) aulqVar2.pX(ChipCloudRendererOuterClass.chipCloudRenderer)).b) {
                int i = aptkVar.b;
                if (i == 91394224) {
                    aptg aptgVar = (aptg) aptkVar.c;
                    int size = this.f.size();
                    ajpd ajpdVar = this.f;
                    boolean z = size == e;
                    if (aptgVar.i != z) {
                        aone builder = aptgVar.toBuilder();
                        builder.copyOnWrite();
                        aptg aptgVar2 = (aptg) builder.instance;
                        aptgVar2.b |= 256;
                        aptgVar2.i = z;
                        aptgVar = (aptg) builder.build();
                    }
                    ajpdVar.add(aptgVar);
                } else if (i == 65153809) {
                    this.f.add((apmg) aptkVar.c);
                }
            }
        }
        Object c4 = ajokVar.c("related_chip_section_list_filter");
        if (c4 instanceof ohk) {
            this.k = (ohk) c4;
        }
        String str = aulgVar.e;
        this.m = str;
        if (ammx.e(str)) {
            return;
        }
        this.l = this.i.h(this.m, true).L(khf.t).Y(mmt.c).k(aulj.class).ab(this.j).ax(new ayrs() { // from class: mub
            @Override // defpackage.ayrs
            public final void a(Object obj2) {
                mud.this.f(((aulj) obj2).getSelectedChipIndex().intValue());
            }
        });
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return null;
    }

    public final void f(int i) {
        if (this.d == null) {
            return;
        }
        this.e.aa(i);
        this.b.c(Integer.valueOf(i));
        ohk ohkVar = this.k;
        if (ohkVar != null) {
            if (i == 0) {
                ohkVar.b();
            } else if (this.d.e() == 0) {
                this.k.a();
            }
        }
        this.d.k(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(int i) {
        if (ammx.e(this.m)) {
            f(i);
            return;
        }
        aalc c = this.i.c();
        String str = this.m;
        str.getClass();
        amkq.O(!str.isEmpty(), "key cannot be empty");
        aone createBuilder = aulk.a.createBuilder();
        createBuilder.copyOnWrite();
        aulk aulkVar = (aulk) createBuilder.instance;
        aulkVar.b |= 1;
        aulkVar.c = str;
        aulh aulhVar = new aulh(createBuilder);
        Long valueOf = Long.valueOf(i);
        aone aoneVar = aulhVar.a;
        long longValue = valueOf.longValue();
        aoneVar.copyOnWrite();
        aulk aulkVar2 = (aulk) aoneVar.instance;
        aulkVar2.b |= 2;
        aulkVar2.d = longValue;
        c.k(aulhVar);
        c.b().Q();
    }
}
