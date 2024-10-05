package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ampf extends amof {
    private static final long serialVersionUID = 0;
    transient int c;

    private ampf() {
        super(ampx.f(12));
        amkq.t(3, "expectedValuesPerKey");
        this.c = 3;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = 3;
        int readInt = objectInputStream.readInt();
        n(ampx.e());
        for (int i = 0; i < readInt; i++) {
            List e = e(objectInputStream.readObject());
            int readInt2 = objectInputStream.readInt();
            for (int i2 = 0; i2 < readInt2; i2++) {
                e.add(objectInputStream.readObject());
            }
        }
    }

    public static ampf u() {
        return new ampf();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        amkq.ax(this, objectOutputStream);
    }

    @Override // defpackage.amof, defpackage.amov
    public final /* bridge */ /* synthetic */ Collection a() {
        return new ArrayList(this.c);
    }
}
