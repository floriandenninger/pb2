package com.google.android.apps.youtube.embeddedplayer.service.databus.dataadapter.service;

import com.google.android.apps.youtube.embeddedplayer.service.model.ErrorData;
import defpackage.ahbl;
import defpackage.aigr;
import defpackage.ypd;
import defpackage.ysy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class c implements ypd {
    public final ysy a;
    private final com.google.android.apps.youtube.embeddedplayer.service.databus.service.a b;

    public c(ysy ysyVar, com.google.android.apps.youtube.embeddedplayer.service.databus.service.a aVar) {
        this.a = ysyVar;
        this.b = aVar;
    }

    public final void a(int i) {
        this.b.a(new ErrorData(i));
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aigr.class};
        }
        if (i == 0) {
            int i2 = ((aigr) obj).i;
            switch (i2 - 1) {
                case 1:
                case 2:
                case 12:
                    a(0);
                    return null;
                case 3:
                case 6:
                case 8:
                case 9:
                case 10:
                    if (this.a.o()) {
                        a(9);
                        return null;
                    }
                    a(1);
                    return null;
                case 4:
                case 5:
                    a(7);
                    return null;
                case 7:
                case 11:
                default:
                    if (!ahbl.d(i2)) {
                        return null;
                    }
                    a(10);
                    return null;
            }
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
