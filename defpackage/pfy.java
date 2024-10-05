package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class pfy extends IOException {
    public final int a;

    public pfy(IOException iOException, int i) {
        super(iOException);
        this.a = i;
    }

    public pfy(String str) {
        super(str);
        this.a = 1;
    }

    public pfy(String str, IOException iOException) {
        super(str, iOException);
        this.a = 1;
    }
}
