package defpackage;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uxw implements Externalizable {
    private static final long serialVersionUID = 1;
    private boolean e;
    private boolean g;
    public String a = "";
    public String b = "";
    public final List c = new ArrayList();
    public String d = "";
    private boolean f = false;
    private String h = "";

    public final int a() {
        return this.c.size();
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        this.a = objectInput.readUTF();
        this.b = objectInput.readUTF();
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            this.c.add(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.e = true;
            this.d = readUTF;
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.g = true;
            this.h = readUTF2;
        }
        this.f = objectInput.readBoolean();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.a);
        objectOutput.writeUTF(this.b);
        int a = a();
        objectOutput.writeInt(a);
        for (int i = 0; i < a; i++) {
            objectOutput.writeUTF((String) this.c.get(i));
        }
        objectOutput.writeBoolean(this.e);
        if (this.e) {
            objectOutput.writeUTF(this.d);
        }
        objectOutput.writeBoolean(this.g);
        if (this.g) {
            objectOutput.writeUTF(this.h);
        }
        objectOutput.writeBoolean(this.f);
    }
}
