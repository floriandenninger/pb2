package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajbu {
    public final TreeMap a = new TreeMap();
    public long b;
    public ajbv c;
    public final zih d;
    public final String e;
    public final PlayerResponseModel f;

    public ajbu(ajbv ajbvVar, zih zihVar, long j, String str, PlayerResponseModel playerResponseModel) {
        this.c = ajbvVar;
        this.d = zihVar;
        this.f = playerResponseModel;
        this.e = str;
        this.b = e(playerResponseModel, j);
    }

    private static long e(PlayerResponseModel playerResponseModel, long j) {
        return (playerResponseModel.C() || playerResponseModel.E()) ? j : Math.min(j, TimeUnit.SECONDS.toMillis(playerResponseModel.a()));
    }

    public final ajbt a(long j) {
        return b(j, this.b);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [aixt, java.lang.Object] */
    public final ajbt b(long j, long j2) {
        ?? a = this.d.a();
        if (a != 0) {
            return new ajbt(a, j, j2, !this.f.C() && j2 >= TimeUnit.SECONDS.toMillis((long) this.f.a()));
        }
        return null;
    }

    public final void c(long j) {
        long e = e(this.f, j);
        long j2 = this.b;
        if (j2 != e) {
            long j3 = j2 - e;
            ajbv ajbvVar = this.c;
            ajbu ajbuVar = ajbvVar.f;
            ajbv r = ajbvVar.r();
            if (d()) {
                ajbv ajbvVar2 = this.c;
                if (ajbvVar2.d && ajbuVar != null && r != null) {
                    for (ajbv ajbvVar3 : ajbuVar.a.tailMap(Long.valueOf(ajbvVar2.a)).values()) {
                        r.w(ajbvVar3);
                        if (ajbvVar3 != this.c) {
                            ajbvVar3.h -= j3;
                        } else {
                            ajbvVar3.g -= j3;
                        }
                        r.v(ajbvVar3);
                    }
                }
            }
            this.b = e;
        }
    }

    public final boolean d() {
        return this.f.c() != null && this.f.c().aj();
    }
}
