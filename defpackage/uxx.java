package defpackage;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uxx implements Externalizable {
    private static final long serialVersionUID = 1;
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f277J;
    private boolean L;
    private boolean N;
    private boolean P;
    private boolean R;
    private boolean U;
    private boolean W;
    private boolean Y;
    private boolean Z;
    public boolean n;
    public boolean u;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;
    public uxz a = null;
    public uxz b = null;
    public uxz c = null;
    public uxz d = null;
    public uxz e = null;
    public uxz f = null;
    public uxz g = null;
    public uxz h = null;
    public uxz i = null;
    public uxz j = null;
    private uxz H = null;
    public uxz k = null;
    private uxz K = null;
    private uxz M = null;
    private uxz O = null;
    private uxz Q = null;
    private uxz S = null;
    private String T = "";
    public int l = 0;
    public String m = "";
    private String V = "";
    private String X = "";
    public String o = "";
    public String p = "";
    public String q = "";
    public boolean r = false;
    public final List s = new ArrayList();
    public final List t = new ArrayList();
    private boolean aa = false;
    public String v = "";
    private boolean ab = false;
    private boolean ac = false;

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            uxz uxzVar = new uxz();
            uxzVar.readExternal(objectInput);
            this.w = true;
            this.a = uxzVar;
        }
        if (objectInput.readBoolean()) {
            uxz uxzVar2 = new uxz();
            uxzVar2.readExternal(objectInput);
            this.x = true;
            this.b = uxzVar2;
        }
        if (objectInput.readBoolean()) {
            uxz uxzVar3 = new uxz();
            uxzVar3.readExternal(objectInput);
            this.y = true;
            this.c = uxzVar3;
        }
        if (objectInput.readBoolean()) {
            uxz uxzVar4 = new uxz();
            uxzVar4.readExternal(objectInput);
            this.z = true;
            this.d = uxzVar4;
        }
        if (objectInput.readBoolean()) {
            uxz uxzVar5 = new uxz();
            uxzVar5.readExternal(objectInput);
            this.A = true;
            this.e = uxzVar5;
        }
        if (objectInput.readBoolean()) {
            uxz uxzVar6 = new uxz();
            uxzVar6.readExternal(objectInput);
            this.B = true;
            this.f = uxzVar6;
        }
        if (objectInput.readBoolean()) {
            uxz uxzVar7 = new uxz();
            uxzVar7.readExternal(objectInput);
            this.C = true;
            this.g = uxzVar7;
        }
        if (objectInput.readBoolean()) {
            uxz uxzVar8 = new uxz();
            uxzVar8.readExternal(objectInput);
            this.D = true;
            this.h = uxzVar8;
        }
        if (objectInput.readBoolean()) {
            uxz uxzVar9 = new uxz();
            uxzVar9.readExternal(objectInput);
            this.E = true;
            this.i = uxzVar9;
        }
        if (objectInput.readBoolean()) {
            uxz uxzVar10 = new uxz();
            uxzVar10.readExternal(objectInput);
            this.F = true;
            this.j = uxzVar10;
        }
        if (objectInput.readBoolean()) {
            uxz uxzVar11 = new uxz();
            uxzVar11.readExternal(objectInput);
            this.G = true;
            this.H = uxzVar11;
        }
        if (objectInput.readBoolean()) {
            uxz uxzVar12 = new uxz();
            uxzVar12.readExternal(objectInput);
            this.I = true;
            this.k = uxzVar12;
        }
        if (objectInput.readBoolean()) {
            uxz uxzVar13 = new uxz();
            uxzVar13.readExternal(objectInput);
            this.f277J = true;
            this.K = uxzVar13;
        }
        if (objectInput.readBoolean()) {
            uxz uxzVar14 = new uxz();
            uxzVar14.readExternal(objectInput);
            this.L = true;
            this.M = uxzVar14;
        }
        if (objectInput.readBoolean()) {
            uxz uxzVar15 = new uxz();
            uxzVar15.readExternal(objectInput);
            this.N = true;
            this.O = uxzVar15;
        }
        if (objectInput.readBoolean()) {
            uxz uxzVar16 = new uxz();
            uxzVar16.readExternal(objectInput);
            this.P = true;
            this.Q = uxzVar16;
        }
        if (objectInput.readBoolean()) {
            uxz uxzVar17 = new uxz();
            uxzVar17.readExternal(objectInput);
            this.R = true;
            this.S = uxzVar17;
        }
        this.T = objectInput.readUTF();
        this.l = objectInput.readInt();
        this.m = objectInput.readUTF();
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.U = true;
            this.V = readUTF;
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.W = true;
            this.X = readUTF2;
        }
        if (objectInput.readBoolean()) {
            String readUTF3 = objectInput.readUTF();
            this.n = true;
            this.o = readUTF3;
        }
        if (objectInput.readBoolean()) {
            String readUTF4 = objectInput.readUTF();
            this.Y = true;
            this.p = readUTF4;
        }
        if (objectInput.readBoolean()) {
            String readUTF5 = objectInput.readUTF();
            this.Z = true;
            this.q = readUTF5;
        }
        this.r = objectInput.readBoolean();
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            uxw uxwVar = new uxw();
            uxwVar.readExternal(objectInput);
            this.s.add(uxwVar);
        }
        int readInt2 = objectInput.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            uxw uxwVar2 = new uxw();
            uxwVar2.readExternal(objectInput);
            this.t.add(uxwVar2);
        }
        this.aa = objectInput.readBoolean();
        if (objectInput.readBoolean()) {
            String readUTF6 = objectInput.readUTF();
            this.u = true;
            this.v = readUTF6;
        }
        this.ab = objectInput.readBoolean();
        this.ac = objectInput.readBoolean();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.w);
        if (this.w) {
            this.a.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.x);
        if (this.x) {
            this.b.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.y);
        if (this.y) {
            this.c.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.z);
        if (this.z) {
            this.d.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.A);
        if (this.A) {
            this.e.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.B);
        if (this.B) {
            this.f.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.C);
        if (this.C) {
            this.g.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.D);
        if (this.D) {
            this.h.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.E);
        if (this.E) {
            this.i.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.F);
        if (this.F) {
            this.j.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.G);
        if (this.G) {
            this.H.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.I);
        if (this.I) {
            this.k.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f277J);
        if (this.f277J) {
            this.K.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.L);
        if (this.L) {
            this.M.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.N);
        if (this.N) {
            this.O.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.P);
        if (this.P) {
            this.Q.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.R);
        if (this.R) {
            this.S.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.T);
        objectOutput.writeInt(this.l);
        objectOutput.writeUTF(this.m);
        objectOutput.writeBoolean(this.U);
        if (this.U) {
            objectOutput.writeUTF(this.V);
        }
        objectOutput.writeBoolean(this.W);
        if (this.W) {
            objectOutput.writeUTF(this.X);
        }
        objectOutput.writeBoolean(this.n);
        if (this.n) {
            objectOutput.writeUTF(this.o);
        }
        objectOutput.writeBoolean(this.Y);
        if (this.Y) {
            objectOutput.writeUTF(this.p);
        }
        objectOutput.writeBoolean(this.Z);
        if (this.Z) {
            objectOutput.writeUTF(this.q);
        }
        objectOutput.writeBoolean(this.r);
        int size = this.s.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((uxw) this.s.get(i)).writeExternal(objectOutput);
        }
        int size2 = this.t.size();
        objectOutput.writeInt(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            ((uxw) this.t.get(i2)).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.aa);
        objectOutput.writeBoolean(this.u);
        if (this.u) {
            objectOutput.writeUTF(this.v);
        }
        objectOutput.writeBoolean(this.ab);
        objectOutput.writeBoolean(this.ac);
    }
}
