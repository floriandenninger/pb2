package defpackage;

import j$.util.Optional;
import j$.util.function.Function;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afwl implements ysn {
    public final azrw a;
    private final apdq b;
    private final ysn c;
    private final Optional d;

    public afwl(azrw azrwVar, apdq apdqVar, Optional optional, ysn ysnVar) {
        this.a = azrwVar;
        this.b = apdqVar;
        this.c = ysnVar;
        this.d = optional;
    }

    @Override // defpackage.ysn
    public final /* synthetic */ ysl a(cnd cndVar, ysm ysmVar, String str) {
        return yny.d(this, cndVar, ysmVar, str);
    }

    @Override // defpackage.ysn
    public final ysl b(cnd cndVar, ysm ysmVar, final Executor executor, aace aaceVar, String str) {
        final ysl b = this.c.b(cndVar, ysmVar, executor, aaceVar, str);
        return this.b.l ? (ysl) this.d.map(new Function() { // from class: afwk
            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return Function.CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                afwl afwlVar = afwl.this;
                ysl yslVar = b;
                Executor executor2 = executor;
                afvy afvyVar = (afvy) obj;
                anic anicVar = (anic) ((ajoy) afwlVar.a.get()).a.get();
                anicVar.getClass();
                afvyVar.getClass();
                yslVar.getClass();
                executor2.getClass();
                return new afwt(anicVar, afvyVar, yslVar, executor2);
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return Function.CC.$default$compose(this, function);
            }
        }).orElse(b) : b;
    }
}
