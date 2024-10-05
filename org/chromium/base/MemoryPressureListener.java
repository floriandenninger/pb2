package org.chromium.base;

import defpackage.bady;
import defpackage.baea;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class MemoryPressureListener {
    private static baea a;

    private static void addNativeCallback() {
        bady badyVar = new Object() { // from class: bady
        };
        if (a == null) {
            a = new baea();
        }
        a.d(badyVar);
    }
}
