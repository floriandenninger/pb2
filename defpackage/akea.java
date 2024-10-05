package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akea implements akeb {
    public acsx a;
    private final byte[] b;
    private aods c;
    private final String d;
    private aksl e;

    public akea(byte[] bArr, String str) {
        this.b = bArr;
        new HashMap();
        this.d = str;
    }

    public akea(byte[] bArr, String str, byte[] bArr2) {
        this.b = bArr;
        this.d = str;
    }

    @Override // defpackage.akdg
    public final void a(aksl akslVar) {
        this.e = akslVar;
    }

    @Override // defpackage.akeb
    public final int b() {
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013a  */
    @Override // defpackage.akeb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.akdy d() {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akea.d():akdy");
    }

    @Override // defpackage.akeb
    public final String e() {
        return this.d;
    }

    @Override // defpackage.akeb
    public final byte[] f() {
        byte[] bArr = this.b;
        if (bArr != null) {
            return bArr;
        }
        aods aodsVar = this.c;
        if (aodsVar != null) {
            return aodsVar.toByteArray();
        }
        return null;
    }

    @Override // defpackage.akdl
    public final void j(acsx acsxVar) {
        this.a = acsxVar;
    }

    @Override // defpackage.akdl
    public final acsx ob() {
        return this.a;
    }
}
