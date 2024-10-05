package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awis extends whu {
    private final aone a;

    private awis() {
        super(null);
        awiw awiwVar = awiw.a;
        throw null;
    }

    public awis(aone aoneVar) {
        super(null);
        this.a = aoneVar;
    }

    @Override // defpackage.whu
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final awiu a(aakv aakvVar) {
        return new awiu((awiw) this.a.build(), aakvVar);
    }

    public final void c(awiv... awivVarArr) {
        for (int i = 0; i <= 0; i++) {
            this.a.ba(awivVarArr[i]);
        }
    }

    public final void d(awiv... awivVarArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(awivVarArr));
        List<awiv> unmodifiableList = Collections.unmodifiableList(((awiw) this.a.instance).e);
        aone aoneVar = this.a;
        aoneVar.copyOnWrite();
        ((awiw) aoneVar.instance).e = awiw.emptyProtobufList();
        for (awiv awivVar : unmodifiableList) {
            if (!linkedHashSet.contains(awivVar)) {
                this.a.ba(awivVar);
            }
        }
    }
}
