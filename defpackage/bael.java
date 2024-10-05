package defpackage;

import android.os.AsyncTask;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bael extends ThreadPoolExecutor {
    private static final int a;
    private static final int b;
    private static final int c;
    private static final ThreadFactory d;
    private static final BlockingQueue e;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        a = availableProcessors;
        b = Math.max(2, Math.min(availableProcessors - 1, 4));
        c = availableProcessors + availableProcessors + 1;
        d = new anxc(2, (char[]) null);
        e = new ArrayBlockingQueue(128);
    }

    public bael() {
        super(b, c, 30L, TimeUnit.SECONDS, (BlockingQueue<Runnable>) e, d);
        allowCoreThreadTimeOut(true);
    }

    private static String a(Runnable runnable) {
        Class<?> cls = runnable.getClass();
        if (cls == baek.class) {
            throw null;
        }
        if (cls.getEnclosingClass() == AsyncTask.class) {
            Field declaredField = cls.getDeclaredField("this$0");
            declaredField.setAccessible(true);
            cls = declaredField.get(runnable).getClass();
        }
        return cls.getName();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            super.execute(runnable);
        } catch (RejectedExecutionException e2) {
            HashMap hashMap = new HashMap();
            for (Runnable runnable2 : (Runnable[]) getQueue().toArray(new Runnable[0])) {
                String a2 = a(runnable2);
                hashMap.put(a2, Integer.valueOf((hashMap.containsKey(a2) ? ((Integer) hashMap.get(a2)).intValue() : 0) + 1));
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Prominent classes in AsyncTask: ");
            StringBuilder sb2 = new StringBuilder();
            for (Map.Entry entry : hashMap.entrySet()) {
                if (((Integer) entry.getValue()).intValue() > 32) {
                    sb2.append((String) entry.getKey());
                    sb2.append(' ');
                }
            }
            sb.append(sb2.length() == 0 ? "NO CLASSES FOUND" : sb2.toString());
            throw new RejectedExecutionException(sb.toString(), e2);
        }
    }
}
