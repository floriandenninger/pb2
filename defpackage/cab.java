package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cab extends btt {
    public cab() {
        super(7, 8);
    }

    @Override // defpackage.btt
    public final void a(buo buoVar) {
        buoVar.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
    }
}
