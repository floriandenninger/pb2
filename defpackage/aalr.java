package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aalr implements aals {
    private static final ThreadLocal b = new aalq();
    protected final Queue a = amql.a(128);
    private final shf c;

    public aalr(shf shfVar) {
        this.c = shfVar;
    }

    @Override // defpackage.aals
    public synchronized void a(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 3 + String.valueOf(str2).length());
        sb.append("[");
        sb.append(str);
        sb.append("] ");
        sb.append(str2);
        String sb2 = sb.toString();
        Queue queue = this.a;
        String format = ((SimpleDateFormat) b.get()).format(new Date(this.c.c()));
        StringBuilder sb3 = new StringBuilder(String.valueOf(format).length() + 1 + String.valueOf(sb2).length());
        sb3.append(format);
        sb3.append(" ");
        sb3.append(sb2);
        queue.add(sb3.toString());
    }
}
