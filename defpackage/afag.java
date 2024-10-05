package defpackage;

import android.os.Build;
import android.os.Trace;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afag {
    private static final Random g = new Random();
    final afjf a;
    boolean b;
    boolean c;
    boolean d;
    final int e;
    int f;

    public afag(afjf afjfVar, int i) {
        this.a = afjfVar;
        this.e = i;
        if (Build.VERSION.SDK_INT >= 29) {
            int nextInt = g.nextInt();
            this.f = nextInt;
            Trace.beginAsyncSection("ParsingAudio", nextInt);
            Trace.beginAsyncSection("ParsingVideo", this.f);
        }
    }
}
