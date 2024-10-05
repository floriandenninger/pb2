package defpackage;

import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gh {
    public final Signature a;
    public final Cipher b;
    public final Mac c;

    public gh(Signature signature) {
        this.a = signature;
        this.b = null;
        this.c = null;
    }

    public gh(Cipher cipher) {
        this.b = cipher;
        this.a = null;
        this.c = null;
    }

    public gh(Mac mac) {
        this.c = mac;
        this.b = null;
        this.a = null;
    }
}
