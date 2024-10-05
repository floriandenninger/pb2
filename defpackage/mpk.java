package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mpk extends ajpc {
    public final RecyclerView a;
    final ajpd b;
    public final jgp c;
    private final Context d;
    private final ajoy e;
    private areq f;
    private ajoq g;
    private ajoq h;
    private final ajnw i;

    public mpk(Context context, jgp jgpVar, ajoy ajoyVar, ViewGroup viewGroup, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.d = context;
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.horizontal_buttons_layout, viewGroup, false);
        this.a = recyclerView;
        recyclerView.af(new mpj());
        this.c = jgpVar;
        this.e = ajoyVar;
        this.b = new ajpd();
        this.i = new ajnw();
    }

    private final int f(apkv apkvVar, avfc avfcVar) {
        int orElse = wbs.W(this.d, R.attr.ytGeneralBackgroundB).orElse(0);
        if (avfcVar == null || (avfcVar.b & 4) == 0) {
            return apkvVar != null ? apkvVar.c : orElse;
        }
        Context context = this.d;
        avez b = avez.b(avfcVar.e);
        if (b == null) {
            b = avez.THEME_ATTRIBUTE_UNKNOWN;
        }
        return akbg.a(context, b, orElse);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.b.clear();
        whu.I(this.a, false);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        apkv apkvVar;
        ajoq ajoqVar;
        areq areqVar = (areq) obj;
        final int i = 1;
        whu.I(this.a, true);
        this.i.a = ajokVar.a;
        if (!amkq.b(this.f, areqVar)) {
            this.f = areqVar;
            avfc avfcVar = null;
            if ((areqVar.b & 1) != 0) {
                arep arepVar = areqVar.d;
                if (arepVar == null) {
                    arepVar = arep.a;
                }
                if (arepVar.b == 118483990) {
                    apkvVar = (apkv) arepVar.c;
                } else {
                    apkvVar = apkv.a;
                }
            } else {
                apkvVar = null;
            }
            if ((areqVar.b & 1) != 0) {
                arep arepVar2 = areqVar.d;
                if (arepVar2 == null) {
                    arepVar2 = arep.a;
                }
                if (arepVar2.b == 256005610) {
                    avfcVar = (avfc) arepVar2.c;
                } else {
                    avfcVar = avfc.a;
                }
            }
            ajpa ajpaVar = new ajpa();
            if (!(apkvVar == null && avfcVar == null) && whu.R(f(apkvVar, avfcVar)) > 0.5d) {
                if (this.h == null) {
                    this.h = new ajoq(this) { // from class: mph
                        public final /* synthetic */ mpk a;

                        {
                            this.a = this;
                        }

                        @Override // defpackage.ajoq
                        public final ajom b(ViewGroup viewGroup) {
                            return i != 0 ? this.a.c.e(null, null, R.layout.horizontal_button_list_button_layout_dark) : this.a.c.e(null, null, R.layout.horizontal_button_list_button_layout_light);
                        }
                    };
                }
                ajoqVar = this.h;
            } else {
                if (this.g == null) {
                    final int i2 = 0;
                    this.g = new ajoq(this) { // from class: mph
                        public final /* synthetic */ mpk a;

                        {
                            this.a = this;
                        }

                        @Override // defpackage.ajoq
                        public final ajom b(ViewGroup viewGroup) {
                            return i2 != 0 ? this.a.c.e(null, null, R.layout.horizontal_button_list_button_layout_dark) : this.a.c.e(null, null, R.layout.horizontal_button_list_button_layout_light);
                        }
                    };
                }
                ajoqVar = this.g;
            }
            ajpaVar.f(apmg.class, ajoqVar);
            ajox a = this.e.a(ajpaVar);
            a.h(this.b);
            a.rU(this.i);
            this.a.ac(a);
            this.a.setBackgroundColor(f(apkvVar, avfcVar));
        }
        for (apmh apmhVar : areqVar.c) {
            if ((apmhVar.b & 1) != 0) {
                ajpd ajpdVar = this.b;
                apmg apmgVar = apmhVar.c;
                if (apmgVar == null) {
                    apmgVar = apmg.a;
                }
                ajpdVar.add(apmgVar);
            }
        }
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((areq) obj).e.I();
    }
}
