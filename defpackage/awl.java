package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class awl implements avr {
    private boolean h;
    private ByteBuffer g = a;
    public ByteBuffer d = a;
    private avp e = avp.a;
    private avp f = avp.a;
    protected avp b = avp.a;
    protected avp c = avp.a;

    @Override // defpackage.avr
    public final avp a(avp avpVar) {
        this.e = avpVar;
        this.f = i(avpVar);
        return g() ? this.f : avp.a;
    }

    @Override // defpackage.avr
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.d;
        this.d = a;
        return byteBuffer;
    }

    @Override // defpackage.avr
    public final void c() {
        this.d = a;
        this.h = false;
        this.b = this.e;
        this.c = this.f;
        k();
    }

    @Override // defpackage.avr
    public final void d() {
        this.h = true;
        l();
    }

    @Override // defpackage.avr
    public final void f() {
        c();
        this.g = a;
        this.e = avp.a;
        this.f = avp.a;
        this.b = avp.a;
        this.c = avp.a;
        m();
    }

    @Override // defpackage.avr
    public boolean g() {
        return this.f != avp.a;
    }

    @Override // defpackage.avr
    public boolean h() {
        return this.h && this.d == a;
    }

    protected avp i(avp avpVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ByteBuffer j(int i) {
        if (this.g.capacity() < i) {
            this.g = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        }
        ByteBuffer byteBuffer = this.g;
        this.d = byteBuffer;
        return byteBuffer;
    }

    protected void k() {
    }

    protected void l() {
    }

    protected void m() {
    }
}
