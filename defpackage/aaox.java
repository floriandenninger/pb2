package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaox {
    public final Uri a;
    public final String b;
    public final Map c;
    public final AtomicReference d;
    public final ammv e;
    public PlayerConfigModel f;
    public String g;
    public VideoStreamingData h;
    public long i;
    public boolean j;
    public final boolean m;
    public String n;
    public String o;
    private atyi q;
    public int p = 1;
    public int k = -1;
    public int l = -1;

    public aaox(String str, long j, Uri uri, atyi atyiVar, boolean z, ammv ammvVar) {
        zhq.m(str);
        this.b = str;
        this.i = Math.max(j, 0L);
        this.a = uri;
        this.q = atyiVar;
        this.m = z;
        this.e = ammvVar;
        this.f = new PlayerConfigModel(atyiVar);
        this.d = new AtomicReference(aosz.ONESIE_REQUEST_TARGET_ENCRYPTED_PLAYER_SERVICE);
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        hashMap.put("Content-Type", "application/x-protobuf");
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.aaox h(defpackage.aaea r8, defpackage.ammv r9, java.lang.String r10, long r11, defpackage.afkm r13, byte[] r14) {
        /*
            Method dump skipped, instructions count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaox.h(aaea, ammv, java.lang.String, long, afkm, byte[]):aaox");
    }

    public final PlayerConfigModel a(PlayerConfigModel playerConfigModel, ysy ysyVar) {
        Iterable q;
        if (playerConfigModel == null || ysyVar == null) {
            return this.f;
        }
        long K = playerConfigModel.K();
        List V = playerConfigModel.V();
        if (!V.isEmpty()) {
            if (K != Long.MAX_VALUE) {
                Integer valueOf = Integer.valueOf(ysyVar.a());
                if (!V.contains(valueOf)) {
                    return this.f;
                }
                if ((this.f.V().contains(valueOf) ? this.f.K() : Long.MAX_VALUE) <= K) {
                    return this.f;
                }
                aone createBuilder = atyi.a.createBuilder();
                atyi atyiVar = this.q;
                if ((atyiVar.b & 2) != 0) {
                    aquz aquzVar = atyiVar.e;
                    if (aquzVar == null) {
                        aquzVar = aquz.b;
                    }
                    createBuilder.copyOnWrite();
                    atyi atyiVar2 = (atyi) createBuilder.instance;
                    aquzVar.getClass();
                    atyiVar2.e = aquzVar;
                    atyiVar2.b |= 2;
                }
                atyi atyiVar3 = this.q;
                if ((atyiVar3.c & 256) != 0) {
                    auyf auyfVar = atyiVar3.B;
                    if (auyfVar == null) {
                        auyfVar = auyf.a;
                    }
                    createBuilder.copyOnWrite();
                    atyi atyiVar4 = (atyi) createBuilder.instance;
                    auyfVar.getClass();
                    atyiVar4.B = auyfVar;
                    atyiVar4.c |= 256;
                }
                atyi atyiVar5 = this.q;
                if ((atyiVar5.b & 16384) != 0) {
                    apdx apdxVar = atyiVar5.k;
                    if (apdxVar == null) {
                        apdxVar = apdx.a;
                    }
                    createBuilder.copyOnWrite();
                    atyi atyiVar6 = (atyi) createBuilder.instance;
                    apdxVar.getClass();
                    atyiVar6.k = apdxVar;
                    atyiVar6.b |= 16384;
                }
                atyi atyiVar7 = this.q;
                if ((atyiVar7.b & 32768) != 0) {
                    atmi atmiVar = atyiVar7.l;
                    if (atmiVar == null) {
                        atmiVar = atmi.a;
                    }
                    createBuilder.copyOnWrite();
                    atyi atyiVar8 = (atyi) createBuilder.instance;
                    atmiVar.getClass();
                    atyiVar8.l = atmiVar;
                    atyiVar8.b |= 32768;
                }
                aone createBuilder2 = aqif.b.createBuilder();
                atyi atyiVar9 = this.q;
                if ((atyiVar9.c & 64) != 0) {
                    aqif aqifVar = atyiVar9.z;
                    if (aqifVar == null) {
                        aqifVar = aqif.b;
                    }
                    boolean z = aqifVar.f;
                    createBuilder2.copyOnWrite();
                    aqif aqifVar2 = (aqif) createBuilder2.instance;
                    aqifVar2.c |= 4;
                    aqifVar2.f = z;
                }
                createBuilder2.copyOnWrite();
                aqif aqifVar3 = (aqif) createBuilder2.instance;
                aqifVar3.c |= 1;
                aqifVar3.d = K;
                atyi atyiVar10 = playerConfigModel.c;
                if ((atyiVar10.c & 64) == 0) {
                    q = amru.q();
                } else {
                    aqif aqifVar4 = atyiVar10.z;
                    if (aqifVar4 == null) {
                        aqifVar4 = aqif.b;
                    }
                    q = new aonw(aqifVar4.e, aqif.a);
                }
                createBuilder2.copyOnWrite();
                aqif aqifVar5 = (aqif) createBuilder2.instance;
                aonu aonuVar = aqifVar5.e;
                if (!aonuVar.c()) {
                    aqifVar5.e = aonm.mutableCopy(aonuVar);
                }
                Iterator it = q.iterator();
                while (it.hasNext()) {
                    aqifVar5.e.g(((atfo) it.next()).n);
                }
                createBuilder.copyOnWrite();
                atyi atyiVar11 = (atyi) createBuilder.instance;
                aqif aqifVar6 = (aqif) createBuilder2.build();
                aqifVar6.getClass();
                atyiVar11.z = aqifVar6;
                atyiVar11.c |= 64;
                return new PlayerConfigModel((atyi) createBuilder.build());
            }
        }
        return this.f;
    }

    public final aosz b() {
        return (aosz) this.d.get();
    }

    public final void c(VideoStreamingData videoStreamingData) {
        this.p = 2;
        this.h = videoStreamingData;
    }

    public final void d(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel) {
        this.p = 2;
        this.h = videoStreamingData;
        this.f = playerConfigModel;
        this.q = playerConfigModel.c;
    }

    public final void e(long j) {
        this.i = Math.max(j, 0L);
    }

    public final void f(String str) {
        zhq.m(str);
        this.g = str;
    }

    public final boolean g() {
        return this.p == 2;
    }

    public final void i() {
        this.j = true;
    }
}
