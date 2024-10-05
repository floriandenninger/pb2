package defpackage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ymm extends ymk {
    /* JADX INFO: Access modifiers changed from: protected */
    public ymm(File file) {
        super(file);
    }

    @Override // defpackage.ymk
    protected final /* bridge */ /* synthetic */ Object g(BufferedInputStream bufferedInputStream) {
        ObjectInputStream objectInputStream;
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                objectInputStream = new ObjectInputStream(bufferedInputStream);
            } catch (ClassNotFoundException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            Serializable serializable = (Serializable) objectInputStream.readObject();
            k(objectInputStream);
            return serializable;
        } catch (ClassNotFoundException e2) {
            e = e2;
            objectInputStream2 = objectInputStream;
            throw new IOException("Couldn't read object", e);
        } catch (Throwable th2) {
            th = th2;
            objectInputStream2 = objectInputStream;
            k(objectInputStream2);
            throw th;
        }
    }

    @Override // defpackage.ymk
    protected final /* bridge */ /* synthetic */ void i(Object obj, BufferedOutputStream bufferedOutputStream) {
        ObjectOutputStream objectOutputStream;
        try {
            objectOutputStream = new ObjectOutputStream(bufferedOutputStream);
            try {
                objectOutputStream.writeObject(obj);
                l(objectOutputStream);
            } catch (Throwable th) {
                th = th;
                l(objectOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream = null;
        }
    }
}
