package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ppu extends ata implements ppx {
    private final String a;

    /* JADX INFO: Access modifiers changed from: protected */
    public ppu(String str) {
        super(new ppz[2], new pqa[2]);
        this.a = str;
        o(1024);
    }

    @Override // defpackage.ast
    public final String c() {
        return this.a;
    }

    @Override // defpackage.ata
    protected final /* bridge */ /* synthetic */ asu g(Throwable th) {
        return new ppy("Unexpected decode error", th);
    }

    @Override // defpackage.ata
    protected final /* bridge */ /* synthetic */ asu h(asw aswVar, asy asyVar, boolean z) {
        ppz ppzVar = (ppz) aswVar;
        pqa pqaVar = (pqa) asyVar;
        try {
            ByteBuffer byteBuffer = ppzVar.b;
            pse.c(byteBuffer);
            pqaVar.e(ppzVar.d, q(byteBuffer.array(), byteBuffer.limit(), z), ppzVar.f);
            pqaVar.clearFlag(CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
            return null;
        } catch (ppy e) {
            return e;
        }
    }

    @Override // defpackage.ata
    protected final /* bridge */ /* synthetic */ asw i() {
        return new ppz();
    }

    @Override // defpackage.ata
    protected final /* bridge */ /* synthetic */ asy k() {
        return new ppv(new asx() { // from class: ppt
            @Override // defpackage.asx
            public final void a(asy asyVar) {
                ppu.this.n((pqa) asyVar);
            }
        });
    }

    protected abstract ppw q(byte[] bArr, int i, boolean z);

    @Override // defpackage.ppx
    public final void w(long j) {
    }
}
