package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajsk extends gp {
    final /* synthetic */ alr a;

    public ajsk(alr alrVar) {
        this.a = alrVar;
    }

    @Override // defpackage.gp
    public final void h() {
        alr alrVar = this.a;
        alrVar.a.writeLock().lock();
        try {
            alrVar.b.remove(this);
        } finally {
            alrVar.a.writeLock().unlock();
        }
    }

    @Override // defpackage.gp
    public final void i() {
        Log.e("UnicodeEmojiUtils", "FontRequest for emoji failed.");
    }
}
