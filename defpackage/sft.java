package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sft implements sfz {
    static final int[] e;
    public final Context a;
    public final ammv b;
    public final sfp c;
    public final sgd d;
    public aone f;
    private final List g;
    private final List h;

    static {
        new Uri.Builder().scheme("content").authority("com.google.android.googlequicksearchbox.GsaPublicContentProvider").appendPath("morris_provider").appendPath("com.google.android.googlequicksearchbox.MorrisProvider").build();
        e = new int[]{2, 3};
    }

    public sft(final Context context) {
        final qnn b = qnn.b(context);
        this.g = amkq.aO();
        this.b = amlr.a;
        this.a = context;
        new sfs(this, Looper.getMainLooper());
        this.h = new ArrayList();
        anaf.C(Executors.newSingleThreadExecutor());
        sgd sgdVar = new sgd(null);
        this.d = sgdVar;
        sgdVar.a = this;
        this.c = new sfp(context, new amnv() { // from class: sfr
            @Override // defpackage.amnv
            public final Object get() {
                sft sftVar = sft.this;
                return new sfw(context, sftVar.d, sftVar, b);
            }
        }, new amnv() { // from class: sfq
            @Override // defpackage.amnv
            public final Object get() {
                return new edw(context, sft.this.d);
            }
        });
    }

    public static void b(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new RuntimeException(str.concat(" should be called in main thread"));
        }
    }

    public final int a() {
        int a = this.c.a();
        String.format("#getConnectionState() - connectionState = %d", Integer.valueOf(a));
        return a;
    }

    public final void c(edt edtVar) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        String.format(Locale.US, "#recordAppFlowEvent: %s, timeStampNs: %d", edtVar, Long.valueOf(elapsedRealtimeNanos));
        List list = this.h;
        sgj a = sgk.a();
        a.copyOnWrite();
        ((sgk) a.instance).e(edtVar);
        a.copyOnWrite();
        ((sgk) a.instance).f(elapsedRealtimeNanos);
        list.add((sgk) a.build());
    }

    public final void d() {
        if (!this.c.c() || this.f == null) {
            return;
        }
        aone createBuilder = sgu.a.createBuilder();
        aone aoneVar = this.f;
        createBuilder.copyOnWrite();
        sgu sguVar = (sgu) createBuilder.instance;
        sgt sgtVar = (sgt) aoneVar.build();
        sgtVar.getClass();
        sguVar.d = sgtVar;
        sguVar.b |= 2;
        try {
            g(createBuilder);
            this.f = null;
        } catch (RemoteException unused) {
            Log.w("AssistantIntegClient", "#sendPendingVoicePlateParams(): failed to send VoicePlateParams");
        }
    }

    public final aone e(aone aoneVar) {
        int d = sgf.d(0);
        aoneVar.copyOnWrite();
        sgt sgtVar = (sgt) aoneVar.instance;
        int i = d - 1;
        sgt sgtVar2 = sgt.a;
        if (d == 0) {
            throw null;
        }
        sgtVar.c = i;
        sgtVar.b |= 1;
        if (!TextUtils.isEmpty(null)) {
            aoneVar.copyOnWrite();
            throw null;
        }
        aoneVar.copyOnWrite();
        sgt sgtVar3 = (sgt) aoneVar.instance;
        sgtVar3.b &= -3;
        sgtVar3.d = sgt.a.d;
        aone createBuilder = sgs.a.createBuilder();
        ArrayList aO = amkq.aO();
        createBuilder.copyOnWrite();
        sgs sgsVar = (sgs) createBuilder.instance;
        aony aonyVar = sgsVar.b;
        if (!aonyVar.c()) {
            sgsVar.b = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll((Iterable) aO, (List) sgsVar.b);
        aoneVar.copyOnWrite();
        sgt sgtVar4 = (sgt) aoneVar.instance;
        sgs sgsVar2 = (sgs) createBuilder.build();
        sgsVar2.getClass();
        sgtVar4.e = sgsVar2;
        sgtVar4.b |= 4;
        aoneVar.copyOnWrite();
        sgt sgtVar5 = (sgt) aoneVar.instance;
        sgtVar5.b |= 32;
        sgtVar5.g = 0;
        if (!TextUtils.isEmpty(null)) {
            aoneVar.copyOnWrite();
            throw null;
        }
        aoneVar.copyOnWrite();
        sgt sgtVar6 = (sgt) aoneVar.instance;
        sgtVar6.b |= 16;
        sgtVar6.f = "";
        aone createBuilder2 = sgr.a.createBuilder();
        List list = this.g;
        createBuilder2.copyOnWrite();
        sgr sgrVar = (sgr) createBuilder2.instance;
        aony aonyVar2 = sgrVar.b;
        if (!aonyVar2.c()) {
            sgrVar.b = aonm.mutableCopy(aonyVar2);
        }
        aolo.addAll((Iterable) list, (List) sgrVar.b);
        aoneVar.copyOnWrite();
        sgt sgtVar7 = (sgt) aoneVar.instance;
        sgr sgrVar2 = (sgr) createBuilder2.build();
        sgrVar2.getClass();
        sgtVar7.h = sgrVar2;
        sgtVar7.b |= 64;
        aone createBuilder3 = sgu.a.createBuilder();
        createBuilder3.copyOnWrite();
        sgu sguVar = (sgu) createBuilder3.instance;
        sgt sgtVar8 = (sgt) aoneVar.build();
        sgtVar8.getClass();
        sguVar.d = sgtVar8;
        sguVar.b |= 2;
        int[] iArr = e;
        int length = iArr.length;
        for (int i2 = 0; i2 < 2; i2++) {
            int i3 = iArr[i2];
            createBuilder3.copyOnWrite();
            sgu sguVar2 = (sgu) createBuilder3.instance;
            if (i3 != 0) {
                aonu aonuVar = sguVar2.g;
                if (!aonuVar.c()) {
                    sguVar2.g = aonm.mutableCopy(aonuVar);
                }
                sguVar2.g.g(i3 - 1);
            } else {
                throw null;
            }
        }
        return createBuilder3;
    }

    public final aone f() {
        if (this.f == null) {
            this.f = sgt.a.createBuilder();
        }
        return this.f;
    }

    public final void g(aone aoneVar) {
        List list = this.h;
        aoneVar.copyOnWrite();
        sgu sguVar = (sgu) aoneVar.instance;
        sgu sguVar2 = sgu.a;
        aony aonyVar = sguVar.e;
        if (!aonyVar.c()) {
            sguVar.e = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll((Iterable) list, (List) sguVar.e);
        sfp.b("sendData", anfq.h(this.c.c, new sfm((sgu) aoneVar.build(), 0), angq.a));
        this.h.clear();
    }
}
