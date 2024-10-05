package defpackage;

import android.content.Context;
import android.util.Pair;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.TrackingUrlModel;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afgt implements afgx, afgy {
    public final Map a;
    private final int b;
    private final shf c;
    private final shf d;
    private final afqj e;
    private final aaea f;
    private final Pair g;
    private final afgw h;
    private final zfe i;

    public afgt(shf shfVar, shf shfVar2, Context context, afqj afqjVar, aaea aaeaVar, afgw afgwVar) {
        shfVar.getClass();
        this.c = shfVar;
        shfVar2.getClass();
        this.d = shfVar2;
        afqjVar.getClass();
        this.e = afqjVar;
        this.f = aaeaVar;
        this.g = yjk.R(context);
        this.b = zgx.a(context);
        this.h = afgwVar;
        this.i = afgwVar.b;
        this.a = new ConcurrentHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.afgs d(com.google.android.libraries.youtube.innertube.model.player.TrackingUrlModel r18, java.lang.String r19, defpackage.awdi r20, java.lang.String r21, java.lang.String r22, boolean r23, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r24) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afgt.d(com.google.android.libraries.youtube.innertube.model.player.TrackingUrlModel, java.lang.String, awdi, java.lang.String, java.lang.String, boolean, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel):afgs");
    }

    private final auij e() {
        aaea aaeaVar = this.f;
        if (aaeaVar == null || aaeaVar.a() == null) {
            return auij.b;
        }
        atcl atclVar = this.f.a().i;
        if (atclVar == null) {
            atclVar = atcl.a;
        }
        auij auijVar = atclVar.f;
        return auijVar == null ? auij.b : auijVar;
    }

    public final afgs a(String str, awdi awdiVar) {
        afgs d = d(null, str, awdiVar, null, null, false, PlayerConfigModel.b);
        Map map = this.a;
        int i = pts.a;
        map.put(str, d);
        return d;
    }

    public final afgs b(TrackingUrlModel trackingUrlModel, String str, awdi awdiVar, String str2, Integer num, String str3, VideoStreamingData videoStreamingData, boolean z, PlayerConfigModel playerConfigModel) {
        afgs d = d(trackingUrlModel, str, awdiVar, str2, str3, z, playerConfigModel);
        if (d == null) {
            return null;
        }
        this.a.put(str, d);
        d.h(trackingUrlModel, str, str2, num, str3, videoStreamingData, playerConfigModel);
        return d;
    }

    @Override // defpackage.afgx
    public final afgs c(String str) {
        return (afgs) this.a.get(str);
    }
}
