package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahvg {
    final /* synthetic */ ahvm a;
    private final Runnable b = new Runnable() { // from class: ahve
        @Override // java.lang.Runnable
        public final void run() {
            FormatStreamModel[] formatStreamModelArr;
            ahvg ahvgVar = ahvg.this;
            synchronized (ahvgVar.a.L) {
                formatStreamModelArr = ahvgVar.a.M;
            }
            if (formatStreamModelArr == null) {
                ahvgVar.a();
                return;
            }
            long j = -1;
            for (FormatStreamModel formatStreamModel : formatStreamModelArr) {
                long a = ahvgVar.a.t.a(formatStreamModel, TimeUnit.MILLISECONDS.toMicros(ahvgVar.a.G));
                j = j < 0 ? a : Math.min(j, a);
            }
            ahvgVar.a.K = TimeUnit.MICROSECONDS.toMillis(j);
            final ahvm ahvmVar = ahvgVar.a;
            ahvmVar.v.execute(new Runnable() { // from class: ahvf
                @Override // java.lang.Runnable
                public final void run() {
                    ahvm.this.f();
                }
            });
            ahvm ahvmVar2 = ahvgVar.a;
            if (ahvmVar2.K >= ahvmVar2.I) {
                ahvgVar.a();
            }
        }
    };
    private ScheduledFuture c;

    public ahvg(ahvm ahvmVar) {
        this.a = ahvmVar;
    }

    public final synchronized void a() {
        ScheduledFuture scheduledFuture = this.c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.c = null;
        }
    }

    public final void b() {
        a();
        this.c = this.a.u.scheduleAtFixedRate(this.b, 0L, 10L, TimeUnit.SECONDS);
    }
}
