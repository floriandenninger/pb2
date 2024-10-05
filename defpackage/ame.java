package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ame {
    public final char[] a;
    public final amd b;
    public final Typeface c;
    public final bvj d;

    ame() {
        this.c = null;
        this.d = null;
        this.b = new amd(1024);
        this.a = new char[0];
    }

    public ame(Typeface typeface, bvj bvjVar) {
        this.c = typeface;
        this.d = bvjVar;
        this.b = new amd(1024);
        int e = bvjVar.e();
        this.a = new char[e + e];
        int e2 = bvjVar.e();
        for (int i = 0; i < e2; i++) {
            als alsVar = new als(this, i);
            Character.toChars(alsVar.c(), this.a, i + i);
            gn.c(alsVar.b() > 0, "invalid metadata codepoint length");
            this.b.b(alsVar, 0, alsVar.b() - 1);
        }
    }
}
