package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class amrv extends amsm implements amtt {
    private static final long serialVersionUID = 0;

    public amrv(amrz amrzVar, int i) {
        super(amrzVar, i);
    }

    public static amrv b(amup amupVar) {
        return ((amov) amupVar).b == 0 ? amqj.a : c(amupVar.r().entrySet());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static amrv c(Collection collection) {
        if (collection.isEmpty()) {
            return amqj.a;
        }
        amrw amrwVar = new amrw(collection.size());
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            amru o = amru.o((Collection) entry.getValue());
            if (!o.isEmpty()) {
                amrwVar.g(key, o);
                i += o.size();
            }
        }
        return new amrv(amrwVar.c(), i);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
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
                amrp f = amru.f();
                for (int i3 = 0; i3 < readInt2; i3++) {
                    f.h(objectInputStream.readObject());
                }
                h.g(readObject, f.g());
                i += readInt2;
            } else {
                StringBuilder sb2 = new StringBuilder(31);
                sb2.append("Invalid value count ");
                sb2.append(readInt2);
                throw new InvalidObjectException(sb2.toString());
            }
        }
        try {
            amsk.a.b(this, h.c());
            amsk.b.a(this, i);
        } catch (IllegalArgumentException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        amkq.ax(this, objectOutputStream);
    }

    public final amru a(Object obj) {
        amru amruVar = (amru) this.b.get(obj);
        return amruVar == null ? amru.q() : amruVar;
    }

    @Override // defpackage.amtt
    public final /* bridge */ /* synthetic */ List e(Object obj) {
        throw null;
    }

    @Override // defpackage.amtt
    @Deprecated
    public final /* bridge */ /* synthetic */ List f(Object obj) {
        throw new UnsupportedOperationException();
    }
}
