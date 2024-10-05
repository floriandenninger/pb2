package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class afcr {
    protected final aesa a;
    protected final afhs b;
    private HashMap c = new HashMap();
    private String d;
    private boolean e;
    private long f;

    public afcr(afhs afhsVar, aesa aesaVar) {
        afki.b(aesaVar != null);
        this.b = afhsVar;
        this.a = aesaVar;
    }

    public abstract void a(List list, long j, long j2, afcp[] afcpVarArr, afco afcoVar);

    public void b(boolean z) {
    }

    public void c() {
    }

    public void d(float f) {
    }

    public void e() {
    }

    public void f(aeex aeexVar) {
    }

    public void g(afkm afkmVar) {
    }

    public final boolean h(adxr adxrVar, afcp afcpVar, String str, PlayerConfigModel playerConfigModel, long j) {
        String d = afcpVar.d();
        if (!this.b.Z(aqva.EXO_PLAYER_HOT_CONFIG_FEATURES_ENABLE_CACHE_OPTIMIZATIONS)) {
            if (adxrVar != null && !TextUtils.isEmpty(str) && !playerConfigModel.aa()) {
                aquz aquzVar = playerConfigModel.c.e;
                if (aquzVar == null) {
                    aquzVar = aquz.b;
                }
                int i = aquzVar.E;
                if (adxrVar.e(str, d, j, i == 0 ? 10 : i, 0, 1)) {
                    return true;
                }
            }
            return false;
        }
        String str2 = this.d;
        if (str2 == null || str2 != str || this.f > j) {
            this.d = str;
            this.c = new HashMap();
            this.f = 0L;
            this.e = false;
            afic aficVar = afic.ABR;
        }
        this.f = j;
        adxp adxpVar = (adxp) this.c.get(d);
        if (adxpVar == null) {
            if (str != null) {
                adxpVar = adxrVar.c(str, d, j, true);
            }
            if (adxpVar == null) {
                return false;
            }
            this.c.put(d, adxpVar);
        }
        long j2 = adxpVar.a;
        if (j2 >= 0) {
            long j3 = adxpVar.c;
            if (j3 > 0) {
                if (j2 > j) {
                    afic aficVar2 = afic.ABR;
                    TimeUnit.MICROSECONDS.toSeconds(adxpVar.a - j);
                    return false;
                }
                long j4 = j3 - j;
                if (j4 <= 0) {
                    this.c.remove(d);
                    afic aficVar3 = afic.ABR;
                    return false;
                }
                afic aficVar4 = afic.ABR;
                TimeUnit.MICROSECONDS.toSeconds(j4);
                return j4 > TimeUnit.SECONDS.toMicros(5L) * 10;
            }
        }
        if (!this.e && adxpVar.e == 5) {
            this.e = true;
            this.a.e(new afih("cache", TimeUnit.MICROSECONDS.toMillis(j), d.length() != 0 ? "info.nochunkindex;fmt.".concat(d) : new String("info.nochunkindex;fmt.")));
        }
        return false;
    }
}
