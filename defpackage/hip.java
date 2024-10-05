package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hip {
    final int a;
    final ArrayList b = new ArrayList();
    hio c;

    public hip(int i) {
        this.a = i;
    }

    public final int a(int i) {
        this.c = null;
        if (i > this.a) {
            zga.b("Attempted StereoChannelMapper track add with track with more than 2 channels");
            return -1;
        }
        this.b.add(Integer.valueOf(i));
        return this.b.size() - 1;
    }
}
