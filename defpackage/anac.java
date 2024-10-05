package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anac implements amzs {
    private final Level a;

    public anac() {
        this(Level.ALL);
    }

    public anac(Level level) {
        this.a = level;
    }

    @Override // defpackage.amzs
    public final amyp a(String str) {
        return new anae(str, this.a);
    }
}
