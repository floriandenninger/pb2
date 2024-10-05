package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alab implements alai {
    private final Context a;
    private final akzk b;
    private final /* synthetic */ int c;
    private final axze d;

    public alab(Context context, akzk akzkVar, axze axzeVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = i;
        this.a = context;
        this.b = akzkVar;
        this.d = axzeVar;
    }

    @Override // defpackage.alai
    public final String a() {
        return this.c != 0 ? "content" : "file";
    }

    @Override // defpackage.alai
    public final /* synthetic */ alaf b(int i, Uri uri, alae alaeVar) {
        return this.c != 0 ? akzz.a(i, uri, this.a, this.d) : akzz.a(i, uri, this.a, this.d);
    }
}
