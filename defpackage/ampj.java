package defpackage;

import j$.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ampj implements BiConsumer {
    private final /* synthetic */ int d;
    public static final /* synthetic */ ampj c = new ampj(2);
    public static final /* synthetic */ ampj b = new ampj(1);
    public static final /* synthetic */ ampj a = new ampj(0);

    private /* synthetic */ ampj(int i) {
        this.d = i;
    }

    @Override // j$.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i = this.d;
        if (i == 0) {
            ((vak) obj).v((amvf) obj2);
        } else if (i != 1) {
            ((amsv) obj).c(obj2);
        } else {
            ((amrp) obj).h(obj2);
        }
    }

    @Override // j$.util.function.BiConsumer
    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        int i = this.d;
        if (i != 0) {
            return i != 1 ? BiConsumer.CC.$default$andThen(this, biConsumer) : BiConsumer.CC.$default$andThen(this, biConsumer);
        }
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
