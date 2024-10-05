package defpackage;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wwj {
    final String a;
    final boolean b;
    final List c;
    final String d;
    final xev e;

    public wwj(String str, aign aignVar, List list, String str2, xev xevVar) {
        this.a = str;
        boolean z = true;
        if (aignVar != aign.VIDEO_PLAYING && aignVar != aign.ENDED) {
            z = false;
        }
        this.b = z;
        this.c = list;
        this.d = str2;
        this.e = xevVar;
    }
}
