package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agtc implements ate {
    public static final agtc a = new agtc();
    public static final afhf b = new afhf() { // from class: agtb
        @Override // defpackage.atd
        public final ate a() {
            return agtc.a;
        }

        @Override // defpackage.afhf
        public final /* synthetic */ ate b(afhi afhiVar) {
            return aedn.k(this);
        }

        @Override // defpackage.afhf
        public final /* synthetic */ ate c(afhi afhiVar, String str, ammv ammvVar) {
            throw null;
        }
    };

    private agtc() {
    }

    @Override // defpackage.ate
    public final /* synthetic */ Map a() {
        return Collections.emptyMap();
    }

    @Override // defpackage.ate
    public final void b(att attVar) {
    }

    @Override // defpackage.atc
    public final int g(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ate
    public final long h(ath athVar) {
        throw new IOException("Empty DataSource");
    }

    @Override // defpackage.ate
    public final Uri i() {
        return Uri.EMPTY;
    }

    @Override // defpackage.ate
    public final void j() {
    }
}
