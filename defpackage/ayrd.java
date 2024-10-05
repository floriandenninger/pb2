package defpackage;

import java.io.PrintStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayrd extends ayrc {
    private final PrintStream a;

    public ayrd(PrintStream printStream) {
        this.a = printStream;
    }

    @Override // defpackage.ayrc
    public final void a(Object obj) {
        this.a.println(obj);
    }
}
