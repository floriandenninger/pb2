package org.chromium.base.task;

import defpackage.ayeq;
import defpackage.bael;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class PostTask {
    private static volatile boolean c;
    private static AtomicReferenceArray e;
    private static final Object a = new Object();
    private static List b = new ArrayList();
    private static final Executor d = new bael();

    static {
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(5);
        atomicReferenceArray.set(0, new ayeq(null));
        e = atomicReferenceArray;
    }

    private static void onNativeSchedulerReady() {
        List list;
        c = true;
        synchronized (a) {
            list = b;
            b = null;
        }
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw null;
        }
    }

    private static void onNativeSchedulerShutdownForTesting() {
        synchronized (a) {
            b = new ArrayList();
        }
        c = false;
        e.set(0, new ayeq(null));
        for (int i = 1; i < e.length(); i++) {
            e.set(i, null);
        }
    }
}
