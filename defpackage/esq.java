package defpackage;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class esq extends ajpc implements ajof, ajmt {
    public final SwipeLayout a;
    public final ajyc b;
    public apql c;
    public final jgp d;
    private final TextView e;
    private final TextView f;
    private final ImageView g;
    private final View h;
    private final ImageView i;
    private final ajpd j;
    private final RecyclerView k;
    private final Context l;
    private final ajjz m;
    private final ajoi n;
    private final ajmu o;
    private final View.OnLongClickListener p;
    private final ajyc q;
    private ajok r;

    public esq(Context context, ajjz ajjzVar, azrw azrwVar, aahd aahdVar, ajmu ajmuVar, jgp jgpVar, etr etrVar, kga kgaVar, ajoy ajoyVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.l = context;
        ajjzVar.getClass();
        this.m = ajjzVar;
        this.d = jgpVar;
        ajmuVar.getClass();
        this.o = ajmuVar;
        SwipeLayout swipeLayout = (SwipeLayout) LayoutInflater.from(context).inflate(R.layout.channel_list_item, (ViewGroup) null);
        this.a = swipeLayout;
        this.e = (TextView) swipeLayout.findViewById(R.id.channel_name);
        this.f = (TextView) swipeLayout.findViewById(R.id.activity_count_live_status);
        this.g = (ImageView) swipeLayout.findViewById(R.id.channel_avatar);
        this.h = swipeLayout.findViewById(R.id.channel_status);
        this.i = (ImageView) swipeLayout.findViewById(R.id.channel_status_merged);
        RecyclerView recyclerView = (RecyclerView) swipeLayout.findViewById(R.id.buttons);
        this.k = recyclerView;
        final int i = 0;
        recyclerView.af(new LinearLayoutManager(0));
        ajpa ajpaVar = new ajpa();
        ajox a = ajoyVar.a(ajpaVar);
        recyclerView.ac(a);
        ajpd ajpdVar = new ajpd();
        this.j = ajpdVar;
        a.h(ajpdVar);
        ajpaVar.f(apmp.class, new ajou(azrwVar));
        ajpaVar.f(apmg.class, new esp(this));
        ajpaVar.f(avae.class, etrVar);
        ajpaVar.f(avaa.class, kgaVar);
        this.n = new ajoi(aahdVar, swipeLayout, this);
        this.p = new View.OnLongClickListener() { // from class: esm
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                SwipeLayout swipeLayout2 = esq.this.a;
                if (swipeLayout2.q()) {
                    swipeLayout2.i(0.0f);
                    return true;
                }
                swipeLayout2.j(0.0f);
                return true;
            }
        };
        final int i2 = 1;
        this.q = new ajyc(this) { // from class: esn
            public final /* synthetic */ esq a;

            {
                this.a = this;
            }

            @Override // defpackage.ajyc
            public final void oC(aong aongVar) {
                if (i2 == 0) {
                    this.a.g();
                    return;
                }
                esq esqVar = this.a;
                esqVar.a.f();
                esqVar.g();
            }
        };
        this.b = new ajyc(this) { // from class: esn
            public final /* synthetic */ esq a;

            {
                this.a = this;
            }

            @Override // defpackage.ajyc
            public final void oC(aong aongVar) {
                if (i == 0) {
                    this.a.g();
                    return;
                }
                esq esqVar = this.a;
                esqVar.a.f();
                esqVar.g();
            }
        };
    }

    private final int k(apql apqlVar) {
        ipn i = i(apqlVar);
        if (i == null) {
            return 1;
        }
        return i.c;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.n.c();
        this.o.e(this);
        this.c = null;
        yjj.D(this.a, Collections.emptyList());
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        this.r = ajokVar;
        ipn ipnVar = new ipn((apql) obj);
        this.o.e(this);
        this.o.h(ipnVar.b, this);
        this.o.c(ipnVar.b, ipnVar);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((apql) obj).i.I();
    }

    public final Map f(apql apqlVar) {
        HashMap hashMap = new HashMap();
        acra acraVar = this.r.a;
        if (acraVar != null) {
            hashMap.put("com.google.android.libraries.youtube.logging.interaction_logger", acraVar);
        }
        hashMap.putAll(acrc.g(new fvx(false, new eso(this, apqlVar, k(apqlVar)))));
        return hashMap;
    }

    public final void g() {
        j(this.c, 4);
    }

    @Override // defpackage.ajof
    public final boolean h(View view) {
        apql apqlVar = this.c;
        if ((apqlVar.b & 8) == 0) {
            return true;
        }
        if (k(apqlVar) != 2) {
            return false;
        }
        j(this.c, 1);
        return false;
    }

    public final ipn i(apql apqlVar) {
        if (apqlVar == null) {
            return null;
        }
        return (ipn) this.o.b(ipn.a(apqlVar));
    }

    public final void j(apql apqlVar, int i) {
        ipn i2 = i(apqlVar);
        if (i2 == null) {
            return;
        }
        ajmu ajmuVar = this.o;
        Uri uri = i2.b;
        aone builder = ((aonm) i2.a).toBuilder();
        ipn.c(builder);
        ajmuVar.d(uri, new ipn((apql) builder.build(), i));
    }

    @Override // defpackage.ajmt
    public final void kB(Uri uri, Uri uri2) {
        aqyg aqygVar;
        avgg avggVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        ipn ipnVar = (ipn) this.o.b(uri);
        this.c = (apql) ipnVar.a;
        this.a.setAlpha(1.0f);
        apql apqlVar = this.c;
        if ((apqlVar.b & 8) == 0) {
            this.n.c();
        } else {
            ajoi ajoiVar = this.n;
            acra acraVar = this.r.a;
            apxf apxfVar = apqlVar.h;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            ajoiVar.a(acraVar, apxfVar, this.r.e());
        }
        apqj apqjVar = this.c.k;
        if (apqjVar == null) {
            apqjVar = apqj.a;
        }
        int aC = anaf.aC(apqjVar.b);
        int i = 1;
        if (aC == 0) {
            aC = 1;
        }
        apql apqlVar2 = this.c;
        if ((apqlVar2.b & 2) != 0) {
            aqygVar = apqlVar2.f;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        this.e.setText(ajcq.b(aqygVar));
        apql apqlVar3 = this.c;
        if ((apqlVar3.b & 4) != 0) {
            avggVar = apqlVar3.g;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
        } else {
            avggVar = null;
        }
        if (ahbw.L(avggVar)) {
            this.m.h(this.g, avggVar);
        }
        if (aC != 2) {
            apql apqlVar4 = this.c;
            int i2 = apqlVar4.c;
            if (i2 == 4) {
                this.f.setVisibility(0);
                TextView textView = this.f;
                if (apqlVar4.c == 4) {
                    aqygVar3 = (aqyg) apqlVar4.d;
                } else {
                    aqygVar3 = aqyg.a;
                }
                textView.setText(ajcq.b(aqygVar3));
                this.f.setTextColor(this.l.getResources().getColor(R.color.yt_grey3));
            } else if (i2 != 5) {
                this.f.setVisibility(8);
            } else {
                this.f.setVisibility(0);
                TextView textView2 = this.f;
                if (apqlVar4.c == 5) {
                    aqygVar2 = (aqyg) apqlVar4.d;
                } else {
                    aqygVar2 = aqyg.a;
                }
                textView2.setText(ajcq.b(aqygVar2));
                this.f.setTextColor(this.l.getResources().getColor(R.color.yt_medium_red));
            }
        }
        apql apqlVar5 = this.c;
        this.j.clear();
        for (apqi apqiVar : apqlVar5.m) {
            int i3 = apqiVar.b;
            if ((i3 & 1) != 0) {
                ajpd ajpdVar = this.j;
                apmp apmpVar = apqiVar.c;
                if (apmpVar == null) {
                    apmpVar = apmp.a;
                }
                ajpdVar.add(apmpVar);
            } else if ((i3 & 2) != 0) {
                ajpd ajpdVar2 = this.j;
                apmg apmgVar = apqiVar.d;
                if (apmgVar == null) {
                    apmgVar = apmg.a;
                }
                ajpdVar2.add(apmgVar);
            } else if ((i3 & 4) != 0) {
                ajpd ajpdVar3 = this.j;
                avae avaeVar = apqiVar.e;
                if (avaeVar == null) {
                    avaeVar = avae.a;
                }
                ajpdVar3.add(avaeVar);
            } else if ((i3 & 8) != 0) {
                ajpd ajpdVar4 = this.j;
                avaa avaaVar = apqiVar.f;
                if (avaaVar == null) {
                    avaaVar = avaa.a;
                }
                ajpdVar4.add(avaaVar);
            }
        }
        this.j.l();
        this.k.setVisibility(true != this.j.isEmpty() ? 0 : 8);
        apql apqlVar6 = this.c;
        ArrayList arrayList = new ArrayList();
        this.a.h();
        if (apqlVar6.n.size() != 0) {
            for (apqo apqoVar : apqlVar6.n) {
                if ((apqoVar.b & i) != 0) {
                    frg d = this.d.d(this.q, f(apqlVar6));
                    ajok ajokVar = this.r;
                    apmg apmgVar2 = apqoVar.c;
                    if (apmgVar2 == null) {
                        apmgVar2 = apmg.a;
                    }
                    d.oB(ajokVar, apmgVar2);
                    TextView textView3 = d.b;
                    if (textView3 instanceof TextView) {
                        textView3.setGravity(16);
                    }
                    arrayList.add(textView3);
                    i = 1;
                }
            }
            yjj.D(this.a, arrayList);
            this.a.setOnLongClickListener(this.p);
        } else {
            yjj.D(this.a, arrayList);
            this.a.setOnLongClickListener(null);
        }
        int i4 = ipnVar.c;
        int i5 = this.c.c;
        this.h.setVisibility(8);
        this.i.setVisibility(aC != 2 ? 8 : 4);
        this.g.setAlpha(1.0f);
        this.e.setAlpha(1.0f);
        if (i4 == 3) {
            this.g.setAlpha(0.5f);
            this.e.setAlpha(0.5f);
            return;
        }
        if (i4 == 4) {
            this.a.setAlpha(0.5f);
            this.k.setVisibility(8);
            this.a.k(null);
            SwipeLayout swipeLayout = this.a;
            swipeLayout.f = false;
            swipeLayout.h = false;
            swipeLayout.setOnLongClickListener(null);
            return;
        }
        if (aC != 2) {
            if (i4 == 2) {
                this.h.setVisibility(0);
            }
        } else if (i5 == 5) {
            this.i.setVisibility(0);
            this.i.setImageDrawable(this.l.getResources().getDrawable(R.drawable.channel_list_sub_item_live));
        } else if (i4 == 2) {
            this.i.setVisibility(0);
            this.i.setImageDrawable(this.l.getResources().getDrawable(R.drawable.channel_list_sub_item_new_content));
        }
    }
}
