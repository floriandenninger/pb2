package defpackage;

import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayre extends ayrc {
    private final PrintWriter a;

    public ayre(PrintWriter printWriter) {
        this.a = printWriter;
    }

    @Override // defpackage.ayrc
    public final void a(Object obj) {
        this.a.println(obj);
    }
}
