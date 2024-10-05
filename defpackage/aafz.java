package defpackage;

import android.os.Bundle;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aafz implements ylb {
    public final azrw a;
    private final azrw b;
    private final anib c;

    public aafz(azrw azrwVar, azrw azrwVar2, anib anibVar) {
        this.b = azrwVar;
        this.a = azrwVar2;
        this.c = anibVar;
    }

    @Override // defpackage.ylb
    public final int a(Bundle bundle) {
        final String string;
        if (!((Boolean) this.b.get()).booleanValue() || (string = bundle.getString("MDD_TASK_TAG_KEY")) == null) {
            return 1;
        }
        try {
            anaf.T(new anfy() { // from class: aafy
                @Override // defpackage.anfy
                public final anhy a() {
                    aafz aafzVar = aafz.this;
                    return ((tlk) aafzVar.a.get()).c(string);
                }
            }, this.c).get();
            return 0;
        } catch (InterruptedException | ExecutionException unused) {
            return 1;
        }
    }
}
