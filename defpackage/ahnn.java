package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahnn extends ahga implements ahig, ahkh {
    public final Context e;
    public final ahkv f;
    public final ViewGroup g;
    public final ahnl h;
    public ahhw i;
    public boolean j;
    private final ahki k;
    private final Handler m;

    public ahnn(Context context, ahki ahkiVar, ahkv ahkvVar, ajjz ajjzVar, ViewGroup viewGroup, aahd aahdVar) {
        super(new ahhp(ahkvVar, 0.0f, 0.0f));
        this.e = context;
        ahkiVar.getClass();
        this.k = ahkiVar;
        this.f = ahkvVar;
        this.g = viewGroup;
        this.m = new Handler(Looper.getMainLooper());
        this.h = new ahnl(context, ajjzVar, viewGroup, aahdVar);
        c();
    }

    private final void c() {
        if (v()) {
            return;
        }
        this.l = true;
    }

    public final void a() {
        if (v()) {
            this.l = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(final atzz[] atzzVarArr) {
        this.m.post(new Runnable() { // from class: ahnm
            @Override // java.lang.Runnable
            public final void run() {
                aqyg aqygVar;
                aqyg aqygVar2;
                ahnn ahnnVar = ahnn.this;
                atzz[] atzzVarArr2 = atzzVarArr;
                ArrayList arrayList = new ArrayList(atzzVarArr2.length);
                for (atzz atzzVar : atzzVarArr2) {
                    ahnl ahnlVar = ahnnVar.h;
                    View view = null;
                    view = null;
                    aqyg aqygVar3 = null;
                    if (atzzVar == null) {
                        zga.b("Cannot create view because the renderer was null");
                    } else {
                        int i = atzzVar.b;
                        if ((i & 1) != 0) {
                            aqsz aqszVar = atzzVar.c;
                            if (aqszVar == null) {
                                aqszVar = aqsz.a;
                            }
                            View b = ahnlVar.b(R.layout.vr_watch_next_video);
                            avgg avggVar = aqszVar.d;
                            if (avggVar == null) {
                                avggVar = avgg.a;
                            }
                            avgg avggVar2 = avggVar;
                            aqyg aqygVar4 = aqszVar.f;
                            if (aqygVar4 == null) {
                                aqygVar4 = aqyg.a;
                            }
                            aqyg aqygVar5 = aqygVar4;
                            if ((aqszVar.b & 32) != 0) {
                                aqygVar2 = aqszVar.h;
                                if (aqygVar2 == null) {
                                    aqygVar2 = aqyg.a;
                                }
                            } else {
                                aqygVar2 = aqszVar.g;
                                if (aqygVar2 == null) {
                                    aqygVar2 = aqyg.a;
                                }
                            }
                            aqyg aqygVar6 = aqygVar2;
                            apxf apxfVar = aqszVar.j;
                            if (apxfVar == null) {
                                apxfVar = apxf.a;
                            }
                            ahnlVar.c(b, avggVar2, aqygVar5, aqygVar6, apxfVar);
                            TextView textView = (TextView) b.findViewById(R.id.duration);
                            if ((aqszVar.b & 512) != 0 && (aqygVar3 = aqszVar.i) == null) {
                                aqygVar3 = aqyg.a;
                            }
                            textView.setText(ajcq.b(aqygVar3));
                            view = b;
                        } else if ((i & 2) != 0) {
                            aqsy aqsyVar = atzzVar.d;
                            if (aqsyVar == null) {
                                aqsyVar = aqsy.a;
                            }
                            view = ahnlVar.b(R.layout.vr_watch_next_playlist);
                            avgg avggVar3 = aqsyVar.d;
                            if (avggVar3 == null) {
                                avggVar3 = avgg.a;
                            }
                            avgg avggVar4 = avggVar3;
                            aqyg aqygVar7 = aqsyVar.c;
                            if (aqygVar7 == null) {
                                aqygVar7 = aqyg.a;
                            }
                            aqyg aqygVar8 = aqygVar7;
                            if ((aqsyVar.b & 64) != 0) {
                                aqygVar = aqsyVar.f;
                                if (aqygVar == null) {
                                    aqygVar = aqyg.a;
                                }
                            } else {
                                aqygVar = aqsyVar.g;
                                if (aqygVar == null) {
                                    aqygVar = aqyg.a;
                                }
                            }
                            aqyg aqygVar9 = aqygVar;
                            apxf apxfVar2 = aqsyVar.e;
                            if (apxfVar2 == null) {
                                apxfVar2 = apxf.a;
                            }
                            ahnlVar.c(view, avggVar4, aqygVar8, aqygVar9, apxfVar2);
                            TextView textView2 = (TextView) view.findViewById(R.id.video_count);
                            aqyg aqygVar10 = aqsyVar.h;
                            if (aqygVar10 == null) {
                                aqygVar10 = aqyg.a;
                            }
                            textView2.setText(ajcq.b(aqygVar10));
                        } else {
                            zga.b("Cannot create view because of unexpected renderer type.");
                        }
                    }
                    if (view != null) {
                        arrayList.add(view);
                    }
                }
                ahhw ahhwVar = ahnnVar.i;
                if (ahhwVar != null) {
                    if (ahhwVar.k != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ahhwVar.k.addView((View) it.next());
                        }
                    }
                    ahnnVar.a();
                }
            }
        });
    }

    @Override // defpackage.ahig
    public final boolean f(ahjq ahjqVar) {
        return r(ahjqVar);
    }

    @Override // defpackage.ahig
    public final boolean g(ahjq ahjqVar) {
        return false;
    }

    @Override // defpackage.ahig
    public final boolean h(ahjq ahjqVar) {
        return false;
    }

    @Override // defpackage.ahga, defpackage.ahhi, defpackage.ahim
    public final void p(ahjq ahjqVar) {
        ahhw ahhwVar;
        int a;
        View childAt;
        if (!r(ahjqVar) || (ahhwVar = this.i) == null) {
            return;
        }
        ahhn b = ((ahga) this).a.b(ahjqVar);
        if (ahhwVar.k == null || !b.b() || (a = (int) (b.a() * 4.0f)) >= ahhwVar.k.getChildCount() || (childAt = ahhwVar.k.getChildAt(a)) == null || !childAt.isClickable()) {
            return;
        }
        ahhwVar.j.post(new hgc(childAt, 7));
    }

    @Override // defpackage.ahga, defpackage.ahhi, defpackage.ahim
    public final void q(ahjq ahjqVar) {
        this.j = r(ahjqVar);
        if (!this.k.w() || this.k.x()) {
            a();
            ((ahiy) this.i).n = true != this.j ? 0.5f : 1.0f;
        } else {
            c();
        }
        super.q(ahjqVar);
    }
}
