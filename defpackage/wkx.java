package defpackage;

import com.google.android.libraries.youtube.mdx.model.ScreenId;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class wkx implements Consumer {
    public final /* synthetic */ aone a;
    private final /* synthetic */ int b;

    public /* synthetic */ wkx(aone aoneVar, int i) {
        this.b = i;
        this.a = aoneVar;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.b;
        if (i != 0) {
            return i != 1 ? Consumer.CC.$default$andThen(this, consumer) : Consumer.CC.$default$andThen(this, consumer);
        }
        return Consumer.CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.b;
        if (i == 0) {
            aone aoneVar = this.a;
            float floatValue = ((Float) obj).floatValue();
            aoneVar.copyOnWrite();
            arxd arxdVar = (arxd) aoneVar.instance;
            arxd arxdVar2 = arxd.a;
            arxdVar.b |= 2;
            arxdVar.d = floatValue;
            return;
        }
        if (i == 1) {
            aone aoneVar2 = this.a;
            ases asesVar = (ases) obj;
            aoneVar2.copyOnWrite();
            aseu aseuVar = (aseu) aoneVar2.instance;
            aseu aseuVar2 = aseu.a;
            asesVar.getClass();
            aseuVar.d = asesVar;
            aseuVar.b |= 2;
            return;
        }
        aone aoneVar3 = this.a;
        ScreenId b = ((adgb) obj).b();
        if (b != null) {
            String str = b.c;
            aoneVar3.copyOnWrite();
            atbe atbeVar = (atbe) aoneVar3.instance;
            atbe atbeVar2 = atbe.a;
            atbeVar.b |= 4;
            atbeVar.e = str;
        }
    }
}
