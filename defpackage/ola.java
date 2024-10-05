package defpackage;

import android.content.SharedPreferences;
import com.google.android.apps.youtube.app.watchwhile.StartupSignalStream;
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ola {
    public final axpg a;
    public final euc b;
    public final StartupSignalStream c;
    final ayqw d = new ayqw();
    final AtomicBoolean e = new AtomicBoolean(false);
    public final aadw f;
    private final SharedPreferences g;

    public ola(axpg axpgVar, aadw aadwVar, euc eucVar, StartupSignalStream startupSignalStream, yqw yqwVar, SharedPreferences sharedPreferences) {
        this.a = axpgVar;
        this.f = aadwVar;
        this.b = eucVar;
        this.c = startupSignalStream;
        this.g = sharedPreferences;
        yqwVar.a().R(new oky(this, 0));
    }

    public final boolean a() {
        if (!evr.bh(this.f)) {
            return false;
        }
        asvu asvuVar = this.f.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        if (asvuVar.cO) {
            long j = this.g.getLong("on_device_mdx_successful_cast_time", 0L);
            if (j <= 0) {
                return true;
            }
            ChronoUnit chronoUnit = ChronoUnit.DAYS;
            Instant ofEpochMilli = Instant.ofEpochMilli(j);
            aneu aneuVar = aneu.a;
            long between = chronoUnit.between(ofEpochMilli, Instant.now());
            asvu asvuVar2 = this.f.b().e;
            if (asvuVar2 == null) {
                asvuVar2 = asvu.a;
            }
            if (between <= asvuVar2.cP) {
                return false;
            }
        }
        return true;
    }
}
