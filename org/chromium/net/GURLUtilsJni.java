package org.chromium.net;

import J.N;
import defpackage.badw;
import defpackage.baes;
import org.chromium.net.GURLUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class GURLUtilsJni implements GURLUtils.Natives {
    public static final badw TEST_HOOKS = new baes();
    private static GURLUtils.Natives testInstance;

    public static GURLUtils.Natives get() {
        return new GURLUtilsJni();
    }

    @Override // org.chromium.net.GURLUtils.Natives
    public String getOrigin(String str) {
        return N.MpCt7siL(str);
    }
}
