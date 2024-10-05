package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abbp extends aaru {
    protected final String a;
    private final Uri b;

    public abbp(ajoy ajoyVar, afsx afsxVar, Uri uri, String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("navigation/resolve_url", ajoyVar, afsxVar, null, null, null);
        k();
        uri.getClass();
        this.b = uri;
        this.a = str;
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arvz.a.createBuilder();
        String uri = this.b.toString();
        createBuilder.copyOnWrite();
        arvz arvzVar = (arvz) createBuilder.instance;
        uri.getClass();
        arvzVar.b |= 2;
        arvzVar.d = uri;
        String str = this.a;
        if (str != null) {
            createBuilder.copyOnWrite();
            arvz arvzVar2 = (arvz) createBuilder.instance;
            arvzVar2.b |= 4;
            arvzVar2.e = str;
        }
        return createBuilder;
    }

    @Override // defpackage.aaqh
    public final String b() {
        afpi g = g();
        g.c("uri", this.b.toString());
        return g.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        zhq.m(this.b.toString());
    }
}
