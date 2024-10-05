package defpackage;

import android.animation.Animator;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akau {
    public final Queue a;

    public akau(byte[] bArr, byte[] bArr2) {
        this.a = new ArrayDeque();
    }

    private final Animator.AnimatorListener f() {
        return new akat(this);
    }

    private final synchronized void g() {
        if (this.a.peek() != null && !((Animator) this.a.peek()).isStarted()) {
            ((Animator) this.a.peek()).start();
        }
    }

    public final synchronized void a(Animator animator) {
        Animator clone = animator.clone();
        while (!this.a.isEmpty()) {
            ((Animator) this.a.peek()).cancel();
        }
        clone.addListener(f());
        this.a.add(clone);
        g();
    }

    public final synchronized void b(Animator animator) {
        Animator clone = animator.clone();
        clone.addListener(f());
        this.a.add(clone);
        g();
    }

    public final synchronized void c(Animator animator) {
        if (this.a.peek() != animator) {
            return;
        }
        this.a.remove();
        g();
    }

    public final synchronized cpf d(ByteBuffer byteBuffer) {
        cpf cpfVar;
        cpfVar = (cpf) this.a.poll();
        if (cpfVar == null) {
            cpfVar = new cpf();
        }
        cpfVar.b = null;
        Arrays.fill(cpfVar.a, (byte) 0);
        cpfVar.c = new cpe();
        cpfVar.d = 0;
        cpfVar.b = byteBuffer.asReadOnlyBuffer();
        cpfVar.b.order(ByteOrder.LITTLE_ENDIAN);
        return cpfVar;
    }

    public final synchronized void e(cpf cpfVar) {
        cpfVar.b = null;
        cpfVar.c = null;
        this.a.offer(cpfVar);
    }

    public akau(char[] cArr) {
        this.a = ddn.i(0);
    }

    public akau() {
        this((byte[]) null);
    }

    public akau(byte[] bArr) {
        this.a = new ArrayDeque();
    }
}
