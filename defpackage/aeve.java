package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeve {
    public static final avr[] a = new avr[0];
    public final ScheduledExecutorService b;
    public final aenf c;
    public final adxr d;
    public final Context e;
    public final affe f;
    public final aezm g;
    public final adyj h;

    public aeve(ScheduledExecutorService scheduledExecutorService, aenf aenfVar, adxr adxrVar, Context context, aezm aezmVar, adyj adyjVar, affe affeVar) {
        this.b = scheduledExecutorService;
        this.c = aenfVar;
        this.d = adxrVar;
        this.e = context;
        this.g = aezmVar;
        this.h = adyjVar;
        this.f = affeVar;
    }

    public static void c(bac bacVar, aeut aeutVar) {
        if (j(aeutVar, aqva.EXO_PLAYER_HOT_CONFIG_FEATURES_ASYNC_QUEUEING)) {
            bacVar.k = true;
        }
        if (j(aeutVar, aqva.EXO_PLAYER_HOT_CONFIG_FEATURES_ASYNC_QUEUEING_FORCE_WORKAROUND)) {
            bacVar.l = true;
        }
        if (j(aeutVar, aqva.EXO_PLAYER_HOT_CONFIG_FEATURES_ASYNC_QUEUEING_SYNCHRONIZED_INTERACTIONS)) {
            bacVar.m = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final avk d(psf psfVar) {
        return new avk(psfVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final affc e(aeut aeutVar, PlayerConfigModel playerConfigModel, VideoStreamingData videoStreamingData) {
        if (videoStreamingData.B()) {
            return new affc(playerConfigModel, videoStreamingData, new aeuy(aeutVar, 0), aeutVar.k);
        }
        return affc.a;
    }

    public static final atd g(aeut aeutVar, aelf aelfVar, aezf aezfVar) {
        int i;
        afiy[] afiyVarArr;
        afiy[] afiyVarArr2;
        PlayerConfigModel a2 = aezfVar.a();
        synchronized (aeutVar) {
            if (aeutVar.D != null && !a2.ab()) {
                afiyVarArr = aeutVar.D;
                afiyVarArr2 = afiyVarArr;
                aeutVar.D = null;
            }
            afiyVarArr = new afiy[0];
            afiyVarArr2 = afiyVarArr;
            aeutVar.D = null;
        }
        for (afiy afiyVar : afiyVarArr2) {
            afiyVar.b(a2, aelfVar, aezfVar.K);
        }
        return new aeva(afiyVarArr2, aeutVar.f, a2, aezfVar, aelfVar);
    }

    public static final aewj h(aeut aeutVar, aeru aeruVar) {
        return new aevd(aeutVar, aeruVar);
    }

    private static boolean j(aeut aeutVar, aqva aqvaVar) {
        return aeutVar.i.s.Z(aqvaVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final plr a(aeut aeutVar, pmv pmvVar, ptk ptkVar) {
        afhs afhsVar = aeutVar.i.s;
        Context context = this.e;
        poj pojVar = new poj(context, aeutVar, aeutVar.s, pmvVar, bfi.h(context), aeutVar.b);
        Looper mainLooper = Looper.getMainLooper();
        pse.g(!pojVar.p);
        pojVar.h = mainLooper;
        long j = afhsVar.j();
        pse.g(!pojVar.p);
        pojVar.n = j;
        pse.g(!pojVar.p);
        pojVar.i = ptkVar;
        return muf.I(pojVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final afaf b(aeut aeutVar, aezf aezfVar) {
        PlayerConfigModel a2 = aezfVar.a();
        return new afaf(g(aeutVar, null, aezfVar), aeutVar.i.s, a2.A(), a2.z(), aezfVar.b.a(), a2.t(), new aevc[]{f(aeutVar.h)}, aeutVar.i.d);
    }

    public final aevc f(aevh aevhVar) {
        return new aevc(this, aevhVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aewe i(aeut aeutVar, aeqg aeqgVar, aeuu aeuuVar, afhs afhsVar) {
        HashMap hashMap = new HashMap(1);
        hashMap.put("aid", yjj.k(this.e));
        return new aewe(aeqgVar, hashMap, aeutVar.k, aeuuVar, afhsVar, null);
    }
}
