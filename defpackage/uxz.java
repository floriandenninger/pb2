package defpackage;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uxz implements Externalizable {
    private static final long serialVersionUID = 1;
    private boolean d;
    private boolean e;
    public String a = "";
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    private String f = "";

    public final int a() {
        return this.b.size();
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.d = true;
            this.a = readUTF;
        }
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            this.b.add(Integer.valueOf(objectInput.readInt()));
        }
        int readInt2 = objectInput.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            this.c.add(Integer.valueOf(objectInput.readInt()));
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.e = true;
            this.f = readUTF2;
        }
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.d);
        if (this.d) {
            objectOutput.writeUTF(this.a);
        }
        int a = a();
        objectOutput.writeInt(a);
        for (int i = 0; i < a; i++) {
            objectOutput.writeInt(((Integer) this.b.get(i)).intValue());
        }
        int size = this.c.size();
        objectOutput.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            objectOutput.writeInt(((Integer) this.c.get(i2)).intValue());
        }
        objectOutput.writeBoolean(this.e);
        if (this.e) {
            objectOutput.writeUTF(this.f);
        }
    }
}
