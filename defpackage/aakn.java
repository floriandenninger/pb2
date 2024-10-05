package defpackage;

import android.util.Base64;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aakn {
    public final aahv a;
    public final azrw b;

    public aakn(azrw azrwVar, aahv aahvVar) {
        this.b = azrwVar;
        this.a = aahvVar;
    }

    public static byte[] a(aomf aomfVar) {
        aomk l = aomfVar.l();
        try {
            if (aoqp.b(l.n()) != 2) {
                String valueOf = String.valueOf(Base64.encodeToString(aomfVar.I(), 10));
                throw new IllegalStateException(valueOf.length() != 0 ? "Any field within EntityMutationPayload must have WIRETYPE_LENGTH_DELIMITED tag. Base64 payload bytes: ".concat(valueOf) : new String("Any field within EntityMutationPayload must have WIRETYPE_LENGTH_DELIMITED tag. Base64 payload bytes: "));
            }
            byte[] H = l.H();
            amkq.O(l.E(), "There can be only one field in EntityMutationPayload");
            return H;
        } catch (IOException unused) {
            return null;
        }
    }
}
