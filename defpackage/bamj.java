package defpackage;

import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class bamj extends bami {
    protected final int d;

    /* JADX INFO: Access modifiers changed from: protected */
    public bamj(bajj bajjVar, int i, boolean z, int i2) {
        super(bajjVar, i, z);
        this.d = i2;
    }

    @Override // defpackage.bamw
    public final int b() {
        return this.b;
    }

    @Override // defpackage.bamw
    public final void d(StringBuffer stringBuffer, long j, bajf bajfVar, int i, bajn bajnVar, Locale locale) {
        try {
            bamx.d(stringBuffer, this.a.a(bajfVar).a(j), this.d);
        } catch (RuntimeException unused) {
            bamr.c(stringBuffer, this.d);
        }
    }
}
