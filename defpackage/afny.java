package defpackage;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afny implements afnm {
    public final Context a;
    public final afnt b;
    public final acra c;
    public final avuu d;
    public final ajpd e;
    public String f;
    public final akpe g;
    private final ajoy h;
    private final ajvb i;
    private final acpl j;
    private final RecyclerView k;
    private final Handler l = new Handler();
    private String m;
    private final ajkn n;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [ajos, java.lang.Object] */
    public afny(ajoy ajoyVar, ajvb ajvbVar, acpl acplVar, ajkn ajknVar, akpe akpeVar, Context context, afnt afntVar, RecyclerView recyclerView, acra acraVar, avuu avuuVar, byte[] bArr) {
        this.g = akpeVar;
        this.a = context;
        this.h = ajoyVar;
        this.i = ajvbVar;
        this.j = acplVar;
        this.n = ajknVar;
        this.b = afntVar;
        this.k = recyclerView;
        this.c = acraVar;
        this.d = avuuVar;
        afnw afnwVar = new afnw();
        afnwVar.mK(new ajol() { // from class: afnu
            @Override // defpackage.ajol
            public final void a(ajok ajokVar, ajng ajngVar, int i) {
                afny afnyVar = afny.this;
                if (afnyVar.d == avuu.USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_TEXT_STICKER) {
                    ajokVar.f("color", Integer.valueOf(wbs.W(afnyVar.a, R.attr.ytStaticBrandWhite).orElse(0)));
                }
                ajokVar.a(afnyVar.c);
            }
        });
        ajox a = ajoyVar.a(ajvbVar.get());
        a.q(true);
        a.h(afnwVar);
        this.e = afnwVar;
        recyclerView.setPadding(0, context.getResources().getDimensionPixelSize(R.dimen.user_mention_suggestions_list_padding_top), 0, 0);
        recyclerView.setClipToPadding(false);
        recyclerView.ae(null);
        recyclerView.ac(a);
        recyclerView.setMotionEventSplittingEnabled(false);
    }

    private final avuv j(avut avutVar) {
        avuv a = avux.a();
        String str = this.m;
        a.copyOnWrite();
        avux.e((avux) a.instance, str);
        avuu avuuVar = this.d;
        a.copyOnWrite();
        avux.c((avux) a.instance, avuuVar);
        a.copyOnWrite();
        avux.f((avux) a.instance, avutVar);
        return a;
    }

    private final void k(avux avuxVar) {
        acpl acplVar = this.j;
        arpn a = arpp.a();
        a.copyOnWrite();
        ((arpp) a.instance).ea(avuxVar);
        acplVar.c((arpp) a.build());
    }

    @Override // defpackage.afnm
    public final afnq a(int i) {
        return new afns((avuy) this.e.get(i));
    }

    @Override // defpackage.afnm
    public final void b(final String str) {
        if (this.f == null && str.trim().isEmpty()) {
            return;
        }
        this.l.removeCallbacksAndMessages(null);
        this.l.postDelayed(new Runnable() { // from class: afnv
            @Override // java.lang.Runnable
            public final void run() {
                afny afnyVar = afny.this;
                String str2 = str;
                afnyVar.f = str2;
                afnx afnxVar = new afnx(afnyVar);
                akpe akpeVar = afnyVar.g;
                ynm.k(akpeVar.c.b(new afnz(akpeVar, str2, aaef.b, null), akpeVar.b), angq.a, new afka(2), new izq(afnxVar, 5));
            }
        }, 200L);
        i(avut.USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_INPUT_TEXT_UPDATED);
    }

    @Override // defpackage.afnm
    public final void c(int i) {
        avuv j = j(avut.USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_SUGGESTION_SELECTED);
        aone createBuilder = avuw.a.createBuilder();
        createBuilder.copyOnWrite();
        avuw avuwVar = (avuw) createBuilder.instance;
        avuwVar.b |= 1;
        avuwVar.c = i;
        j.copyOnWrite();
        avux.d((avux) j.instance, (avuw) createBuilder.build());
        k((avux) j.build());
    }

    @Override // defpackage.afnm
    public final void d(afnt afntVar, RecyclerView recyclerView) {
    }

    @Override // defpackage.afnm
    public final void e() {
        this.m = this.n.b(16);
        i(avut.USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_MENTION_FLOW_STARTED);
    }

    @Override // defpackage.afnm
    public final void f() {
        i(avut.USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_MENTION_FLOW_STOPPED);
        this.f = null;
        this.l.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.afnm
    public final boolean g() {
        return false;
    }

    @Override // defpackage.afnm
    public final boolean h() {
        return true;
    }

    public final void i(avut avutVar) {
        k((avux) j(avutVar).build());
    }
}
