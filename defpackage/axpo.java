package defpackage;

import android.os.Bundle;
import com.google.cardboard.sdk.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axpo extends ant {
    final /* synthetic */ efn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axpo(bue bueVar, Bundle bundle, efn efnVar) {
        super(bueVar, bundle);
        this.a = efnVar;
    }

    @Override // defpackage.ant
    protected final apm d(Class cls, aph aphVar) {
        efn efnVar = this.a;
        efnVar.b = aphVar;
        ayaw.j(efnVar.b, aph.class);
        azrw azrwVar = (azrw) ((axpp) axfq.n(new eic(efnVar.a, efnVar.b), axpp.class)).a().get(cls.getName());
        if (azrwVar == null) {
            String name = cls.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + R.styleable.AppCompatTheme_windowMinWidthMajor);
            sb.append("Expected the @HiltViewModel-annotated class '");
            sb.append(name);
            sb.append("' to be available in the multi-binding of @HiltViewModelMap but none was found.");
            throw new IllegalStateException(sb.toString());
        }
        return (apm) azrwVar.get();
    }
}
