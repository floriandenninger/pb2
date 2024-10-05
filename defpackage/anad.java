package defpackage;

import java.util.logging.Level;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class anad extends amzq {
    private final Level a;

    public anad(String str, Level level) {
        super(str);
        this.a = level;
    }

    @Override // defpackage.amyp
    public final void c(amyo amyoVar) {
        String str = (String) amyoVar.j().d(amyj.a);
        if (str == null) {
            str = a();
        }
        if (str == null) {
            str = amyoVar.f().b();
            int indexOf = str.indexOf(36, str.lastIndexOf(46));
            if (indexOf >= 0) {
                str = str.substring(0, indexOf);
            }
        }
        anae.e(amyoVar, amkq.ac(str), this.a);
    }

    @Override // defpackage.amyp
    public final boolean d(Level level) {
        return true;
    }
}
