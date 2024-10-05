package com.google.apps.tiktok.contrib.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import defpackage.aeb;
import defpackage.amcu;
import defpackage.amil;
import defpackage.amiu;
import defpackage.amjw;
import defpackage.amkq;
import defpackage.anhy;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class TikTokListenableWorker extends ListenableWorker {
    private final amiu f;
    private final amcu g;
    private final WorkerParameters h;

    public TikTokListenableWorker(Context context, amiu amiuVar, amcu amcuVar, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.g = amcuVar;
        this.f = amiuVar;
        this.h = workerParameters;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [amij, amir] */
    @Override // androidx.work.ListenableWorker
    public final anhy b() {
        WorkerParameters workerParameters = this.h;
        aeb aebVar = new aeb(workerParameters.c.size());
        for (String str : workerParameters.c) {
            if (str.startsWith("TikTokWorker#")) {
                aebVar.add(str);
            }
        }
        int i = aebVar.b;
        amkq.P(i == 1, "Worker has %s tags instead of exactly one.", i);
        String str2 = (String) aebVar.iterator().next();
        if (!amjw.o()) {
            ?? c = this.f.c(String.valueOf(str2).concat(" startWork()"));
            try {
                anhy a = this.g.a();
                amjw.i(c);
                return a;
            } catch (Throwable th) {
                try {
                    amjw.i(c);
                } catch (Throwable unused) {
                }
                throw th;
            }
        }
        amil l = amjw.l(String.valueOf(str2).concat(" startWork()"));
        try {
            anhy a2 = this.g.a();
            l.a(a2);
            l.close();
            return a2;
        } catch (Throwable th2) {
            try {
                l.close();
            } catch (Throwable unused2) {
            }
            throw th2;
        }
    }
}
