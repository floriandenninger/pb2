package com.google.android.apps.youtube.embeddedplayer.service;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.android.apps.youtube.embeddedplayer.service.EmbedsBackgroundTaskWorker;
import defpackage.abd;
import defpackage.aci;
import defpackage.aeu;
import defpackage.amkq;
import defpackage.anaf;
import defpackage.anhy;
import defpackage.yjk;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class EmbedsBackgroundTaskWorker extends ListenableWorker {
    public static final String f = "com.google.android.apps.youtube.embeddedplayer.service.EmbedsBackgroundTaskWorker";
    public boolean g;
    public String h;
    public String i;
    public String j;
    public String k;
    public Set l;
    public Bundle m;

    public EmbedsBackgroundTaskWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.ListenableWorker
    public final anhy b() {
        if (this.b.d >= 2) {
            return anaf.O(abd.f());
        }
        Set c = c();
        this.l = c;
        amkq.O(c.size() == 2, "Incorrect number of background task tags");
        Bundle l = yjk.l(a());
        this.m = l;
        if (l == null) {
            return anaf.O(abd.f());
        }
        String string = l.getString("package_name");
        String string2 = this.m.getString("version_name");
        String string3 = this.m.getString("developer_key");
        String string4 = this.m.getString("client_library_version_name");
        boolean containsKey = this.m.containsKey("is_internal_application_with_sign_in");
        if (string == null || string2 == null || string3 == null || string4 == null || !containsKey) {
            return anaf.O(abd.f());
        }
        this.h = string;
        this.i = string2;
        this.j = string3;
        this.k = string4;
        this.g = this.m.getBoolean("is_internal_application_with_sign_in");
        return aci.c(new aeu() { // from class: oup
            @Override // defpackage.aeu
            public final Object a(aes aesVar) {
                EmbedsBackgroundTaskWorker embedsBackgroundTaskWorker = EmbedsBackgroundTaskWorker.this;
                for (String str : embedsBackgroundTaskWorker.l) {
                    if (!amkq.e(EmbedsBackgroundTaskWorker.f, str)) {
                        otb.n(new ous(aesVar, str, embedsBackgroundTaskWorker.m), new Handler(Looper.getMainLooper()), embedsBackgroundTaskWorker.a, embedsBackgroundTaskWorker.j, embedsBackgroundTaskWorker.h, embedsBackgroundTaskWorker.i, embedsBackgroundTaskWorker.k, embedsBackgroundTaskWorker.g, 1);
                    }
                }
                return "Environment creation operation";
            }
        });
    }
}
