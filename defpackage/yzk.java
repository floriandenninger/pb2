package defpackage;

import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class yzk implements Consumer {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public /* synthetic */ yzk(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return this.b != 0 ? Consumer.CC.$default$andThen(this, consumer) : Consumer.CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        if (this.b == 0) {
            String str = this.a;
            int i = yzm.g;
            ((smz) obj).a(str, -1);
            return;
        }
        String str2 = this.a;
        smz smzVar = (smz) obj;
        int i2 = yzm.g;
        if (!str2.equals(smzVar.a) || smzVar.b.e()) {
            return;
        }
        smzVar.b.a();
    }
}
