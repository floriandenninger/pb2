package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aljw {
    private final Typeface a;
    private final aljs b;
    private boolean c;

    public aljw() {
    }

    public aljw(aljs aljsVar, Typeface typeface) {
        this.a = typeface;
        this.b = aljsVar;
    }

    public final void a() {
        this.c = true;
    }

    public final void b(Typeface typeface) {
        if (this.c) {
            return;
        }
        this.b.a(typeface);
    }

    public final void c() {
        b(this.a);
    }
}
