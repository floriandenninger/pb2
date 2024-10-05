package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaft extends aafb {
    public final azrw a;
    public final azrw b;
    private final anib c;

    public aaft(tjx tjxVar, anib anibVar, azrw azrwVar, azrw azrwVar2) {
        super(tjxVar, azrwVar2);
        this.c = anibVar;
        this.a = azrwVar;
        this.b = azrwVar2;
    }

    private final anhy h(final String str, final Callable callable) {
        if (!a().containsKey(str)) {
            ((aafr) this.b.get()).b(aqib.DATA_PUSH_CLIENT_EVENT_TYPE_FILE_NOT_FOUND, b(), str);
            String valueOf = String.valueOf(str);
            return anaf.N(new IOException(valueOf.length() != 0 ? "File not found: ".concat(valueOf) : new String("File not found: ")));
        }
        final String str2 = (String) a().get(str);
        return this.c.submit(new Callable() { // from class: aafs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                aaft aaftVar = aaft.this;
                String str3 = str2;
                Callable callable2 = callable;
                String str4 = str;
                try {
                    return ((vcw) aaftVar.a.get()).c(Uri.parse(str3), (vcv) callable2.call());
                } catch (IOException e) {
                    ((aafr) aaftVar.b.get()).b(aqib.DATA_PUSH_CLIENT_EVENT_TYPE_FILE_READ_BYTES_FAILED, aaftVar.b(), str4);
                    throw e;
                }
            }
        });
    }

    @Override // defpackage.aafx
    public final anhy f(String str) {
        return h(str, gip.u);
    }

    @Override // defpackage.aafx
    public final anhy g() {
        return h("tf-lite-bandwidth-model.tflite", gip.t);
    }
}
