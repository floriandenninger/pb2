package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cun implements ddq {
    private final /* synthetic */ int a;

    public cun(int i) {
        this.a = i;
    }

    public static final cuo b() {
        try {
            return new cuo(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.ddq
    public final /* synthetic */ Object a() {
        int i = this.a;
        if (i != 0) {
            return i != 1 ? new ArrayList() : new ctc();
        }
        return b();
    }
}
