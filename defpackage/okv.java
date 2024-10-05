package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class okv extends oon implements axql {
    private volatile axps j;
    private final Object k = new Object();

    public okv() {
        addOnContextAvailableListener(new oku(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f() {
        throw null;
    }

    @Override // defpackage.zv, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.u(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.axql
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final axps lL() {
        if (this.j == null) {
            synchronized (this.k) {
                if (this.j == null) {
                    this.j = m();
                }
            }
        }
        return this.j;
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    protected axps m() {
        throw null;
    }
}
