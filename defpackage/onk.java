package defpackage;

import android.content.Intent;
import android.content.pm.ShortcutManager;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class onk implements gph, ypd {
    private final fcv A;
    private final actg B;
    private final ypa C;
    private anhy D;
    private final aadw E;
    private final lkb F;
    public final ml a;
    public final aahd b;
    public final ony c;
    public final its d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public Intent i;
    public Bundle j;
    public final lkb k;
    private final ajdh l;
    private final afsy m;
    private final fgj n;
    private final fcw o;
    private final azrw p;
    private final acpl q;
    private final azrw r;
    private final orr s;
    private final epq t;
    private final ety u;
    private final onm v;
    private final azrw w;
    private final Executor x;
    private final Set y = new CopyOnWriteArraySet();
    private final azrw z;

    public onk(ml mlVar, aahd aahdVar, ajdh ajdhVar, afsy afsyVar, fgj fgjVar, fcw fcwVar, azrw azrwVar, azrw azrwVar2, orr orrVar, epq epqVar, ony onyVar, ety etyVar, onm onmVar, azrw azrwVar3, Executor executor, aadw aadwVar, ypa ypaVar, azrw azrwVar4, lkb lkbVar, its itsVar, lkb lkbVar2, acpl acplVar, fcv fcvVar, actg actgVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = mlVar;
        this.b = aahdVar;
        this.l = ajdhVar;
        this.m = afsyVar;
        this.n = fgjVar;
        this.o = fcwVar;
        this.p = azrwVar;
        this.r = azrwVar2;
        this.s = orrVar;
        this.t = epqVar;
        this.c = onyVar;
        this.u = etyVar;
        this.v = onmVar;
        this.w = azrwVar3;
        this.x = executor;
        this.A = fcvVar;
        this.B = actgVar;
        this.E = aadwVar;
        this.z = azrwVar4;
        this.F = lkbVar;
        this.d = itsVar;
        this.k = lkbVar2;
        this.q = acplVar;
        this.C = ypaVar;
        ypaVar.g(this);
    }

    public static boolean i(Intent intent) {
        String stringExtra = intent.getStringExtra("source");
        if (TextUtils.isEmpty(stringExtra)) {
            return false;
        }
        return stringExtra.equals("shortcut");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0324 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0325  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.anhy j(android.content.Intent r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.onk.j(android.content.Intent, boolean):anhy");
    }

    private final void k(anhy anhyVar) {
        anhy anhyVar2 = this.D;
        if (anhyVar2 != null) {
            anhyVar2.cancel(true);
        }
        this.D = anhyVar;
        if (l()) {
            anhyVar.d(new Runnable() { // from class: oni
                @Override // java.lang.Runnable
                public final void run() {
                    onk.this.g();
                }
            }, this.x);
        } else {
            g();
        }
    }

    private final boolean l() {
        anhy anhyVar = this.D;
        return anhyVar == null || !(anhyVar.isDone() || this.D.isCancelled());
    }

    private final boolean m(Intent intent) {
        String stringExtra = intent.getStringExtra("query");
        if (stringExtra == null) {
            return false;
        }
        ArrayList<String> arrayList = new ArrayList();
        if (stringExtra.contains("is:channel")) {
            arrayList.add("search_filter=channel");
        } else if (stringExtra.contains("is:playlists")) {
            arrayList.add("search_filter=playlist");
        }
        String trim = stringExtra.replace("is:channel", "").replace("is:playlists", "").trim();
        goy goyVar = (goy) intent.getSerializableExtra("selected_time_filter");
        if (goyVar != null) {
            int ordinal = goyVar.ordinal();
            if (ordinal == 0) {
                arrayList.add("search_filter=live");
            } else if (ordinal == 1) {
                arrayList.add("search_filter=today");
            } else if (ordinal == 2) {
                arrayList.add("search_filter=week");
            } else if (ordinal == 3) {
                arrayList.add("search_filter=month");
            }
        }
        aone createBuilder = auux.a.createBuilder();
        if (!arrayList.isEmpty()) {
            aone createBuilder2 = auuv.a.createBuilder();
            createBuilder2.copyOnWrite();
            auuv auuvVar = (auuv) createBuilder2.instance;
            auuvVar.b |= 1;
            auuvVar.d = true;
            for (String str : arrayList) {
                aone createBuilder3 = auuw.a.createBuilder();
                createBuilder3.copyOnWrite();
                auuw auuwVar = (auuw) createBuilder3.instance;
                str.getClass();
                auuwVar.b |= 4;
                auuwVar.e = str;
                createBuilder3.copyOnWrite();
                auuw auuwVar2 = (auuw) createBuilder3.instance;
                auuwVar2.d = 2;
                auuwVar2.b |= 2;
                createBuilder2.copyOnWrite();
                auuv auuvVar2 = (auuv) createBuilder2.instance;
                auuw auuwVar3 = (auuw) createBuilder3.build();
                auuwVar3.getClass();
                auuvVar2.a();
                auuvVar2.c.add(auuwVar3);
            }
            auuv auuvVar3 = (auuv) createBuilder2.build();
            createBuilder.copyOnWrite();
            auux auuxVar = (auux) createBuilder.instance;
            auuvVar3.getClass();
            auuxVar.a();
            auuxVar.b.add(auuvVar3);
        }
        ony onyVar = this.c;
        lkb lkbVar = this.F;
        auux auuxVar2 = (auux) createBuilder.build();
        aong aongVar = (aong) apxf.a.createBuilder();
        aonk aonkVar = SearchEndpointOuterClass.searchEndpoint;
        aong aongVar2 = (aong) aunn.a.createBuilder();
        aongVar2.copyOnWrite();
        aunn aunnVar = (aunn) aongVar2.instance;
        trim.getClass();
        aunnVar.b |= 1;
        aunnVar.c = trim;
        aongVar.e(aonkVar, (aunn) aongVar2.build());
        onyVar.d(lkbVar.a((apxf) aongVar.build(), auuxVar2, null, false, null, false, false, 0, 0));
        return true;
    }

    private final boolean n() {
        return evr.aT(this.E) && this.m.c().y();
    }

    @Override // defpackage.gph
    public final void a(kcy kcyVar) {
        if (l()) {
            this.y.add(kcyVar);
        } else {
            kcyVar.a();
        }
    }

    @Override // defpackage.gph
    public final void b(kcy kcyVar) {
        this.y.remove(kcyVar);
    }

    public final void c(Intent intent, Bundle bundle) {
        anhy O;
        if (n()) {
            this.i = intent;
            this.j = bundle;
            return;
        }
        if (bundle != null) {
            try {
                e();
                this.g = bundle.getBoolean("has_handled_intent", false);
            } catch (BadParcelableException e) {
                zga.d("handleIntent failed", e);
                O = anaf.O(Boolean.FALSE);
            }
        }
        if (this.g || intent == null) {
            O = anaf.O(Boolean.FALSE);
        } else {
            if (i(intent) && this.r != null) {
                ml mlVar = this.a;
                String action = intent.getAction();
                if (action != null && Build.VERSION.SDK_INT >= 25) {
                    ((ShortcutManager) mlVar.getSystemService(ShortcutManager.class)).reportShortcutUsed(action);
                }
            }
            if ("com.google.android.youtube.action.open.search".equals(intent.getAction())) {
                this.e = true;
                O = anaf.O(Boolean.TRUE);
            } else {
                O = j(intent, true);
            }
        }
        k(O);
    }

    public final void d(Intent intent) {
        anhy O;
        if (!n()) {
            e();
            if (intent.hasExtra("background_failed_dismissible_dialog") || intent.hasExtra("background_failed_upsell_dialog") || intent.hasExtra("background_failed_upsell_dialog_on_elements")) {
                ((evd) this.p.get()).d = true;
                O = anaf.O(Boolean.TRUE);
            } else {
                this.g = false;
                if ("com.google.android.youtube.action.open.search".equals(intent.getAction())) {
                    if (i(intent)) {
                        this.e = true;
                    } else {
                        this.a.onSearchRequested();
                    }
                    O = anaf.O(Boolean.TRUE);
                } else {
                    O = j(intent, false);
                }
            }
            k(O);
            return;
        }
        this.i = intent;
        this.j = null;
    }

    public final void e() {
        if (this.B.j(ahcf.class)) {
            this.C.d(new fdg());
        }
        this.A.b();
    }

    public final void g() {
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            ((kcy) it.next()).a();
        }
        this.y.clear();
    }

    public final void h() {
        this.e = false;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aftm.class};
        }
        if (i == 0) {
            Intent intent = this.i;
            if (intent == null) {
                return null;
            }
            Bundle bundle = this.j;
            if (bundle == null) {
                d(intent);
            } else {
                c(intent, bundle);
            }
            this.i = null;
            this.j = null;
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
