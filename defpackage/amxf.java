package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class amxf {
    public final amyp a;

    /* JADX INFO: Access modifiers changed from: protected */
    public amxf(amyp amypVar) {
        anaf.d(amypVar, "backend");
        this.a = amypVar;
    }

    public static void i(String str, amyo amyoVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(TimeUnit.NANOSECONDS.toMillis(amyoVar.e()))));
        sb.append(": logging error [");
        amxs f = amyoVar.f();
        if (f != amxs.a) {
            sb.append(f.b());
            sb.append('.');
            sb.append(f.d());
            sb.append(':');
            sb.append(f.a());
        }
        sb.append("]: ");
        sb.append(str);
        System.err.println(sb);
        System.err.flush();
    }

    public abstract amxz a(Level level);

    public final amxz b() {
        return a(Level.CONFIG);
    }

    public final amxz c() {
        return a(Level.FINE);
    }

    public final amxz d() {
        return a(Level.FINEST);
    }

    public final amxz e() {
        return a(Level.INFO);
    }

    public final amxz f() {
        return a(Level.SEVERE);
    }

    public final amxz g() {
        return a(Level.WARNING);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String h() {
        return this.a.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean j(Level level) {
        return this.a.d(level);
    }
}
