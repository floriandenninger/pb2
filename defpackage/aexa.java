package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aexa extends aewz {
    final /* synthetic */ aexb a;

    public aexa(aexb aexbVar) {
        this.a = aexbVar;
    }

    @Override // defpackage.aewz, defpackage.bjc
    public final void v(long j, int i, int i2, int i3, bjb bjbVar) {
        synchronized (this.a) {
            try {
                this.a.m(j);
                super.v(j, i, i2, i3, bjbVar);
            } catch (aesf | aewp | aewq e) {
                this.a.n(e);
            }
        }
    }
}
