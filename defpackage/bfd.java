package defpackage;

import android.net.Uri;
import android.util.Base64;
import j$.net.URLDecoder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bfd extends atb {
    private ath a;
    private byte[] b;
    private int c;
    private int d;

    public bfd() {
        super(false);
    }

    @Override // defpackage.atc
    public final int g(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.d;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(pts.C(this.b), this.c, bArr, i, min);
        this.c += min;
        this.d -= min;
        c(min);
        return min;
    }

    @Override // defpackage.ate
    public final long h(ath athVar) {
        e(athVar);
        this.a = athVar;
        Uri uri = athVar.a;
        String scheme = uri.getScheme();
        boolean equals = "data".equals(scheme);
        String valueOf = String.valueOf(scheme);
        pse.f(equals, valueOf.length() != 0 ? "Unsupported scheme: ".concat(valueOf) : new String("Unsupported scheme: "));
        String[] af = pts.af(uri.getSchemeSpecificPart(), ",");
        if (af.length != 2) {
            String valueOf2 = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 23);
            sb.append("Unexpected URI format: ");
            sb.append(valueOf2);
            throw pnr.b(sb.toString(), null);
        }
        String str = af[1];
        if (af[0].contains(";base64")) {
            try {
                this.b = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                String valueOf3 = String.valueOf(str);
                throw pnr.b(valueOf3.length() != 0 ? "Error while parsing Base64 encoded string: ".concat(valueOf3) : new String("Error while parsing Base64 encoded string: "), e);
            }
        } else {
            this.b = pts.Z(URLDecoder.decode(str, amme.a.name()));
        }
        long j = athVar.g;
        int length = this.b.length;
        if (j > length) {
            this.b = null;
            throw new atf(2008);
        }
        int i = (int) j;
        this.c = i;
        int i2 = length - i;
        this.d = i2;
        long j2 = athVar.h;
        if (j2 != -1) {
            this.d = (int) Math.min(i2, j2);
        }
        f(athVar);
        long j3 = athVar.h;
        return j3 != -1 ? j3 : this.d;
    }

    @Override // defpackage.ate
    public final Uri i() {
        ath athVar = this.a;
        if (athVar != null) {
            return athVar.a;
        }
        return null;
    }

    @Override // defpackage.ate
    public final void j() {
        if (this.b != null) {
            this.b = null;
            d();
        }
        this.a = null;
    }
}
