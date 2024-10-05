package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bajv extends balj {
    private static final long serialVersionUID = -4481126543819298617L;
    public bajw a;
    public bajh b;

    public bajv(bajw bajwVar, bajh bajhVar) {
        this.a = bajwVar;
        this.b = bajhVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.a = (bajw) objectInputStream.readObject();
        this.b = ((bajj) objectInputStream.readObject()).a(this.a.b);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.a);
        objectOutputStream.writeObject(this.b.o());
    }

    @Override // defpackage.balj
    protected final long a() {
        return this.a.a;
    }

    @Override // defpackage.balj
    protected final bajf b() {
        return this.a.b;
    }

    @Override // defpackage.balj
    public final bajh c() {
        return this.b;
    }
}
