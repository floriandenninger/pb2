package defpackage;

import android.net.Uri;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afug {
    public final String a;
    public Uri b;
    public byte[] c;
    public boolean d;
    public long e;
    public Map f;
    public afsx g;
    public String h;
    public final afuf i;
    public afve j;
    public final int k;

    public afug(int i, String str) {
        this.c = null;
        this.d = false;
        this.i = afuf.a;
        this.j = afve.b;
        this.k = i;
        this.a = str;
    }

    public final void a(afve afveVar) {
        if (afveVar == null) {
            afveVar = afve.b;
        }
        this.j = afveVar;
    }

    public final void b(Uri uri) {
        uri.getClass();
        this.b = uri;
    }

    public afug(byte[] bArr, String str) {
        this.c = null;
        this.d = false;
        this.i = afuf.a;
        this.j = afve.b;
        this.k = 2;
        this.c = bArr;
        this.a = str;
    }
}
