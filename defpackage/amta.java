package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class amta extends amsm implements amup {
    private static final long serialVersionUID = 0;
    public final transient amsx d;

    public amta(amrz amrzVar, int i) {
        super(amrzVar, i);
        this.d = a(null);
    }

    private static amsx a(Comparator comparator) {
        if (comparator == null) {
            return amvs.a;
        }
        return amtd.F(comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        amsv amtbVar;
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            StringBuilder sb = new StringBuilder(29);
            sb.append("Invalid key count ");
            sb.append(readInt);
            throw new InvalidObjectException(sb.toString());
        }
        amrw h = amrz.h();
        int i = 0;
        for (int i2 = 0; i2 < readInt; i2++) {
            Object readObject = objectInputStream.readObject();
            int readInt2 = objectInputStream.readInt();
            if (readInt2 > 0) {
                if (comparator == null) {
                    amtbVar = new amsv();
                } else {
                    amtbVar = new amtb(comparator);
                }
                for (int i3 = 0; i3 < readInt2; i3++) {
                    amtbVar.c(objectInputStream.readObject());
                }
                amsx g = amtbVar.g();
                if (g.size() == readInt2) {
                    h.g(readObject, g);
                    i += readInt2;
                } else {
                    String valueOf = String.valueOf(readObject);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 40);
                    sb2.append("Duplicate key-value pairs exist for key ");
                    sb2.append(valueOf);
                    throw new InvalidObjectException(sb2.toString());
                }
            } else {
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Invalid value count ");
                sb3.append(readInt2);
                throw new InvalidObjectException(sb3.toString());
            }
        }
        try {
            amsk.a.b(this, h.c());
            amsk.b.a(this, i);
            amsz.a.b(this, a(comparator));
        } catch (IllegalArgumentException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        amsx amsxVar = this.d;
        objectOutputStream.writeObject(amsxVar instanceof amtd ? ((amtd) amsxVar).a : null);
        amkq.ax(this, objectOutputStream);
    }
}
