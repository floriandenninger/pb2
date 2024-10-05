package defpackage;

import android.content.Context;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aafw extends aafb {
    private final Context a;
    private final anib b;
    private final azrw c;

    public aafw(Context context, tjx tjxVar, anib anibVar, azrw azrwVar) {
        super(tjxVar, azrwVar);
        this.a = context;
        this.b = anibVar;
        this.c = azrwVar;
    }

    private final anhy i(String str, Callable callable) {
        if (!a().containsKey(str)) {
            ((aafr) this.c.get()).b(aqib.DATA_PUSH_CLIENT_EVENT_TYPE_FILE_NOT_FOUND, b(), str);
            String valueOf = String.valueOf(str);
            return anaf.N(new IOException(valueOf.length() != 0 ? "File not found: ".concat(valueOf) : new String("File not found: ")));
        }
        return this.b.submit(callable);
    }

    @Override // defpackage.aafx
    public final anhy f(final String str) {
        return i(str, new Callable() { // from class: aafv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aafw.this.h(str);
            }
        });
    }

    @Override // defpackage.aafx
    public final anhy g() {
        return i("tf-lite-bandwidth-model.tflite", new Callable() { // from class: aafu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] h = aafw.this.h("tf-lite-bandwidth-model.tflite");
                return ByteBuffer.allocateDirect(h.length).put(h);
            }
        });
    }

    public final byte[] h(String str) {
        return anbt.c(this.a.getAssets().open((String) a().get(str)));
    }
}
