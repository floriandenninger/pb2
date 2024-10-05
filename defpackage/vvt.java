package defpackage;

import java.io.EOFException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class vvt extends vvk {
    protected int c;

    public vvt(vvn vvnVar) {
        super(vvnVar);
    }

    @Override // defpackage.vvk
    public void e(vvj vvjVar) {
        vvjVar.h(1L);
        int read = vvjVar.a.read();
        if (read >= 0) {
            vvjVar.i(1L);
            this.c = read;
            vvjVar.l(3);
            return;
        }
        throw new EOFException();
    }
}
