package defpackage;

import com.google.compression.brotli.dec.Dictionary;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anjc {
    static final boolean a;

    static {
        boolean z;
        try {
            Class.forName(String.valueOf(Dictionary.class.getPackage().getName()).concat(".DictionaryData"));
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        a = z;
    }
}
