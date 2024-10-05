package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class qmq implements Executor {
    private final /* synthetic */ int o;
    public static final /* synthetic */ qmq n = new qmq(15);
    public static final /* synthetic */ qmq m = new qmq(14);
    public static final /* synthetic */ qmq l = new qmq(13);
    public static final /* synthetic */ qmq k = new qmq(12);
    public static final /* synthetic */ qmq j = new qmq(11);
    public static final /* synthetic */ qmq i = new qmq(10);
    public static final /* synthetic */ qmq h = new qmq(9);
    public static final /* synthetic */ qmq g = new qmq(8);
    public static final /* synthetic */ qmq f = new qmq(7);
    public static final /* synthetic */ qmq e = new qmq(6);
    public static final /* synthetic */ qmq d = new qmq(5);
    public static final /* synthetic */ qmq c = new qmq(3);
    public static final /* synthetic */ qmq b = new qmq(2);
    public static final /* synthetic */ qmq a = new qmq(0);

    public /* synthetic */ qmq(int i2) {
        this.o = i2;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.o) {
            case 0:
                runnable.run();
                return;
            case 1:
                ((aas) aar.B().b).b.execute(runnable);
                return;
            case 2:
                runnable.run();
                return;
            case 3:
                runnable.run();
                return;
            case 4:
                runnable.run();
                return;
            case 5:
                uqq.l(runnable);
                return;
            case 6:
                ynm.q(runnable);
                return;
            case 7:
                runnable.run();
                return;
            case 8:
                runnable.run();
                return;
            case 9:
                runnable.run();
                return;
            case 10:
                runnable.run();
                return;
            case 11:
                runnable.run();
                return;
            case 12:
                runnable.run();
                return;
            case 13:
                runnable.run();
                return;
            case 14:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
