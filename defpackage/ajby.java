package defpackage;

import android.os.SystemClock;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Observable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajby extends Observable implements ypd {
    public final ScheduledExecutorService a;
    public ScheduledFuture b;
    ajbx c;

    public ajby(ScheduledExecutorService scheduledExecutorService) {
        scheduledExecutorService.getClass();
        this.a = scheduledExecutorService;
    }

    private final void d() {
        ajbx ajbxVar = this.c;
        if (ajbxVar != null) {
            ajbxVar.b();
            this.c = null;
        }
    }

    public final void b(ahef ahefVar) {
        avzq avzqVar;
        aign aignVar = aign.NEW;
        int ordinal = ahefVar.c().ordinal();
        if (ordinal != 6) {
            if (ordinal != 7) {
                if (ordinal != 8) {
                    d();
                    return;
                }
                return;
            }
            PlayerResponseModel b = ahefVar.b();
            if (b != null) {
                d();
                avzn t = b.t();
                if (t == null) {
                    avzqVar = null;
                } else {
                    avzqVar = t.c;
                    if (avzqVar == null) {
                        avzqVar = avzq.b;
                    }
                }
                if (avzqVar == null) {
                    return;
                }
                ajbx ajbxVar = new ajbx(this, avzqVar, b.t());
                this.c = ajbxVar;
                ajbxVar.b = SystemClock.elapsedRealtime();
                ajbxVar.j = 1;
            }
        }
    }

    public final void c(ahej ahejVar) {
        ajbx ajbxVar = this.c;
        if (ajbxVar == null) {
            return;
        }
        switch (ahejVar.a()) {
            case 2:
                ajbxVar.a();
                ajbxVar.d(3);
                return;
            case 3:
            case 6:
                ajbxVar.a();
                ajbxVar.d(7);
                return;
            case 4:
            case 7:
            case 8:
                d();
                return;
            case 5:
                ajbxVar.a();
                aign aignVar = aign.NEW;
                int i = ajbxVar.j;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 0) {
                    ajbxVar.d(2);
                    ajbxVar.c(ajbxVar.c - ajbxVar.f);
                    return;
                } else if (i2 == 2) {
                    ajbxVar.d(4);
                    ajbxVar.c(ajbxVar.d - ajbxVar.h);
                    return;
                } else {
                    if (i2 == 4 || i2 == 6) {
                        ajbxVar.d(6);
                        return;
                    }
                    return;
                }
            case 9:
            case 10:
                ajbxVar.a();
                ajbxVar.d(5);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahef.class, ahej.class};
        }
        if (i == 0) {
            b((ahef) obj);
            return null;
        }
        if (i == 1) {
            c((ahej) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
