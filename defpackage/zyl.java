package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zyl implements alai {
    private final Context a;
    private final akzk b;
    private final aadw c;
    private final axze d;

    public zyl(Context context, aadw aadwVar, akzk akzkVar, axze axzeVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = context;
        aadwVar.getClass();
        this.c = aadwVar;
        this.b = akzkVar;
        this.d = axzeVar;
    }

    @Override // defpackage.alai
    public final String a() {
        return "goog-edited-video";
    }

    @Override // defpackage.alai
    public final /* bridge */ /* synthetic */ alaf b(int i, Uri uri, alae alaeVar) {
        return new zyk(i, uri, this.a, this.c, this.d, alaeVar, this.b, null, null, null);
    }
}
