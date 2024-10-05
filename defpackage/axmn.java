package defpackage;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axmn extends axml {
    private short a;
    private short b;
    private final List c = new LinkedList();
    private int d;
    private int e;
    private short f;

    @Override // defpackage.axml
    public final String a() {
        return "rash";
    }

    @Override // defpackage.axml
    public final ByteBuffer b() {
        short s = this.a;
        ByteBuffer allocate = ByteBuffer.allocate(s == 1 ? 13 : (s * 6) + 11);
        allocate.putShort(this.a);
        if (this.a == 1) {
            allocate.putShort(this.b);
        } else {
            for (axmm axmmVar : this.c) {
                allocate.putInt(axmmVar.a);
                allocate.putShort(axmmVar.b);
            }
        }
        allocate.putInt(this.d);
        allocate.putInt(this.e);
        did.ab(allocate, this.f);
        allocate.rewind();
        return allocate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    @Override // defpackage.axml
    public final void c(ByteBuffer byteBuffer) {
        short s = byteBuffer.getShort();
        this.a = s;
        if (s != 1) {
            while (true) {
                ?? r1 = s - 1;
                if (s <= 0) {
                    break;
                }
                this.c.add(new axmm(awxt.g(did.ak(byteBuffer)), byteBuffer.getShort()));
                s = r1;
            }
        } else {
            this.b = byteBuffer.getShort();
        }
        this.d = awxt.g(did.ak(byteBuffer));
        this.e = awxt.g(did.ak(byteBuffer));
        this.f = (short) did.aj(byteBuffer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        axmn axmnVar = (axmn) obj;
        return this.f == axmnVar.f && this.d == axmnVar.d && this.e == axmnVar.e && this.a == axmnVar.a && this.b == axmnVar.b && this.c.equals(axmnVar.c);
    }

    public final int hashCode() {
        return (((((((((this.a * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e) * 31) + this.f;
    }
}
