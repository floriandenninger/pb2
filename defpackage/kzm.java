package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kzm implements ajom, ypd {
    public final jti a;
    public final we b;
    public final we c;
    public aqbe d;
    final ajwa e;
    private final View f;
    private final TextView g;
    private final agsl h;
    private final agsw i;
    private final ajuw j;
    private final View k;
    private final azrw l;
    private final Context m;
    private final gaf n;
    private final gma o;
    private final aadw p;

    public kzm(Context context, ajuw ajuwVar, azrw azrwVar, ajoy ajoyVar, ajvb ajvbVar, acqz acqzVar, ajoy ajoyVar2, jti jtiVar, aadw aadwVar, azrw azrwVar2, gma gmaVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.m = context;
        this.a = jtiVar;
        this.j = ajuwVar;
        this.p = aadwVar;
        this.l = azrwVar2;
        agsn a = ((agof) azrwVar.get()).a();
        this.h = a.i();
        this.i = a.m();
        View inflate = LayoutInflater.from(context).inflate(R.layout.commute_shelf_layout, (ViewGroup) null);
        this.f = inflate;
        this.g = (TextView) inflate.findViewById(R.id.title);
        this.k = inflate.findViewById(R.id.contextual_menu_anchor);
        this.n = ajoyVar2.J(context, (ViewStub) inflate.findViewById(R.id.title_badge));
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.shelf_items);
        recyclerView.af(new LinearLayoutManager(0));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.aB(new fyd(context.getResources().getDimensionPixelOffset(R.dimen.offline_commute_playlist_item_padding)));
        kzl kzlVar = new kzl(recyclerView, ajoyVar, ajvbVar, acqzVar);
        this.e = kzlVar;
        kzlVar.b.rU(new ajol() { // from class: kzi
            @Override // defpackage.ajol
            public final void a(ajok ajokVar, ajng ajngVar, int i) {
                aqbe aqbeVar = kzm.this.d;
                if (aqbeVar != null) {
                    ajokVar.b = aqbeVar.h.I();
                }
            }
        });
        this.b = new we(-1, -2);
        this.c = new we(-1, 0);
        this.o = gmaVar;
        gmaVar.c(inflate);
    }

    private final amru e() {
        return amru.n(aypy.S(this.h.i()).N(khe.j).L(khf.g).Y(new kzj(this, 1)).L(khf.f).aA());
    }

    private final amru g() {
        int i = this.d.f;
        if (i == 0) {
            return amru.q();
        }
        ArrayList aP = amkq.aP((Iterable) aypy.S(this.i.g()).N(khe.k).L(khf.h).ak(i + 1).Y(new kzj(this, 0)).av().X());
        if (aP.size() < this.d.g) {
            return amru.q();
        }
        if (aP.size() > i) {
            aP.remove(i);
            Context context = this.m;
            aone createBuilder = aupa.a.createBuilder();
            aqyg h = ajcq.h(context.getResources().getString(R.string.see_all));
            createBuilder.copyOnWrite();
            aupa aupaVar = (aupa) createBuilder.instance;
            h.getClass();
            aupaVar.c = h;
            aupaVar.b |= 1;
            apxf apxfVar = fia.a;
            createBuilder.copyOnWrite();
            aupa aupaVar2 = (aupa) createBuilder.instance;
            apxfVar.getClass();
            aupaVar2.d = apxfVar;
            aupaVar2.b |= 2;
            aone createBuilder2 = aota.a.createBuilder();
            int i2 = acrb.CONSUMPTION_SHELF_SEE_ALL_BUTTON.Jk;
            createBuilder2.copyOnWrite();
            aota aotaVar = (aota) createBuilder2.instance;
            aotaVar.b |= 1;
            aotaVar.c = i2;
            createBuilder2.copyOnWrite();
            aota aotaVar2 = (aota) createBuilder2.instance;
            aotaVar2.b |= 32;
            aotaVar2.d = i;
            createBuilder.copyOnWrite();
            aupa aupaVar3 = (aupa) createBuilder.instance;
            aota aotaVar3 = (aota) createBuilder2.build();
            aotaVar3.getClass();
            aupaVar3.e = aotaVar3;
            aupaVar3.b |= 4;
            aP.add((aupa) createBuilder.build());
        }
        return amru.o(aP);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.f;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        ((ypa) this.l.get()).m(this);
        this.e.a.clear();
        this.d = null;
    }

    public final void d() {
        yny.A(this.f, new kzk(this, 1), yny.y(this.c.width, this.c.height), ViewGroup.LayoutParams.class);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aglb.class};
        }
        if (i == 0) {
            aglb aglbVar = (aglb) obj;
            ajpd ajpdVar = this.e.a;
            if (ajpdVar.isEmpty()) {
                return null;
            }
            String str = aglbVar.a;
            for (int i2 = 0; i2 < ajpdVar.size(); i2++) {
                Object obj2 = ajpdVar.get(i2);
                if (obj2 instanceof kyt) {
                    kyt kytVar = (kyt) obj2;
                    if (!kytVar.a && kytVar.b.equals(str)) {
                        ajpdVar.remove(i2);
                        if (ajpdVar.isEmpty()) {
                            d();
                            return null;
                        }
                        ajpdVar.l();
                        return null;
                    }
                }
            }
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0049  */
    @Override // defpackage.ajom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void oB(defpackage.ajok r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kzm.oB(ajok, java.lang.Object):void");
    }
}
