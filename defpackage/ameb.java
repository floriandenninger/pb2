package defpackage;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ameb extends ant {
    final /* synthetic */ efm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ameb(bue bueVar, Bundle bundle, efm efmVar) {
        super(bueVar, bundle);
        this.a = efmVar;
    }

    @Override // defpackage.ant
    protected final apm d(Class cls, aph aphVar) {
        efm efmVar = this.a;
        efmVar.a = aphVar;
        ayaw.j(efmVar.a, aph.class);
        azrw azrwVar = (azrw) ((amec) axfq.n(new eib(), amec.class)).a().get(cls.getName());
        if (azrwVar == null) {
            String name = cls.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 130);
            sb.append("Expected the @AccountViewModel-annotated class '");
            sb.append(name);
            sb.append("' to be available in the multi-binding of @AccountViewModelMap but none was found.");
            throw new IllegalStateException(sb.toString());
        }
        return (apm) azrwVar.get();
    }
}
