package defpackage;

import android.content.Context;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dwc {
    public final Context c;
    public final dwe f;
    public final Object a = new Object();
    public boolean d = true;
    public boolean e = false;
    public final List b = new LinkedList();

    public dwc(Context context) {
        this.c = context;
        this.f = new dwe(context);
        new Thread(new dwb(this)).start();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        long b = (dwg.b(context) + 300000) - dwg.a();
        scheduledThreadPoolExecutor.scheduleAtFixedRate(new dwa(this), b > 0 ? b : 0L, 300000L, TimeUnit.MILLISECONDS);
    }
}
