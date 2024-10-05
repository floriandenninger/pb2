package defpackage;

import android.os.Build;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import j$.util.function.BiPredicate;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aksf implements Callable {
    private final int a;
    private final BiPredicate b;
    private final aksg c;

    public aksf(int i, aksg aksgVar, BiPredicate biPredicate) {
        this.c = aksgVar;
        this.b = biPredicate;
        this.a = i;
    }

    private static final aone b(Thread thread, StackTraceElement[] stackTraceElementArr) {
        aone createBuilder = aqcu.a.createBuilder();
        String name = thread.getName();
        createBuilder.copyOnWrite();
        aqcu aqcuVar = (aqcu) createBuilder.instance;
        name.getClass();
        aqcuVar.b |= 2;
        aqcuVar.d = name;
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            String stackTraceElement2 = stackTraceElement.toString();
            if (sb.length() + stackTraceElement2.length() > 2000) {
                break;
            }
            sb.append(stackTraceElement2);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        createBuilder.copyOnWrite();
        aqcu aqcuVar2 = (aqcu) createBuilder.instance;
        sb2.getClass();
        aqcuVar2.b |= 1;
        aqcuVar2.c = sb2;
        return createBuilder;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aqct call() {
        Map k;
        long uptimeMillis = SystemClock.uptimeMillis();
        aone createBuilder = aqcs.a.createBuilder();
        createBuilder.copyOnWrite();
        aqcs aqcsVar = (aqcs) createBuilder.instance;
        aqcsVar.b |= 1;
        aqcsVar.c = uptimeMillis;
        long uptimeMillis2 = Build.VERSION.SDK_INT >= 24 ? SystemClock.uptimeMillis() - Process.getStartUptimeMillis() : 0L;
        createBuilder.copyOnWrite();
        aqcs aqcsVar2 = (aqcs) createBuilder.instance;
        aqcsVar2.b |= 32;
        aqcsVar2.h = uptimeMillis2;
        int rotation = this.c.a.getDefaultDisplay().getRotation();
        int i = 3;
        if (rotation == 0) {
            i = 2;
        } else if (rotation == 1) {
            i = 4;
        } else if (rotation != 2) {
            i = rotation == 3 ? 5 : 1;
        }
        createBuilder.copyOnWrite();
        aqcs aqcsVar3 = (aqcs) createBuilder.instance;
        aqcsVar3.g = i - 1;
        aqcsVar3.b |= 16;
        long pss = Debug.getPss();
        createBuilder.copyOnWrite();
        aqcs aqcsVar4 = (aqcs) createBuilder.instance;
        aqcsVar4.b |= 64;
        aqcsVar4.i = pss / 1024;
        aone createBuilder2 = aqct.a.createBuilder();
        aksg aksgVar = this.c;
        if (this.a != 0) {
            k = Thread.getAllStackTraces();
        } else {
            Thread thread = aksgVar.b;
            k = amrz.k(thread, thread.getStackTrace());
        }
        for (Map.Entry entry : k.entrySet()) {
            Thread thread2 = (Thread) entry.getKey();
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) entry.getValue();
            if (this.c.b.equals(thread2)) {
                aone b = b(thread2, stackTraceElementArr);
                createBuilder2.copyOnWrite();
                aqct aqctVar = (aqct) createBuilder2.instance;
                aqcu aqcuVar = (aqcu) b.build();
                aqcuVar.getClass();
                aqctVar.c = aqcuVar;
                aqctVar.b |= 1;
            } else if (!this.b.test(thread2, stackTraceElementArr)) {
                aone b2 = b(thread2, stackTraceElementArr);
                createBuilder2.copyOnWrite();
                aqct aqctVar2 = (aqct) createBuilder2.instance;
                aqcu aqcuVar2 = (aqcu) b2.build();
                aqcuVar2.getClass();
                aony aonyVar = aqctVar2.d;
                if (!aonyVar.c()) {
                    aqctVar2.d = aonm.mutableCopy(aonyVar);
                }
                aqctVar2.d.add(aqcuVar2);
            }
        }
        long uptimeMillis3 = SystemClock.uptimeMillis();
        createBuilder.copyOnWrite();
        aqcs aqcsVar5 = (aqcs) createBuilder.instance;
        aqcsVar5.b = 2 | aqcsVar5.b;
        aqcsVar5.d = (float) (uptimeMillis3 - uptimeMillis);
        createBuilder2.copyOnWrite();
        aqct aqctVar3 = (aqct) createBuilder2.instance;
        aqcs aqcsVar6 = (aqcs) createBuilder.build();
        aqcsVar6.getClass();
        aqctVar3.a();
        aqctVar3.e.add(aqcsVar6);
        return (aqct) createBuilder2.build();
    }
}
