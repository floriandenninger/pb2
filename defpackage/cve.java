package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cve implements cpx {
    @Override // defpackage.cpx
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, cqn cqnVar) {
        try {
            ddc.e((ByteBuffer) obj, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
