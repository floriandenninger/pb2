package defpackage;

import android.text.TextUtils;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aghg implements ypd {
    public final ypa a;
    public final aaea b;
    public final ScheduledExecutorService c;
    public final azrw d;
    public final azrw e;
    public final azrw f;
    public final azrw g;
    boolean h;
    private final azrw i;

    public aghg(ypa ypaVar, aaea aaeaVar, ScheduledExecutorService scheduledExecutorService, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        this.a = ypaVar;
        this.b = aaeaVar;
        this.c = scheduledExecutorService;
        this.d = azrwVar;
        this.e = azrwVar2;
        this.f = azrwVar3;
        this.i = azrwVar4;
        this.g = azrwVar5;
    }

    public final void a(int i, int i2, int i3) {
        if (this.i.get() != null) {
            ((viz) ((aksl) this.i.get()).h.get()).b("VERIFY_ON_PLAYBACK_EXCEPTION", i != 1 ? i != 2 ? "VERIFICATION_SUCCESS" : "VIDEO_STREAM_VERIFICATION_FAILURE" : "AUDIO_STREAM_VERIFICATION_FAILURE", Integer.toString(i2 - 1), i3 != 1 ? i3 != 2 ? i3 != 3 ? "PLAYBACK_EXCEPTION_FMT_NONEAVAILABLE" : "PLAYBACK_EXCEPTION_OFFLINE_FMT_NONEAVAILABLE" : "PLAYBACK_EXCEPTION_NO_CONNECTION" : "PLAYBACK_EXCEPTION_UNKNOWN");
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aglb.class, ahdv.class, aigr.class};
        }
        if (i == 0) {
            String str = ((aglb) obj).a;
            ainy ainyVar = (ainy) this.d.get();
            if (ainyVar == null || !ainyVar.O() || !TextUtils.equals(ainyVar.q(), str) || !this.h) {
                return null;
            }
            ainyVar.s();
            return null;
        }
        if (i == 1) {
            apxf d = ((ahdv) obj).d();
            if (d == null) {
                return null;
            }
            this.h = d.pY(atrs.a);
            return null;
        }
        if (i == 2) {
            final aigr aigrVar = (aigr) obj;
            final atph atphVar = this.b.a().g;
            if (atphVar == null) {
                atphVar = atph.a;
            }
            if (!atphVar.n && !atphVar.p) {
                return null;
            }
            this.c.execute(new Runnable() { // from class: aghf
                /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 555
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.aghf.run():void");
                }
            });
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
