package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.youtube.R;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aicg {
    public final Resources a;
    private final ywr b;
    private aicf c;
    private aicf d;
    private int e;

    public aicg(Context context, ywr ywrVar) {
        this.b = ywrVar;
        this.a = context.getResources();
    }

    public Duration a() {
        if ((((awwk) this.b.c()).b & 1) == 0) {
            Duration ofSeconds = Duration.ofSeconds(10L);
            ofSeconds.getClass();
            return ofSeconds;
        }
        aoms aomsVar = ((awwk) this.b.c()).c;
        if (aomsVar == null) {
            aomsVar = aoms.a;
        }
        return Duration.ofSeconds(aomsVar.b);
    }

    public final CharSequence b() {
        int seconds = (int) (this.e * a().getSeconds());
        return this.a.getQuantityString(R.plurals.quick_seek_x_second, seconds, Integer.valueOf(seconds));
    }

    public final void c(aicf aicfVar) {
        aicf aicfVar2 = this.d;
        this.c = aicfVar2;
        this.d = aicfVar;
        if (aicfVar2 != null && aicfVar2.b != this.d.b) {
            d();
        }
        this.e++;
    }

    public final void d() {
        this.e = 0;
    }
}
