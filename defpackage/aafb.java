package defpackage;

import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Function;
import j$.util.stream.Collectors;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class aafb implements aafx {
    private final tjx a;
    private final amnv b;
    private final amnv c;

    public aafb(final tjx tjxVar, final azrw azrwVar) {
        tjxVar.getClass();
        this.a = tjxVar;
        this.b = amkq.x(new amnv() { // from class: aaex
            @Override // defpackage.amnv
            public final Object get() {
                return (amrz) Collection.EL.stream(tjx.this.h).collect(ampm.a(opb.m, opb.n));
            }
        });
        this.c = amkq.x(new amnv() { // from class: aaey
            @Override // defpackage.amnv
            public final Object get() {
                tjx tjxVar2 = tjx.this;
                try {
                    if ((tjxVar2.b & 256) != 0) {
                        aols aolsVar = tjxVar2.m;
                        if (aolsVar == null) {
                            aolsVar = aols.a;
                        }
                        awmn awmnVar = ((awmm) aonm.parseFrom(awmm.a, aolsVar.c, aomw.b())).b;
                        if (awmnVar == null) {
                            awmnVar = awmn.a;
                        }
                        return amru.o(awmnVar.b);
                    }
                    return amru.q();
                } catch (aoob unused) {
                    ((aafr) azrwVar.get()).a(aqib.DATA_PUSH_CLIENT_EVENT_TYPE_MANIFEST_INIT_FAILED, tjxVar2.c);
                    zga.b("Failed to initialize FileGroup manifest.");
                    return amru.q();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final amrz a() {
        return (amrz) this.b.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String b() {
        return this.a.c;
    }

    @Override // defpackage.aafx
    public final String c() {
        return this.a.c;
    }

    @Override // defpackage.aafx
    public final List d(final aonk aonkVar) {
        return (List) Collection.EL.stream((amru) this.c.get()).filter(new aafa(aonkVar, 1)).map(new Function() { // from class: aaez
            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return Function.CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                return ((awmp) obj).pX(aonk.this);
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return Function.CC.$default$compose(this, function);
            }
        }).collect(Collectors.toList());
    }

    @Override // defpackage.aafx
    public final boolean e(aonk aonkVar) {
        return Collection.EL.stream((amru) this.c.get()).anyMatch(new aafa(aonkVar, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aafb)) {
            return false;
        }
        tjx tjxVar = this.a;
        int i = tjxVar.f;
        tjx tjxVar2 = ((aafb) obj).a;
        return i == tjxVar2.f && Objects.equals(tjxVar.c, tjxVar2.c);
    }

    public final int hashCode() {
        tjx tjxVar = this.a;
        return Objects.hash(tjxVar.c, Integer.valueOf(tjxVar.f));
    }
}
