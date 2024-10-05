package org.chromium.base;

import defpackage.ajfg;
import defpackage.badn;
import defpackage.baea;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ApplicationStatus {
    public static badn a;
    public static baea b;
    private static final Map c = DesugarCollections.synchronizedMap(new HashMap());

    private ApplicationStatus() {
    }

    public static void a(badn badnVar) {
        if (b == null) {
            b = new baea();
        }
        b.d(badnVar);
    }

    public static int getStateForApplication() {
        synchronized (c) {
        }
        return 0;
    }

    public static boolean hasVisibleActivities() {
        getStateForApplication();
        return false;
    }

    private static void registerThreadSafeNativeApplicationStateListener() {
        ThreadUtils.c(new ajfg(19));
    }
}
