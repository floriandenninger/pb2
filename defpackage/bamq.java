package defpackage;

import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bamq extends bami {
    public bamq(bajj bajjVar, int i, boolean z) {
        super(bajjVar, i, z);
    }

    @Override // defpackage.bamw
    public final int b() {
        return this.b;
    }

    @Override // defpackage.bamw
    public final void d(StringBuffer stringBuffer, long j, bajf bajfVar, int i, bajn bajnVar, Locale locale) {
        try {
            bamx.e(stringBuffer, this.a.a(bajfVar).a(j));
        } catch (RuntimeException unused) {
            stringBuffer.append((char) 65533);
        }
    }
}
