package defpackage;

import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akzk {
    private final MediaMetadataRetriever a;
    private final MediaExtractor b;

    public akzk() {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.a = mediaMetadataRetriever;
        this.b = mediaExtractor;
    }

    public static apvb a(akzo akzoVar) {
        if (akzoVar == null) {
            return null;
        }
        aone createBuilder = apvb.a.createBuilder();
        double d = akzoVar.b;
        createBuilder.copyOnWrite();
        apvb apvbVar = (apvb) createBuilder.instance;
        apvbVar.b |= 1;
        apvbVar.c = d;
        int i = akzoVar.c;
        createBuilder.copyOnWrite();
        apvb apvbVar2 = (apvb) createBuilder.instance;
        apvbVar2.b |= 2;
        apvbVar2.d = i;
        int i2 = akzoVar.d;
        createBuilder.copyOnWrite();
        apvb apvbVar3 = (apvb) createBuilder.instance;
        apvbVar3.b |= 4;
        apvbVar3.e = i2;
        boolean z = akzoVar.e;
        createBuilder.copyOnWrite();
        apvb apvbVar4 = (apvb) createBuilder.instance;
        apvbVar4.b |= 8;
        apvbVar4.f = z;
        int ds = amkq.ds(akzoVar.f);
        if (ds == 0) {
            ds = 2;
        }
        createBuilder.copyOnWrite();
        apvb apvbVar5 = (apvb) createBuilder.instance;
        apvbVar5.g = ds - 1;
        apvbVar5.b |= 16;
        int dt = amkq.dt(akzoVar.g);
        if (dt == 0) {
            dt = 2;
        }
        createBuilder.copyOnWrite();
        apvb apvbVar6 = (apvb) createBuilder.instance;
        apvbVar6.h = dt - 1;
        apvbVar6.b |= 32;
        int dt2 = amkq.dt(akzoVar.h);
        int i3 = dt2 != 0 ? dt2 : 2;
        createBuilder.copyOnWrite();
        apvb apvbVar7 = (apvb) createBuilder.instance;
        apvbVar7.i = i3 - 1;
        apvbVar7.b |= 64;
        double d2 = akzoVar.i;
        createBuilder.copyOnWrite();
        apvb apvbVar8 = (apvb) createBuilder.instance;
        apvbVar8.b |= 128;
        apvbVar8.j = d2;
        int dr = amkq.dr(akzoVar.j);
        int i4 = dr != 0 ? dr : 1;
        createBuilder.copyOnWrite();
        apvb apvbVar9 = (apvb) createBuilder.instance;
        apvbVar9.k = i4 - 1;
        apvbVar9.b |= 256;
        int i5 = akzoVar.k;
        createBuilder.copyOnWrite();
        apvb apvbVar10 = (apvb) createBuilder.instance;
        apvbVar10.b |= 512;
        apvbVar10.l = i5;
        return (apvb) createBuilder.build();
    }
}
