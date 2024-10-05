package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bald implements Serializable {
    private static final long serialVersionUID = -6212696554273812441L;
    private transient bajn a;

    public bald(bajn bajnVar) {
        this.a = bajnVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.a = (bajn) objectInputStream.readObject();
    }

    private Object readResolve() {
        return bale.P(this.a);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.a);
    }
}
