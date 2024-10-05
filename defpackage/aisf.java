package defpackage;

import android.content.Context;
import android.view.accessibility.CaptioningManager;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aisf {
    private static final String t = zga.a("subtitles");
    public final ypa a;
    public final Context b;
    public final aipt c;
    public final aitb d;
    public final ahbv e;
    public final ScheduledExecutorService f;
    public final String g;
    public final aifk h;
    public final axpg i;
    public final Set j = Collections.newSetFromMap(new WeakHashMap());
    public CaptioningManager k;
    public boolean l;
    public SubtitleTrack m;
    public aiuj n;
    public ykn o;
    public aitf p;
    public PlayerResponseModel q;
    public ajbl r;
    public boolean s;

    public aisf(ypa ypaVar, Context context, aipt aiptVar, aitb aitbVar, ahbv ahbvVar, ScheduledExecutorService scheduledExecutorService, String str, anhy anhyVar, axpg axpgVar, aifk aifkVar) {
        ypaVar.getClass();
        this.a = ypaVar;
        aiptVar.getClass();
        this.c = aiptVar;
        aitbVar.getClass();
        this.d = aitbVar;
        ahbvVar.getClass();
        this.e = ahbvVar;
        context.getClass();
        this.b = context;
        scheduledExecutorService.getClass();
        this.f = scheduledExecutorService;
        str.getClass();
        this.g = str;
        this.i = axpgVar;
        aifkVar.getClass();
        this.h = aifkVar;
        anhyVar.getClass();
        if (aifkVar.x()) {
            ynm.i(anhyVar, new ynl() { // from class: aisb
                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj) {
                    aisf aisfVar = aisf.this;
                    ammv ammvVar = (ammv) obj;
                    if (ammvVar.h()) {
                        aisfVar.k = (CaptioningManager) ammvVar.c();
                    }
                }
            });
        }
    }

    public static boolean k(aipt aiptVar, CaptioningManager captioningManager) {
        if (((Boolean) ynm.g(aiptVar.c(), 1L, TimeUnit.SECONDS, false)).booleanValue()) {
            return ((Boolean) ynm.g(aiptVar.b(), 1L, TimeUnit.SECONDS, false)).booleanValue();
        }
        return captioningManager != null && captioningManager.isEnabled();
    }

    public final int a() {
        return aand.DASH_FMP4_TT_FMT3.bG;
    }

    public final void b(aypn aypnVar, aypn aypnVar2, aypn aypnVar3, aifk aifkVar) {
        ayqw ayqwVar = new ayqw();
        ayqwVar.d(aypnVar.n().X(new aisc(this, 2)));
        ayqwVar.d(aypnVar2.n().Y(new aisc(this, 3), airw.c));
        if (aifkVar.x()) {
            ayqwVar.d(aypnVar3.n().X(new aisc(this, 0)));
        }
    }

    public final void c() {
        ykn yknVar = this.o;
        if (yknVar != null) {
            yknVar.d();
            this.o = null;
        }
    }

    public final void f() {
        this.n = null;
        i(false);
        h(null, false);
        this.p = null;
        c();
        this.q = null;
    }

    public final void g(SubtitleTrack subtitleTrack, boolean z) {
        String c;
        boolean z2 = false;
        if (subtitleTrack != null) {
            zga.j(t, String.format("setSubtitleTrack name:%s languageCode:%s languageName:%s format:%d trackName:%s vssid:%s videoid:%s", subtitleTrack, subtitleTrack.c(), subtitleTrack.d(), Integer.valueOf(subtitleTrack.a()), subtitleTrack.g(), subtitleTrack.j(), subtitleTrack.i()), new Throwable());
        } else {
            zga.h(t, "subtitleTrack is null");
        }
        if (subtitleTrack != null) {
            if (subtitleTrack.p()) {
                c = "";
            } else {
                c = subtitleTrack.c();
                z2 = true;
            }
            aips a = this.c.a();
            a.b(Boolean.valueOf(z2));
            a.b = c;
            ynm.m(a.a(), ailg.f);
            this.s = true;
        }
        h(subtitleTrack, z);
    }

    public final void h(SubtitleTrack subtitleTrack, boolean z) {
        aiuj aiujVar;
        int i;
        this.m = subtitleTrack;
        SubtitleTrack subtitleTrack2 = null;
        if (subtitleTrack != null && subtitleTrack.p()) {
            this.m = null;
        }
        if (this.m == null && (aiujVar = this.n) != null) {
            atyd atydVar = aiujVar.b;
            if (atydVar != null && atydVar.h && (i = atydVar.g) >= 0 && i < aiujVar.a.b.size()) {
                aiuh a = aiujVar.a((atye) aiujVar.a.b.get(atydVar.g));
                a.d(true);
                subtitleTrack2 = a.a();
            }
            this.m = subtitleTrack2;
        }
        ahdy ahdyVar = new ahdy(this.m, z);
        ajbl ajblVar = this.r;
        if (ajblVar != null) {
            ajblVar.aA().c(ahdyVar);
        } else {
            this.a.f(ahdyVar);
        }
    }

    public final void i(boolean z) {
        this.l = z;
        ajbl ajblVar = this.r;
        if (ajblVar != null) {
            ajblVar.aB().c(new ahdz(this.l));
        } else {
            this.a.d(new ahdz(z));
        }
    }

    public final boolean j() {
        VideoStreamingData videoStreamingData;
        PlayerResponseModel playerResponseModel = this.q;
        return (playerResponseModel == null || (videoStreamingData = playerResponseModel.c) == null || !videoStreamingData.C() || ahbj.H(playerResponseModel, a()).isEmpty()) ? false : true;
    }
}
