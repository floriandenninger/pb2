package defpackage;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.android.youtube.R;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iph {
    public final Context a;
    public final aahd b;
    public final ipg c;
    public final apxf d;
    public final acra e;
    public final avuu f;
    public final ajpd g;
    public String h;
    private final ajoy i;
    private final ajvb j;
    private final acpl k;
    private final RecyclerView l;
    private final Handler m = new Handler();
    private String n;
    private final ajkn o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [ajos, java.lang.Object] */
    public iph(Context context, ajoy ajoyVar, ajvb ajvbVar, aahd aahdVar, acpl acplVar, ajkn ajknVar, ipg ipgVar, RecyclerView recyclerView, apxf apxfVar, acra acraVar, avuu avuuVar, byte[] bArr) {
        this.a = context;
        this.i = ajoyVar;
        this.j = ajvbVar;
        this.b = aahdVar;
        this.k = acplVar;
        this.o = ajknVar;
        this.c = ipgVar;
        this.l = recyclerView;
        this.d = apxfVar;
        this.e = acraVar;
        this.f = avuuVar;
        ipe ipeVar = new ipe();
        final ipc ipcVar = new ipc(this);
        ipeVar.mK(new ajol() { // from class: ipb
            @Override // defpackage.ajol
            public final void a(ajok ajokVar, ajng ajngVar, int i) {
                iph iphVar = iph.this;
                ajokVar.f("listener", ipcVar);
                if (iphVar.f == avuu.USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_TEXT_STICKER) {
                    ajokVar.f("color", Integer.valueOf(wbs.W(iphVar.a, R.attr.ytStaticBrandWhite).orElse(0)));
                }
                ajokVar.a(iphVar.e);
            }
        });
        ajox a = ajoyVar.a(ajvbVar.get());
        a.q(true);
        a.h(ipeVar);
        this.g = ipeVar;
        recyclerView.setPadding(0, context.getResources().getDimensionPixelSize(R.dimen.user_mention_suggestions_list_padding_top), 0, 0);
        recyclerView.setClipToPadding(false);
        recyclerView.ae(null);
        recyclerView.af(new LinearLayoutManager());
        recyclerView.ac(a);
        recyclerView.setMotionEventSplittingEnabled(false);
    }

    public final avuv a(avut avutVar) {
        avuv a = avux.a();
        String str = this.n;
        a.copyOnWrite();
        avux.e((avux) a.instance, str);
        avuu avuuVar = this.f;
        a.copyOnWrite();
        avux.c((avux) a.instance, avuuVar);
        a.copyOnWrite();
        avux.f((avux) a.instance, avutVar);
        return a;
    }

    public final void b(avux avuxVar) {
        acpl acplVar = this.k;
        arpn a = arpp.a();
        a.copyOnWrite();
        ((arpp) a.instance).ea(avuxVar);
        acplVar.c((arpp) a.build());
    }

    public final void c(avut avutVar) {
        b((avux) a(avutVar).build());
    }

    public final void d(final String str) {
        if (str.equals(this.h)) {
            return;
        }
        if (this.h == null && str.trim().isEmpty()) {
            return;
        }
        this.m.removeCallbacksAndMessages(null);
        this.m.postDelayed(new Runnable() { // from class: ipd
            @Override // java.lang.Runnable
            public final void run() {
                iph iphVar = iph.this;
                String str2 = str;
                iphVar.h = str2;
                if (str2.length() == 0) {
                    iphVar.g.clear();
                    iphVar.c.e(true);
                    return;
                }
                ipf ipfVar = new ipf(iphVar);
                HashMap hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.services.social.query", str2);
                hashMap.put("com.google.android.libraries.youtube.innertube.services.social.listener", ipfVar);
                iphVar.b.c(iphVar.d, hashMap);
            }
        }, 200L);
        c(avut.USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_INPUT_TEXT_UPDATED);
    }

    public final void e() {
        this.n = this.o.b(16);
        c(avut.USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_MENTION_FLOW_STARTED);
    }

    public final void f() {
        c(avut.USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_MENTION_FLOW_STOPPED);
        this.h = null;
        this.m.removeCallbacksAndMessages(null);
    }
}
