package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pxt {
    private static pxt b;
    public final pun a = new pun(new ArrayList());

    private pxt() {
        new ArrayList();
    }

    public static pxt a() {
        pxt pxtVar;
        synchronized (pxt.class) {
            if (b == null) {
                b = new pxt();
            }
            pxtVar = b;
        }
        return pxtVar;
    }
}
